package com.example.kyler.mockitoexample;

/**
 * Created by kyler on 07/07/2016.
 */
public class LoginModle implements ILoginModle {
    @Override
    public boolean checkLogin(String username, String password) {
        if(username.equals("duckky")&password.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
