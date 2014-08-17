package android.com.lights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class WatchMain  extends Activity {

    private ViewGroup viewGroup;
    private final String TAG = WatchMain.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_main);

    }

    public void startAnimations(View v){

    }




}