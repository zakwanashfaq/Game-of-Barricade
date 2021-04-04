import java.awt.*;
import java.util.ArrayList;

/* defines a player */
class player{
    String name;
    Color color;
    ArrayList<pawn> pawns = new ArrayList<pawn>();

    player(String name){
        this.name = name;
        for (int i = 0; i < 5; i++) {
            pawns.add(new pawn());
        }
    }
    void set_default_pawn_position(int pos){
        for (pawn p: pawns) {
            p.default_position = pos;
        }
    }
    /* getters and setters */
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


}
/* defines a pawn */
class pawn{
    int position;
    int default_position;/* set default and reset method*/
    void reset(){
        position = default_position;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
}
