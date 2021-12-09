package presentation.guicomponents;

public class Test {
    public static void main(String args[]) {
        Frontend view = new Frontend();
        view.setVisible(true);

        try {
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

        view.registerProperty();
    }
}
