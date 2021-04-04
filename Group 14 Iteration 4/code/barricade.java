import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class barricade {
    String[] player_names;
    public void startGame(){
        System.out.println("Game start sequence:\nPlayers: ");
        for (String i: player_names) {
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {
        System.out.println("<<<START SEQUENCE>>>");
        start st = new start();
        st.create_save_file();
        settings s = new settings();
        st.init(s);
    }

}
