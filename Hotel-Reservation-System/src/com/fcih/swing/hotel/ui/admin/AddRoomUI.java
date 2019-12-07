package com.fcih.swing.hotel.ui.admin;

import com.fcih.swing.hotel.ui.Drawable;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public final class AddRoomUI extends JPanel implements Drawable {

    private JLabel roomNumberLabel;
    private JTextField roomNumberTextField;

    private JLabel costLabel;
    private JTextField costTextField;

    private JComboBox roomTypeComboBox;
    private JLabel roomTypeLabel;

    private JComboBox viewTypeComboBox;
    private JLabel viewTypeLabel;

    private JButton addRoomBtn;

    public AddRoomUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {
        roomNumberLabel = new JLabel();
        roomNumberTextField = new JTextField();

        costLabel = new JLabel();
        costTextField = new JTextField();

        viewTypeLabel = new JLabel();
        viewTypeComboBox = new JComboBox();

        roomTypeLabel = new JLabel();
        roomTypeComboBox = new JComboBox();

        addRoomBtn = new JButton();
    }

    @Override
    public void draw() {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Room Data", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        preparePanelComponent();

        GroupLayout addRoomPanelLayout = new GroupLayout(this);
        setLayout(addRoomPanelLayout);
        addRoomPanelLayout.setHorizontalGroup(
                addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(addRoomPanelLayout.createSequentialGroup()
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(viewTypeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomNumberLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(roomNumberTextField)
                                .addComponent(viewTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(202, 202, 202)
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(roomTypeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costLabel, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(costTextField)
                                .addComponent(roomTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(addRoomPanelLayout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(addRoomBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(432, Short.MAX_VALUE))
        );
        addRoomPanelLayout.setVerticalGroup(
                addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, addRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(costLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomNumberLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costTextField, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addComponent(roomNumberTextField))
                        .addGap(110, 110, 110)
                        .addGroup(addRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(viewTypeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomTypeLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewTypeComboBox, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomTypeComboBox, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addRoomBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
    }

    private void preparePanelComponent() {
        roomNumberLabel.setFont(new Font("Tahoma", 1, 18));
        roomNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
        roomNumberLabel.setText("Room Number");

        roomNumberTextField.setFont(new Font("Tahoma", 0, 18));
        roomNumberTextField.setHorizontalAlignment(JTextField.CENTER);
        roomNumberTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        costLabel.setFont(new Font("Tahoma", 1, 18));
        costLabel.setHorizontalAlignment(SwingConstants.LEFT);
        costLabel.setText("Cost");

        costTextField.setFont(new Font("Tahoma", 0, 18));
        costTextField.setHorizontalAlignment(JTextField.CENTER);
        costTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        viewTypeLabel.setFont(new Font("Tahoma", 1, 18));
        viewTypeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        viewTypeLabel.setText("View Type");
        viewTypeLabel.setToolTipText("");

        roomTypeLabel.setFont(new Font("Tahoma", 1, 18));
        roomTypeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        roomTypeLabel.setText("Room Type");

        addRoomBtn.setFont(new Font("Tahoma", 1, 18));
        addRoomBtn.setText("Add");
        addRoomBtn.setHorizontalTextPosition(SwingConstants.CENTER);

        viewTypeComboBox.setFont(new Font("Tahoma", 1, 18));
        viewTypeComboBox.setModel(new DefaultComboBoxModel(new String[]{"  -- Please Select Value --", "View_1", "View_2", "View_3", "View_4"}));
        viewTypeComboBox.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createBevelBorder(BevelBorder.RAISED)), BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1), BorderFactory.createEmptyBorder(1, 1, 1, 1))));
        viewTypeComboBox.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        roomTypeComboBox.setFont(new Font("Tahoma", 1, 18));
        roomTypeComboBox.setModel(new DefaultComboBoxModel(new String[]{"  -- Please Select Value --", "View_1", "View_2", "View_3", "View_4"}));
        roomTypeComboBox.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createBevelBorder(BevelBorder.RAISED)), BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1), BorderFactory.createEmptyBorder(1, 1, 1, 1))));
        roomTypeComboBox.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

}
