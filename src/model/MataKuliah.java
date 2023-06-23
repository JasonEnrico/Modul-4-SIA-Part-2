/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class MataKuliah {

    private String kode;
    private int SKS;
    private String nama;

    public MataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode=" + kode + ", SKS=" + SKS + ", nama=" + nama + '}';
    }
    
}
