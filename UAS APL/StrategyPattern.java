public class StrategyPattern 
{
    private AmongusCrew amongusCrew;
    //method set dengan parameter amongusCrew
    public void setAmongusCrew(AmongusCrew amongusCrew) 
    {
        this.amongusCrew = amongusCrew;
    }

    //method get untuk mengembalikan nilai amongusCrew
    public AmongusCrew getAmongusCrew() 
    {
        return this.amongusCrew;
    }

    //Method crew untuk memanggil method crew yang ada pada atribut amongusCrew
    public void crew() 
    {
        amongusCrew.crew();
    }
}
