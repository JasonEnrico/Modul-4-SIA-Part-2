/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMataKuliahMagister = new ArrayList<>();
    private String judulPenelitianTesis;

    public Magister(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> listMataKuliahMagister, String judulPenelitianTesis) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.listMataKuliahMagister = listMataKuliahMagister;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getListMataKuliahMagister() {
        return listMataKuliahMagister;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setListMataKuliahMagister(ArrayList<MatkulAmbil> listMataKuliahMagister) {
        this.listMataKuliahMagister = listMataKuliahMagister;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "Magister{" + "listMataKuliahMagister=" + listMataKuliahMagister + ", judulPenelitianTesis=" + judulPenelitianTesis + '}';
    }
    
}
