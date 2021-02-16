public class Q7 {
    public void convertSecToDay(int sec){
        int day = sec/(24*3600);

        sec = sec % (24*3600);
        int hour = sec/3600;

        sec = sec % 3600;
        int mins = sec/60;

        sec = sec % 60;
        int seconds = sec;

        System.out.println("day: " + day + " hour: " + hour + " seconds: " + seconds);

    }
    public static void main(String[] args) {
        Q7 tym = new Q7();
        tym.convertSecToDay(8535542);
    }
}
