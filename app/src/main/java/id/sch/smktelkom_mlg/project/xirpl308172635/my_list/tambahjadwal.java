package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.jadwal.hari;
import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.jadwal2.hari2;

/**
 * Created by Marissa Nur Aini on 11/22/2016.
 */
public class tambahjadwal extends Activity {
    ArrayList<hari> mHari = new ArrayList<>();
    hari2 mHari2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputjadwal);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mHari2 = new hari2(mHari);
        recyclerView.setAdapter(mHari2);

        fillData();
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.hari);
        TypedArray satu = resources.obtainTypedArray(R.array.hari_picture);
        Drawable[] arFoto = new Drawable[satu.length()];

        for (int i = 0; i < arFoto.length; i++) {
            BitmapDrawable bd = (BitmapDrawable) satu.getDrawable(i);
            RoundedBitmapDrawable rbd = RoundedBitmapDrawableFactory.create(getResources(), bd.getBitmap());
            rbd.setCircular(true);
            arFoto[i] = rbd;
        }
    }
}
