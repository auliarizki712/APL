//membuat class AmongusKuning yang mengimplementasikan interface AmongusCrew
public class AmongusKuning implements AmongusCrew 
{
    //mengoverride method crew dari interface AmongusCrew untuk mencetak kata2 crew
    @Override
    public void crew() 
    {
        System.out.println("crew");
    }

    //method toString untuk mengembalikan kata2 kuning
    public String toString() 
    {
        return "kuning";
    }
}
