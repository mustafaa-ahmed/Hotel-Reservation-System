package com.fcih.swing.hotel.ui.admin;

import com.fcih.swing.hotel.ui.Drawable;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public final class AddRoomTypeUI extends JPanel implements Drawable {

    private JLabel roomTypeCostLabel;
    private JLabel roomTypeNameLabel;
    
    private JTextField roomTypeNameTextField;
    private JTextField roomTypeCostTextField;

    private JButton addRoomTypeBtn;

    public AddRoomTypeUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {
        roomTypeNameLabel = new JLabel();
        roomTypeCostLabel = new JLabel();
        roomTypeNameTextField = new JTextField();
        roomTypeCostTextField = new JTextField();
        addRoomTypeBtn = new JButton();
    }

    @Override
    public void draw() {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Room Type Data", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        preparePanelComponent();

        GroupLayout addRoomTypePanelLayout = new GroupLayout(this);
        setLayout(addRoomTypePanelLayout);
        addRoomTypePanelLayout.setHorizontalGroup(
            addRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addRoomTypePanelLayout.createSequentialGroup()
                .addComponent(roomTypeNameLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(roomTypeNameTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(roomTypeCostLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomTypeCostTextField, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(addRoomTypePanelLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(addRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        addRoomTypePanelLayout.setVerticalGroup(
            addRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, addRoomTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addRoomTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomTypeCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomTypeNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomTypeCostTextField, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(roomTypeNameTextField))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addRoomTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private void preparePanelComponent() {

        roomTypeNameLabel.setFont(new Font("Tahoma", 1, 18));
        roomTypeNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        roomTypeNameLabel.setText("Name");

        roomTypeNameTextField.setFont(new Font("Tahoma", 0, 18));
        roomTypeNameTextField.setHorizontalAlignment(JTextField.CENTER);
        roomTypeNameTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        roomTypeCostLabel.setFont(new Font("Tahoma", 1, 18));
        roomTypeCostLabel.setHorizontalAlignment(SwingConstants.LEFT);
        roomTypeCostLabel.setText("Cost");

        roomTypeCostTextField.setFont(new Font("Tahoma", 0, 18));
        roomTypeCostTextField.setHorizontalAlignment(JTextField.CENTER);
        roomTypeCostTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        addRoomTypeBtn.setFont(new Font("Tahoma", 1, 18));
        addRoomTypeBtn.setText("Add");
        addRoomTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
