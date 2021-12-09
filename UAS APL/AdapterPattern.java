public class AdapterPattern implements AmongusCrew 
{
    AmongusImpostor amongusImpostor;
    //method constructor untuk memberikan nilai awal pada AdapterPattern dengan parameter amongusImpostor 
    public AdapterPattern(AmongusImpostor amongusImpostor) 
    {
        this.amongusImpostor = amongusImpostor;
    }

    //mengoverride method crew dari interface AmongusCrew
    @Override
    public void crew() 
    {
        amongusImpostor.impostor();
    }
}
