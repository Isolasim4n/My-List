package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import id.sch.smktelkom_mlg.project.xirpl308172635.my_list.db_message;

/**
 * Created by WINDOWS 8.1 on 17/11/2016.
 */

public class dbtugas extends SQLiteOpenHelper {

    public static final String DESKRIPSI = "deskripsi";
    private static final String DATABASE_NAME = "mylist";
    private static final String TABLE_NAME = "tb_tugas";
    private static final String UID = "no";
    private static final String JUDUL = "judul";
    private static final String HARI = "hari_pengumpulan";
    private static final String TANGGAL = "tanggal_pengumpulan";
    private static final String WAKTU = "waktu_pengumpulan";
    private static final int DATABASE_VERSION = 1;
    private static final String DROP_TABLE = "DROP TABLE  IF EXISTS " + TABLE_NAME;
    //Membuat database
    private static final String db_create = "create table "
            + TABLE_NAME + "("
            + UID + " integer primary key autoincrement, "
            + JUDUL + " varchar(50) not null, "
            + DESKRIPSI + "text not null"
            + HARI + "varchar(50) not null ,"
            + TANGGAL + "integer (11) not null,"
            + WAKTU + "integer (11) not null;";
    private Context context;


    public dbtugas(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        db_message.message(context, "dbTugas dipanggil");
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
