/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Karyawan extends Staff {

    private int salary;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public Karyawan(int salary, ArrayList<PresensiStaff> presensiStaff, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "Karyawan{" + "salary=" + salary + ", presensiStaff=" + presensiStaff + '}';
    }

}
