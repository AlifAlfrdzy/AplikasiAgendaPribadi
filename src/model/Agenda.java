/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Agenda {
    private String tanggal;
    private String hari;
    private String kategori;
    private String deskripsi;

    public Agenda(String tanggal, String hari, String kategori, String deskripsi) {
        this.tanggal = tanggal;
        this.hari = hari;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
    }

    public String getTanggal() { return tanggal; }
    public String getHari() { return hari; }
    public String getKategori() { return kategori; }
    public String getDeskripsi() { return deskripsi; }

    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
    public void setHari(String Hari) { this.hari = hari; }
    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
}
