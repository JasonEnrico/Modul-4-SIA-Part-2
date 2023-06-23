package controller;

import java.util.ArrayList;

import model.*;

public class Controller {

    // PRINT USER DATA
    public String printUserData(String nama, ArrayList<User> user) {
        String teks = "";
        boolean found = false;
        int i;
        for (i = 0; i < user.size(); i++) {
            if (user.get(i).getNama().equals(nama)) {
                found = true;
                break;
            }
        }
        if (found) {
            if (user.get(i) instanceof Mahasiswa) {
                if (user.get(i) instanceof Sarjana) {
                    teks = "Status: Mahasiswa Sarjana";
                } else if (user.get(i) instanceof Magister) {
                    teks = "Status: Mahasiswa Magister";
                } else {
                    teks = "Status: Mahasiswa Doktor";
                }
            } else if (user.get(i) instanceof Dosen) {
                if (user.get(i) instanceof DosenTetap) {
                    teks = "Status: Dosen Tetap";
                } else {
                    teks = "Status: Dosen Honorer";
                }
            } else {
                teks = "Status: Karyawan";
            }
            return user.get(i).toString() + teks;
        } else {
            return "User tidak ditemukan!";
        }
    }

    // PRINT NILAI AKHIR (NA)
    public String printNilaiAkhir(String nim, String kodeMK, ArrayList<Mahasiswa> user) {
        boolean nimFound = false;
        double nilaiAkhir = 0;
        int i;
        for (i = 0; i < user.size(); i++) {
            if (user.get(i).getNIM().equals(nim)) {
                nimFound = true;
                break;
            }
        }
        if (nimFound) {
            if (user.get(i) instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) user.get(i);
                ArrayList<MatkulAmbil> listMatkulSarjana = sarjana.getListMataKuliahSarjana();
                nilaiAkhir = (listMatkulSarjana.get(i).getN1() + listMatkulSarjana.get(i).getN2()
                        + listMatkulSarjana.get(i).getN3()) / 3;

            } else if (user.get(i) instanceof Magister) {
                Magister magister = (Magister) user.get(i);
                ArrayList<MatkulAmbil> listMatkulMagister = magister.getListMataKuliahMagister();
                nilaiAkhir = (listMatkulMagister.get(i).getN1() + listMatkulMagister.get(i).getN2()
                        + listMatkulMagister.get(i).getN3()) / 3;

            } else if (user.get(i) instanceof Doktor) {
                Doktor doktor = (Doktor) user.get(i);

                double nilaiSidang1 = doktor.getNilaiSidang1();
                double nilaiSidang2 = doktor.getNilaiSidang2();
                double nilaiSidang3 = doktor.getNilaiSidang3();

                nilaiAkhir = (nilaiSidang1 + nilaiSidang2 + nilaiSidang3) / 3;

            }
            return "Nama: " + user.get(i).getNama() + "\nNilai Akhir: " + nilaiAkhir;
        } else {
            return "NIM tidak valid / tidak ditemukan!";
        }
    }

    // PRINT NILAI RATA-RATA SELURUH MHS PADA 1 MATKUL
    public String printNR(String kodeMK, ArrayList<Mahasiswa> mahasiswa) {
        boolean found = false;
        double totalNilai = 0;
        int counter = 0;
        for (Mahasiswa mhs : mahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) mhs;
                ArrayList<MatkulAmbil> listMatkulSarjana = sarjana.getListMataKuliahSarjana();

                for (MatkulAmbil matkulAmbil : listMatkulSarjana) {
                    if (matkulAmbil.getMatkulAmbil().getKode().equals(kodeMK)) {
                        totalNilai += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        counter++;
                        found = true;
                    }
                }

            } else if (mhs instanceof Magister) {
                Magister magister = (Magister) mhs;
                ArrayList<MatkulAmbil> listMatkulMagister = magister.getListMataKuliahMagister();

                for (MatkulAmbil matkulAmbil : listMatkulMagister) {
                    if (matkulAmbil.getMatkulAmbil().getKode().equals(kodeMK)) {
                        totalNilai += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        counter++;
                        found = true;
                    }
                }
            }

        }
        if (found) {
            return "Kode MK: " + kodeMK + "Nilai Rata-rata Akhir: " + (totalNilai / counter);
        } else {
            return "Kode MK tidak ditemukan!";
        }

    }

    // PRINT BANYAK MAHASISWA TIDAK LULUS
    public String printMhsTidakLulus(String kodeMK, ArrayList<Mahasiswa> mahasiswa) {
        double rataRata = 0;
        int counter = 0;
        int counterAll = 0;
        boolean found = false;

        String namaMataKuliah = "";

        for (Mahasiswa mhs : mahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) mhs;
                ArrayList<MatkulAmbil> listMatkulSarjana = sarjana.getListMataKuliahSarjana();

                for (MatkulAmbil matkulAmbil : listMatkulSarjana) {
                    if (matkulAmbil.getMatkulAmbil().getKode().equals(kodeMK)) {
                        rataRata += matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3() / 3;
                        if (rataRata < 56) {
                            counter++;
                        }
                        counterAll++;
                        found = true;
                    }
                }

            } else if (mhs instanceof Magister) {
                Magister magister = (Magister) mhs;
                ArrayList<MatkulAmbil> listMatkulMagister = magister.getListMataKuliahMagister();

                for (MatkulAmbil matkulAmbil : listMatkulMagister) {
                    if (matkulAmbil.getMatkulAmbil().getKode().equals(kodeMK)) {
                        rataRata += matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3() / 3;
                        if (rataRata < 56) {
                            counter++;
                        }
                        counterAll++;
                        found = true;
                    }
                }
            }

        }
        if (found) {
            return "<" + counter + "> dari <" + counterAll + "> mahasiwa tidak lulus mata kuliah " + namaMataKuliah;
        } else {
            return "Nilai / kode mata kuliah tidak ditemukan!";
        }

    }

    // PRINT MATKUL AMBIL MAHASISWA TERTENTU
    public String printMatkulAmbil(String nim, ArrayList<Mahasiswa> mahasiswa) {
        boolean found = false;
        int i;
        String teks = "";
        for (i = 0; i < mahasiswa.size(); i++) {
            if (mahasiswa.get(i).getNIM().equals(nim)) {
                found = true;
                teks += "Nama: " + mahasiswa.get(i).getNama();
                break;
            }
        }
        if (found) {
            if (mahasiswa.get(i) instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) mahasiswa.get(i);
                ArrayList<MatkulAmbil> listMatkulSarjana = sarjana.getListMataKuliahSarjana();
                teks += "\nMatkul yang diambil: ";
                for (MatkulAmbil matkulAmbil : listMatkulSarjana) {
                    teks += "\n- " + matkulAmbil.getMatkulAmbil().getNama();
                }

            } else if (mahasiswa.get(i) instanceof Magister) {
                Magister magister = (Magister) mahasiswa.get(i);
                ArrayList<MatkulAmbil> listMatkulMagister = magister.getListMataKuliahMagister();
                teks += "\nMatkul yang diambil: ";
                for (MatkulAmbil matkulAmbil : listMatkulMagister) {
                    teks += "\n- " + matkulAmbil.getMatkulAmbil().getNama();
                }
            }
        } else {
            return "User tidak ditemukan!";
        }
        return teks;
    }

    // PRINT TOTAL JAM DOSEN MENGAJAR
    public String printTotalAjarDosen(String NIK, ArrayList<Dosen> dosen) {
        for (int i = 0; i < dosen.size(); i++) {
            if (dosen.get(i) instanceof Dosen){
                Dosen d = (Dosen) dosen.get(i);
                if (d.getNIK().equals(NIK)){
                    int count = 0;
                    for (MatkulAjar matkul : d.getListMatkulAjar()){
                        for (PresensiStaff presensi : matkul.getListPresensiStaff()){
                            if (presensi.getStatus() == Status.HADIR){count += presensi.getJam();}
                        }
                    }
                    return "Jumlah jam mengajar " + d.getNama() + ": " + count;
                }
            }
        }
        return "NIK dosen tidak ditemukan!";
    }

    // PRINT GAJI STAFF
    public String printGajiStaff(String NIK, ArrayList<Staff> staff) {
        for (int index = 0; index < staff.size(); index++) {
            if (staff.get(index) instanceof Staff){
                Staff stf = (Staff) staff.get(index);
                if (stf.getNIK().equals(NIK)){
                    if (stf instanceof Karyawan){
                        Karyawan kywn = (Karyawan) stf;
                        int unit = 0;
                        for(PresensiStaff j : kywn.getPresensiStaff()){
                            if (j.getStatus() == Status.HADIR){unit++;}
                        }
                        return "Gaji Karyawan " + kywn.getNama() + ": " + (unit/22*kywn.getSalary());
                    }
                    else if (stf instanceof DosenTetap){
                        DosenTetap kywn = (DosenTetap) stf;
                        int unit = 0;
                        for (MatkulAjar i : kywn.getListMatkulAjar()){
                            for (PresensiStaff j : i.getListPresensiStaff()){
                                if (j.getStatus() == Status.HADIR){unit++;}
                            }
                        }
                        return "Gaji Dosen Tetap " + kywn.getNama() + ": " + (kywn.getSalary() + unit*25000);
                    }
                    DosenHonorer kywn = (DosenHonorer) stf;
                    int unit = 0;
                    for (MatkulAjar i : kywn.getListMatkulAjar()){
                        for (PresensiStaff j : i.getListPresensiStaff()){
                            if (j.getStatus() == Status.HADIR){unit++;}
                        }
                    }
                    return "Gaji Dosen Tetap " + kywn.getNama() + ": " + (kywn.getHonorPerSKS()*unit);
                }
            }
        }
        return "NIK staff tidak ditemukan!";
    }
}