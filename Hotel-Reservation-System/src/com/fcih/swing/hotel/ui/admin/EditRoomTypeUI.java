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

public class EditRoomTypeUI extends JPanel implements Drawable {

    private JButton deleteRoomTypeBtn;
    private JButton updateRoomTypeBtn;
    private JScrollPane roomTypeTableScrollPane;
    private JTable roomTypeTable;

    public EditRoomTypeUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        roomTypeTableScrollPane = new JScrollPane();
        roomTypeTable = new JTable();
        updateRoomTypeBtn = new JButton();
        deleteRoomTypeBtn = new JButton();
    }

    @Override
    public void draw() {

        drawServiceTable();
        drawBtn();

        GroupLayout editRoomTypePanelLayout = new GroupLayout(this);
        setLayout(editRoomTypePanelLayout);
        editRoomTypePanelLayout.setHorizontalGroup(
                editRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editRoomTypePanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(deleteRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(updateRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(251, Short.MAX_VALUE))
                .addGroup(editRoomTypePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomTypeTableScrollPane)
                        .addContainerGap())
        );
        editRoomTypePanelLayout.setVerticalGroup(
                editRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editRoomTypePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomTypeTableScrollPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
    }

    private void drawServiceTable() {
        roomTypeTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        roomTypeTable.getTableHeader().setOpaque(false);
        roomTypeTable.getTableHeader().setBackground(new Color(32, 136, 203));
        roomTypeTable.getTableHeader().setForeground(new Color(255, 255, 255));

        roomTypeTableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Room Type Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        roomTypeTable.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
        roomTypeTable.setFont(new Font("Tahoma", 0, 18));
        roomTypeTable.setModel(new DefaultTableModel(
                new Object[][]{
                    {new Integer(1), "RoomType_1", new Integer(100)},
                    {new Integer(2), "RoomType_2", new Integer(200)},
                    {new Integer(3), "RoomType_3", new Integer(300)},
                    {new Integer(4), "RoomType_4", new Integer(400)}
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

        roomTypeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        for (int i = 1; i < roomTypeTable.getColumnCount(); i++) {
            roomTypeTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }

        roomTypeTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        roomTypeTable.setRowHeight(35);
        roomTypeTable.setRowMargin(5);
        roomTypeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        roomTypeTableScrollPane.setViewportView(roomTypeTable);
    }

    private void drawBtn() {

        deleteRoomTypeBtn.setFont(new Font("Tahoma", 1, 18));
        deleteRoomTypeBtn.setText("Update");
        deleteRoomTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        updateRoomTypeBtn.setFont(new Font("Tahoma", 1, 18));
        updateRoomTypeBtn.setText("Delete");
        updateRoomTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
