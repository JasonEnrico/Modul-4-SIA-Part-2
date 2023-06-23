/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Dosen extends Staff {

    private String departemen;
    private ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();

    public Dosen(String departemen, ArrayList<MatkulAjar> listMatkulAjar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        this.listMatkulAjar = listMatkulAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulAjar() {
        return listMatkulAjar;
    }

    public void setListMatkulAjar(ArrayList<MatkulAjar> listMatkulAjar) {
        this.listMatkulAjar = listMatkulAjar;
    }

    @Override
    public String toString() {
        return super.toString() + "Dosen{" + "departemen=" + departemen + ", listMatkulAjar=" + listMatkulAjar + '}';
    }
    
}
