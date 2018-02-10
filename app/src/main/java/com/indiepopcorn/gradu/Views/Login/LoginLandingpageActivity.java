package com.indiepopcorn.gradu.Views.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.indiepopcorn.gradu.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mehdi.sakout.fancybuttons.FancyButton;

public class LoginLandingpageActivity extends AppCompatActivity
{
        
        @BindView(R.id.loginButton)
        FancyButton loginButton;
        @BindView(R.id.registerButton)
        FancyButton registerButton;
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login_landingpage);
                ButterKnife.bind(this);
        }
        
        @OnClick(R.id.loginButton)
        public void onLoginButtonClicked() {
                finish();
                startActivity(new Intent(this, LoginActivity.class));
        }
        
        @OnClick(R.id.registerButton)
        public void onRegisterButtonClicked() {
                finish();
                startActivity(new Intent(this, RegisterActivity.class));
        }
}
