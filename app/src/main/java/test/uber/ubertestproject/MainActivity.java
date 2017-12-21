package test.uber.ubertestproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import test.uber.ubertestproject.customer.CustomerLoginActivity;
import test.uber.ubertestproject.driver.DriverLoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDriver, btnCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

    }

    private void initUI() {

        btnDriver = (Button) findViewById(R.id.driver);
        btnCustomer = (Button) findViewById(R.id.customer);

        btnDriver.setOnClickListener(this);
        btnCustomer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.driver:
                startActivity(new Intent(MainActivity.this, DriverLoginActivity.class));
                break;
            case R.id.customer:
                startActivity(new Intent(MainActivity.this, CustomerLoginActivity.class));
                break;
        }

    }
}
