package com.indiepopcorn.gradu.Views.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.indiepopcorn.gradu.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mehdi.sakout.fancybuttons.FancyButton;

public class LoginActivity extends AppCompatActivity
{
        
        @BindView(R.id.cancel_button)
        ImageView cancelButton;
        @BindView(R.id.emailEditText)
        EditText emailEditText;
        @BindView(R.id.passwordEditText)
        EditText passwordEditText;
        @BindView(R.id.linearLayout)
        LinearLayout linearLayout;
        @BindView(R.id.loginButton)
        FancyButton loginButton;
        @BindView(R.id.fb_button)
        ImageView fbButton;
        @BindView(R.id.google_button)
        ImageView googleButton;
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);
                ButterKnife.bind(this);
        }
        
        @OnClick(R.id.cancel_button)
        public void onCancelButtonClicked() {
                finish();
                // TODO refactor by using fragment flow
                startActivity(new Intent(this, LoginLandingpageActivity.class));
        }
        
        @OnClick(R.id.loginButton)
        public void onLoginButtonClicked() {
        
        }
        
        @OnClick(R.id.fb_button)
        public void onFbButtonClicked() {
        
        }
        
        @OnClick(R.id.google_button)
        public void onGoogleButtonClicked() {
        
        }
}
