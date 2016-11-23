package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;

public class CreateData extends AppCompatActivity implements View.OnClickListener {

    //inisialisasi eleme-elemen pada layout
    Button buttonSubmit;
    EditText ejudul, edeskripsi, etanggal, ewaktu;
    private DBDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputtugas);

        buttonSubmit = (Button) findViewById(R.id.button_tambah);
        buttonSubmit.setOnClickListener(this);
        ejudul = (EditText) findViewById(R.id.etjudul);
        edeskripsi = (EditText) findViewById(R.id.etdeskripsi);
        etanggal = (EditText) findViewById(R.id.etdate);
        ewaktu = (EditText) findViewById(R.id.ettime);

        dataSource = new DBDataSource(this);
        dataSource.open();
    }

    @Override
    public void onClick(View v) {
        String judul = null;
        String deskripsi = null;
        String tanggal = null;
        String waktu = null;
        @SuppressWarnings("unused")

        Tugas tugas = null;
        if (ejudul.getText() != null && edeskripsi.getText() != null && etanggal != null && ewaktu != null) {
            judul = ejudul.getText().toString();
            deskripsi = edeskripsi.getText().toString();
            tanggal = etanggal.getText().toString();
            waktu = ewaktu.getText().toString();
        }
        switch (v.getId()) {
            case R.id.button_tambah:
                tugas = dataSource.createTugas(judul, deskripsi, tanggal, waktu);
                Toast.makeText(this, "Tugas baru\n" +
                        "judul : " + tugas.getNama_tugas() + "\n" +
                        "deskripsi : " + tugas.getDesk_tugas() + "\n" +
                        "tanggal pengumpulan : " + tugas.getTanggal_tugas() + "\n" +
                        "waktu pengerjaan : " + tugas.getWaktu_tugas(), Toast.LENGTH_LONG).show();
                break;
        }
    }
}
