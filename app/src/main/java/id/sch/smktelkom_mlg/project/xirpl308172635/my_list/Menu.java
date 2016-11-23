package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas.CreateData;

/**
 * Created by USER on 21/11/2016.
 */

public class Menu extends Activity implements View.OnClickListener {

    private Button bTambah;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.inputtugas);

        bTambah = (Button) findViewById(R.id.button_tambah);
        bTambah.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_tambah:
                Intent i = new Intent(this, CreateData.class);
                startActivity(i);
                break;
        }
    }
}
