package br.senac.go.adrielmiranda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//
//        }
        Button openBT = findViewById(R.id.botaoCrono);
        openBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CronogramaActivity.class);
                intent.putExtra("teste",R.id.textView6);
                startActivity(intent);
            }
        });
    }



//        public void IrParaCronograma (View view ){
//
//            Intent intent1 = new Intent(getApplicationContext(), CronogramaActivity.class);
//            startActivity(intent1);
//
//        }
    }


