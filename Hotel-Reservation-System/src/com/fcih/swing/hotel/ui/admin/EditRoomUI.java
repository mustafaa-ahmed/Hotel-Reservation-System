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

public class EditRoomUI extends JPanel implements Drawable {

    private JButton deleteRoomBtn;
    private JButton updateRoomBtn;
    private JScrollPane roomTableScrollPane;
    private JTable roomTable;

    public EditRoomUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        roomTableScrollPane = new JScrollPane();
        roomTable = new JTable();
        updateRoomBtn = new JButton();
        deleteRoomBtn = new JButton();
    }

    @Override
    public void draw() {

        drawRoomTable();
        drawBtn();

        GroupLayout editRoomPanelLayout = new GroupLayout(this);
        setLayout(editRoomPanelLayout);
        editRoomPanelLayout.setHorizontalGroup(
                editRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editRoomPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(deleteRoomBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(updateRoomBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(251, Short.MAX_VALUE))
                .addGroup(editRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomTableScrollPane)
                        .addContainerGap())
        );
        editRoomPanelLayout.setVerticalGroup(
                editRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomTableScrollPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteRoomBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateRoomBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
    }

    private void drawRoomTable() {
        roomTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        roomTable.getTableHeader().setOpaque(false);
        roomTable.getTableHeader().setBackground(new Color(32, 136, 203));
        roomTable.getTableHeader().setForeground(new Color(255, 255, 255));

        roomTableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Room Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        roomTable.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
        roomTable.setFont(new Font("Tahoma", 0, 18));
        roomTable.setModel(new DefaultTableModel(
                new Object[][]{
                    {new Integer(1), "Room_1", new Integer(100), "Garden View", "Single"},
                    {new Integer(2), "Room_2", new Integer(200), "Pool View", "Double"},
                    {new Integer(3), "Room_3", new Integer(300), "Nile View", "Triple"},
                    {new Integer(4), "Room_4", new Integer(400), "Sea View", "Quadruple"}
                },
                new String[]{
                    "Column", "Name", "Cost", "Room Type", "View Type"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class, String.class, Integer.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
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

        roomTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        for (int i = 1; i < roomTable.getColumnCount(); i++) {
            roomTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }

        roomTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        roomTable.setRowHeight(35);
        roomTable.setRowMargin(5);
        roomTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        roomTableScrollPane.setViewportView(roomTable);
    }

    private void drawBtn() {

        deleteRoomBtn.setFont(new Font("Tahoma", 1, 18));
        deleteRoomBtn.setText("Update");
        deleteRoomBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        updateRoomBtn.setFont(new Font("Tahoma", 1, 18));
        updateRoomBtn.setText("Delete");
        updateRoomBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
