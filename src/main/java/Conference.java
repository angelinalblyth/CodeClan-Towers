import java.util.ArrayList;

public class Conference extends Room{

    private String name;
    private Integer capacity;
    private ArrayList<Guest> guests;
    private Integer dailyrate;

    public Conference(String name, int capacity, int dailyrate) {
        super(capacity);
        this.name = name;
        this.guests = new ArrayList<Guest>();

        this.dailyrate = dailyrate;
    }

    public String getName() {
        return name;
    }

    public Integer getDailyRate() {
        return dailyrate;
    }


}
