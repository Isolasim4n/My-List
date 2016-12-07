package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Jadwal;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.adapter.InputJadwalAdapter;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.inputjadwal.InputJadwal;

/**
 * Created by Marissa Nur Aini on 12/4/2016.
 */
public class input_jadwal extends AppCompatActivity {
    ArrayList<InputJadwal> mInputJadwal = new ArrayList<>();
    InputJadwalAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_jadwal);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);


        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new InputJadwalAdapter(mInputJadwal);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] Judul = resources.getStringArray(R.array.hari);
        String[] Deskripsi = resources.getStringArray(R.array.hari);
        TypedArray satu = resources.obtainTypedArray(R.array.hari_picture);
        Drawable[] Foto = new Drawable[satu.length()];
        for (int i = 0; i < Foto.length; i++) {
            Foto[i] = satu.getDrawable(i);

        }
        satu.recycle();

        for (int i = 0; i < Judul.length; i++) {
            mInputJadwal.add(new InputJadwal(Judul[i], Deskripsi[i], Foto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

}

