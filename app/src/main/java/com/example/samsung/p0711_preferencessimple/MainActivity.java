package com.example.samsung.p0711_preferencessimple;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView) findViewById(R.id.tvInfo);

        //Получение SharedPreferences, которе работает с файлом настроек
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        //Полная очистка настроек
//        sharedPreferences.edit().clear().commit();
    }

    @Override
    protected void onResume() {
        Boolean cbNotif = sharedPreferences.getBoolean("cbNotif", false);
        String etAddress = sharedPreferences.getString("etAddress", ""),
                text = getString(R.string.notification_are_) + " "
                        + (cbNotif ? getString(R.string.enabled_comma_address_is_)
                        + etAddress : getString(R.string.disabled));
        tvInfo.setText(text);
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.add(0, 1, 0, R.string.preferences);
        menuItem.setIntent(new Intent(this, PrefActivity.class));
        return super.onCreateOptionsMenu(menu);
    }
}
