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

public final class AddViewTypeUI extends JPanel implements Drawable {

    private JLabel viewTypeCostLabel;
    private JLabel viewTypeNameLabel;
    
    private JTextField viewTypeNameTextField;
    private JTextField viewTypeCostTextField;

    private JButton addViewTypeBtn;

    public AddViewTypeUI() {
        initComponents();
        draw();
    }

    @Override
    public void initComponents() {
        viewTypeNameLabel = new JLabel();
        viewTypeCostLabel = new JLabel();
        viewTypeNameTextField = new JTextField();
        viewTypeCostTextField = new JTextField();
        addViewTypeBtn = new JButton();
    }

    @Override
    public void draw() {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "View Type Data", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 18)));

        preparePanelComponent();

        GroupLayout addViewTypePanelLayout = new GroupLayout(this);
        setLayout(addViewTypePanelLayout);
        addViewTypePanelLayout.setHorizontalGroup(
            addViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addViewTypePanelLayout.createSequentialGroup()
                .addComponent(viewTypeNameLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(viewTypeNameTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(viewTypeCostLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewTypeCostTextField, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(addViewTypePanelLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(addViewTypeBtn, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        addViewTypePanelLayout.setVerticalGroup(
            addViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, addViewTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addViewTypePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewTypeCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewTypeNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewTypeCostTextField, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(viewTypeNameTextField))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addViewTypeBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private void preparePanelComponent() {

        viewTypeNameLabel.setFont(new Font("Tahoma", 1, 18));
        viewTypeNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        viewTypeNameLabel.setText("Name");

        viewTypeNameTextField.setFont(new Font("Tahoma", 0, 18));
        viewTypeNameTextField.setHorizontalAlignment(JTextField.CENTER);
        viewTypeNameTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        viewTypeCostLabel.setFont(new Font("Tahoma", 1, 18));
        viewTypeCostLabel.setHorizontalAlignment(SwingConstants.LEFT);
        viewTypeCostLabel.setText("Cost");

        viewTypeCostTextField.setFont(new Font("Tahoma", 0, 18));
        viewTypeCostTextField.setHorizontalAlignment(JTextField.CENTER);
        viewTypeCostTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        addViewTypeBtn.setFont(new Font("Tahoma", 1, 18));
        addViewTypeBtn.setText("Add");
        addViewTypeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
