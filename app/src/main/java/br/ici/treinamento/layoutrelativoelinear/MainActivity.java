package br.ici.treinamento.layoutrelativoelinear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //frameLayout = findViewById(R.id.frameCarregando);
        //frameLayout.setVisibility(View.GONE);
    }

   /* public void abri(View view){
        frameLayout.setVisibility(View.VISIBLE);
    }*/
}
