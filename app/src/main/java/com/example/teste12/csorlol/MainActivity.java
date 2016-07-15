package com.example.teste12.csorlol;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Runnable{
    Button cs, lol;
    ImageView imageView;
    Random random;
    Random random2;
    int a;
    int jogo;
    TextView score;
    int pontos = 0;
    boolean time = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cs = (Button)findViewById(R.id.cs);
        lol = (Button)findViewById(R.id.lol);
        cs.setOnClickListener(this);
        lol.setOnClickListener(this);
        imageView = (ImageView)findViewById(R.id.image);
        score = (TextView)findViewById(R.id.score);
        random = new Random();
        random2 = new Random();
        a =  random.nextInt(79);
        run();
        score.setText(String.valueOf(pontos));


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cs) {
            if(jogo == 0)
            {
                pontos += 1;
                time = true;
                Log.d("dsadasd", "gg");
            }
            else if(jogo != 0 )
            {
                time = true;
                pontos = 0;

                Log.d("dsadasd", "perdeu");
            }
            if(time == true)
            {
                a = random.nextInt(79);
                time = false;
            }
            score.setText(String.valueOf(pontos));
            Log.d("dasda", String.valueOf(jogo));
            switch (a) {
                case 0:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.boltz);
                    break;
                case 1:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.brtt);
                    break;
                case 2:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.coldzera);
                    break;
                case 3:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fallen);
                    break;
                case 4:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.adren);
                    break;
                case 5:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.adrian);
                    break;
                case 6:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.advent);
                    break;
                case 7:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.airwaks);
                    break;
                case 8:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.aphromoo);
                    break;
                case 9:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.bang);
                    break;
                case 10:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.bengi);
                    break;
                case 11:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.betsy);
                    break;
                case 12:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.blank);
                    break;
                case 13:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.bodyy);
                    break;
                case 14:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.darshan);
                    break;
                case 15:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.dennis);
                    break;
                case 16:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.dosia);
                    break;
                case 17:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.duke);
                    break;
                case 18:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.edward);
                    break;
                case 19:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.elige);
                    break;
                case 20:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.exileh);
                    break;
                case 21:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.faker);
                    break;
                case 22:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.febiven);
                    break;
                case 23:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.felps);
                    break;
                case 24:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fer);
                    break;
                case 25:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.flamie);
                    break;
                case 26:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.flusha);
                    break;
                case 27:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fnx);
                    break;
                case 28:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.gamsu);
                    break;
                case 29:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.guardian);
                    break;
                case 30:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hen1);
                    break;
                case 31:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hiko);
                    break;
                case 32:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hooch);
                    break;
                case 33:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.huhi);
                    break;
                case 34:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.huni);
                    break;
                case 35:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.hylissang);
                    break;
                case 36:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.jdm64);
                    break;
                case 37:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.jw);
                    break;
                case 38:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.kami);
                    break;
                case 39:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.krimz);
                    break;
                case 40:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.lucas1);
                    break;
                case 41:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.minerva);
                    break;
                case 42:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.mou);
                    break;
                case 43:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.move);
                    break;
                case 44:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.mylon);
                    break;
                case 45:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.nitr0);
                    break;
                case 46:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.olofmeister);
                    break;
                case 47:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.parang);
                    break;
                case 48:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.picoca);
                    break;
                case 49:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.pimp);
                    break;
                case 50:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.pobelter);
                    break;
                case 51:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.raise);
                    break;
                case 52:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.reignover);
                    break;
                case 53:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.rekkles);
                    break;
                case 54:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.rpk);
                    break;
                case 55:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.savage);
                    break;
                case 56:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.scream);
                    break;
                case 57:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.seized);
                    break;
                case 58:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.shoowtime);
                    break;
                case 59:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.shox);
                    break;
                case 60:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.sirt);
                    break;
                case 61:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.smithzz);
                    break;
                case 62:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.spaze);
                    break;
                case 63:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.spirit);
                    break;
                case 64:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.steelback);
                    break;
                case 65:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.stixxay);
                    break;
                case 66:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.taco);
                    break;
                case 67:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.taeyeon);
                    break;
                case 68:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.tb);
                    break;
                case 69:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.veritas);
                    break;
                case 70:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.vizicsacsi);
                    break;
                case 71:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.wildturtle);
                    break;
                case 72:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.wolf);
                    break;
                case 73:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.xmithie);
                    break;
                case 74:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.yellowstar);
                    break;
                case 75:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zakk);
                    break;
                case 76:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zeus);
                    break;
                case 77:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zhoking);
                    break;
                case 78:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.ziriguidun);
                    break;

            }
            a = random.nextInt(79);
        }
        if (v.getId() == R.id.lol) {
            if(jogo == 1)
            {   time = true;
                pontos += 1;
                Log.d("dsadasd", "gg");
            }
            else if(jogo == 0)
            {
                time = true;
                pontos = 0;
                Log.d("dsadasd", "perdeu");
            }
            if(time == true)
            {
                a = random.nextInt(79);
                time = false;
            }
            score.setText(String.valueOf(pontos));
            Log.d("dasda", String.valueOf(jogo));
            switch (a) {
                case 0:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.boltz);
                    break;
                case 1:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.brtt);
                    break;
                case 2:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.coldzera);
                    break;
                case 3:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fallen);
                    break;
                case 4:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.adren);
                    break;
                case 5:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.adrian);
                    break;
                case 6:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.advent);
                    break;
                case 7:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.airwaks);
                    break;
                case 8:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.aphromoo);
                    break;
                case 9:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.bang);
                    break;
                case 10:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.bengi);
                    break;
                case 11:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.betsy);
                    break;
                case 12:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.blank);
                    break;
                case 13:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.bodyy);
                    break;
                case 14:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.darshan);
                    break;
                case 15:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.dennis);
                    break;
                case 16:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.dosia);
                    break;
                case 17:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.duke);
                    break;
                case 18:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.edward);
                    break;
                case 19:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.elige);
                    break;
                case 20:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.exileh);
                    break;
                case 21:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.faker);
                    break;
                case 22:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.febiven);
                    break;
                case 23:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.felps);
                    break;
                case 24:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fer);
                    break;
                case 25:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.flamie);
                    break;
                case 26:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.flusha);
                    break;
                case 27:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.fnx);
                    break;
                case 28:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.gamsu);
                    break;
                case 29:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.guardian);
                    break;
                case 30:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hen1);
                    break;
                case 31:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hiko);
                    break;
                case 32:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.hooch);
                    break;
                case 33:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.huhi);
                    break;
                case 34:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.huni);
                    break;
                case 35:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.hylissang);
                    break;
                case 36:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.jdm64);
                    break;
                case 37:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.jw);
                    break;
                case 38:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.kami);
                    break;
                case 39:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.krimz);
                    break;
                case 40:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.lucas1);
                    break;
                case 41:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.minerva);
                    break;
                case 42:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.mou);
                    break;
                case 43:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.move);
                    break;
                case 44:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.mylon);
                    break;
                case 45:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.nitr0);
                    break;
                case 46:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.olofmeister);
                    break;
                case 47:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.parang);
                    break;
                case 48:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.picoca);
                    break;
                case 49:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.pimp);
                    break;
                case 50:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.pobelter);
                    break;
                case 51:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.raise);
                    break;
                case 52:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.reignover);
                    break;
                case 53:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.rekkles);
                    break;
                case 54:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.rpk);
                    break;
                case 55:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.savage);
                    break;
                case 56:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.scream);
                    break;
                case 57:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.seized);
                    break;
                case 58:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.shoowtime);
                    break;
                case 59:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.shox);
                    break;
                case 60:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.sirt);
                    break;
                case 61:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.smithzz);
                    break;
                case 62:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.spaze);
                    break;
                case 63:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.spirit);
                    break;
                case 64:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.steelback);
                    break;
                case 65:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.stixxay);
                    break;
                case 66:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.taco);
                    break;
                case 67:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.taeyeon);
                    break;
                case 68:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.tb);
                    break;
                case 69:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.veritas);
                    break;
                case 70:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.vizicsacsi);
                    break;
                case 71:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.wildturtle);
                    break;
                case 72:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.wolf);
                    break;
                case 73:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.xmithie);
                    break;
                case 74:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.yellowstar);
                    break;
                case 75:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zakk);
                    break;
                case 76:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zeus);
                    break;
                case 77:
                    jogo = 0;
                    imageView.setBackgroundResource(R.drawable.zhoking);
                    break;
                case 78:
                    jogo = 1;
                    imageView.setBackgroundResource(R.drawable.ziriguidun);
                    break;

            }

        }
    }

    @Override
    public void run() {
        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                if(pontos == 15)
                {
                    Log.d("dsad", "alahukbar");
                    Intent sendintent = new Intent();
                    sendintent.setAction("JAMV");
                    sendintent.putExtra("letter","U1");
                    startActivity(sendintent);
                }
            }
        });

        switch (a) {
            case 0:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.boltz);
                break;
            case 1:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.brtt);

                break;
            case 2:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.coldzera);

                break;
            case 3:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.fallen);
               break;
            case 4:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.adren);
                break;
            case 5:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.adrian);
                break;
            case 6:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.advent);
                break;
            case 7:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.airwaks);
                break;
            case 8:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.aphromoo);
                break;
            case 9:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.bang);
                break;
            case 10:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.bengi);
                break;
            case 11:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.betsy);
                break;
            case 12:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.blank);
                break;
            case 13:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.bodyy);
                break;
            case 14:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.darshan);
                break;
            case 15:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.dennis);
                break;
            case 16:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.dosia);
                break;
            case 17:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.duke);
                break;
            case 18:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.edward);
                break;
            case 19:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.elige);
                break;
            case 20:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.exileh);
                break;
            case 21:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.faker);
                break;
            case 22:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.febiven);
                break;
            case 23:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.felps);
                break;
            case 24:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.fer);
                break;
            case 25:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.flamie);
                break;
            case 26:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.flusha);
                break;
            case 27:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.fnx);
                break;
            case 28:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.gamsu);
                break;
            case 29:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.guardian);
                break;
            case 30:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.hen1);
                break;
            case 31:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.hiko);
                break;
            case 32:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.hooch);
                break;
            case 33:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.huhi);
                break;
            case 34:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.huni);
                break;
            case 35:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.hylissang);
                break;
            case 36:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.jdm64);
                break;
            case 37:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.jw);
                break;
            case 38:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.kami);
                break;
            case 39:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.krimz);
                break;
            case 40:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.lucas1);
                break;
            case 41:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.minerva);
                break;
            case 42:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.mou);
                break;
            case 43:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.move);
                break;
            case 44:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.mylon);
                break;
            case 45:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.nitr0);
                break;
            case 46:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.olofmeister);
                break;
            case 47:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.parang);
                break;
            case 48:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.picoca);
                break;
            case 49:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.pimp);
                break;
            case 50:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.pobelter);
                break;
            case 51:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.raise);
                break;
            case 52:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.reignover);
                break;
            case 53:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.rekkles);
                break;
            case 54:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.rpk);
                break;
            case 55:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.savage);
                break;
            case 56:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.scream);
                break;
            case 57:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.seized);
                break;
            case 58:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.shoowtime);
                break;
            case 59:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.shox);
                break;
            case 60:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.sirt);
                break;
            case 61:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.smithzz);
                break;
            case 62:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.spaze);
                break;
            case 63:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.spirit);
                break;
            case 64:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.steelback);
                break;
            case 65:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.stixxay);
                break;
            case 66:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.taco);
                break;
            case 67:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.taeyeon);
                break;
            case 68:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.tb);
                break;
            case 69:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.veritas);
                break;
            case 70:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.vizicsacsi);
                break;
            case 71:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.wildturtle);
                break;
            case 72:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.wolf);
                break;
            case 73:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.xmithie);
                break;
            case 74:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.yellowstar);
                break;
            case 75:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.zakk);
                break;
            case 76:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.zeus);
                break;
            case 77:
                jogo = 0;
                imageView.setBackgroundResource(R.drawable.zhoking);
                break;
            case 78:
                jogo = 1;
                imageView.setBackgroundResource(R.drawable.ziriguidun);
                break;
        }

    }
}
