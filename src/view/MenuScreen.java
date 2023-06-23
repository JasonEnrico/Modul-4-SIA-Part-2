package view;

public class MenuScreen {

    public MenuScreen() {
        menuScreen();
    }

    private void menuScreen() {

        int pilihan;
        do {
            pilihan = Integer.parseInt(Command.input("Pilih Menu: \n" + "1. Print User Data \n" + "2. Print Nilai Akhir(NA) Mahasiswa \n" + "3. Print Rata-rata Nilai Akhir(NR) mahasiswa \n" +"4. Print Banyak Mahasiswa Tidak Lulus \n" + "5. Print Matkul Ambil Mahasiswa Tertentu \n" + "6. Print Total Jam Dosen Mengajar \n" + "7. Print gaji Staff \n" + "0. Exit"));

            switch (pilihan) {
                case 1:
                    new UserDataScreen();
                    break;
                case 2:
                    new NilaiAkhirScreen();
                    break;
                case 3:
                    new NilaiRataRataScreen();
                    break;
                case 4:
                    new MhsTidakLulusScreen();
                    break;
                case 5:
                    new MatkulAmbilScreen();
                    break;
                case 6:
                    new TotalAjarDosenScreen();
                    break;
                case 7:
                    new GajiStaffScreen();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (pilihan != 0);
    }
}
