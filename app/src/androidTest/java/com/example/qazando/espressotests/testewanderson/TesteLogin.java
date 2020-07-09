package com.example.qazando.espressotests.testewanderson;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import com.example.qazando.espressotests.R;
import com.example.qazando.espressotests.ui.activity.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class TesteLogin {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void escreverEmUmCampo()  {
        //aqui escreve usuário
        onView(withId(R.id.login_username)).perform(typeText("wanderson.ipms@gmail.com"));
        //aqui fecha o teclado
        Espresso.closeSoftKeyboard();
        //aqui digita a senha
        onView(withId(R.id.login_password)).perform(typeText("123456"));
        //aqui fecha o teclado
        Espresso.closeSoftKeyboard();
        //teste finalizado
    }


        @Test
        public void ValidarPoupupSemSenha(){

        //aqui escreve usuario
        onView(withId(R.id.login_username)).perform(typeText("wanderson.ipms@gmail.com"));
        //aqui fecha o teclado
        Espresso.closeSoftKeyboard();
        //aqui clica no botao Login
        onView(withId(R.id.login_button)).perform(click());
        //aqui faz a validação da poupup de aviso
        onView(withText("Aviso")).inRoot(isDialog()).check(matches(isDisplayed()));
        //aqui faz a validação da mensagem poupup de aviso
        onView(withText("Campos não podem estar vazios")).inRoot(isDialog()).check(matches(isDisplayed()));
    }

@Test
    public void ValidarPoupupSemUsuario(){
        //aqui escreve senha
        onView(withId(R.id.login_password)).perform(typeText("123456789"));
        //aqui fecha o teclado
        Espresso.closeSoftKeyboard();
        //aqui clica no botao Login
        onView(withId(R.id.login_button)).perform(click());
    }
@Test
    public void ValidarLoginSemDigitarNada(){
        //aqui clica no botao Login
        onView(withId(R.id.login_button)).perform(click());
        //aqui faz a validação da poupup de aviso
        onView(withText("Aviso")).inRoot(isDialog()).check(matches(isDisplayed()));
        //aqui faz a validação da mensagem poupup de aviso
        onView(withText("Campos não podem estar vazios")).inRoot(isDialog()).check(matches(isDisplayed()));
        //clicar no ok da poupup
        onView(withText("OK")).perform(click());
        //validando hint do campo
        onView(withId(R.id.login_username)).check(matches(withHint("Seu E-mail")));
        //validar texto
        onView(withText("Bem vindo Novamente")).check(matches(isDisplayed()));
}

@Test
    public void ValidarBotaoCadastrar(){

        //aqui botao de cadastrar
        onView(withId(R.id.btn_sign_up_login)).perform(click());
        //digitar endereço de email
        onView(withId(R.id.field_sign_up)).perform(typeText("nayaracristina@gmail.com"));
        //aqui fecha o teclado
        Espresso.closeSoftKeyboard();



}
}
