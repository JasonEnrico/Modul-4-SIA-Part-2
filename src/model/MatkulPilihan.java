/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class MatkulPilihan extends MataKuliah {

    private int jumlahMinimumMahasiswa;

    public MatkulPilihan(String kode, int SKS, String nama, int jumlahMinimumMahasiswa) {
        super(kode, SKS, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "MatkulPilihan{" + "jumlahMinimumMahasiswa=" + jumlahMinimumMahasiswa + '}';
    }

}
