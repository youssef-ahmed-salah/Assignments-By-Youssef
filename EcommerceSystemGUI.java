import javax.swing.*;
import java.awt.event.*;

public class EcommerceSystemGUI extends JFrame {
    private JTextField nameField, idField, addressField;
    private JComboBox<String> productComboBox;
    private JButton addProductButton, placeOrderButton;
    private JTextArea outputArea;

    // Variables to store total price
    private double totalPrice = 0.0;

    public EcommerceSystemGUI() {
        setTitle("E-Commerce System");
        setSize(400, 400); // Increased size to accommodate larger order summary
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 25);
        add(nameField);

        // ID
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 60, 80, 25);
        add(idLabel);
        idField = new JTextField();
        idField.setBounds(120, 60, 200, 25);
        add(idField);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 100, 80, 25);
        add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(120, 100, 200, 25);
        add(addressField);

        // Product selection
        JLabel productLabel = new JLabel("Select Product:");
        productLabel.setBounds(20, 140, 100, 25);
        add(productLabel);
        String[] products = {"Smartphone", "T-Shirt", "Book"};
        productComboBox = new JComboBox<>(products);
        productComboBox.setBounds(120, 140, 200, 25);
        add(productComboBox);

        // Add Product button
        addProductButton = new JButton("Add Product");
        addProductButton.setBounds(20, 180, 150, 25);
        add(addProductButton);

        // Place Order button
        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setBounds(200, 180, 150, 25);
        add(placeOrderButton);

        // Output area
        outputArea = new JTextArea();
        outputArea.setBounds(20, 220, 350, 120); // Increased size of the output area
        outputArea.setEditable(false);
        add(outputArea);

        // Action Listeners
        addProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        placeOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placeOrder();
            }
        });
    }

    private void addProduct() {
        String productName = (String) productComboBox.getSelectedItem();
        double price = getProductPrice(productName);
        outputArea.append("Product added: " + productName + " ($" + price + ")\n");
        totalPrice += price;
    }

    private double getProductPrice(String productName) {
        switch (productName) {
            case "Smartphone":
                return 599.99;
            case "T-Shirt":
                return 19.99;
            case "Book":
                return 39.99;
            default:
                return 0.0;
        }
    }

    private void placeOrder() {
        String name = nameField.getText();
        String id = idField.getText();
        String address = addressField.getText();
        outputArea.append("Order placed for: " + name + " (ID: " + id + "), Address: " + address + "\n");
        outputArea.append("Total Price: $" + (float)totalPrice + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EcommerceSystemGUI().setVisible(true);
            }
        });
    }
}
