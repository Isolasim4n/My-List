package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;

public class CreateDatatugas extends Activity implements OnClickListener {
    private Button buttonSubmit;
    private EditText ejudul, edeskripsi, etanggal, ewaktu;
    private DBDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_datatugas);
        buttonSubmit = (Button) findViewById(R.id.button_submit);
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
            ejudul.setText("");
            edeskripsi.setText("");
            etanggal.setText("");
            ewaktu.setText("");
        }
        switch (v.getId()) {
            case R.id.button_submit:
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
