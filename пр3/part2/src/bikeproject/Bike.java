package bikeproject;

public class Bike implements BikeParts {
    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int NumGears;
    private final String make;

    public Bike() {
        make = MAKE;
    }

    public Bike(String handleBars, String frame, String tyres,
                String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        NumGears = numGears;
        make = MAKE;
    }

    @Override
    public String getHandleBars() {
        return handleBars;
    }

    @Override
    public void setHandleBars(String newValue) {
        handleBars = newValue;
    }

    @Override
    public String getFrame() {
        return frame;
    }

    @Override
    public void setFrame(String newValue) {
        frame = newValue;
    }

    @Override
    public String getTyres() {
        return tyres;
    }

    @Override
    public void setTyres(String newValue) {
        tyres = newValue;
    }

    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public void setSeatType(String newValue) {
        seatType = newValue;
    }

    @Override
    public int getNumGears() {
        return NumGears;
    }

    @Override
    public void setNumGears(int newValue) {
        NumGears = newValue;
    }

    @Override
    public void printDescription() {
        System.out.println("\n" + make + "\n"
                + "This bike has " + handleBars + " handlebars on a "
                + frame + " frame with " + NumGears + " gears."
                + "\nIt has a " + seatType + " seat with " + tyres + " tyres.");
    }
}
