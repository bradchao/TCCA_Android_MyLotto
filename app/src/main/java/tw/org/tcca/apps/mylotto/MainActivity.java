package tw.org.tcca.apps.mylotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createLotto(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        Log.v("bradlog", set.toString());
    }
}