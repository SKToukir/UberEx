package test.uber.ubertestproject.map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import test.uber.ubertestproject.R;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Log.d("Response","MapActivity");
    }
}
