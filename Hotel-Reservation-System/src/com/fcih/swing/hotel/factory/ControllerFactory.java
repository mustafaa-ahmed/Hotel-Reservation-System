package com.fcih.swing.hotel.factory;

import com.fcih.swing.hotel.controller.AddEmployeeController;
import com.fcih.swing.hotel.controller.LoginController;
import com.fcih.swing.hotel.controller.impl.AddEmployeeControllerImpl;
import com.fcih.swing.hotel.controller.impl.LoginControllerImpl;

public class ControllerFactory {

    private ControllerFactory() {}
    
    public static LoginController getLoginController() {
        return new LoginControllerImpl();
    }
    
    public static AddEmployeeController getAddEmployeeController() {
        return new AddEmployeeControllerImpl();
    }
    
}