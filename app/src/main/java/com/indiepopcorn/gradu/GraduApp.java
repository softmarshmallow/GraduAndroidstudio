package com.indiepopcorn.gradu;

import android.app.Application;
import android.content.Context;

/**
 * Created by softmarshmallow on 2/10/18.
 */

public class GraduApp extends Application
{
        private static Context context;
        
        @Override
        public void onCreate() {
                super.onCreate();
                // app context
                GraduApp.context = getApplicationContext();
        }
        public static Context getAppContext() {
                return GraduApp.context;
        }
        public static final String TAG = GraduApp.class.getSimpleName();
}
