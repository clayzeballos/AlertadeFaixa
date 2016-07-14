package br.com.zeballos.alertadefaixa;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView fundoAnimado = (ImageView) findViewById(R.id.fundo_animado);
        fundoAnimado.setBackgroundResource(R.drawable.alerta);

        AnimationDrawable alertaAnimation = (AnimationDrawable) fundoAnimado.getBackground();
        alertaAnimation.start();
    }


}
