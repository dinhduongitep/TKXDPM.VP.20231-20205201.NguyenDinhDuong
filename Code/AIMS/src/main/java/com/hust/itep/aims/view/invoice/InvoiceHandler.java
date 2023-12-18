package com.hust.itep.aims.view.invoice;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.hust.itep.aims.controller.VnPayController;
import com.hust.itep.aims.dao.order.OrderDAO;
import com.hust.itep.aims.entity.media.Media;
import com.hust.itep.aims.service.EventCellInputChange;
import com.hust.itep.aims.service.QtyCellEditor;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class InvoiceHandler extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JLabel lbTotal;
    private JTable table;
    int total;
    public InvoiceHandler() throws SQLException {
        initComponents();
        setData();
    }
    private void setData() throws SQLException {
        table.getColumnModel().getColumn(3).setCellEditor(new QtyCellEditor(new EventCellInputChange() {
            @Override
            public void inputChanged() {
                sumAmount();
            }
        }));
        table.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        table.getColumnModel().getColumn(4).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        table.getColumnModel().getColumn(5).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        table.getColumnModel().getColumn(6).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        List<Media> medium = new ArrayList<>();
        medium = new OrderDAO().getOrder(1);
        int i = 0;
        for (Media media : medium) {
            model.addRow(new Media(i, media.getTitle(), media.getPrice(), media.getCategory(), media.getQuantity()).toTableRow(table.getRowCount() + 1));
            i++;
        }
        sumAmount();
    }

    private void sumAmount() {
        for (int i = 0; i < table.getRowCount(); i++) {
            Media item = (Media) table.getValueAt(i, 0);
            total += item.getPrice()*item.getQuantity();
        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        lbTotal.setText(df.format(total)+" VND");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        table = new JTable();
        jLabel1 = new JLabel();
        lbTotal = new JLabel();
        jButton1 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Data", "No", "Name", "Category", "Price", "Quantity", "Total Price"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setPreferredWidth(30);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jLabel1.setText("Total");

        lbTotal.setText("0.0");

        jButton1.setText("Payment");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VnPayController vnpayController = new VnPayController();
                try {
                    String paymentUrl = vnpayController.createPaymentUrl("1", total * 100000);
                    vnpayController.openURL(paymentUrl);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
//                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(97, 97, 97)
                                                                .addComponent(lbTotal)))
                                                .addGap(8, 8, 8)))
//                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(lbTotal))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }



    public static void run() {
        FlatLaf.registerCustomDefaultsSource("style");
        FlatDarculaLaf.setup();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InvoiceHandler().setVisible(true);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
