package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Jadwal.Jadwalku;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Tugas.Tugasku;

public class MainActivity extends AppCompatActivity  {


    public static final int REQUEST_CODE = 88;
    Button bJadwal,bTugas;
     TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        bJadwal = (Button) findViewById(R.id.btnJadwal);
        bTugas = (Button) findViewById(R.id.btnTugas);

        bJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, Jadwalku.class), REQUEST_CODE);
            }
        });

        bTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this,Tugasku.class),REQUEST_CODE);
            }
        });


    }


}
