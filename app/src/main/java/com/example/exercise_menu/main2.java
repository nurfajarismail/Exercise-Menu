package com.example.exercise_menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class main2 extends AppCompatActivity {
    private Context context;
    TextView persegi, lingkran,pp,segitiga,trapesium;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        persegi=(TextView) findViewById(R.id.persegii);
        lingkran=(TextView)findViewById(R.id.lingkaran);
        pp=(TextView)findViewById(R.id.ppanjang);
        segitiga=(TextView)findViewById(R.id.segitiga);
        trapesium=(TextView) findViewById(R.id.trapesium) ;
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogpersegi();
            }


        });
        lingkran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialoglingkaran();
            }


        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogpp();
            }


        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogsegitiga();
            }


        });
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogtrapes();
            }


        });



    }

    private void showDialogpersegi(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog


        // set pesan dari dialog
        final String[] dialog = {"Hitung Luas", "Hitung Keliling",};
        alertDialogBuilder.setItems(dialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:{

                        startActivity(new Intent(main2.this, luasperseg.class));

                    }break;
                    case 1:{
                        startActivity(new Intent(main2.this, luasperseg.class));
                    }break;
                    default:

                }
            }
        });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
    private void showDialoglingkaran(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog


        // set pesan dari dialog
        final String[] dialog = {"Hitung Luas", "Hitung Keliling",};
        alertDialogBuilder.setItems(dialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:{

                        startActivity(new Intent(main2.this, luasling.class));

                    }break;
                    case 1:{
                        startActivity(new Intent(main2.this, kelilinglingkar.class));
                    }break;
                    default:

                }
            }
        });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
    private void showDialogpp(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog


        // set pesan dari dialog
        final String[] dialog = {"Hitung Luas", "Hitung Keliling",};
        alertDialogBuilder.setItems(dialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:{

                        startActivity(new Intent(main2.this, luaspp.class));

                    }break;
                    case 1:{
                        startActivity(new Intent(main2.this, kelilingpp.class));
                    }break;
                    default:

                }
            }
        });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
    private void showDialogsegitiga(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog


        // set pesan dari dialog
        final String[] dialog = {"Hitung Luas", "Hitung Keliling",};
        alertDialogBuilder.setItems(dialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:{

                        startActivity(new Intent(main2.this, luassgtg.class));

                    }break;
                    case 1:{
                        startActivity(new Intent(main2.this, kelilingsegitiga.class));
                    }break;
                    default:

                }
            }
        });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
    private void showDialogtrapes(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog


        // set pesan dari dialog
        final String[] dialog = {"Hitung Luas", "Hitung Keliling",};
        alertDialogBuilder.setItems(dialog, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:{

                        startActivity(new Intent(main2.this, luastrapes.class));

                    }break;
                    case 1:{
                        startActivity(new Intent(main2.this, kelilingtrapes.class));
                    }break;
                    default:

                }
            }
        });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }

}

