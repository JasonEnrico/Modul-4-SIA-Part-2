package view;

import controller.Controller;
import main.Main;

public class MatkulAmbilScreen {
    public MatkulAmbilScreen() {
        matkulAmbilScreen();
    }

    public void matkulAmbilScreen() {
        Controller ctrl = new Controller();

        Command.message(ctrl.printMatkulAmbil(Command.input("Input nim: "), Main.mahasiswa));
    }
}