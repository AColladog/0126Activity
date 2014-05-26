
/**
 * Esta clase nos imprime por pantalla los numeros enteros que le pasemos en la variable static y también el tiempo en MINUTOS:SEGUNDOS utilizados para ello
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private static final int NUMBERS = 1000000; 
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
       
    }

    /**
     * Calcula el tiempo en imprimir valores enteros, imorime el resultado por pantalla
     */
    public void tiempoTranscurrido()
    {
        long initTime = System.currentTimeMillis();
        for(int i = 0; i < NUMBERS; i++){
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
