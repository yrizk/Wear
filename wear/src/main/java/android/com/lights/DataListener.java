package android.com.lights;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by rizk on 8/17/14.
 */
public class DataListener extends WearableListenerService {

    private final static String TAG = DataListener.class.getSimpleName();

    @Override
    public void onMessageReceived(MessageEvent msgEvent){
        Toast.makeText(this,"onMessageReceived", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onMessageReceived");
    }

    @Override
    public void onPeerConnected(Node peer){
        Log.d(TAG, "onPeerConnected");
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ComponentName cn = new ComponentName(this, WatchMain.class);
        intent.setComponent(cn);
        startActivity(intent);
        Toast.makeText(this,"onPeerConnected", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDataChanged(DataEventBuffer dataEvents) {
        Log.d(TAG, "onDataChanged"); 
        for (DataEvent event : dataEvents) {
            if (event.getType() == DataEvent.TYPE_DELETED) {
                Log.d(TAG, "DataItem deleted: " + event.getDataItem().getUri());
            } else if (event.getType() == DataEvent.TYPE_CHANGED) {
                Log.d(TAG, "DataItem changed: " + event.getDataItem().getUri());
            }
        }
    }

    @Override
    public void onPeerDisconnected(Node peer){
        Toast.makeText(this,"onPeerDisconnected",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPeerDisconnected");
    }
}
