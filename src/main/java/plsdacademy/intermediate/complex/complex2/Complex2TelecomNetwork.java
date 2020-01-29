package plsdacademy.intermediate.complex.complex2;

public class Complex2TelecomNetwork {

    public static void main(String[] args) {
        TelecomNetwork telecomNetwork = new TelecomNetwork("Play");
        TelecomDevices devices1 = new TelecomDevices(telecomNetwork, 123456789);

        TelecomDevices devices2 = new TelecomDevices(new TelecomNetwork("era"), 321654987);

        System.out.println(devices2.getCurrentNetwork().getOperator());
        devices1.connect();
        devices2.connect();


        telecomNetwork.setOperator("idea");
        devices1.getCurrentNetwork().setOperator("idea2");

        devices2.getCurrentNetwork().setOperator("orange");

        devices1.call(devices2, "hi device2");
        devices2.answer(devices2, "odpowiedz");
        devices2.call(devices1, "hi device1");
        devices1.call(devices1, "how are you");

        devices2.call(devices2, "good");

        System.out.println("-----------Messages recived by Device1");
        devices1.getRecivedMessages().forEach(System.out::println);

        System.out.println("-----------Messages recived by Device2");
        devices2.getRecivedMessages().forEach(System.out::println);
        System.out.println("---------------------------------------------");

        telecomNetwork.getCallLog().forEach(System.out::println);
        System.out.println(devices2.getCurrentNetwork().getOperator());
    }
}
