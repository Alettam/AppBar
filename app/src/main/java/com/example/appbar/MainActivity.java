package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        int id = item.getItemId();

        switch (id){
            case R.id.action_open_notes:
                Toast.makeText(MainActivity.this, "Открыть запиную книжку", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,NotesActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_subscription:
                Toast.makeText(MainActivity.this, "Открыть подписку", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,SubscriptionActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_foto:
                Toast.makeText(MainActivity.this, "Открыть фотогалерею", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,FotoActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_health:
                Toast.makeText(MainActivity.this, "Открыть фотогалерею", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,HealthActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_payment:
                Toast.makeText(MainActivity.this, "Открыть оплату", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,PaymentActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_spinner:
                Toast.makeText(MainActivity.this, "Открыть ввод адреса", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,SpinerActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_open_calendarview:
                Toast.makeText(MainActivity.this, "Открыть календарь", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,CalendarviewActivity.class);
                startActivity(intent);
                return true;

            default: return super.onOptionsItemSelected(item);
        }


        // if (id == R.id.action_open_notes) {
        //    Toast.makeText(MainActivity.this, "Открыть запиную книжку", Toast.LENGTH_SHORT).show();
        //    Intent intent = new Intent(MainActivity.this,NotesActivity.class);
          //  startActivity(intent);
            //return true;
        //}else if (id)
        //return super.onOptionsItemSelected(item);
    }
}
