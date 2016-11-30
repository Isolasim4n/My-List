package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Tugas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.R;

public class Tugasku extends AppCompatActivity {

    public static final int INT = 88;
    Button bView;
    TabLayout tabLayout;
    ListView mlistview;
    ArrayAdapter<dbtugas> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugasku);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tugas"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mlistview = (ListView) findViewById(R.id.listview);

        //Fungsi untuk read data
        List<dbtugas> list = dbtugas.listAll(dbtugas.class);

        adapter = new ArrayAdapter<dbtugas>(Tugasku.this, android.R.layout.simple_list_item_1, list);
        mlistview.setAdapter(adapter);
        bView = (Button) findViewById(R.id.btnView);
        bView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabTugas);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Tugasku.this,CreateData.class),INT);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
