package view;

import controller.Controller;
import main.Main;

public class GajiStaffScreen {
    public GajiStaffScreen(){
        printGajiStaffScreen();
    }
    public void printGajiStaffScreen() {
        Controller ctrl = new Controller();

        Command.message(ctrl.printGajiStaff(Command.input("Input NIK: "), Main.staff));
    }

}
