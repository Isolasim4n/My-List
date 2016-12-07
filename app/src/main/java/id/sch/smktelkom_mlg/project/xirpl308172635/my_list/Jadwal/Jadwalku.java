package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Jadwal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;

public class Jadwalku extends AppCompatActivity {
    public static final int REQUEST_CODE = 88;
    FloatingActionButton fabTugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalku);

        fabTugas = (FloatingActionButton) findViewById(R.id.fabTugas);
        fabTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(new Intent(Jadwalku.this, input_jadwal.class), REQUEST_CODE);
            }
        });
    }
}
