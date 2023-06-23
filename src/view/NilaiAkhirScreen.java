package view;

import controller.Controller;
import main.Main;

public class NilaiAkhirScreen {

    public NilaiAkhirScreen(){
        nilaiAkhirScreen();
    }

    public void nilaiAkhirScreen(){
        Controller ctrl = new Controller();

        Command.message(ctrl.printNilaiAkhir(Command.input("Input nim: "), Command.input("Input kode MK"), Main.mahasiswa));
    }

}