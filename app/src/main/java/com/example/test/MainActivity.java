package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate (R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void goToBeginActivity(MenuItem item) {
        Intent intent = new Intent(this, BegineActivity.class);
        startActivity(intent);
    }

    public void goToAboutActivity(MenuItem item) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.begine:
                Toast.makeText(this, "Переход на новую вкладку", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.work:
                Toast.makeText(this, "Переход на новую вкладку", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.about:
                Toast.makeText(this, "Информация о разработчике", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
