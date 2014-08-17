package android.com.lights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class WatchMain  extends Activity {

    private ViewGroup viewGroup;
    private final String TAG = WatchMain.class.getSimpleName();
    private int ticker =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_main);

    }



    public void startAnimations(View v){
        Button button = (Button) findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.circle_anim);
        button.startAnimation(animation);
    }




}