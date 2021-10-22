package com.example.simplecarcreator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHondaInteract(View view) {
        Car car = new Car();
        car.createCar("Honda Minivan", 4, 25f);
        TextView output = (TextView) findViewById(R.id.txtOutput);
        System.out.println(car.getString());
        output.setText(car.getString());
    }

    public void onSedanInteract(View view) {
        Car car = new Car();
        car.createCar("Sedan", 5, 15f);
        TextView output = (TextView) findViewById(R.id.txtOutput);
        System.out.println(car.getString());
        output.setText(car.getString());
    }

    public void onConvertibleInteract(View view) {
        Car car = new Car();
        car.createCar("Convertible", 4, 400f);
        TextView output = (TextView) findViewById(R.id.txtOutput);
        System.out.println(car.getString());
        output.setText(car.getString());
    }

/*    public void onHondaInteract(View view) {

        Car car = new Car();

        EditText carModel = (EditText) findViewById(R.id.modelName);
        String carName = carModel.getText().toString();
        car.setModelName(carName);

        EditText totalCarDoors = (EditText) findViewById(R.id.totalCarDoors);
        int carDoors = Integer.parseInt(totalCarDoors.getText().toString());
        car.setDoors(carDoors);

        EditText milesPerGallon = (EditText) findViewById(R.id.milesPerGallon);
        float mpg = Float.parseFloat(milesPerGallon.getText().toString());
        car.setMilesPerGallon(mpg);

        car.createCar(carName, carDoors, mpg);

        TextView output = (TextView) findViewById(R.id.txtOutput);
        System.out.println(car.getString());
        output.setText(car.getString());
    }*/
}