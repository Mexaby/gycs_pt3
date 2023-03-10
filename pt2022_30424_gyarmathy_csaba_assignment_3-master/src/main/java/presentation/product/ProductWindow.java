package presentation.product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Main product window class generated by the Swing form editor
 * Contains ActionListeners for each button in the window
 *
 * @author Csabi
 */
public class ProductWindow extends JFrame{
    private JButton addNewProductButton;
    private JButton editExistingProductButton;
    private JButton deleteProductButton;
    private JButton viewAllProductsButton;
    private JPanel productPanel;

    public ProductWindow() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.add(productPanel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        addNewProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddProductWindow();
            }
        });
        editExistingProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditProductWindow();
            }
        });

        deleteProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteProductWindow();
            }
        });
        viewAllProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ShowProductsWindow();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
