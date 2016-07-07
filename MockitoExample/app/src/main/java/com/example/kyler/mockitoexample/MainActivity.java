package com.example.kyler.mockitoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {
    EditText username,password;

    ILoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginPresenter(this);
        username = (EditText) findViewById(R.id.edt_username);
        password = (EditText) findViewById(R.id.edt_password);
    }

    public void onClickLogin(View view){
        presenter.onClickLogin();
    }

    @Override
    public String getUsername() {
        return username.getText().toString().trim();
    }

    @Override
    public void showUsernameError(int resID) {
        username.setError(getString(resID));
    }

    @Override
    public String getPassword() {
        return password.getText().toString().trim();
    }

    @Override
    public void showPasswordError(int resID) {
        password.setError(getString(resID));
    }

    @Override
    public void showLoginSuccess() {
        Toast.makeText(this,"Login succeed!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginFail() {
        Toast.makeText(this,"Login failed!",Toast.LENGTH_SHORT).show();
    }
}
