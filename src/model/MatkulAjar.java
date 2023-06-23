/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class MatkulAjar {

    private MataKuliah matkulAjar;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulAjar(MataKuliah matkulAjar, ArrayList<PresensiStaff> listPresensiStaff) {
        this.matkulAjar = matkulAjar;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(MataKuliah matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar [matkulAjar=" + matkulAjar + ", listPresensiStaff=" + listPresensiStaff + "]";
    }
    
    
}
