/*
* Zakwan Ashfaq Zian
* 201950250
* */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/* Node model describing a single slot */
class node{
    int id;
    ArrayList <node> neighbour_list = new ArrayList<node>();
    boolean visited = false;
    boolean barricade = false;
    public node(int id) {
        this.id = id;
    }
    void set_barricade(){
        barricade = true;
    }
    void remove_barricade(){
        barricade = false;
    }
}

/* graph model describing the board */
public class graph {
    int dice;
    node[] slots = new node[120];
    JButton[] buttons;

    public graph() {
        // initializing the slots
        for (int i=0; i<120; i++){
            slots[i] = new node(i);
        }
        initEdges();
        initBarricades();
    }
    /* initializes all relations - edges initialization */
    private void initEdges(){
        slots[112].neighbour_list.add(slots[2]);
        slots[113].neighbour_list.add(slots[6]);
        slots[114].neighbour_list.add(slots[10]);
        slots[115].neighbour_list.add(slots[14]);
        slots[2].neighbour_list.add(slots[3]);
        slots[2].neighbour_list.add(slots[1]);
        slots[1].neighbour_list.add(slots[0]);
        slots[3].neighbour_list.add(slots[4]);
        slots[4].neighbour_list.add(slots[18]);
        slots[0].neighbour_list.add(slots[17]);
        slots[17].neighbour_list.add(slots[22]);
        slots[22].neighbour_list.add(slots[23]);
        slots[23].neighbour_list.add(slots[24]);
        slots[18].neighbour_list.add(slots[26]);
        slots[26].neighbour_list.add(slots[25]);
        slots[25].neighbour_list.add(slots[24]);
        slots[26].neighbour_list.add(slots[27]);
        slots[24].neighbour_list.add(slots[39]);
        slots[39].neighbour_list.add(slots[43]);
        slots[43].neighbour_list.add(slots[44]);
        slots[44].neighbour_list.add(slots[45]);
        slots[6].neighbour_list.add(slots[5]);
        slots[5].neighbour_list.add(slots[4]);
        slots[6].neighbour_list.add(slots[7]);
        slots[7].neighbour_list.add(slots[8]);
        slots[8].neighbour_list.add(slots[19]);
        slots[19].neighbour_list.add(slots[30]);
        slots[30].neighbour_list.add(slots[29]);
        slots[29].neighbour_list.add(slots[28]);
        slots[28].neighbour_list.add(slots[40]);
        slots[27].neighbour_list.add(slots[28]);
        slots[10].neighbour_list.add(slots[9]);
        slots[9].neighbour_list.add(slots[8]);
        slots[10].neighbour_list.add(slots[11]);
        slots[30].neighbour_list.add(slots[31]);
        slots[31].neighbour_list.add(slots[32]);
        slots[32].neighbour_list.add(slots[41]);
        slots[11].neighbour_list.add(slots[12]);
        slots[12].neighbour_list.add(slots[20]);
        slots[20].neighbour_list.add(slots[34]);
        slots[34].neighbour_list.add(slots[33]);
        slots[33].neighbour_list.add(slots[32]);
        slots[32].neighbour_list.add(slots[41]);
        slots[40].neighbour_list.add(slots[47]);
        slots[41].neighbour_list.add(slots[51]);
        slots[34].neighbour_list.add(slots[35]);
        slots[35].neighbour_list.add(slots[36]);
        slots[36].neighbour_list.add(slots[42]);
        slots[15].neighbour_list.add(slots[16]);
        slots[14].neighbour_list.add(slots[13]);
        slots[13].neighbour_list.add(slots[12]);
        slots[14].neighbour_list.add(slots[15]);
        slots[38].neighbour_list.add(slots[37]);
        slots[16].neighbour_list.add(slots[21]);
        slots[21].neighbour_list.add(slots[38]);
        slots[37].neighbour_list.add(slots[36]);
        slots[36].neighbour_list.add(slots[42]);
        slots[42].neighbour_list.add(slots[55]);
        /////////////////////////////////////////
        slots[45].neighbour_list.add(slots[56]);
        slots[46].neighbour_list.add(slots[45]);
        slots[47].neighbour_list.add(slots[46]);
        slots[47].neighbour_list.add(slots[48]);
        slots[48].neighbour_list.add(slots[47]);
        slots[49].neighbour_list.add(slots[48]);
        slots[48].neighbour_list.add(slots[49]);
        slots[49].neighbour_list.add(slots[50]);
        slots[50].neighbour_list.add(slots[49]);
        slots[51].neighbour_list.add(slots[50]);
        slots[50].neighbour_list.add(slots[51]);
        slots[51].neighbour_list.add(slots[52]);
        slots[52].neighbour_list.add(slots[53]);
        slots[53].neighbour_list.add(slots[57]);
        slots[54].neighbour_list.add(slots[53]);
        slots[55].neighbour_list.add(slots[54]);
        slots[45].neighbour_list.add(slots[56]);
        slots[53].neighbour_list.add(slots[57]);
        slots[56].neighbour_list.add(slots[58]);
        slots[57].neighbour_list.add(slots[66]);
        /////////////////////////////////////////
        slots[58].neighbour_list.add(slots[59]);
        slots[59].neighbour_list.add(slots[60]);
        slots[57].neighbour_list.add(slots[66]);
        slots[66].neighbour_list.add(slots[65]);
        slots[65].neighbour_list.add(slots[64]);

        slots[60].neighbour_list.add(slots[61]);
        slots[61].neighbour_list.add(slots[60]);
        slots[62].neighbour_list.add(slots[61]);
        slots[61].neighbour_list.add(slots[62]);
        slots[62].neighbour_list.add(slots[63]);
        slots[63].neighbour_list.add(slots[62]);
        slots[64].neighbour_list.add(slots[63]);
        slots[63].neighbour_list.add(slots[64]);

        slots[60].neighbour_list.add(slots[67]);
        slots[64].neighbour_list.add(slots[68]);
        slots[67].neighbour_list.add(slots[69]);
        slots[68].neighbour_list.add(slots[73]);

        slots[69].neighbour_list.add(slots[70]);
        slots[70].neighbour_list.add(slots[71]);
        slots[73].neighbour_list.add(slots[72]);
        slots[72].neighbour_list.add(slots[71]);

        slots[71].neighbour_list.add(slots[74]);
        slots[74].neighbour_list.add(slots[83]);
        ////////////////////////////////////////////////
        slots[83].neighbour_list.add(slots[84]);
        slots[84].neighbour_list.add(slots[85]);
        slots[85].neighbour_list.add(slots[86]);
        slots[86].neighbour_list.add(slots[87]);
        slots[87].neighbour_list.add(slots[88]);
        slots[88].neighbour_list.add(slots[89]);
        slots[89].neighbour_list.add(slots[90]);
        slots[90].neighbour_list.add(slots[91]);
        /////////////////////////////////////////////
        slots[83].neighbour_list.add(slots[82]);
        slots[82].neighbour_list.add(slots[81]);
        slots[81].neighbour_list.add(slots[80]);
        slots[80].neighbour_list.add(slots[79]);
        slots[79].neighbour_list.add(slots[78]);
        slots[78].neighbour_list.add(slots[77]);
        slots[77].neighbour_list.add(slots[76]);
        slots[76].neighbour_list.add(slots[75]);
        /////////////////////////////////////////////
        slots[75].neighbour_list.add(slots[92]);
        slots[92].neighbour_list.add(slots[94]);
        slots[91].neighbour_list.add(slots[93]);
        slots[73].neighbour_list.add(slots[110]);
        slots[94].neighbour_list.add(slots[95]);
        slots[95].neighbour_list.add(slots[96]);
        slots[96].neighbour_list.add(slots[97]);
        slots[97].neighbour_list.add(slots[98]);
        slots[98].neighbour_list.add(slots[99]);
        slots[99].neighbour_list.add(slots[100]);
        slots[100].neighbour_list.add(slots[101]);
        slots[101].neighbour_list.add(slots[102]);
        slots[110].neighbour_list.add(slots[109]);
        slots[109].neighbour_list.add(slots[108]);
        slots[108].neighbour_list.add(slots[107]);
        slots[107].neighbour_list.add(slots[106]);
        slots[106].neighbour_list.add(slots[105]);
        slots[105].neighbour_list.add(slots[104]);
        slots[104].neighbour_list.add(slots[103]);
        slots[103].neighbour_list.add(slots[102]);
        slots[102].neighbour_list.add(slots[111]);



    }

    public void initBarricades(){
        barricade_Setup(22);
        barricade_Setup(26);
        barricade_Setup(30);
        barricade_Setup(34);
        barricade_Setup(38);
        barricade_Setup(60);
        barricade_Setup(64);
        barricade_Setup(71);
        barricade_Setup(74);
        barricade_Setup(83);
        barricade_Setup(102);
    }
    private void barricade_Setup(int index){
        slots[index].set_barricade();
    }
    public void init_buttons(){
        initBarricades();
    }
    int id;
    boolean barricade_check = false;
    boolean blocked = false;
    int barricade_id = -1;

    int dfs(int index, int dice, JButton[] array){
        barricade_check = false;
        node start = slots[index];
        this.dice = dice;
        loop(start, 0, array);
        int temp = this.id;
        this.id = -95;
        if (barricade_check){
            return -1;
        }
        if (temp == -95) {
            return -2;
        }
        if (blocked) {
            System.out.println("caught");
            return -2;
        }
        return temp;
    }

    void loop(node n, int num, JButton[] array) {
       if (dice == num) {
           if (n.barricade) {
               System.out.println("barricade detected: "+n.id);
               barricade_check = true;
               barricade_id = n.id;
               return;
           }
            this.id = n.id;
            array[id].setEnabled(true);
            return;
        }
       if (n.barricade) {
            System.out.println("No No NO NO NO");
            blocked = true;
            return;
        }
        num++;
        for (int i = 0; i < n.neighbour_list.size(); i++) {
            loop(n.neighbour_list.get(i), num, array);
        }
    }
}
