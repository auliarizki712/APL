public class Impostor implements AmongusImpostor 
{
    //mengoverride methode impostor dari interface AmongusImpostor untuk melakukan adapter pattern dan mencetak kata2 impostor
    @Override
    public void impostor() 
    {
        System.out.println("impostor");
    }
}
