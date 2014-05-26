
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        
    }

    /**
     * 
     */
    public void tiempoTranscurrido()
    {
        long initTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            System.out.print(i + " ");            
        }
        long finalTime = System.currentTimeMillis();
        finalTime = finalTime - initTime;
        long minutos = finalTime/(1000*60);
        long segundos = (finalTime/1000) - (minutos*60);
        System.out.println();
        System.out.println(minutos + ":" + segundos);
    }
}
