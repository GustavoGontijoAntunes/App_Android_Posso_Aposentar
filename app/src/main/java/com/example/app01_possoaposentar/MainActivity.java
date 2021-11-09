package com.example.app01_possoaposentar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNome;
    EditText editIdade;
    TextView txtRelatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.edit_Nome);
        editIdade = findViewById(R.id.edit_Idade);
        txtRelatorio = findViewById(R.id.txt_Relatorio);
    }

    public void verificar(View view){

        int i = Integer.parseInt(editIdade.getText().toString());

        if(this.possoAposentar(i)) {
            txtRelatorio.setText("Posso aposentar!");
        } else{
            txtRelatorio.setText("Não posso aposentar!");
        }
    }

    public static boolean possoAposentar(int idade){

        if(idade >= 65){
            return true;
        }
        return false;
    }

    public static double calcular(double x){
       return x * 2;
    }
}