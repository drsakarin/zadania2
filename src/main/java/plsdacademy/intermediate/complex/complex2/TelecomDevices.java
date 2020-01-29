package plsdacademy.intermediate.complex.complex2;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode(of = "number") //hash i equals tylko po numerze

public class TelecomDevices {

    private final TelecomNetwork currentNetwork;
    private int number;
    private List<String> recivedMessages;

    TelecomDevices(TelecomNetwork network, int number) {
        this.currentNetwork = network;
        this.number = number;
        this.recivedMessages = new ArrayList<>();
    }

    void connect() {
        currentNetwork.getConnectedDevices().add(this);
    }

    void disconnect() {
        currentNetwork.getConnectedDevices().remove(this);
    }

    boolean isConnected() {


        return currentNetwork.getConnectedDevices().contains(this);
    }

    void call(TelecomDevices anotherDevice, String message) {
        if (isConnected()) {
            if (anotherDevice.isConnected()) {
                String log = "Registered in network " + currentNetwork.getOperator()
                        + ". Calling to: " + anotherDevice.getNumber()
                        + ". Saying: " + message;
                currentNetwork.addCallLog(log);
                anotherDevice.getRecivedMessages().add(message);
            } else {
                String errorLog = "Cannot make call to." + anotherDevice.getNumber() + " Caller: "
                        + this.getNumber() + " is not connected to network.";
                currentNetwork.addCallLog(errorLog);
            }
        } else {
            String errorLog = "Cannot make call to." + anotherDevice.getNumber() + " Caller: "
                    + this.getNumber() + " is not connected to network.";
            currentNetwork.addCallLog(errorLog);
        }
    }


    void answer(TelecomDevices deviceWhichCalled, String reply) {
        if (isConnected()) {
            if (deviceWhichCalled.isConnected()) {
                String log = "odpowiadam Registered in network " + currentNetwork.getOperator()
                        + ". Recived call from: " + deviceWhichCalled.getNumber()
                        + "Replying: " + reply;
                currentNetwork.addCallLog(log);
                deviceWhichCalled.getRecivedMessages().add(reply);
            } else {
                String log = "Cannot anserw to: " + currentNetwork.getOperator()
                        + ". Recived call from: " + deviceWhichCalled.getNumber()
                        + "Replying: " + reply;
                currentNetwork.addCallLog(log); //errorLog
            }

        }

    }


}