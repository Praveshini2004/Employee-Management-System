/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author DELL
 */
public class Home extends JFrame implements ActionListener {
    JButton view, add, update, remove;

    Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon("src/icons/home.jpg");
        Image i2 = i1.getImage().getScaledInstance(1000, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 630);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(280, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        image.add(heading);
 
        int buttonWidth = 150;
        int buttonHeight = 40;

        add = new JButton("Add Employee");
        add.setBounds((1000 - buttonWidth) / 2, 80, buttonWidth, buttonHeight);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employees");
        view.setBounds((1000 - buttonWidth) / 2, 140, buttonWidth, buttonHeight);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds((1000 - buttonWidth) / 2, 200, buttonWidth, buttonHeight);
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds((1000 - buttonWidth) / 2, 260, buttonWidth, buttonHeight);
        remove.addActionListener(this);
        image.add(remove);

        setSize(1000, 630);
        setLocation(200, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == remove) {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}