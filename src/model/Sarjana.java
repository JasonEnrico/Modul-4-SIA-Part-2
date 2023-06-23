/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMataKuliahSarjana = new ArrayList<>();

    public Sarjana(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> listMataKuliahSarjana) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.listMataKuliahSarjana = listMataKuliahSarjana;
    }

    public ArrayList<MatkulAmbil> getListMataKuliahSarjana() {
        return listMataKuliahSarjana;
    }

    public void setListMataKuliahSarjana(ArrayList<MatkulAmbil> listMataKuliahSarjana) {
        this.listMataKuliahSarjana = listMataKuliahSarjana;
    }

    @Override
    public String toString() {
        return super.toString() + "Sarjana [listMataKuliahSarjana=" + listMataKuliahSarjana + "]";
    }
    
}
