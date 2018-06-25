import java.util.ArrayList;

public class Bedroom extends Room {

    private Integer roomNumber;
    private Integer capacity;
    private Type type;
    private Integer nightlyRate;



    public Bedroom(int roomNumber, int capacity, Type type, int nightlyRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Type getRoomType() {
        return type;
    }

    public Integer getNightlyRate() {
        return nightlyRate;
    }

}
