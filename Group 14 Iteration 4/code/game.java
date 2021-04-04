import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class game {
    ArrayList<player> player_list = new ArrayList<player>();
    int current_Index = 0;
    pawn[] positions = new pawn[111];
    graph board = new graph();
    settings s; /* link this */

    /* constructor */
    game(String[] players) {
        /* initializing positions list to null */
        for (pawn p : positions) {
            p = null;
        }
        /* setting initial positions to pawns */
        for (String player : players) {
            if (player.equals("")) {
                /* if player name is blank then ignore*/
                continue;
            } else {
                /* create players and add their pawns to the start*/
                player temp_player = new player(player);
                player_list.add(temp_player);
                ArrayList<pawn> temp_pawn_list = temp_player.pawns;
                for (int i = 0; i < 5; i++) {
                    //sets location for every pawn
//                    temp_pawn_list.get(i).setPosition(0);
                    temp_pawn_list.get(i).reset();
                }
            }
        }
        int flag = 0;
        for (player p : player_list) {
            if (flag == 0) {
                p.set_default_pawn_position(112);
                for (pawn temp : p.pawns) {
                    temp.reset();
                }
            }
            if (flag == 1) {
                p.set_default_pawn_position(113);
                for (pawn temp : p.pawns) {
                    temp.reset();
                }
            }
            if (flag == 2) {
                p.set_default_pawn_position(114);
                for (pawn temp : p.pawns) {
                    temp.reset();
                }
            }
            if (flag == 3) {
                p.set_default_pawn_position(115);
                for (pawn temp : p.pawns) {
                    temp.reset();
                }
            }
            flag++;
        }

    }

    /* inserting move */
    int move(int button_index, int dice, JButton[] array) {
        pawn temp_pawn = find_pawn(button_index);
        int next_location = board.dfs(temp_pawn.getPosition(), dice, array);
        /* handle no valid moves */
        if (next_location == 0) return 0;
        if (next_location == -1) return -1;
        if (next_location == -2) return -2;
        return next_location;
    }

    void finalize_move(int finalID, int current_spot) {
        /* resetting eaten player */
        pawn current_pawn = find_pawn(current_spot);
        /* checking if slot is empty*/
        if (positions[finalID] == null) {
            positions[finalID] = current_pawn;
            current_pawn.setPosition(finalID);
        }
        /* if slot is not empty */
        else {
            pawn final_pawn = find_pawn(finalID);
            final_pawn.reset();
            positions[finalID] = current_pawn;
            current_pawn.setPosition(finalID);
        }
        current_Index++;
    }

    void finalize_move_with_barricade(int finalID, int current_spot) {
        pawn current_pawn = find_pawn(current_spot);
        positions[finalID] = current_pawn;
        current_pawn.setPosition(finalID);

    }

    player get_current_player() {
        return player_list.get(current_Index % (player_list.size()));
    }

    pawn find_pawn(int index) {
//        player temp_player = player_list.get(current_Index%(player_list.size()));
        pawn result = null;
        for (player pp : player_list) {
            for (pawn p : pp.pawns) {
                if (p.getPosition() == index) {
                    return p;
                }
            }
        }
        return result;
    }

    /* method used to print for backend test */
    void print_pawn_locations() {
        System.out.println("=====================================");
        for (player pl : player_list) {
            System.out.print(pl.getName() + "\t|\t");
            for (pawn p : pl.pawns) {
                System.out.print(p.position + "\t");
            }
            System.out.println();
        }
        System.out.println("Barricades locations");
        for (node n : board.slots) {
            if (n.barricade) {
                System.out.print(n.id+"  ");
            }
        }
        System.out.println();
        System.out.println("=====================================");
    }
}
