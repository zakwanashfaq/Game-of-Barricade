import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class main_game {
    private JFrame main_frame;
    private JPanel main_panel;
    private JPanel main_right_panel;
    private JPanel main_bottom_panel;
    private JPanel board_panel;
    private JLabel bottom_panel_label;
    private JPanel top_main_right_panel;
    private JPanel dice_panel;
    private JLabel dice_num_label;
    private JButton rollDiceButton;
    private JPanel bottom_main_right_panel;
    private JButton RESETButton;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button6;
    private JButton button12;
    private JButton button99;
    private JButton OPTIONSButton;
    private JButton SAVEANDEXITButton;
    private JButton EXITButton;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JButton button55;
    private JButton button56;
    private JButton button57;
    private JButton button58;
    private JButton button59;
    private JButton button60;
    private JButton button61;
    private JButton button62;
    private JButton button63;
    private JButton button64;
    private JButton button65;
    private JButton button66;
    private JButton button67;
    private JButton button68;
    private JButton button69;
    private JButton button70;
    private JButton button71;
    private JButton button72;
    private JButton button73;
    private JButton button74;
    private JButton button75;
    private JButton button76;
    private JButton button77;
    private JButton button78;
    private JButton button79;
    private JButton button80;
    private JButton button81;
    private JButton button82;
    private JButton button83;
    private JButton button84;
    private JButton button85;
    private JButton button86;
    private JButton button87;
    private JButton button88;
    private JButton button89;
    private JButton button90;
    private JButton button91;
    private JButton button92;
    private JButton button93;
    private JButton button94;
    private JButton button95;
    private JButton button96;
    private JButton button97;
    private JButton button98;
    private JButton button100;
    private JButton button101;
    private JButton button102;
    private JButton button103;
    private JButton button104;
    private JButton button105;
    private JButton button106;
    private JButton button107;
    private JButton button108;
    private JButton button109;
    private JButton button110;
    private JButton button111;
    private JButton button112;
    private JButton button113;
    private JButton button114;
    private JButton button115;

    private JLabel Under_construction_label;
    Random rand = new Random();
    //    graph board = new graph();
    game game_object;
    public settings s;
    int dice;
    JButton[] button_array = null;
    boolean save_check = false;
    int state = 0;
    int current_pos = 0;

    public main_game() {
        main_frame = new JFrame("Malefiz Game");
        main_frame.add(main_panel);
        main_frame.setMinimumSize(new Dimension(1250, 750));
        main_frame.setLocation
                ((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 340,
                        (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 315);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.validate();
        main_frame.repaint();
        JButton[] button_array = {button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
                button10, button11, button12, button13, button14, button15, button16, button17, button18, button19,
                button20, button21, button22, button23, button24, button25, button26, button27, button28, button29,
                button30, button31, button32, button33, button34, button35, button36, button37, button38, button39,
                button40, button41, button42, button43, button44, button45, button46, button47, button48, button49,
                button50, button51, button52, button53, button54, button55, button56, button57, button58, button59,
                button60, button61, button62, button63, button64, button65, button66, button67, button68, button69,
                button70, button71, button72, button73, button74, button75, button76, button77, button78, button79,
                button80, button81, button82, button83, button84, button85, button86, button87, button88, button89,
                button90, button91, button92, button93, button94, button95, button96, button97, button98, button99,
                button100, button101, button102, button103, button104, button105, button106, button107, button108,
                button109, button110, button111, button112, button113, button114, button115,};
        this.button_array = button_array;
        int count = 0;
        for (JButton b : button_array) {
            b.setEnabled(false);
            b.setText(count + "");
            count++;
        }
//        board.init_buttons();
        rollDiceButton.addActionListener(e -> {
            ////////////////////////////////////////////
            refresh_color();
            refresh_color();
            ///////////////////////////////////////////
            this.dice = rand.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            dice_num_label.setText(dice + "");
            dice_num_label.repaint();
            dice_num_label.validate();
            dice_num_label.updateUI();
            dice_num_label.paintImmediately(dice_num_label.getVisibleRect());
            dice_panel.repaint();
            dice_panel.validate();
            int flag = 0;
            for (player p : game_object.player_list) {
                if (flag == 0) {
                    p.setColor(s.color1);
                }
                if (flag == 1) {
                    p.setColor(s.color2);
                }
                if (flag == 2) {
                    p.setColor(s.color3);
                }
                if (flag == 3) {
                    p.setColor(s.color4);
                }
                flag++;
            }
            refresh_color();
            update_player_label();
        });
        EXITButton.addActionListener(e -> System.exit(50));
        OPTIONSButton.addActionListener(e -> s.show());
        // button action listeners
        int id = 0;
        for (JButton b : button_array) {
            int finalId = id;
            int finalId1 = id;
            b.addActionListener(s -> {
                /* set all slot buttons to disabled */
                for (JButton z : button_array) {
                    z.setEnabled(false);
                }
                if (state == 0) {
                    current_pos = finalId;
                    int nxt = game_object.move(finalId, dice, button_array);
                    if (nxt == 111) {
                        System.out.println("Winner");
                        for (JButton butn : button_array) {
                            butn.setEnabled(false);
                        }
                        String msg = game_object.get_current_player().name + " Won";
                        JOptionPane.showMessageDialog(new Frame(), msg, "Message", JOptionPane.INFORMATION_MESSAGE);

                    }
                    if (nxt == -1) {
                        state = 3;
                        /* enanbling buttons for barricade position change */
                        for (JButton b2 : button_array) {
                            b2.setEnabled(true);
                        }
                        /* disabling player pawn location */
                        for (player p : game_object.player_list) {
                            for (pawn pp : p.pawns) {
                                button_array[pp.getPosition()].setEnabled(false);
                            }
                        }
                        for (node n : game_object.board.slots) {
                            if (n.barricade) button_array[n.id].setEnabled(false);
                        }
                        button_array[game_object.board.barricade_id].setEnabled(false);
                        String msg = "choose new position for barricade " + game_object.board.barricade_id;
                        JOptionPane.showMessageDialog(new Frame(), msg, "Message", JOptionPane.INFORMATION_MESSAGE);

                    } else if (nxt == -2) {
                        System.out.println("illegal move");
                        state = 0;
                        game_object.current_Index += 1;
                        /* enabling next pawn positions*/
                        for (pawn p : game_object.get_current_player().pawns) {
                            button_array[p.getPosition()].setEnabled(true);
                        }
                        String msg = "Move cannot be made\nMoving to next player";
                        JOptionPane.showMessageDialog(new Frame(), msg, "Message", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        state = 1;
                    }
                } else if (state == 1) {
                    /* get current pawns */
                    ArrayList<pawn> temp_pawns = game_object.get_current_player().pawns;
                    /* remove colors of prev positions */
                    for (pawn p : temp_pawns) {
                        button_array[p.getPosition()].setBackground(new Color(-12));
                    }
                    /* making the move*/
//                    int nxt = game_object.move(finalId, dice, button_array);
                    game_object.finalize_move(finalId, current_pos);


                    //                button_array[nxt].setEnabled(true);
                    /* setting colors for new positions */
                    for (pawn p : temp_pawns) {
                        button_array[p.getPosition()].setBackground(game_object.get_current_player().getColor());
                    }
                    /* enabling next pawn positions*/
                    for (pawn p : game_object.get_current_player().pawns) {
                        button_array[p.getPosition()].setEnabled(true);
                    }
                    game_object.print_pawn_locations();
                    state = 0;
                } else if (state == 3) {
                    System.out.println("State 3 activated");
                    /* put barricade in new spot */
                    /* put current pawn in barricade spot */
                    int pos = game_object.board.barricade_id;
                    System.out.println(pos);
                    game_object.board.slots[pos].remove_barricade();
                    game_object.board.slots[finalId1].set_barricade();
                    game_object.print_pawn_locations();
                    state = 0;
                    game_object.current_Index += 1;
                    game_object.finalize_move_with_barricade(pos, current_pos);
                    /* enabling next pawn positions*/
                    for (pawn p : game_object.get_current_player().pawns) {
                        button_array[p.getPosition()].setEnabled(true);
                    }
                } else if (state == 4) {

                }
                refresh_color();
                update_player_label();
            });
            id = id + 1;
        }
        /* executes if this is a saved game*/
        if (save_check) {
            /* get current pawns */
            ArrayList<pawn> temp_pawns = game_object.get_current_player().pawns;
            /* set all slot buttons to disabled */
            for (JButton z : button_array) {
                z.setEnabled(false);
            }
            /* remove colors of prev positions */
            for (pawn p : temp_pawns) {
                button_array[p.getPosition()].setBackground(new Color(-12));
            }
//                button_array[nxt].setEnabled(true);
            /* setting colors for new positions */
            for (pawn p : temp_pawns) {
                button_array[p.getPosition()].setBackground(game_object.get_current_player().getColor());
            }
            /* enabling next pawn positions*/
            for (pawn p : game_object.get_current_player().pawns) {
                button_array[p.getPosition()].setEnabled(true);
            }
            game_object.print_pawn_locations();
            set_move();
        }
        SAVEANDEXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* create save file */
                String path = (System.getProperty("user.dir")) + "/save_file.txt";
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(path);
                } catch (Exception g) {
                    System.out.println("Error occured while reading save file");
                    return;
                }

                ArrayList<player> lst = game_object.player_list;
                int num_of_player = lst.size();
                /* store list lenght to file */
                try {
                    myWriter.write(num_of_player + "\n");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                for (player p : lst) {
                    String name = p.getName();
                    /* save string names to file*/
                    try {
                        myWriter.write(name + "\n");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    for (pawn pw : p.pawns) {
                        int location = pw.getPosition();
                        /* save location of each pawn*/
                        try {
                            myWriter.write(location + "\n");
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                }
                try {
                    myWriter.write(game_object.current_Index + "\n");
                    /* writing all the barricade positions */
                    for (node n : game_object.board.slots) {
                        if (n.barricade) {
                            myWriter.write(n.id + "\n");
                        }
                    }
                    myWriter.close();
                    System.out.println("SAVED GAME SUCCESFULLY");
                    JOptionPane.showMessageDialog(new JFrame("SUCCESS"), "SAVED GAME SUCCESSFULLY.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ioException) {
                    System.out.println("SAving Failed");
                }
            }

        });
        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Reset button pressed.");
                JOptionPane.showMessageDialog(new Frame(), "All pawns are back at home", "GAME RESET SUCESS", JOptionPane.INFORMATION_MESSAGE);
                for (JButton z : button_array) {
                    z.setEnabled(false);
                    z.setBackground(new Color(-1));
                }
                for (player p : game_object.player_list) {
                    for (pawn pw : p.pawns) {
                        pw.reset();
                    }
                }
                for (node n : game_object.board.slots) {
                    n.remove_barricade();
                }
                game_object.board.initBarricades();
                game_object.current_Index = 0;
                refresh_color();
                set_player_colors();
                update_player_label();
                button_array[112].setEnabled(true);
            }
        });
    }

    void set_move() {
        System.out.println("set_move initiated");
    }

    void refresh_color() {
        for (JButton b : button_array) {
            b.setBackground(new Color(-1));
        }
        for (player p : game_object.player_list) {
            for (pawn pw : p.pawns) {
                int location = pw.getPosition();
                button_array[location].setBackground(p.getColor());
            }
        }
        node[] barricades = game_object.board.slots;
        for (int i = 0; i < barricades.length; i++) {
            if (barricades[i].barricade) {
                button_array[i].setBackground(new Color(5000));
                button_array[i].setForeground(new Color(-1));
            }
        }
    }

    void set_player_colors() {
        int flag = 0;
        for (player p : game_object.player_list) {
            if (flag == 0) {
                p.setColor(s.color1);
            }
            if (flag == 1) {
                p.setColor(s.color2);
            }
            if (flag == 2) {
                p.setColor(s.color3);
            }
            if (flag == 3) {
                p.setColor(s.color4);
            }
            flag++;
        }
    }

    void update_player_label() {
        bottom_panel_label.setText(game_object.get_current_player().getName() + "'s turn");
        bottom_panel_label.validate();
        bottom_panel_label.repaint();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        main_panel = new JPanel();
        main_panel.setLayout(new BorderLayout(0, 0));
        main_right_panel = new JPanel();
        main_right_panel.setLayout(new BorderLayout(0, 0));
        main_panel.add(main_right_panel, BorderLayout.EAST);
        top_main_right_panel = new JPanel();
        top_main_right_panel.setLayout(new GridBagLayout());
        main_right_panel.add(top_main_right_panel, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Chiller", Font.BOLD, 48, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Malefiz Game");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        top_main_right_panel.add(label1, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 25;
        top_main_right_panel.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        top_main_right_panel.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        top_main_right_panel.add(spacer3, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, -1, 20, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setHorizontalAlignment(0);
        label2.setHorizontalTextPosition(0);
        label2.setText("Group 14");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        top_main_right_panel.add(label2, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 80;
        top_main_right_panel.add(spacer4, gbc);
        dice_panel = new JPanel();
        dice_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        dice_panel.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        top_main_right_panel.add(dice_panel, gbc);
        dice_num_label = new JLabel();
        dice_num_label.setEnabled(false);
        Font dice_num_labelFont = this.$$$getFont$$$(null, Font.BOLD, 72, dice_num_label.getFont());
        if (dice_num_labelFont != null) dice_num_label.setFont(dice_num_labelFont);
        dice_num_label.setHorizontalAlignment(0);
        dice_num_label.setHorizontalTextPosition(0);
        dice_num_label.setText("0");
        dice_panel.add(dice_num_label);
        rollDiceButton = new JButton();
        rollDiceButton.setBackground(new Color(-13283793));
        rollDiceButton.setForeground(new Color(-723724));
        rollDiceButton.setText("roll dice");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 25;
        top_main_right_panel.add(rollDiceButton, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 25;
        top_main_right_panel.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        top_main_right_panel.add(spacer6, gbc);
        bottom_main_right_panel = new JPanel();
        bottom_main_right_panel.setLayout(new GridBagLayout());
        main_right_panel.add(bottom_main_right_panel, BorderLayout.SOUTH);
        RESETButton = new JButton();
        RESETButton.setText("RESET");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(RESETButton, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(spacer7, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        bottom_main_right_panel.add(spacer8, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(spacer9, gbc);
        OPTIONSButton = new JButton();
        OPTIONSButton.setText("OPTIONS");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(OPTIONSButton, gbc);
        SAVEANDEXITButton = new JButton();
        SAVEANDEXITButton.setText("SAVE GAME");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(SAVEANDEXITButton, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        bottom_main_right_panel.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        bottom_main_right_panel.add(spacer11, gbc);
        EXITButton = new JButton();
        EXITButton.setText("EXIT");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        bottom_main_right_panel.add(EXITButton, gbc);
        main_bottom_panel = new JPanel();
        main_bottom_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        main_bottom_panel.setBackground(new Color(-11776948));
        main_panel.add(main_bottom_panel, BorderLayout.SOUTH);
        bottom_panel_label = new JLabel();
        bottom_panel_label.setForeground(new Color(-3092272));
        bottom_panel_label.setText("This will show which players turn it is");
        bottom_panel_label.setToolTipText("Turn Indicator");
        main_bottom_panel.add(bottom_panel_label);
        board_panel = new JPanel();
        board_panel.setLayout(new GridBagLayout());
        board_panel.setBackground(new Color(-263173));
        main_panel.add(board_panel, BorderLayout.CENTER);
        button0 = new JButton();
        button0.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button0, gbc);
        button3 = new JButton();
        button3.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button3, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.VERTICAL;
        board_panel.add(spacer12, gbc);
        button2 = new JButton();
        button2.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button2, gbc);
        button1 = new JButton();
        button1.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button1, gbc);
        button4 = new JButton();
        button4.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button4, gbc);
        button5 = new JButton();
        button5.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button5, gbc);
        button6 = new JButton();
        button6.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button6, gbc);
        button7 = new JButton();
        button7.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button7, gbc);
        button8 = new JButton();
        button8.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button8, gbc);
        button9 = new JButton();
        button9.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button9, gbc);
        button10 = new JButton();
        button10.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button10, gbc);
        button11 = new JButton();
        button11.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button11, gbc);
        button12 = new JButton();
        button12.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button12, gbc);
        button13 = new JButton();
        button13.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button13, gbc);
        button14 = new JButton();
        button14.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button14, gbc);
        button15 = new JButton();
        button15.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button15, gbc);
        button16 = new JButton();
        button16.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button16, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 18;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 5;
        board_panel.add(spacer13, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 5;
        board_panel.add(spacer14, gbc);
        button17 = new JButton();
        button17.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button17, gbc);
        button18 = new JButton();
        button18.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button18, gbc);
        button19 = new JButton();
        button19.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button19, gbc);
        button20 = new JButton();
        button20.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button20, gbc);
        button21 = new JButton();
        button21.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button21, gbc);
        button22 = new JButton();
        button22.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button22, gbc);
        button23 = new JButton();
        button23.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button23, gbc);
        button24 = new JButton();
        button24.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button24, gbc);
        button25 = new JButton();
        button25.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button25, gbc);
        button26 = new JButton();
        button26.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button26, gbc);
        button27 = new JButton();
        button27.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button27, gbc);
        button28 = new JButton();
        button28.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button28, gbc);
        button29 = new JButton();
        button29.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button29, gbc);
        button30 = new JButton();
        button30.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button30, gbc);
        button31 = new JButton();
        button31.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button31, gbc);
        button32 = new JButton();
        button32.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button32, gbc);
        button33 = new JButton();
        button33.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button33, gbc);
        button34 = new JButton();
        button34.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button34, gbc);
        button35 = new JButton();
        button35.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button35, gbc);
        button36 = new JButton();
        button36.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button36, gbc);
        button37 = new JButton();
        button37.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button37, gbc);
        button38 = new JButton();
        button38.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button38, gbc);
        button39 = new JButton();
        button39.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button39, gbc);
        button40 = new JButton();
        button40.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button40, gbc);
        button41 = new JButton();
        button41.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button41, gbc);
        button42 = new JButton();
        button42.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button42, gbc);
        button43 = new JButton();
        button43.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button43, gbc);
        button44 = new JButton();
        button44.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button44, gbc);
        button45 = new JButton();
        button45.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button45, gbc);
        button46 = new JButton();
        button46.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button46, gbc);
        button47 = new JButton();
        button47.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button47, gbc);
        button48 = new JButton();
        button48.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button48, gbc);
        button49 = new JButton();
        button49.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button49, gbc);
        button50 = new JButton();
        button50.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button50, gbc);
        button51 = new JButton();
        button51.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button51, gbc);
        button52 = new JButton();
        button52.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button52, gbc);
        button53 = new JButton();
        button53.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button53, gbc);
        button54 = new JButton();
        button54.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button54, gbc);
        button55 = new JButton();
        button55.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button55, gbc);
        button56 = new JButton();
        button56.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button56, gbc);
        button58 = new JButton();
        button58.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button58, gbc);
        button57 = new JButton();
        button57.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button57, gbc);
        button59 = new JButton();
        button59.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button59, gbc);
        button60 = new JButton();
        button60.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button60, gbc);
        button61 = new JButton();
        button61.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button61, gbc);
        button62 = new JButton();
        button62.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button62, gbc);
        button63 = new JButton();
        button63.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button63, gbc);
        button64 = new JButton();
        button64.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button64, gbc);
        button65 = new JButton();
        button65.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button65, gbc);
        button66 = new JButton();
        button66.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button66, gbc);
        final JPanel spacer15 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 15;
        board_panel.add(spacer15, gbc);
        button67 = new JButton();
        button67.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button67, gbc);
        button68 = new JButton();
        button68.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button68, gbc);
        button69 = new JButton();
        button69.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button69, gbc);
        button70 = new JButton();
        button70.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button70, gbc);
        button71 = new JButton();
        button71.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button71, gbc);
        button72 = new JButton();
        button72.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button72, gbc);
        button73 = new JButton();
        button73.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button73, gbc);
        button74 = new JButton();
        button74.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button74, gbc);
        button75 = new JButton();
        button75.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button75, gbc);
        button76 = new JButton();
        button76.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button76, gbc);
        button77 = new JButton();
        button77.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button77, gbc);
        button78 = new JButton();
        button78.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button78, gbc);
        button79 = new JButton();
        button79.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button79, gbc);
        button80 = new JButton();
        button80.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button80, gbc);
        button81 = new JButton();
        button81.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button81, gbc);
        button82 = new JButton();
        button82.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button82, gbc);
        button83 = new JButton();
        button83.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button83, gbc);
        button84 = new JButton();
        button84.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button84, gbc);
        button85 = new JButton();
        button85.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button85, gbc);
        button86 = new JButton();
        button86.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button86, gbc);
        button87 = new JButton();
        button87.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button87, gbc);
        button88 = new JButton();
        button88.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button88, gbc);
        button89 = new JButton();
        button89.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button89, gbc);
        button90 = new JButton();
        button90.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button90, gbc);
        button91 = new JButton();
        button91.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button91, gbc);
        button92 = new JButton();
        button92.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button92, gbc);
        button93 = new JButton();
        button93.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button93, gbc);
        button94 = new JButton();
        button94.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button94, gbc);
        button95 = new JButton();
        button95.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button95, gbc);
        button96 = new JButton();
        button96.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button96, gbc);
        button97 = new JButton();
        button97.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button97, gbc);
        button98 = new JButton();
        button98.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button98, gbc);
        button99 = new JButton();
        button99.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button99, gbc);
        button100 = new JButton();
        button100.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button100, gbc);
        button101 = new JButton();
        button101.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button101, gbc);
        button102 = new JButton();
        button102.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button102, gbc);
        button103 = new JButton();
        button103.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button103, gbc);
        button104 = new JButton();
        button104.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button104, gbc);
        button105 = new JButton();
        button105.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button105, gbc);
        button106 = new JButton();
        button106.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button106, gbc);
        button107 = new JButton();
        button107.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button107, gbc);
        button108 = new JButton();
        button108.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button108, gbc);
        button109 = new JButton();
        button109.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button109, gbc);
        button110 = new JButton();
        button110.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button110, gbc);
        button111 = new JButton();
        button111.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button111, gbc);
        final JPanel spacer16 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 5;
        board_panel.add(spacer16, gbc);
        button112 = new JButton();
        button112.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button112, gbc);
        button113 = new JButton();
        button113.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button113, gbc);
        button114 = new JButton();
        button114.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button114, gbc);
        button115 = new JButton();
        button115.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        board_panel.add(button115, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return main_panel;
    }

    void init(String[] arr, settings settings_instance, boolean[] is_bot_array, String difficulty) {
        // make arraylist of players
        s = settings_instance;
        System.out.println("<<<MAIN GAME SEQUENCE>>>");
        main_frame.setVisible(true);
        String msg = "Press Roll dice to start game.";
        JOptionPane.showMessageDialog(new Frame(), msg, "PLEASE READ!!", JOptionPane.INFORMATION_MESSAGE);
        game_object = new game(arr);
        set_player_colors();
        refresh_color();
        button_array[112].setEnabled(true);
    }

    void init_save(String[] arr, settings settings_instance, int nxt_player, int num_of_players, int[][] pawn_locations, boolean[] is_bot_array, String difficulty, int[] barricade_arr2) {
        // make arraylist of players
        s = settings_instance;
        System.out.println("<<<MAIN SAVED GAME SEQUENCE>>>");
        main_frame.setVisible(true);
        String msg = "Press Roll dice to start game.";
        JOptionPane.showMessageDialog(new Frame(), msg, "PLEASE READ!!", JOptionPane.INFORMATION_MESSAGE);
        game_object = new game(arr);
        int i = 0, j = 0;
        for (player p : game_object.player_list) {
            j = 0;
            for (pawn pw : p.pawns) {
                pw.setPosition(pawn_locations[i][j]);
                j++;
            }
            i++;
        }
        for (node n : game_object.board.slots) {
            n.remove_barricade();
        }
        for (int id : barricade_arr2) {
            game_object.board.slots[id].set_barricade();
        }
        this.save_check = true;
        /* get current pawns */
        ArrayList<pawn> temp_pawns = game_object.get_current_player().pawns;
        /* set all slot buttons to disabled */
        for (JButton z : button_array) {
            z.setEnabled(false);
        }
        /* remove colors of prev positions */
        for (pawn p : temp_pawns) {
            button_array[p.getPosition()].setBackground(new Color(-12));
        }
//                button_array[nxt].setEnabled(true);
        /* setting colors for new positions */
        for (pawn p : temp_pawns) {
            button_array[p.getPosition()].setBackground(game_object.get_current_player().getColor());
        }
        /* enabling next pawn positions*/
        for (pawn p : game_object.get_current_player().pawns) {
            button_array[p.getPosition()].setEnabled(true);
        }
//        game_object.current_Index = nxt_player;
        game_object.print_pawn_locations();
        set_player_colors();
        refresh_color();
        update_player_label();
    }
}
