import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* defines a player */
class player{
    String name;
    pawn[] players_pawn = new pawn[5];
    player(String name, String color){
        for (int i = 0; i < 5; i++) {
            players_pawn[i] = new pawn(color, this);
        }
        this.name = name;
    }
}
/* define a pawn */
class pawn{
    String color;
    player owner;
    int position;

    pawn(String color, player p){
        this.color = color;
        this.owner = p;
    }
}
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
