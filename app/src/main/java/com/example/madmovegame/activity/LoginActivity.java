package com.example.madmovegame.activity;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madmovegame.R;
import com.example.madmovegame.fragment.loginFragment.AuthenticationFragment;
import com.example.madmovegame.fragment.loginFragment.ForgetPwdFragment;
import com.example.madmovegame.fragment.loginFragment.LoginFragment;
import com.example.madmovegame.fragment.loginFragment.RegisterFragment;

public class LoginActivity extends AppCompatActivity
        implements LoginFragment.LoginFragmentListeners {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Open Authentication Fragment
        AuthenticationFragment authenticationFragment = new AuthenticationFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_view,authenticationFragment).commit();
    }

    @Override
    public void openForgetPasswordFragment() {

        //Open Forget Fragment
        ForgetPwdFragment forgetPwdFragment = new ForgetPwdFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_view,forgetPwdFragment).commit();

    }

    @Override
    public void openCreateAccountFragment() {

        //Open Register Fragment
        RegisterFragment registerFragment = new RegisterFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_view,registerFragment).commit();

    }

    @Override
    public void openHomeFragment() {

        //Open Main Activity
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }
}
