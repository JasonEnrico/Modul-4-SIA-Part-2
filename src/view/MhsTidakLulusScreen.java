package view;

import controller.Controller;
import main.Main;

public class MhsTidakLulusScreen {
    public MhsTidakLulusScreen() {
        mhsTidakLulusScreen();
    }

    private void mhsTidakLulusScreen(){
        Controller ctrl = new Controller();
        
        Command.message(ctrl.printMhsTidakLulus(Command.input("Input kode mata kuliah: "), Main.mahasiswa));
    }
}
