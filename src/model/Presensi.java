/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

public class Presensi implements Status {

    private LocalDate tanggal;
    private int status;
    
    public Presensi(LocalDate tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + status + "]";
    }
    
}
