package com.example.qazando.espressotests.aula2.robot;

import android.support.test.espresso.Espresso;

import com.example.qazando.espressotests.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.example.qazando.espressotests.aula2.constantes.LoginConstant2.EMAIL_COM_SUCESSO;
import static com.example.qazando.espressotests.aula2.constantes.LoginConstant2.TXT_SENHA_COM_SUCESSO;

public class RobotLogin2 {

    private static final int CAMPO_EMAIL = R.id.login_username;
    private static final int SENHA_COM_SUCESSO = R.id.login_password;

    public RobotLogin2 EscreverEmail() {
        onView(withId(CAMPO_EMAIL)).perform(typeText(EMAIL_COM_SUCESSO));
        return this;
    }

    public RobotLogin2 FecharTeclado() {
        Espresso.closeSoftKeyboard();
        return this;
    }

    public RobotLogin2 DigitarSenha(){
        onView(withId(SENHA_COM_SUCESSO)).perform(typeText(TXT_SENHA_COM_SUCESSO));
        return this;

    }

    }

