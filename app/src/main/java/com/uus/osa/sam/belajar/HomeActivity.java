package com.uus.osa.sam.belajar;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnclick;
    Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnclick = (Button)findViewById(R.id.btnclick);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //membuat message box
                final Dialog dialog;
                dialog = new Dialog(c);

                //menghubungkan ke layout costum
                dialog.setContentView(R.layout.costum_dialog);

                //membuat judul
                setTitle("Costum Dialog");

                //insisialisasikan
                Button btnyes = (Button)dialog.findViewById(R.id.btnyes);
                Button btnclose = (Button)dialog.findViewById(R.id.btnclose);

                //membuat method untuk button
                btnyes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(HomeActivity.this, "contoh toas", Toast.LENGTH_SHORT).show();
                    }
                });
                btnclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}
