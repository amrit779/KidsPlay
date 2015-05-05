package com.ava.kidsplay;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
    private static ImageView im_A;
    private static ImageView im_B;
    private static ImageView im_C;
    private static ImageView im_D;
    private static ImageView im_E;
    private static ImageView im_F;
    private static ImageView im_G;
    private static ImageView im_H;
    private static ImageView im_I;
    private static ImageView im_J;
    private static ImageView im_K;
    private static ImageView im_L;
    private static ImageView im_M;
    private static ImageView im_N;
    private static ImageView im_O;
    private static ImageView im_P;
    private static ImageView im_Q;
    private static ImageView im_R;
    private static ImageView im_S;
    private static ImageView im_T;
    private static ImageView im_U;
    private static ImageView im_V;
    private static ImageView im_W;
    private static ImageView im_X;
    private static ImageView im_Y;
    private static ImageView im_Z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickImageViewListener();
    }


    public void OnClickImageViewListener(){
        im_A = (ImageView)findViewById(R.id.imA);
        im_B = (ImageView)findViewById(R.id.imB);
        im_C = (ImageView)findViewById(R.id.imC);
        im_D = (ImageView)findViewById(R.id.imD);
        im_E = (ImageView)findViewById(R.id.imE);
        im_F = (ImageView)findViewById(R.id.imF);
        im_G = (ImageView)findViewById(R.id.imG);
        im_H = (ImageView)findViewById(R.id.imH);
        im_I = (ImageView)findViewById(R.id.imI);
        im_J = (ImageView)findViewById(R.id.imJ);
        im_K = (ImageView)findViewById(R.id.imK);
        im_L = (ImageView)findViewById(R.id.imL);
        im_M = (ImageView)findViewById(R.id.imM);
        im_N = (ImageView)findViewById(R.id.imN);
        im_O = (ImageView)findViewById(R.id.imO);
        im_P = (ImageView)findViewById(R.id.imP);
        im_Q = (ImageView)findViewById(R.id.imQ);
        im_R = (ImageView)findViewById(R.id.imR);
        im_S = (ImageView)findViewById(R.id.imS);
        im_T = (ImageView)findViewById(R.id.imT);
        im_U = (ImageView)findViewById(R.id.imU);
        im_V = (ImageView)findViewById(R.id.imV);
        im_W = (ImageView)findViewById(R.id.imW);
        im_X = (ImageView)findViewById(R.id.imX);
        im_Y = (ImageView)findViewById(R.id.imY);
        im_Z = (ImageView)findViewById(R.id.imZ);


       im_A.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_a");
                        startActivity(intent);
                    }
                }
        );

        im_B.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_b");
                        startActivity(intent);
                    }
                }
        );

        im_C.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_c");
                        startActivity(intent);
                    }
                }
        );

        im_D.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_d");
                        startActivity(intent);
                    }
                }
        );

        im_E.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_e");
                        startActivity(intent);
                    }
                }
        );

        im_F.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_f");
                        startActivity(intent);
                    }
                }
        );

        im_G.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_g");
                        startActivity(intent);
                    }
                }
        );

        im_H.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_h");
                        startActivity(intent);
                    }
                }
        );

        im_I.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_i");
                        startActivity(intent);
                    }
                }
        );

        im_J.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_j");
                        startActivity(intent);
                    }
                }
        );

        im_K.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_k");
                        startActivity(intent);
                    }
                }
        );

        im_L.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_l");
                        startActivity(intent);
                    }
                }
        );

        im_M.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_m");
                        startActivity(intent);
                    }
                }
        );

        im_N.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_n");
                        startActivity(intent);
                    }
                }
        );

        im_O.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_o");
                        startActivity(intent);
                    }
                }
        );

        im_P.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_p");
                        startActivity(intent);
                    }
                }
        );

        im_Q.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_q");
                        startActivity(intent);
                    }
                }
        );

        im_R.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_r");
                        startActivity(intent);
                    }
                }
        );

        im_S.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_s");
                        startActivity(intent);
                    }
                }
        );

        im_T.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_t");
                        startActivity(intent);
                    }
                }
        );

        im_U.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_u");
                        startActivity(intent);
                    }
                }
        );
        im_V.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_v");
                        startActivity(intent);
                    }
                }
        );

        im_W.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_w");
                        startActivity(intent);
                    }
                }
        );

        im_X.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_x");
                        startActivity(intent);
                    }
                }
        );

        im_Y.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_y");
                        startActivity(intent);
                    }
                }
        );

        im_Z.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.ava.kidsplay.activity_z");
                        startActivity(intent);
                    }
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
