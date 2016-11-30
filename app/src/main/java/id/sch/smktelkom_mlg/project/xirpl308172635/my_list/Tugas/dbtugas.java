package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.Tugas;

import com.orm.SugarRecord;

/**
 * Created by WINDOWS 8.1 on 30/11/2016.
 */

public class dbtugas extends SugarRecord {
    String judul, deskripsi;
    int tanggal_pengumpulan, waktu_pengumpulan;

    public dbtugas() {
    }

    public dbtugas(String judul, String deskripsi, int tanggal_pengumpulan, int waktu_pengumpulan) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tanggal_pengumpulan = tanggal_pengumpulan;
        this.waktu_pengumpulan = waktu_pengumpulan;
    }

}
