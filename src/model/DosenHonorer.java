/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen {

    private int honorPerSKS;

    public DosenHonorer(String departemen, ArrayList<MatkulAjar> listMatkulAjar, String NIK, String nama, String alamat, String TTL, String telepon, int honorPerSKS) {
        super(departemen, listMatkulAjar, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "DosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }

}
