package android.com.lights;

import android.os.Bundle;
import android.support.wearable.activity.InsetActivity;
import android.support.wearable.view.WatchViewStub;
import android.widget.TextView;

public class WatchMain  extends InsetActivity {

    private TextView mTextView;
    private final String TAG = WatchMain.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onReadyForContent() {
        setContentView(R.layout.activity_watch_main);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.message);
            }
        });
    }
}