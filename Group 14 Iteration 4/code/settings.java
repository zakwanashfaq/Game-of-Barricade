import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class settings {
    private JFrame settings_frame;
    private JPanel settings_panel;
    private JLabel label_top;
    private JPanel top_panel;
    private JButton SAVEButton;
    private JPanel bottom_panel;
    private JPanel centre_panel;
    private JButton scheme1Button1;
    private JButton scheme3Button;
    private JButton player1Button;
    private JButton scheme2Button;
    private JButton player2button;
    private JButton player3button;
    private JButton player4button;
    Color color1, color2, color3, color4;

    public settings() {
        settings_frame = new JFrame("Malefiz Game Display Options");
        settings_frame.add(settings_panel);
        settings_frame.setMinimumSize(new Dimension(484, 435));
        settings_frame.setPreferredSize(new Dimension(484, 435));
        settings_frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 240, (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 215);
        settings_frame.setResizable(false);
        String path = (System.getProperty("user.dir")) + "/settings.txt";
        String scheme = "scheme1";
        File file = new File(path);
        try {
            Scanner scanned_file = new Scanner(file);
            scheme = scanned_file.nextLine();
        } catch (Exception e) {
            System.out.println("Error occured while reading settings file");
        }
        if (scheme.equals("scheme1")) {
            color1 = new Color(0xFF8383);
            color2 = new Color(0xA4CA8B);
            color3 = new Color(0xB1ACF6);
            color4 = new Color(0xFDC809);
        }
        if (scheme.equals("scheme2")) {
            color1 = new Color(0xE5E5E5);
            color2 = new Color(0xDDDDDD);
            color3 = new Color(0xA2A2A2);
            color4 = new Color(0x000000);
        }
        if (scheme.equals("scheme3")) {
            color1 = new Color(0x000DFF);
            color2 = new Color(0xA6A6C4);
            color3 = new Color(0xFA3475);
            color4 = new Color(0x6AB0EE);
        }

//        settings_frame.setResizable(false);

        System.out.println("Open settings file");
        scheme1Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color1 = new Color(0xFF8383);
                color2 = new Color(0xA4CA8B);
                color3 = new Color(0xB1ACF6);
                color4 = new Color(0xFDC809);
                player1Button.setBackground(color1);
                player2button.setBackground(color2);
                player3button.setBackground(color3);
                player4button.setBackground(color4);
                try {
                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write("scheme1");
                    myWriter.close();
                } catch (Exception f) {

                }
            }
        });
        scheme2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color1 = new Color(0xE5E5E5);
                color2 = new Color(0xDDDDDD);
                color3 = new Color(0xA2A2A2);
                color4 = new Color(0x000000);
                player1Button.setBackground(color1);
                player2button.setBackground(color2);
                player3button.setBackground(color3);
                player4button.setBackground(color4);
                try {
                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write("scheme2");
                    myWriter.close();
                } catch (Exception f) {

                }
            }
        });
        scheme3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color1 = new Color(0x000DFF);
                color2 = new Color(0xA6A6C4);
                color3 = new Color(0xFA3475);
                color4 = new Color(0x6AB0EE);
                player1Button.setBackground(color1);
                player2button.setBackground(color2);
                player3button.setBackground(color3);
                player4button.setBackground(color4);
                try {
                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write("scheme3");
                    myWriter.close();
                } catch (Exception f) {

                }
            }
        });
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saved settings file");
                JOptionPane.showMessageDialog(new Frame(), "You can change color scheme\n anytime during the game", "Message", JOptionPane.INFORMATION_MESSAGE);
                hide();
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
        settings_panel = new JPanel();
        settings_panel.setLayout(new BorderLayout(0, 0));
        settings_panel.setBackground(new Color(-197380));
        top_panel = new JPanel();
        top_panel.setLayout(new BorderLayout(0, 0));
        top_panel.setBackground(new Color(-197380));
        settings_panel.add(top_panel, BorderLayout.NORTH);
        label_top = new JLabel();
        Font label_topFont = this.$$$getFont$$$(null, Font.BOLD, 48, label_top.getFont());
        if (label_topFont != null) label_top.setFont(label_topFont);
        label_top.setText("           Settings");
        top_panel.add(label_top, BorderLayout.CENTER);
        bottom_panel = new JPanel();
        bottom_panel.setLayout(new BorderLayout(0, 0));
        bottom_panel.setBackground(new Color(-197380));
        settings_panel.add(bottom_panel, BorderLayout.SOUTH);
        SAVEButton = new JButton();
        SAVEButton.setBackground(new Color(-6298727));
        Font SAVEButtonFont = this.$$$getFont$$$(null, Font.BOLD, 20, SAVEButton.getFont());
        if (SAVEButtonFont != null) SAVEButton.setFont(SAVEButtonFont);
        SAVEButton.setForeground(new Color(-13355980));
        SAVEButton.setText("SAVE");
        bottom_panel.add(SAVEButton, BorderLayout.CENTER);
        centre_panel = new JPanel();
        centre_panel.setLayout(new GridBagLayout());
        centre_panel.setBackground(new Color(-197380));
        settings_panel.add(centre_panel, BorderLayout.CENTER);
        final JPanel spacer1 = new JPanel();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_panel.add(spacer2, gbc);
        scheme1Button1 = new JButton();
        scheme1Button1.setText("scheme1");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(scheme1Button1, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer4, gbc);
        scheme3Button = new JButton();
        scheme3Button.setText("scheme3");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(scheme3Button, gbc);
        player1Button = new JButton();
        player1Button.setText("Player 1");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 50;
        centre_panel.add(player1Button, gbc);
        final JButton button1 = new JButton();
        button1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button1, gbc);
        final JButton button2 = new JButton();
        button2.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button2, gbc);
        final JButton button3 = new JButton();
        button3.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button3, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_panel.add(spacer5, gbc);
        final JButton button4 = new JButton();
        button4.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button4, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer6, gbc);
        player2button = new JButton();
        player2button.setText("Player 2");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 50;
        centre_panel.add(player2button, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer7, gbc);
        scheme2Button = new JButton();
        scheme2Button.setText("scheme2");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(scheme2Button, gbc);
        final JButton button5 = new JButton();
        button5.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button5, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        centre_panel.add(spacer8, gbc);
        player3button = new JButton();
        player3button.setText("Player 3");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 50;
        centre_panel.add(player3button, gbc);
        final JButton button6 = new JButton();
        button6.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button6, gbc);
        final JButton button7 = new JButton();
        button7.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button7, gbc);
        player4button = new JButton();
        player4button.setText("Player 4");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 50;
        centre_panel.add(player4button, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        centre_panel.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 15;
        centre_panel.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 15;
        centre_panel.add(spacer11, gbc);
        final JButton button8 = new JButton();
        button8.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 66;
        centre_panel.add(button8, gbc);
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
        return settings_panel;
    }

    /**
     * @noinspection ALL
     */

    /* returns the current color scheme */
    public void get_color_scheme() {

    }

    // shows the frame
    public void show() {
        settings_frame.setVisible(true);
    }

    // hides the frame
    public void hide() {
        settings_frame.setVisible(false);
    }


}
