//membuat class AmongusPink yang mengimplementasikan interface AmongusCrew
public class AmongusPink implements AmongusCrew 
{
    //mengoverride method crew dari interface AmongusCrew untuk mencetak kata2 crew
    @Override
    public void crew() 
    {
        System.out.println("crew");
    }

    //method toString untuk mengembalikan kata2 pink
    public String toString() 
    {
        return "pink";
    }
}
