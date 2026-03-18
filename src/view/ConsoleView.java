package view;

import java.util.List;

public class ConsoleView {
    public void showHand(String name, List<String> hand) {
        System.out.println(name + " hand: " + hand);
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
