package rribero.botoneragumer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Botones extends Activity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42, button43, button44, button45, button46, button47;
    private MediaPlayer mp;

    public void reproduccion(MediaPlayer sonido){
        mp = sonido;
        if (mp != null){
            mp.release();
        }
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botones);

        button47 = (Button) findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (mp != null && mp.isPlaying() == true) {
                    mp.release();
                }
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View) {
                mp = MediaPlayer.create(Botones.this, R.raw.hijademil);
                reproduccion(mp);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.avances);
                reproduccion(mp);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.barbarian);
                reproduccion(mp);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.batmanyrobin);
                reproduccion(mp);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.botoncitos);
                reproduccion(mp);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {mp = MediaPlayer.create(Botones.this, R.raw.consonia);
                reproduccion(mp);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.dudo);
                reproduccion(mp);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.enagudo);
                reproduccion(mp);
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.fatality);
                reproduccion(mp);
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.finall);
                reproduccion(mp);
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.gambito);
                reproduccion(mp);
            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.gato);
                reproduccion(mp);
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.grosa);
                reproduccion(mp);
            }
        });

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.gumerarg);
                reproduccion(mp);
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.hijademil);
                reproduccion(mp);
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.juegohdp);
                reproduccion(mp);
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.jugaunjuego);
                reproduccion(mp);
            }
        });

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.lagfiles);
                reproduccion(mp);
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.lapapota);
                reproduccion(mp);
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.loros);
                reproduccion(mp);
            }
        });

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.mono);
                reproduccion(mp);
            }
        });

        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.noexiste);
                reproduccion(mp);
            }
        });

        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.nolego);
                reproduccion(mp);
            }
        });

        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.original);
                reproduccion(mp);
            }
        });

        button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.papel);
                reproduccion(mp);
            }
        });

        button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.pegar);
                reproduccion(mp);
            }
        });

        button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.ponianlapapota);
                reproduccion(mp);
            }
        });

        button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.porong);
                reproduccion(mp);
            }
        });

        button29 = (Button) findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.queboludo);
                reproduccion(mp);
            }
        });

        button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.quiero);
                reproduccion(mp);
            }
        });

        button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.reload);
                reproduccion(mp);
            }
        });

        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.risa);
                reproduccion(mp);
            }
        });

        button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.ruido);
                reproduccion(mp);
            }
        });

        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.serasera);
                reproduccion(mp);
            }
        });

        button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.sinonimos);
                reproduccion(mp);
            }
        });

        button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.soyhitman);
                reproduccion(mp);
            }
        });

        button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.soysolo);
                reproduccion(mp);
            }
        });

        button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.tatataan);
                reproduccion(mp);
            }
        });

        button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.termos);
                reproduccion(mp);
            }
        });

        button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.tuhermana);
                reproduccion(mp);
            }
        });

        button41 = (Button) findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.tuvieja);
                reproduccion(mp);
            }
        });

        button42 = (Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.unamuza);
                reproduccion(mp);
            }
        });

        button43 = (Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.unasanders);
                reproduccion(mp);
            }
        });

        button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.uncinco);
                reproduccion(mp);
            }
        });

        button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.hdp);
                reproduccion(mp);
            }
        });

        button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                mp = MediaPlayer.create(Botones.this, R.raw.estamierda);
                reproduccion(mp);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mp = MediaPlayer.create(Botones.this, R.raw.alert);
            mp.start();
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Aviso por las dudas")
                    .setMessage("Esta aplicación no es oficial y no esta vinculada con ningún integrante de STAFF. Fue creada a modo Fanart, muchas gracias por descargarla.")
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            Botones.this.finish();
                        }
                    })
                    .show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

