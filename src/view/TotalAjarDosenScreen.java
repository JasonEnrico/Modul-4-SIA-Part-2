package view;

import controller.Controller;
import main.Main;

public class TotalAjarDosenScreen {
    public TotalAjarDosenScreen() {
        totalAjarDosenScreen();
    }

    public void totalAjarDosenScreen() {
        Controller ctrl = new Controller();

        Command.message(ctrl.printTotalAjarDosen(Command.input("Input NIK Dosen: "), Main.dosen));
    }
}
