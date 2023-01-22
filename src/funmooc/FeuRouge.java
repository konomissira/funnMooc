package src.funmooc;

public class FeuRouge {
    char state;
    public FeuRouge() {
        state = 'R';
    }

    public char getState() {
        return state;
    }

    public void changeState() {
        if (state == 'V') {
            state = 'O';
        } else if (state == 'O') {
            state = 'R';
        } else {
            state = 'V';
        }
    }
}
