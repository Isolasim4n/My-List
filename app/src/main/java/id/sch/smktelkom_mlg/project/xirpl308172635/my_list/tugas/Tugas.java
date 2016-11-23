package id.sch.smktelkom_mlg.project.xirpl308172635.my_list.tugas;

/**
 * Created by USER on 23/11/2016.
 */

public class Tugas {
    private long id;
    private String nama_tugas;
    private String desk_tugas;
    private String tanggal_tugas;
    private String waktu_tugas;

    public Tugas() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_tugas() {
        return nama_tugas;
    }

    public void setNama_tugas(String nama_tugas) {
        this.nama_tugas = nama_tugas;
    }

    public String getDesk_tugas() {
        return desk_tugas;
    }

    public void setDesk_tugas(String desk_tugas) {
        this.desk_tugas = desk_tugas;
    }

    public String getTanggal_tugas() {
        return tanggal_tugas;
    }

    public void setTanggal_tugas(String tanggal_tugas) {
        this.tanggal_tugas = tanggal_tugas;
    }

    public String getWaktu_tugas() {
        return waktu_tugas;
    }

    public void setWaktu_tugas(String waktu_tugas) {
        this.waktu_tugas = waktu_tugas;
    }

    public String toString() {
        return "Tugas " + nama_tugas + " " + desk_tugas + " " + tanggal_tugas + " " + waktu_tugas;
    }

}
