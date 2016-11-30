package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Tugas;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;

public class CreateData extends AppCompatActivity {

    TabLayout tabLayout;
    Button bsimpan;
    EditText etjudul,etdeskripsi,ettanggal_pengumpulan,etwaktu_pengumpulan;
    dbtugas db_tugas = new dbtugas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_data);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tambahkan Tugas"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        etjudul = (EditText) findViewById(R.id.etjudul);
        etdeskripsi = (EditText) findViewById(R.id.etdeskripsi);
        ettanggal_pengumpulan = (EditText) findViewById(R.id.etdate);
        etwaktu_pengumpulan = (EditText) findViewById(R.id.ettime);

        bsimpan = (Button) findViewById(R.id.Simpan);
        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String judul = etjudul.getText().toString();
                String deskripsi = etdeskripsi.getText().toString();
                int tanggal_pengumpulan = Integer.parseInt(ettanggal_pengumpulan.getText().toString());
                int waktu_pengumpulan = Integer.parseInt(etwaktu_pengumpulan.getText().toString());

                db_tugas = new dbtugas(judul, deskripsi, tanggal_pengumpulan, waktu_pengumpulan);
                db_tugas.save(); //Fungsi untuk insert data

                Toast.makeText(getApplicationContext(), "Tugas : " + db_tugas, Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
