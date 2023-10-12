package csc8011;
import java.text.DecimalFormat;
import java.util.ArrayList;

//Museum class
public class Museum {

    //Decimal formatter
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //Name of the Museum
    private String nameOfTheMuseum;

    //List of Exhibits that the Museum acquires
    private ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();

    //Parameterized Constructor
    public Museum(String nameOfTheMuseum, ArrayList<Exhibit>exhibits){
        this.nameOfTheMuseum = nameOfTheMuseum;
        setExhibits(exhibits);
    }

    //Getter for Name of the Museum
    public String getNameOfTheMuseum(){
        return nameOfTheMuseum;
    }
    //Setter for name of the Museum
    public void setNameOfTheMuseum(String nameOfTheMuseum){
        this.nameOfTheMuseum = nameOfTheMuseum;
    }

    //Getter for list of Exhibits
    public ArrayList<Exhibit> getExhibits(){
        return exhibits;
    }

    //Setter for list of Exhibits
    public void setExhibits(ArrayList<Exhibit>exhibits)
    {
        for (int i = 0; i< exhibits.size();i++){
            this.exhibits.add(exhibits.get(i));
        }
    }

    //toString method to print Museum details
    @Override
    public String toString(){
        String result ="Museum name: " + nameOfTheMuseum;
        for(int i = 0; i<exhibits.size();i++){
            result = result +'\n'+ exhibits.get(i).toString();
        }
        return result;
    }

    //Empty Constructor
    public Museum(){

    }

    //Gets the Statistics of the Exhibit
    public String getStatisticsOnTheExhibits(){
        String exhibitWithHighestValue = getExhibitWithHighestValue();
        String firstExhibitTheMuseumAcquired = getTheFirstExhibitTheMuseumAcquired();
        String averageOfAllExhibits = getAverageOFAllExhibits();
        return "The Statics on Highest value, First exhibit acquired and average value of exhibits: " + '\n'
                + exhibitWithHighestValue + '\n' + firstExhibitTheMuseumAcquired + '\n' + averageOfAllExhibits;
    }

    //Gets the details of the Highest Valued Exhibit
    private String getExhibitWithHighestValue(){
        Exhibit highestValuedExhibit = exhibits.get(0);
        double maxValue = exhibits.get(0).getValue();
        for(int i = 1; i < exhibits.size(); i++){
            if(maxValue < exhibits.get(i).getValue()){
                maxValue = exhibits.get(i).getValue();
                highestValuedExhibit = exhibits.get(i);
            }
        }
        return "Highest Value exhibit:  "+ highestValuedExhibit.getDescription()+" " +
                "("+highestValuedExhibit.getExhibitID()+"), £" + df.format(highestValuedExhibit.getValue());
    }

    //Gets the details of First acquired Exhibit of the Museum
    private String getTheFirstExhibitTheMuseumAcquired(){
        Exhibit firstAcquiredExhibit = exhibits.get(0);
        int minYear = exhibits.get(0).getYearAcquired();
        for(int i = 1; i<exhibits.size(); i++){
            if(minYear > exhibits.get(i).getYearAcquired()){
                minYear = exhibits.get(i).getYearAcquired();
                firstAcquiredExhibit = exhibits.get(i);
            }
        }
        return "First exhibit Acquired: "+firstAcquiredExhibit.getDescription()+
                "(acquired "+firstAcquiredExhibit.getYearAcquired()+")";
    }
    //Gets the average of all the Exhibit values
    private String getAverageOFAllExhibits(){
        double averageValue = 0;
        double sum = 0;
        int numberOfExhibits = exhibits.size();
        for (Exhibit Var: exhibits){
            sum = sum + Var.getValue();
        }
        if(sum!=0 && numberOfExhibits!=0){
            averageValue = (double) (sum/numberOfExhibits);
        }
        return "Average value of Exhibits: £"+ df.format(averageValue);
    }
}
