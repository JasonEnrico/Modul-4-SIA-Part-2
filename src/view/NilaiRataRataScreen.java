package view;

import controller.Controller;
import main.Main;

public class NilaiRataRataScreen {

    public NilaiRataRataScreen() {
        nilaiRataRataScreen();
    }

    private void nilaiRataRataScreen(){
        Controller ctrl = new Controller();
        
        Command.message(ctrl.printNR(Command.input("Input kode mata kuliah: "), Main.mahasiswa));
    }

}
