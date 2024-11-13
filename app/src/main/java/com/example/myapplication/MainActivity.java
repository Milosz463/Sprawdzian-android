package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> listaFlag = new ArrayList<>();
    ImageView imageView;
    Button buttonNastepne;
    Button buttonA;
    Button buttonB;
    Button buttonC;
    int numerFlagi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFlag.add(R.drawable.flaga4);
        listaFlag.add(R.drawable.flaga2);
        listaFlag.add(R.drawable.flaga3);

        buttonA = findViewById(R.id.button);
        buttonB = findViewById(R.id.button2);
        buttonC = findViewById(R.id.button3);
        imageView = findViewById(R.id.imageView3);
        buttonNastepne = findViewById(R.id.button4);
        buttonNastepne.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        numerFlagi++;

                        if (numerFlagi == listaFlag.size()) {
                            buttonNastepne.setVisibility(View.INVISIBLE);
                            buttonA.setVisibility(View.INVISIBLE);
                            buttonB.setVisibility(View.INVISIBLE);
                            buttonC.setVisibility(View.INVISIBLE);
                            imageView.setVisibility(View.INVISIBLE);
                        } else {
                            imageView.setImageResource(listaFlag.get(numerFlagi));
                            if (numerFlagi == 1) {
                                buttonA.setText("Meksyk");
                                buttonB.setText("Litwa");
                                buttonC.setText("Rosja");
                            } else if (numerFlagi == 2) {
                                buttonA.setText("Francja");
                                buttonB.setText("Hiszpania");
                                buttonC.setText("Włochy");
                            }
                        }
                    }
                }
        );

    }

}