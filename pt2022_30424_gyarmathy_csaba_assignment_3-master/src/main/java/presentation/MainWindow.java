package presentation;

import presentation.client.ClientWindow;
import presentation.order.AddOrderWindow;
import presentation.product.ProductWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main window class generated by the Swing form editor
 * Contains ActionListeners for each button in the window
 *
 * @author Csabi
 */
public class MainWindow extends JFrame {
    private JButton clientsButton;
    private JButton productsButton;
    private JButton ordersButton;
    private JPanel mainPanel;

    public MainWindow() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(mainPanel);
        frame.setSize(300, 200);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        clientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClientWindow();
            }
        });
        productsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProductWindow();
            }
        });
        ordersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddOrderWindow();
            }
        });
    }
}