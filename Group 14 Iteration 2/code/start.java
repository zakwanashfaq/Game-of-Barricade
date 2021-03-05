import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class start {
    private JFrame mainFrame;
    private JPanel main_panel;
    private JPanel top_main_panel;
    private JLabel start_lanel;
    private JPanel bottom_main_panel;
    private JPanel centre_main_panel;
    private JPanel top_main_subpanel_left;
    private JPanel bottom_main_subpanel_left;
    private JPanel bottom_main_subpanel_right;
    private JButton optionsButton;
    private JButton STARTGAMEButton;
    private JButton RESUMEButton;
    private JPanel centre_player_panel_1;
    private JTextField textField1;
    private JPanel centre_player_panel_2;
    private JPanel centre_player_panel_3;
    private JPanel centre_player_panel_4;
    private JButton HELPButton;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton RadioButton2;
    private JRadioButton RadioButton3;
    private JRadioButton RadioButton4;
    private JLabel cannot_assign_bot_msg;
    private JComboBox<String> comboBox1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private String[] arr;
    public barricade b;
    public int a = 9999;
    settings settings_instance;
    Color color1 = new Color(-1857626);
    Color color2 = new Color(-1857626);
    Color color3 = new Color(-1857626);
    Color color4 = new Color(-1857626);
    boolean[] is_bot_array = {false, false, false, false};
    String difficulty = "Easy";

    public start() {
        comboBox1.addItem("Easy");
        comboBox1.addItem("Medium");
        comboBox1.addItem("Hard");
        comboBox1.setSelectedIndex(0);
        STARTGAMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String arr_temp[] = new String[4];
                arr_temp[0] = textField1.getText();
                arr_temp[1] = textField2.getText();
                arr_temp[2] = textField3.getText();
                arr_temp[3] = textField4.getText();
                // checking for duplicate name
                for (int i = 0; i < arr_temp.length - 1; i++) {
                    for (int j = i + 1; j < arr_temp.length; j++) {
                        if (arr_temp[i].equals(arr_temp[j])) {
                            if ((arr_temp[i].equals("")) || (arr_temp[j].equals(""))) continue;
                            System.out.println("Duplicate");
                            JOptionPane.showMessageDialog(
                                    new Frame(), "Please use unique names", "Alert", JOptionPane.WARNING_MESSAGE
                            );
                            return;
                        }
                    }
                }
                // all emtry name error
                if ((arr_temp[0].equals("")) && (arr_temp[1].equals("")) && (arr_temp[2].equals("")) && (arr_temp[3].equals(""))) {
                    JOptionPane.showMessageDialog(
                            new Frame(), "Enter at least 1 name", "Alert", JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
                arr = arr_temp; // arr holds player names
                System.out.println("No Duplicate. Advancing");
                String message = "Player names:\n" + arr[0] + ",  " + arr[1] + ",  " + arr[2] + ",  " + arr[3] + "\n";
                message += "Bot Difficulty:\n" + difficulty + "\n";
                if (is_bot_array[1]) {
                    message += "Player 2 is a bot\n";
                }
                if (is_bot_array[2]) {
                    message += "Player 3 is a bot\n";
                }
                if (is_bot_array[3]) {
                    message += "Player 4 is a bot\n";
                }
                JOptionPane.showMessageDialog(new Frame(), message, "Message", JOptionPane.INFORMATION_MESSAGE);
                mainFrame.removeAll();
                mainFrame.setVisible(false);
                main_game game_instance = new main_game();
                game_instance.init();
//                System.exit(5);
            }
        });
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings_instance.show();
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bot difficulty set to: " + comboBox1.getSelectedItem());
                if (comboBox1.getSelectedItem().equals("Easy")) {
                    difficulty = "Easy";
                }
                if (comboBox1.getSelectedItem().equals("Medium")) {
                    difficulty = "Medium";
                }
                if (comboBox1.getSelectedItem().equals("Hard")) {
                    difficulty = "Hard";
                }
            }
        });
        ;
        RadioButton2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Player 2 assigned as bot");
                    is_bot_array[1] = true;
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Player 2 unassigned as bot");
                    is_bot_array[1] = false;
                }
            }
        });
        RadioButton3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Player 3 assigned as bot");
                    is_bot_array[2] = true;
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Player 3 unassigned as bot");
                    is_bot_array[2] = false;
                }
            }
        });
        RadioButton4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Player 4 assigned as bot");
                    is_bot_array[3] = true;
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Player 4 unassigned as bot");
                    is_bot_array[3] = false;
                }
            }
        });
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
        top_main_panel = new JPanel();
        top_main_panel.setLayout(new BorderLayout(0, 0));
        top_main_panel.setBackground(new Color(-263173));
        main_panel.add(top_main_panel, BorderLayout.NORTH);
        top_main_subpanel_left = new JPanel();
        top_main_subpanel_left.setLayout(new GridBagLayout());
        top_main_subpanel_left.setBackground(new Color(-328966));
        top_main_panel.add(top_main_subpanel_left, BorderLayout.WEST);
        start_lanel = new JLabel();
        start_lanel.setBackground(new Color(-328966));
        Font start_lanelFont = this.$$$getFont$$$(null, Font.BOLD, 48, start_lanel.getFont());
        if (start_lanelFont != null) start_lanel.setFont(start_lanelFont);
        start_lanel.setForeground(new Color(-10396834));
        start_lanel.setText("  Start Menu");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        top_main_subpanel_left.add(start_lanel, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        top_main_subpanel_left.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        top_main_subpanel_left.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        top_main_subpanel_left.add(spacer3, gbc);
        bottom_main_panel = new JPanel();
        bottom_main_panel.setLayout(new BorderLayout(0, 0));
        bottom_main_panel.setBackground(new Color(-12369083));
        bottom_main_panel.setEnabled(false);
        main_panel.add(bottom_main_panel, BorderLayout.SOUTH);
        bottom_main_subpanel_left = new JPanel();
        bottom_main_subpanel_left.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        bottom_main_subpanel_left.setBackground(new Color(-12369083));
        bottom_main_panel.add(bottom_main_subpanel_left, BorderLayout.WEST);
        optionsButton = new JButton();
        optionsButton.setText("Options");
        bottom_main_subpanel_left.add(optionsButton);
        HELPButton = new JButton();
        HELPButton.setText("HELP");
        bottom_main_subpanel_left.add(HELPButton);
        bottom_main_subpanel_right = new JPanel();
        bottom_main_subpanel_right.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        bottom_main_subpanel_right.setBackground(new Color(-12369083));
        bottom_main_subpanel_right.setEnabled(false);
        bottom_main_panel.add(bottom_main_subpanel_right, BorderLayout.EAST);
        RESUMEButton = new JButton();
        RESUMEButton.setBackground(new Color(-10789446));
        RESUMEButton.setForeground(new Color(-1));
        RESUMEButton.setText("RESUME");
        bottom_main_subpanel_right.add(RESUMEButton);
        STARTGAMEButton = new JButton();
        STARTGAMEButton.setBackground(new Color(-4784205));
        STARTGAMEButton.setText("START GAME");
        bottom_main_subpanel_right.add(STARTGAMEButton);
        centre_main_panel = new JPanel();
        centre_main_panel.setLayout(new GridBagLayout());
        main_panel.add(centre_main_panel, BorderLayout.CENTER);
        centre_player_panel_1 = new JPanel();
        centre_player_panel_1.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        centre_main_panel.add(centre_player_panel_1, gbc);
        centre_player_panel_1.setBorder(BorderFactory.createTitledBorder(null, "Enter name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 150;
        centre_player_panel_1.add(textField1, gbc);
        cannot_assign_bot_msg = new JLabel();
        cannot_assign_bot_msg.setText("Cannot assign as bot");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        centre_player_panel_1.add(cannot_assign_bot_msg, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer4, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 5;
        centre_main_panel.add(spacer5, gbc);
        centre_player_panel_2 = new JPanel();
        centre_player_panel_2.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        centre_main_panel.add(centre_player_panel_2, gbc);
        centre_player_panel_2.setBorder(BorderFactory.createTitledBorder(null, "Enter name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textField2 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 150;
        centre_player_panel_2.add(textField2, gbc);
        RadioButton2 = new JRadioButton();
        RadioButton2.setText("Assign as a bot");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        centre_player_panel_2.add(RadioButton2, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer6, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer7, gbc);
        centre_player_panel_3 = new JPanel();
        centre_player_panel_3.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        centre_main_panel.add(centre_player_panel_3, gbc);
        centre_player_panel_3.setBorder(BorderFactory.createTitledBorder(null, "Enter name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textField3 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 150;
        centre_player_panel_3.add(textField3, gbc);
        RadioButton3 = new JRadioButton();
        RadioButton3.setText("Assign as a bot");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        centre_player_panel_3.add(RadioButton3, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer8, gbc);
        centre_player_panel_4 = new JPanel();
        centre_player_panel_4.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        centre_main_panel.add(centre_player_panel_4, gbc);
        centre_player_panel_4.setBorder(BorderFactory.createTitledBorder(null, "Enter name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textField4 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 150;
        centre_player_panel_4.add(textField4, gbc);
        RadioButton4 = new JRadioButton();
        RadioButton4.setText("Assign as a bot");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        centre_player_panel_4.add(RadioButton4, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer11, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer12, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer13, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer14, gbc);
        button1 = new JButton();
        button1.setBackground(new Color(-1857626));
        button1.setText("");
        button1.setToolTipText("player color");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 100;
        centre_main_panel.add(button1, gbc);
        button2 = new JButton();
        button2.setBackground(new Color(-3742804));
        button2.setText("");
        button2.setToolTipText("player color");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 100;
        centre_main_panel.add(button2, gbc);
        button3 = new JButton();
        button3.setBackground(new Color(-1842243));
        button3.setText("");
        button3.setToolTipText("player color");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 100;
        centre_main_panel.add(button3, gbc);
        button4 = new JButton();
        button4.setBackground(new Color(-2698269));
        button4.setText("");
        button4.setToolTipText("player color");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 100;
        centre_main_panel.add(button4, gbc);
        final JPanel spacer15 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer15, gbc);
        final JPanel spacer16 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer16, gbc);
        final JPanel spacer17 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer17, gbc);
        final JPanel spacer18 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer18, gbc);
        final JPanel spacer19 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(spacer19, gbc);
        final JPanel spacer20 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer20, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("   Bot difficulty (Default = Easy)");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        centre_main_panel.add(label1, gbc);
        final JPanel spacer21 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_main_panel.add(spacer21, gbc);
        comboBox1 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_main_panel.add(comboBox1, gbc);
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

    public void create_save_file() {
        String path = (System.getProperty("user.dir")) + "/settings.txt";
        //opening the file
        try {
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("Saving file created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(path);
                myWriter.write("scheme1");
                myWriter.close();
                System.out.println("Successfully saved settings.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void init(settings st) {
        settings_instance = st;
        this.mainFrame = new JFrame("MALEFIZ BOARD GAME");
        mainFrame.setLocation
                ((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 340,
                        (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 315);
        this.mainFrame.add(this.main_panel);
        this.mainFrame.setPreferredSize(new Dimension(750, 405));
        this.mainFrame.setMinimumSize(new Dimension(750, 405));
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setResizable(false);
        this.mainFrame.setVisible(true);
        this.mainFrame.repaint();
        this.mainFrame.validate();
        while (true) {
            button1.setBackground(settings_instance.color1);
            button2.setBackground(settings_instance.color2);
            button3.setBackground(settings_instance.color3);
            button4.setBackground(settings_instance.color4);
        }
//        while (arr == null) {/* waiting while arr is initialized */}
//        System.out.println("it worked!");
    }

}
