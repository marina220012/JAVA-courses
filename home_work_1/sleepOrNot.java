package home_work_1;

public class sleepOrNot {
    public static void main(String[] args) {
        sleepIn(false, false);
    }
    public static void sleepIn(boolean Weekday, boolean Vacation){
        if(Weekday && Vacation)
            System.out.println("You can continue sleeping. Good night");
        else System.out.println("You have to wake up!");
    }

}
