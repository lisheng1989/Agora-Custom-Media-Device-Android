package io.agora.rtc.ss.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.agora.rtc.ss.app.fileSource.openlive.ui.MainActivity;
import io.agora.rtc.ss.app.newInterface.NewInterfaceActivity;

public class InitActivity extends Activity {

    private static final String LOG_TAG = "InitActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init_activity);

    }



    public final void showLongToast(final String msg) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
    }



    public void onOldInterfaceClicked(View view){
        Intent intent1 = new Intent(InitActivity.this,
                MainActivity.class);
        startActivity(intent1);
        //this.finish();
    }


    public void onNewInterfaceClicked(View view){
        Intent intent1 = new Intent(InitActivity.this,
                NewInterfaceActivity.class);
        startActivity(intent1);
        //this.finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
