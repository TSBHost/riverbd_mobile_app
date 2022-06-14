package app.wasimappbd.softxmagic.mdspbdnew;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by macbookpro on 23/1/18.
 */

public class NetworkService extends Service {


    GridViewActivity gv;

    @Override
    public IBinder onBind(Intent intent) {
        gv = new GridViewActivity();
        Bundle extras = intent.getExtras();
        boolean isNetworkConnected = extras.getBoolean("isNetworkConnected");
        if(isNetworkConnected == true){
            Toast.makeText(getApplicationContext(), "Connected", Toast.LENGTH_SHORT).show();
            //gv.syncAllData();
        }
        else{
            Toast.makeText(getApplicationContext(), "Disconnected", Toast.LENGTH_SHORT).show();
        }

        return null;
    }
}
