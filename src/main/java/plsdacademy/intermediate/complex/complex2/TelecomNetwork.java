package plsdacademy.intermediate.complex.complex2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class TelecomNetwork {

    private String operator;
    private Set<TelecomDevices> connectedDevices;
    private List<String> callLog;

    public TelecomNetwork(String operator) {
        this.operator = operator;
        this.connectedDevices = new HashSet<>();
        this.callLog = new ArrayList<>();
    }

    void addCallLog(String log) {
        callLog.add(log);
    }

    @Override
    public String toString() {
        return "TelecomNetwork{" +
                "operator='" + operator + '\'' +
                ", connectedDevices=" + connectedDevices +
                ", callLog=" + callLog +
                '}';
    }
}
