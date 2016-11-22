package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    public static final int REQUEST_CODE_ADD = 88;
    dbJadwal dbjadwal;
    dbtugas dbTugas;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dbjadwal = new dbJadwal(this);
        SQLiteDatabase sqLiteDatabase = dbjadwal.getWritableDatabase();

        dbTugas = new dbtugas(this);
        SQLiteDatabase sqLiteDatabase1 = dbTugas.getWritableDatabase();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goAdd();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Jadwal"));
        tabLayout.addTab(tabLayout.newTab().setText("Tugas"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);



        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(this);


    }


    private void goAdd() {
        startActivityForResult(new Intent(this, InputActivity.class), REQUEST_CODE_ADD);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
