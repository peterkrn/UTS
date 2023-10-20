package view;

import javax.swing.JOptionPane;

public class MainMenuScreen {
    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to the main menu!");
            System.out.println("1. showUserPost");
            System.out.println("2. showPost");
            System.out.println("3. changePostState");

            int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: "));

            switch (choice) {
               case 1:
                   System.out.println("showUserPost");
                   break;
                case 2:
                    System.out.println("showPost");
                    break;
                case 3:
                    System.out.println("changePostState");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
