package presentation.guicomponents;
import business.businesslogic.Address;

public class Test {
    public static void main(String args[]) {
        Frontend view = new Frontend();
        view.setVisible(true);

        // address exception
        /*try {
            Address addr = new Address(" ", "T4J 6J3", "SE", "Calgary", "AB", "Canada");
        }
        catch (IllegalArgumentException e) {
            System.out.print("not good!");
        }*/

        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        view.signup();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        view.registerProperty();*/
    }
}
