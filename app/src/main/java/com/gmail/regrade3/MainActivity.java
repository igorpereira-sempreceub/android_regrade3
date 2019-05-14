package com.gmail.regrade3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText caixa_1 = findViewById(R.id.num_1);
        int num_1 = Integer.parseInt(String.valueOf(caixa_1.getText()));

        EditText caixa_2 = findViewById(R.id.num_2);
        int num_2 = Integer.parseInt(String.valueOf(caixa_2.getText()));

        EditText caixa_3 = findViewById(R.id.num_3);
        int num_3 = Integer.parseInt(String.valueOf(caixa_3.getText()));

        double resultado = (num_2 * num_3) / num_1;

        EditText caixa_4 = findViewById(R.id.res);
        caixa_4.setText(Double.toString(resultado));
    }

    public void limpar(View view){
        EditText caixa_1 = findViewById(R.id.num_1);
        EditText caixa_2 = findViewById(R.id.num_2);
        EditText caixa_3 = findViewById(R.id.num_3);
        EditText caixa_4 = findViewById(R.id.res);

        caixa_1.setText("");
        caixa_2.setText("");
        caixa_3.setText("");
        caixa_4.setText("");

    }

}
