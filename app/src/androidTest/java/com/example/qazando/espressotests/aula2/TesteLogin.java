package com.example.qazando.espressotests.aula2;

import android.support.test.rule.ActivityTestRule;

import com.example.qazando.espressotests.aula2.robot.RobotLogin2;
import com.example.qazando.espressotests.ui.activity.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

public class TesteLogin {
    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);



    @Test
    public void LogarComSucesso(){
        new RobotLogin2()
                .EscreverEmail()
                .FecharTeclado()
                .DigitarSenha();


    }


}
