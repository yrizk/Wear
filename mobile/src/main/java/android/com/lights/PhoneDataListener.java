package android.com.lights;

import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by rizk on 8/23/14.
 */
public class PhoneDataListener extends WearableListenerService{
    private final static String TAG = PhoneDataListener.class.getSimpleName();

    @Override
    public void onMessageReceived(MessageEvent msgEvent){
        Toast.makeText(this, "onMessageRecieved", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onMessageReceived");
    }

    @Override
    public void onPeerConnected(Node peer){
        Log.d(TAG, "onPeerConnected");
        Toast.makeText(this, "onPeerConnected", Toast.LENGTH_LONG).show();
        Main.watchNode = peer;
    }

    @Overrigde
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
