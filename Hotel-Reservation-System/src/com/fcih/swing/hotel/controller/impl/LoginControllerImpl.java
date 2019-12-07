package com.fcih.swing.hotel.controller.impl;

import com.fcih.swing.hotel.controller.LoginController;

public class LoginControllerImpl implements LoginController{

    @Override
    public boolean login(String code, String password) {
        if(code.equalsIgnoreCase("12345")) {
            return true;
        }
        return false;
    }
    
}
