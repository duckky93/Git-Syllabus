package com.example.kyler.mockitoexample;

/**
 * Created by kyler on 07/07/2016.
 */
public interface LoginView {
    String getUsername();

    void showUsernameError(int resID);

    String getPassword();

    void showPasswordError(int resID);

    void showLoginSuccess();

    void showLoginFail();
}

