package com.emah.aplikasicounter;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrderBarang.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.action_daftar_barang:
                displayToast(getString(R.string.action_ms_daftar_barang));
                Intent intent1 = new Intent(MainActivity.this, OrderBarang.class);
                startActivity(intent1);
                return true;
            case R.id.action_update_barang:
                displayToast(getString(R.string.action_ms_update_barang));
                Intent intent2 = new Intent(MainActivity.this, UpdateBarang.class);
                startActivity(intent2);
                return true;
            case R.id.action_laporan:
                displayToast(getString(R.string.action_ms_laporan));
                return true;
            case R.id.action_settings:
                displayToast(getString(R.string.action_ms_setting));
                return true;
            default:
                //do nothing
        }
        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_update_barang) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void btn_pulsa(View view) {
        displayToast(getString(R.string.order_ms_pulsa));
    }

    public void btn_voucher(View view) {
        displayToast(getString(R.string.order_ms_voucher));
    }

    public void btn_accessoris(View view) {
        displayToast(getString(R.string.order_ms_accessoris));
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, OrderBarang.class);
        startActivity(intent);
    }
}