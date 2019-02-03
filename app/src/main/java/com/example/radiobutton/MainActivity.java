package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup grupoBtns;

    RadioButton radioBtnUno, radioBtnDos, radioBtnTres, radioBtnCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupoBtns = (RadioGroup) findViewById(R.id.grupoRadioBtns);

        radioBtnUno = (RadioButton) findViewById(R.id.radioBtn);
        radioBtnDos = (RadioButton) findViewById(R.id.radioBtnDos);
        radioBtnTres = (RadioButton) findViewById(R.id.radioBtnTres);
        radioBtnCuatro = (RadioButton) findViewById(R.id.radioBtnCuatro);

        //Limpia todos los radioButtons del grupo
        grupoBtns.clearCheck();

        //Check al radioButton indicado, en este caso, el radioButton Uno
        grupoBtns.check(R.id.radioBtn);

        radioBtnUno.setOnClickListener(evento);
        radioBtnDos.setOnClickListener(evento);
        radioBtnTres.setOnClickListener(evento);
        radioBtnCuatro.setOnClickListener(evento);
    }

    View.OnClickListener evento = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Este switch obtiene el id del radioButton que se seleccione
            switch (v.getId()) {
                case R.id.radioBtn:
                    Toast.makeText(getApplicationContext(), "Primaria", Toast.LENGTH_LONG).show();
                    break;

                case R.id.radioBtnDos:
                    Toast.makeText(getApplicationContext(), "Secundaria", Toast.LENGTH_LONG).show();
                    break;

                case R.id.radioBtnTres:
                    Toast.makeText(getApplicationContext(), "Preparatoria", Toast.LENGTH_LONG).show();
                    break;

                case R.id.radioBtnCuatro:
                    Toast.makeText(getApplicationContext(), "Universidad", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };
}
