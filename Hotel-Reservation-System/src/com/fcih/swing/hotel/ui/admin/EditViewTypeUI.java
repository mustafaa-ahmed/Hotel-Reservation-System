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

public class EditViewTypeUI extends JPanel implements Drawable {

    private JButton deleteViewTypeBtn;
    private JButton updateViewTypeBtn;
    private JScrollPane viewTypeTableScrollPane;
    private JTable viewTypeTable;

    public EditViewTypeUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        viewTypeTableScrollPane = new JScrollPane();
        viewTypeTable = new JTable();
        updateViewTypeBtn = new JButton();
        deleteViewTypeBtn = new JButton();
    }

    @Override
    public void draw() {

        drawServiceTable();
        drawBtn();

        GroupLayout editViewTypePanelLayout = new GroupLayout(this);
        setLayout(editViewTypePanelLayout);
        editViewTypePanelLayout.setHorizontalGroup(
                editViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editViewTypePanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(deleteViewTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(updateViewTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(251, Short.MAX_VALUE))
                .addGroup(editViewTypePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewTypeTableScrollPane)
                        .addContainerGap())
        );
        editViewTypePanelLayout.setVerticalGroup(
                editViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editViewTypePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewTypeTableScrollPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteViewTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateViewTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
    }

    private void drawServiceTable() {
        viewTypeTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        viewTypeTable.getTableHeader().setOpaque(false);
        viewTypeTable.getTableHeader().setBackground(new Color(32, 136, 203));
        viewTypeTable.getTableHeader().setForeground(new Color(255, 255, 255));

        viewTypeTableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "View Type Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        viewTypeTable.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
        viewTypeTable.setFont(new Font("Tahoma", 0, 18));
        viewTypeTable.setModel(new DefaultTableModel(
                new Object[][]{
                    {new Integer(1), "ViewType_1", new Integer(100)},
                    {new Integer(2), "ViewType_2", new Integer(200)},
                    {new Integer(3), "ViewType_3", new Integer(300)},
                    {new Integer(4), "ViewType_4", new Integer(400)}
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

        viewTypeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        for (int i = 1; i < viewTypeTable.getColumnCount(); i++) {
            viewTypeTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }

        viewTypeTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        viewTypeTable.setRowHeight(35);
        viewTypeTable.setRowMargin(5);
        viewTypeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        viewTypeTableScrollPane.setViewportView(viewTypeTable);
    }

    private void drawBtn() {

        deleteViewTypeBtn.setFont(new Font("Tahoma", 1, 18));
        deleteViewTypeBtn.setText("Update");
        deleteViewTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        updateViewTypeBtn.setFont(new Font("Tahoma", 1, 18));
        updateViewTypeBtn.setText("Delete");
        updateViewTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
