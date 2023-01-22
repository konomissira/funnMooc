package src.funmooc;

public class IntersectionOne {
    public static void main(String[] args) throws InterruptedException {
        FeuRouge feuRougeOne = new FeuRouge();
        System.out.println(feuRougeOne.getState());
        Thread.sleep(3000);
        while (true) {
            feuRougeOne.changeState();
            System.out.println(feuRougeOne.getState());
            Thread.sleep(3000);
            feuRougeOne.changeState();
            System.out.println(feuRougeOne.getState());
            Thread.sleep(500);
            feuRougeOne.changeState();
            System.out.println(feuRougeOne.getState());
            Thread.sleep(3000);
        }
    }
}
