package csc8011;
import java.text.DecimalFormat;

//Exhibit Class
public class Exhibit {

    //Decimal Formatter
   private static final DecimalFormat df = new DecimalFormat("0.00");


    //Parameterized Constructor For Exhibit
    public Exhibit(String exhibitID, String Description, int yearAcquired, double value){
        this.exhibitID = exhibitID;
        this.Description = Description;
        this.yearAcquired = yearAcquired;
        this.value = value;

    }

    //Unique of an Exhibit
    private String exhibitID;

    //Description of the Exhibit
    private String Description;

    //Year Acquired of the Exhibit
    private int yearAcquired;

    //Double value of the Exhibit
    private double value;


    //Getter for ExhibitID
    public String getExhibitID(){

        return exhibitID;
    }
    //Setter for ExhibitID
    public void setExhibitID(String exhibitID){
        this.exhibitID = exhibitID;
    }

    //Getter for Description
    public String getDescription() {

        return Description;
    }

    //Setter for Description
    public void setDescription(String Description){
        this.Description = Description;
    }

    //Getter for Year Acquired of Exhibits
    public int getYearAcquired() {
        return yearAcquired;
    }

    //Setter for Year Acquired of Exhibits
    public void setYearAcquired(int yearAcquired){
        this.yearAcquired = yearAcquired;
    }

    //Getter for Value of an Exhibit
    public double getValue() {
        return value;
    }

    //Setter for Value of an Exhibit
    public void setValue(double value){
        this.value = value;
    }

    // toString method for Exhibit Class
    @Override
    public String toString(){
        return "Exhibit ID: "+exhibitID+" Description: "+Description+" Year Acquired: "+yearAcquired+" " +
                "Value: £"+df.format(value);
    }
}
