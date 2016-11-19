package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by WINDOWS 8.1 on 17/11/2016.
 */

public class dbJadwal extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mylist";
    private static final String TABLE_NAME = "tb_jadwal";
    private static final String UID = "no";
    private static final String NAME = "jadwal";
    private static final String JAM1 = "waktu mulai";
    private static final String JAM2 = "waktu selesai";
    private static final String HARI = "hari";
    private static final String TANGGAL = "tanggal";
    private static final String BULAN = "bulan";
    private static final String TAHUN = "tahun";
    private static final int DATABASE_VERSION = 1;
    private static final String DROP_TABLE = "DROP TABLE  IF EXISTS " + TABLE_NAME;
    //Membuat database
    private static final String db_create = "create table "
            + TABLE_NAME + "("
            + UID + " integer primary key autoincrement, "
            + NAME + " varchar(50) not null, "
            + JAM1 + " varchar(50) not null, "
            + JAM2 + " varchar(50) not null),"
            + HARI + "varchar(50) not null ,"
            + TANGGAL + "integer (11) not null,"
            + BULAN + "integer (11) not null,"
            + TAHUN + "integer (11) not null;";
    private Context context;


    public dbJadwal(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        db_message.message(context, "dbJadwal dipanggil");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(db_create);
            db_message.message(context, "onCreate dipanggil");
        } catch (SQLiteException e) {
            db_message.message(context, "" + e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db_message.message(context, "onUpgrade dipanggil");
            db.execSQL(DROP_TABLE);
            onCreate(db);
        } catch (SQLiteException e) {
            db_message.message(context, "" + e);
        }
    }
}
