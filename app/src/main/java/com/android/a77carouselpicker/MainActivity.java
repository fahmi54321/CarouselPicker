package com.android.a77carouselpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class MainActivity extends AppCompatActivity {

    CarouselPicker carouselPicker1,carouselPicker2,carouselPicker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselPicker1 = (CarouselPicker) findViewById(R.id.carouselPicker1);
        carouselPicker2 = (CarouselPicker) findViewById(R.id.carouselPicker2);
        carouselPicker3 = (CarouselPicker) findViewById(R.id.carouselPicker3);

        //Carousel 1
        List<CarouselPicker.PickerItem> items1 = new ArrayList<>();
        items1.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        items1.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        items1.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter adapter1 = new CarouselPicker.CarouselViewAdapter(this,items1,0);
        carouselPicker1.setAdapter(adapter1);

        //Carousel 2
        List<CarouselPicker.PickerItem> items2 = new ArrayList<>();
        items2.add(new CarouselPicker.TextItem("One",20));
        items2.add(new CarouselPicker.TextItem("Two",20));
        items2.add(new CarouselPicker.TextItem("Three",20));
        CarouselPicker.CarouselViewAdapter adapter2 = new CarouselPicker.CarouselViewAdapter(this,items2,0);
        carouselPicker2.setAdapter(adapter2);

        //Carousel 3
        List<CarouselPicker.PickerItem> items3 = new ArrayList<>();
        items3.add(new CarouselPicker.TextItem("One",20));
        items3.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        items3.add(new CarouselPicker.TextItem("Three",20));
        CarouselPicker.CarouselViewAdapter adapter3 = new CarouselPicker.CarouselViewAdapter(this,items3,0);
        carouselPicker3.setAdapter(adapter3);
    }
}