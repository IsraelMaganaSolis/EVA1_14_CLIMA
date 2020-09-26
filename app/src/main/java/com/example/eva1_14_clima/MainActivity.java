package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lstVwWeather;
    Weather[] weathers={
            new Weather("Chihuahua", 20, "Lluvia ligera", R.drawable.light_rain),
            new Weather("Cd. Juárez", 25, "Lluvia ligera", R.drawable.cloudy),
            new Weather("Camargo", 23, "Lluvia ligera", R.drawable.atmospher),
            new Weather("Parral", 15, "Lluvia ligera", R.drawable.rainy),
            new Weather("Jimenez", 30, "Lluvia ligera", R.drawable.sunny),
            new Weather("Cuauhtemoc", 12, "Lluvia ligera", R.drawable.snow),
            new Weather("Aldama", 30, "Lluvia ligera", R.drawable.thunderstorm),
            new Weather("Casas Grandes", 32, "Lluvia ligera", R.drawable.tornado),
            new Weather("Ojinaga", 15, "Lluvia ligera", R.drawable.sunny),
            new Weather("Creel ", 18, "Lluvia ligera", R.drawable.cloudy),
            new Weather("Batopilas", 17.2, "Lluvia ligera", R.drawable. light_rain)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwWeather=findViewById(R.id.lstVwWeather);
        lstVwWeather.setAdapter(new WeatherAdapter(
                this,
                R.layout.layout_weather,
                weathers
        ));
    }
}