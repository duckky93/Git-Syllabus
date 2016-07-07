package com.example.kyler.mockitoexample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kyler on 07/07/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {


    @Mock
    private LoginView view;
    @Mock
    private ILoginPresenter presenter;

    @Before
    public void setUp() throws Exception{
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowMessageWhenUsernameIsEmpty() throws Exception{
        when(view.getUsername()).thenReturn("");
        presenter.onClickLogin();
        verify(view).showUsernameError(R.string.username_error);
    }

    @Test
    public void shouldShowMessageWhenPasswordIsEmpty() throws Exception{
        when(view.getUsername()).thenReturn("adgdag");
        when(view.getPassword()).thenReturn("");
        presenter.onClickLogin();
        verify(view).showPasswordError(R.string.password_error);
    }

    @Test
    public void shouldShowMessageWhenLoginAreCorrect() throws Exception{
        when(view.getUsername()).thenReturn("duckky");
        when(view.getPassword()).thenReturn("123");
        presenter.onClickLogin();
        verify(view).showLoginSuccess();
    }

    public void shouldShowMessgeWhenLoginAreIncorrect() throws Exception{
        when(view.getUsername()).thenReturn("duckky");
        when(view.getPassword()).thenReturn("12");
        presenter.onClickLogin();
        verify(view).showLoginFail();
    }
}
