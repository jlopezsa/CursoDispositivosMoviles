package com.example.entradasalidadatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView salida;
    private EditText operador1;
    private Button boton;
    private double numeroOperador;

    private TextView mensaje_inferior;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje_inferior = (TextView) findViewById(R.id.textView);
        mensaje_inferior.setText("Ejemplo de entrada y salida de datos");

        salida = (TextView) findViewById(R.id.txtSalida);
        operador1 = (EditText) findViewById(R.id.txtOperador1);
        boton = (Button) findViewById(R.id.btnEnvio);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroOperador = Double.parseDouble(operador1.getText().toString());

                salida.setText("El número ingresado es: " + numeroOperador);

                Log.i("FLAG(MainActivity)", "El valor ingresado es: "+ numeroOperador); // Mensaje en Logcat
            }
        });

        //salida.setText("Prueba desde codigo");

    }
}