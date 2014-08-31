package android.com.lights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class WatchMain  extends Activity {
    /**
     * This is the Watch Activity, which means it will be resoponsible for recieving the start command
     * from the user. The start command will likely be a custom action, which is a "fire and forget"
     * message to the phone. Not really sure if there is going to be need for any other buttons.
     */

    private final String TAG = WatchMain.class.getSimpleName();
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