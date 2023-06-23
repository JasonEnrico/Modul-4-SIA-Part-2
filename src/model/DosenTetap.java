/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {

    private int salary;

    public DosenTetap(int salary, String departemen, ArrayList<MatkulAjar> listMatkulAjar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, listMatkulAjar, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "DosenTetap{" + "salary=" + salary + '}';
    }

}
