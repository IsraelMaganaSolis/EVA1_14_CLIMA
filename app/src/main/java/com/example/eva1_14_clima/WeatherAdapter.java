package com.example.eva1_14_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private Context context;
    private int resource;
    private Weather[] objects;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource= resource;
        this.objects= objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){//Primera vez que se ejecuta la app. crear las filas
           //Inflar --> inflate
            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent,false);
        }
//Layout creado, accesible a travez del convertView
        TextView txtVwCity,txtVwTemp,txtVwDesc;
        ImageView imgVwImage;
        txtVwCity=convertView.findViewById(R.id.txtVwCity);
        txtVwDesc=convertView.findViewById(R.id.txtVwDesc);
        txtVwTemp=convertView.findViewById(R.id.txtVwTemp);
        imgVwImage=convertView.findViewById(R.id.imgVwImage);

        txtVwCity.setText(objects[position].getCity());
        txtVwTemp.setText(Double.toString(objects[position].getTemp()) + "°C");
        txtVwDesc.setText(objects[position].getDesc());
        imgVwImage.setImageResource(objects[position].getImageWeater());


    return convertView;

    }
}
