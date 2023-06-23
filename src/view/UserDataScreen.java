package view;

import controller.Controller;
import main.Main;

public class UserDataScreen {

    public UserDataScreen() {
        userDataScreen();
    }

    private void userDataScreen(){
        Controller ctrl = new Controller();
        
        Command.message(ctrl.printUserData(Command.input("Input nama: "), Main.user));
    }

}
