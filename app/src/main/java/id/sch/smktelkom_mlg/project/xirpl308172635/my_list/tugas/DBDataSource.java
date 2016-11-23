package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by USER on 21/11/2016.
 */
public class DBDataSource {

    private SQLiteDatabase database;

    private dbtugas dbTugas;

    private String[] allColumns = {dbtugas.UID, dbtugas.JUDUL, dbtugas.DESKRIPSI, dbtugas.TANGGAL, dbtugas.WAKTU};

    public DBDataSource(Context context) {
        dbTugas = new dbtugas(context);
    }

    public void open() throws SQLException {
        database = dbTugas.getWritableDatabase();
    }

    public void close() {
        dbTugas.close();
    }

    public Tugas createTugas(String judul, String deskripsi, String tanggal, String waktu) {
        ContentValues values = new ContentValues();
        values.put(dbtugas.JUDUL, judul);
        values.put(dbtugas.DESKRIPSI, deskripsi);
        values.put(dbtugas.TANGGAL, tanggal);
        values.put(dbtugas.WAKTU, waktu);

        long insertID = database.insert(dbtugas.TABLE_NAME, null, values);

        Cursor cursor = database.query(dbtugas.TABLE_NAME, allColumns, dbtugas.UID + " = " + insertID, null, null, null, null);

        cursor.moveToFirst();

        Tugas newTugas = cursorToTugas(cursor);

        cursor.close();

        return newTugas;

    }

    private Tugas cursorToTugas(Cursor cursor) {
        Tugas tugas = new Tugas();

        Log.v("info", "The getLONG" + cursor.getLong(0));
        Log.v("info", "The setLatLng" + cursor.getString(1) + "," + cursor.getString(2));

        tugas.setId(cursor.getLong(0));
        tugas.setNama_tugas(cursor.getString(1));
        tugas.setDesk_tugas(cursor.getString(2));
        tugas.setTanggal_tugas(cursor.getString(3));
        tugas.setWaktu_tugas(cursor.getString(4));

        return tugas;
    }

}
