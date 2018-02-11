package com.indiepopcorn.gradu.Views.SplashScreen;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.indiepopcorn.gradu.Helpers.LoginHelpers.LoginPreferences;
import com.indiepopcorn.gradu.Networking.LoginService;
import com.indiepopcorn.gradu.R;
import com.indiepopcorn.gradu.Views.Login.LoginLandingpageActivity;
import com.indiepopcorn.gradu.Views.Main.MainTabControllerActivity;

public class SplashScreenActivity extends AppCompatActivity
{
        
        static final String TAG = "SplashScreenActivity";
        final int delayMilliSeconds = 1200;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setTheme(R.style.AppTheme_FullScreen);
                setContentView(R.layout.activity_splash_screen);
                
                //SetTextEffect();
                
                
                Test();
        }
        void Test() {
        
        
        }
        @Override
        protected void onResume() {
                super.onResume();
                StartWaiting();
        }
        @Override
        protected void onPause() {
                super.onPause();
                handler.removeCallbacks(r);
        }
        Handler handler = new Handler();
        Runnable r= new Runnable()
        {
                @Override
                public void run() {
                        MoveToNextActivity();
                }
        };
        void StartWaiting() {
                handler.postDelayed(r , delayMilliSeconds);
                
        }


        boolean skipLogin = true;
        void MoveToNextActivity() {
                if (skipLogin){
                        MoveToMainActivity();
                        return;
                }

                if (LoginPreferences.getIsLoggedIn()) {
                        MoveToMainAfterAutoLogin();
                } else {
                        Intent intent = new Intent(SplashScreenActivity.this, LoginLandingpageActivity.class);
                        startActivity(intent);
                        finish();
                }
        }
        
        
        void MoveToMainAfterAutoLogin(){
                final AlertDialog autoLoginProgressDialog;
                autoLoginProgressDialog = new AlertDialog.Builder(this).create();
                autoLoginProgressDialog.setTitle("로그인중");
                autoLoginProgressDialog.setMessage("Alert message to be shown");
                autoLoginProgressDialog.setCancelable(false);
                autoLoginProgressDialog.show();
                
                LoginService.AutoLogin(new OnCompleteListener<AuthResult>()
                {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                                autoLoginProgressDialog.dismiss();
                                
                                if (task.getException() == null){
                                        MoveToMainActivity();
                                }else {
                                        AlertDialog errorDialog = new AlertDialog.Builder(SplashScreenActivity.this).create();
                                        errorDialog.setTitle("로그인 오류!");
                                        errorDialog.setMessage(task.getException().getLocalizedMessage());
                                        errorDialog.setCancelable(false);
                                        errorDialog.show();
                                }
                        }
                });
        }
        void MoveToMainActivity(){
                Intent intent = new Intent(SplashScreenActivity.this, MainTabControllerActivity.class);
                finish();
                startActivity(intent);
        }
}
