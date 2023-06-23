/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

import java.time.LocalDate;
import model.*;
import view.MenuScreen;

public class Main {
    public static void main(String[] args) {
        // DUMMY MATA KULIAH
        MataKuliah matkul1 = new MataKuliah("IF-301", 3, "PBO");
        MataKuliah matkul2 = new MataKuliah("IF-303", 3, "Sistem Berkas");
        MataKuliah matkul3 = new MataKuliah("IF-3P1", 1, "Praktikum PBO");
        MataKuliah matkul4 = new MatkulPilihan("TI-794", 2, "Probstat 2", 10);
        MataKuliah matkul5 = new MatkulPilihan("SI-381", 2, "Sistem Informasi", 10);

        ArrayList<MataKuliah> dummyListMataKuliah = new ArrayList<MataKuliah>();
        dummyListMataKuliah.add(matkul1);
        dummyListMataKuliah.add(matkul2);
        dummyListMataKuliah.add(matkul3);
        dummyListMataKuliah.add(matkul4);
        dummyListMataKuliah.add(matkul5);

        // DUMMY MAHASISWA SARJANA
        ArrayList<Presensi> dummyListPresensiSarjana = new ArrayList<Presensi>();
        dummyListPresensiSarjana.add(new Presensi(LocalDate.of(2023, 6, 21), Status.HADIR));

        ArrayList<MatkulAmbil> dummyListMataKuliahSarjana = new ArrayList<MatkulAmbil>();
        dummyListMataKuliahSarjana.add(new MatkulAmbil(new MataKuliah("SI-381", 2, "Sistem Informasi"), dummyListPresensiSarjana, 80, 90, 100));

        Sarjana dummySarjana = new Sarjana("1122006", "Informatika", "Jason", "Taman Kopo Indah",
                "Bandung, 4 Februari 2004", "085712345678", dummyListMataKuliahSarjana);

        // DUMMY MAHASISWA MAGISTER
        ArrayList<Presensi> dummyListPresensiMagister = new ArrayList<Presensi>();
        dummyListPresensiMagister.add(new Presensi(LocalDate.of(2023, 6, 25), Status.HADIR));

        ArrayList<MatkulAmbil> dummyListMataKuliahMagister = new ArrayList<>();
        dummyListMataKuliahMagister.add(new MatkulAmbil(new MataKuliah("IF-303", 3, "Sistem Berkas"), dummyListPresensiMagister, 90, 75, 100));

        Magister dummyMagister = new Magister("1121006", "Sistem Informasi", "Enrico", "Astana Anyar",
                "Bandung, 1 Januari 2000", "081987654321", dummyListMataKuliahMagister,
                "Penerapan Teknologi Blockchain dalam Sistem Manajemen Data Mahasiswa untuk Keamanan dan Keandalan Data");

        // DUMMY MAHASISWA DOKTOR
        Doktor dummyDoktor = new Doktor(
                "Strategi Inovasi dan Keunggulan Kompetitif: Studi Kasus pada Industri Teknologi Informasi dan Komunikasi",
                85, 75, 90, "1120006", "Managemen", "Manuela", "Dipatiukur", "Bandung, 1 Desember 1996",
                "085792837011");

        // DUMMY DOSEN TETAP
        ArrayList<PresensiStaff> dummyListPresensiStaff1 = new ArrayList<PresensiStaff>();
        dummyListPresensiStaff1.add(new PresensiStaff(LocalDate.of(2023, 6, 23), Status.HADIR, 2));

        ArrayList<MatkulAjar> dummyListMatkulAjar1 = new ArrayList<MatkulAjar>();
        dummyListMatkulAjar1.add(new MatkulAjar(new MataKuliah("IF-301", 3, "PBO"), dummyListPresensiStaff1));

        DosenTetap dummyDosenTetap = new DosenTetap(10000000, "Teknik Informatika", dummyListMatkulAjar1,
                "3273130505800001", "Padosen", "Margahayu Raya", "Bandung, 5 Mei 1980", "081392312893");

        // DUMMY DOSEN HONORER
        ArrayList<PresensiStaff> dummyListPresensiStaff2 = new ArrayList<PresensiStaff>();
        dummyListPresensiStaff2.add(new PresensiStaff(LocalDate.of(2023, 6, 23), Status.HADIR, 2));

        ArrayList<MatkulAjar> dummyListMatkulAjar2 = new ArrayList<MatkulAjar>();
        dummyListMatkulAjar2.add(new MatkulAjar(new MataKuliah("IF-3P1", 2, "Praktikum PBO"), dummyListPresensiStaff2));

        DosenHonorer dummyDosenHonorer = new DosenHonorer("Sistem Informasi", dummyListMatkulAjar2, "3273130404830001",
                "Budosen", "Sudirman", "Bandung, 4 April 1983", "081512398745", 1000000);

        // DUMMY STAFF
        ArrayList<PresensiStaff> dummyPresensiKaryawan = new ArrayList<PresensiStaff>();
        dummyPresensiKaryawan.add(new PresensiStaff(LocalDate.of(2023, 6, 25), Status.HADIR, 2));

        Karyawan dummyKaryawan = new Karyawan(4500000, dummyPresensiKaryawan, "3273130606900001", "Asep", "Rahayu",
                "Bandung, 6 Juni 1990", "081712387876");

        // DUMMY USER
        user.add(dummySarjana);
        user.add(dummyMagister);
        user.add(dummyDoktor);
        user.add(dummyDosenTetap);
        user.add(dummyDosenHonorer);
        user.add(dummyKaryawan);

        // DUMMY MAHASISWA
        mahasiswa.add(dummySarjana);
        mahasiswa.add(dummyMagister);
        mahasiswa.add(dummyDoktor);

        // DUMMY DOSEN
        dosen.add(dummyDosenTetap);
        dosen.add(dummyDosenHonorer);
        
        // DUMMY STAFF
        staff.add(dummyDosenTetap);
        staff.add(dummyDosenHonorer);
        staff.add(dummyKaryawan);

        new MenuScreen();
    }
    
    public static ArrayList<User> user = new ArrayList<User>();
    public static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    public static ArrayList<Dosen> dosen = new ArrayList<Dosen>();
    public static ArrayList<Staff> staff = new ArrayList<Staff>();
        
}