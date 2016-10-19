
//exercise 2.3

public class midnight {
    public static void main(String args[]) {

        int hour = 12;
        int minute = 00;
        int second = 00;

        System.out.print("Kell on praegu: ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(".");

        System.out.print("Aega möödnud südaööst: ");
        System.out.println((hour * 3600) + (minute * 60) + second);

        System.out.print("Aega südaööni: ");
        System.out.println(24 * 3600 - ((hour * 3600) + (minute * 60) + second));

        System.out.print("Protsent, mis on päevast möödunud: ");
        System.out.print(((hour * 3600) + (minute * 60) + second) /((24 * 3600) / 100));
        System.out.println("%");

        int hournow = 16;
        int minutenow = 59;
        int secondnow = 20;

        System.out.print("Aega kulunud harjutuste peale: ");
        System.out.print(hournow - hour);
        System.out.print("h ");
        System.out.print(minutenow - minute);
        System.out.print("min ");
        System.out.print(secondnow - second);
        System.out.print("sec");


    }
}
