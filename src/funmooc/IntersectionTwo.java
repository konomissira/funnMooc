package src.funmooc;

/**
 * Note this traffic light will represent FRANCE reglementation
 * We need to manage traffic light for two busy streets.
 * in this sample the streets are: Borough Road and Southwark Street
 * this is how we will manage the system the first char will represent Borough Road,
 * and the second char will represent Southwark Street:
 * R R
 * R V
 * R O
 * R R
 * V R
 * O R
 * R R
 */

public class IntersectionTwo {
    public static void main(String[] args) throws InterruptedException {
        FeuRouge feuBoroughRoad = new FeuRouge();
        FeuRouge feuSouthwarkStreet = new FeuRouge();

        while(true){// RR
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(250);
            feuSouthwarkStreet.changeState(); // RV
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(2000);
            feuSouthwarkStreet.changeState(); // RO
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(500);
            feuSouthwarkStreet.changeState(); // RR
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(250);
            feuBoroughRoad.changeState(); // VR
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(2000);
            feuBoroughRoad.getState(); // OR
            System.out.println(feuBoroughRoad.getState() + " " + feuSouthwarkStreet.getState());
            Thread.sleep(500);
            feuBoroughRoad.changeState(); // RR
        }
    }
}
