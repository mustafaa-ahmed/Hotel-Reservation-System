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

public class EditEmployeeUI extends JPanel implements Drawable {

    private JButton deleteEmpBtn;
    private JButton updateEmpBtn;
    private JScrollPane empTableScrollPane;
    private JTable employeeTable;

    public EditEmployeeUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {

        empTableScrollPane = new JScrollPane();
        employeeTable = new JTable();
        updateEmpBtn = new JButton();
        deleteEmpBtn = new JButton();
    }

    @Override
    public void draw() {

        drawEmployeeTable();
        drawBtn();

        GroupLayout editEmployeePanelLayout = new GroupLayout(this);
        setLayout(editEmployeePanelLayout);
        editEmployeePanelLayout.setHorizontalGroup(
                editEmployeePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editEmployeePanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(deleteEmpBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(updateEmpBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(251, Short.MAX_VALUE))
                .addGroup(editEmployeePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empTableScrollPane)
                        .addContainerGap())
        );
        editEmployeePanelLayout.setVerticalGroup(
                editEmployeePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(editEmployeePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empTableScrollPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editEmployeePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteEmpBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateEmpBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
    }

    private void drawEmployeeTable() {
        employeeTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        employeeTable.getTableHeader().setOpaque(false);
        employeeTable.getTableHeader().setBackground(new Color(32, 136, 203));
        employeeTable.getTableHeader().setForeground(new Color(255, 255, 255));

        empTableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Employee Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        employeeTable.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
        employeeTable.setFont(new Font("Tahoma", 0, 18));
        employeeTable.setModel(new DefaultTableModel(
                new Object[][]{
                    {new Integer(1), "mustafa", new Integer(1234), new Integer(11000), "01110335177", "mustafaa.fcih@gmail.com", null, new Boolean(true)},
                    {new Integer(2), "ghada", new Integer(1235), new Integer(12000), "01111166055", "ghada.fcih@gmail.com", null, new Boolean(true)},
                    {new Integer(3), "esraa", new Integer(1236), new Integer(13000), "01016130050", null, null, null},
                    {new Integer(4), "passant", new Integer(1237), new Integer(14000), "01099655177", null, null, null}
                },
                new String[]{
                    "Column", "Name", "Code", "Salary", "Phone", "Email", "Adrdress", "Is Superuser"
                }
        ) {
            Class[] types = new Class[]{
                Integer.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
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

        employeeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        for (int i = 1; i < employeeTable.getColumnCount(); i++) {
            employeeTable.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }

        employeeTable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        employeeTable.setRowHeight(35);
        employeeTable.setRowMargin(5);
        employeeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        empTableScrollPane.setViewportView(employeeTable);
    }

    private void drawBtn() {

        deleteEmpBtn.setFont(new Font("Tahoma", 1, 18));
        deleteEmpBtn.setText("Update");
        deleteEmpBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        updateEmpBtn.setFont(new Font("Tahoma", 1, 18));
        updateEmpBtn.setText("Delete");
        updateEmpBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }
}
