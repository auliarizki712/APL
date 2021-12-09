//membuat class AmongusMerah yang mengimplementasikan interface AmongusCrew
public class AmongusMerah implements AmongusCrew 
{
    //mengoverride method crew dari interface AmongusCrew untuk mencetak kata2 crew
    @Override
    public void crew() 
    {
        System.out.println("crew");
    }

    //method toString untuk mengembalikan kata2 merah
    public String toString() 
    {
        return "Merah";
    }
}
