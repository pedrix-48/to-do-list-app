package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {

    InsertData data = new InsertData();

    public App() {
        // nee frame nian
        this.setSize(450, 600);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ba top panel nian
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(new Color(50, 100, 70));
        topPanel.setPreferredSize(new Dimension(300, 150));
        this.add(topPanel, BorderLayout.NORTH);

        // ba label nian
        JLabel titleLabel = new JLabel("To Do List");
        titleLabel.setFont(new Font("Sans Serif", Font.BOLD, 35));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        topPanel.add(titleLabel, BorderLayout.CENTER);

        // ba panel klaran nian (Conteudu)
        JPanel midPanel = new JPanel();
        midPanel.setBackground(new Color(20, 50, 50));
        midPanel.setLayout(null);
        this.add(midPanel, BorderLayout.CENTER);

        // butaun inserts
        JButton insertButton = new JButton("INSERT");
        insertButton.setFont(new Font("Sans Serif", Font.BOLD, 16));
        midPanel.add(insertButton);
        insertButton.setBounds(320, 310, 100, 30);
        insertButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        insertButton.setBackground(new Color(205, 255, 204));
        insertButton.setFocusable(false);
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lista = JOptionPane.showInputDialog(null, "Prense Lista Foun: ");
                if (lista != null) {
                    data.Insert(lista);
                }else{
                    JOptionPane.showMessageDialog(null, "KANSELA ONA!");
                }
            }
        });

        // butaun update
        JButton updateButton = new JButton("UPDATE");
        updateButton.setFont(new Font("Sans Serif", Font.BOLD, 16));
        midPanel.add(updateButton);
        updateButton.setBounds(170, 310, 120, 30);
        updateButton.setBackground(new Color(255, 255, 143));
        updateButton.setBorder(BorderFactory.createLineBorder(new Color(255, 193, 110)));
        updateButton.setFocusable(false);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // sei prosesu hela !!!
            }
        });

        // delete button
        JButton deleteButton = new JButton("DELETE");
        deleteButton.setFont(new Font("Sans Serif", Font.BOLD, 16));
        deleteButton.setForeground(Color.WHITE);
        midPanel.add(deleteButton);
        deleteButton.setBounds(20, 310, 120, 30);
        deleteButton.setBackground(Color.GRAY);
        deleteButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // sei prosesu hela !!!
            }
        });
    }

    public static void main(String[] KURURIN) {
        new App().setVisible(true);
    }
}
