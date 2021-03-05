/*
* Zakwan Ashfaq Zian
* 201950250
* */

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
    void visited(){
        this.visited = true;
    }
}

/* graph model describing the board */
public class graph {
    int dice;
    node slots[] = new node[13];
    public graph() {
        // initializing the slots
        for (int i=0; i<13; i++){
            slots[i] = new node(i);
        }
        initEdges();
    }
    /* initializes all relations - edges initialization */
    private void initEdges(){
        slots[2].neighbour_list.add(slots[3]);
        slots[2].neighbour_list.add(slots[1]);
        slots[1].neighbour_list.add(slots[0]);
        slots[3].neighbour_list.add(slots[4]);
        slots[0].neighbour_list.add(slots[5]);
        slots[4].neighbour_list.add(slots[6]);
        slots[6].neighbour_list.add(slots[11]);
        slots[5].neighbour_list.add(slots[7]);
        slots[7].neighbour_list.add(slots[8]);
        slots[11].neighbour_list.add(slots[10]);
        slots[8].neighbour_list.add(slots[9]);
        slots[10].neighbour_list.add(slots[9]);
        slots[9].neighbour_list.add(slots[12]);
    }

    void dfs(int index, int dice){
        node start = slots[index];
        this.dice = dice;
        loop(start, 0);
    }

    void loop(node n, int num) {
        if (n.barricade == true ) {
            if (dice == num) {
                System.out.println(n.id + " SWAP");
            }
            return;
        }
        if (dice == num) {
            System.out.println(n.id);
            return;
        }
        num++;
        for (int i = 0; i < n.neighbour_list.size(); i++) {
            loop(n.neighbour_list.get(i), num);
        }
    }

    public static void main(String[] args) {
        graph g = new graph();
        g.slots[5].barricade = true;
        g.dfs(2, 3);
    }
}
