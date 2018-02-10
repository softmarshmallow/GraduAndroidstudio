package com.indiepopcorn.gradu.Views.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.indiepopcorn.gradu.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mehdi.sakout.fancybuttons.FancyButton;

public class RegisterActivity extends AppCompatActivity
{
        
        @BindView(R.id.emailEditText)
        EditText emailEditText;
        @BindView(R.id.passwordEditText)
        EditText passwordEditText;
        @BindView(R.id.fb_button)
        ImageView fbButton;
        @BindView(R.id.google_button)
        ImageView googleButton;
        @BindView(R.id.cancel_button)
        ImageView cancelButton;
        @BindView(R.id.registerButton)
        FancyButton registerButton;
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_register);
                ButterKnife.bind(this);
        }
        
        @OnClick(R.id.fb_button)
        public void onFbButtonClicked() {
        }
        
        @OnClick(R.id.google_button)
        public void onGoogleButtonClicked() {
        }
        
        @OnClick(R.id.cancel_button)
        public void onCancelButtonClicked() {
        
        }
        
        @OnClick(R.id.registerButton)
        public void onRegisterButtonClicked() {
        }
}
