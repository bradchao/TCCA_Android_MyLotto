package tw.org.tcca.apps.mylotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView lotto1, lotto2, lotto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lotto1 = findViewById(R.id.lotto1);
        lotto2 = findViewById(R.id.lotto2);
        lotto3 = findViewById(R.id.lotto3);

    }

    public void lotto1(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*38+1));
        }
        lotto1.setText(set.toString() + (int)(Math.random()*8+1));
    }
    public void lotto2(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        lotto2.setText(set.toString());
    }
    public void lotto3(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<5){
            set.add((int)(Math.random()*39+1));
        }
        lotto3.setText(set.toString());
    }
}