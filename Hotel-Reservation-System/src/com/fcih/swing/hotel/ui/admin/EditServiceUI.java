package com.fcih.swing.hotel.ui.admin;

import com.fcih.swing.hotel.ui.Drawable;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EditServiceUI extends JPanel implements Drawable {

    private JButton deleteServiceBtn;
    private JButton updateServiceBtn;
    private JScrollPane serviceTableScrollPane;
    private JTable serviceTable;
    
    public EditServiceUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        serviceTableScrollPane = new JScrollPane();
        serviceTable = new JTable();
        updateServiceBtn = new JButton();
        deleteServiceBtn = new JButton();
    }

    @Override
    public void draw() {

        drawServiceTable();
        drawBtn();

        GroupLayout editServicePanelLayout = new GroupLayout(this);
        setLayout(editServicePanelLayout);
        editServicePanelLayout.setHorizontalGroup(
                editServicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editServicePanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(deleteServiceBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(updateServiceBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(251, Short.MAX_VALUE))
                .addGroup(editServicePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serviceTableScrollPane)
                        .addContainerGap())
        );
        editServicePanelLayout.setVerticalGroup(
                editServicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editServicePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serviceTableScrollPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editServicePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteServiceBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateServiceBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
    }

    private void drawServiceTable() {
        serviceTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        serviceTable.getTableHeader().setOpaque(false);
        serviceTable.getTableHeader().setBackground(new Color(32, 136, 203));
        serviceTable.getTableHeader().setForeground(new Color(255, 255, 255));

        serviceTableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Service Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        serviceTable.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
        serviceTable.setFont(new Font("Tahoma", 0, 18));
        serviceTable.setModel(new DefaultTableModel(
                new Object[][]{
                    {new Integer(1), "Serv_1", new Integer(100)},
                    {new Integer(2), "Serv_2", new Integer(200)},
                    {new Integer(3), "Serv_3", new Integer(300)},
                    {new Integer(4), "Serv_4", new Integer(400)}
                },
                new String[]{
                    "Column", "Name", "Cost"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class, String.class, Integer.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);

        serviceTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        for (int i = 1; i < serviceTable.getColumnCount(); i++) {
            serviceTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }

        serviceTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        serviceTable.setRowHeight(35);
        serviceTable.setRowMargin(5);
        serviceTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        serviceTableScrollPane.setViewportView(serviceTable);
    }

    private void drawBtn() {

        deleteServiceBtn.setFont(new Font("Tahoma", 1, 18));
        deleteServiceBtn.setText("Update");
        deleteServiceBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        updateServiceBtn.setFont(new Font("Tahoma", 1, 18));
        updateServiceBtn.setText("Delete");
        updateServiceBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
