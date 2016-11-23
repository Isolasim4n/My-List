package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas.dbtugas;

public class InputActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    dbtugas dbTugas;
    dbJadwal dbjadwal;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button bTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        dbjadwal = new dbJadwal(this);
        SQLiteDatabase sqLiteDatabase = dbjadwal.getWritableDatabase();

        dbTugas = new dbtugas(this);
        SQLiteDatabase sqLiteDatabase1 = dbTugas.getWritableDatabase();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("Tambah Jadwal"));
        tabLayout.addTab(tabLayout.newTab().setText("Tambah Tugas"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pagerinput);


        PagerInput adapter = new PagerInput(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

}
