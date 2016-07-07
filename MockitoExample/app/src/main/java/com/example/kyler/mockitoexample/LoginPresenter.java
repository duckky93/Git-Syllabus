package com.example.kyler.mockitoexample;

/**
 * Created by kyler on 07/07/2016.
 */
public class LoginPresenter implements ILoginPresenter {

    private LoginView view;
    private ILoginModle modle;

    LoginPresenter(LoginView view){
        this.view = view;
        modle = new LoginModle();
    }

    @Override
    public void onClickLogin() {
        String username = view.getUsername();
        String password = view.getPassword();
        if(username.equals("")){
            view.showUsernameError(R.string.username_error);
        }else if(password.equals("")){
            view.showPasswordError(R.string.password_error);
        }else if(modle.checkLogin(username,password)){
            view.showLoginSuccess();
        }else{
            view.showLoginFail();
        }
    }
}
