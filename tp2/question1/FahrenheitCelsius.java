package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
	    if(args.length > 0){
    	       for (int i = 0 ; i < args.length ; i++){
    	           int fahrenheit = Integer.parseInt(args[i]);
                   float celsius = fahrenheitEnCelsius(fahrenheit);
                   System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
                }																	
            }
            else{
                System.out.println("no Fahrenheit Value given");
            }
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	        float fullValue =(float) ((5 * (f - 32)) / 9F)* 10;
	        System.out.println("no 1"+fullValue);
	        int oneDecimalValue =(int)( fullValue);
	        System.out.println("no 2"+oneDecimalValue);
		return (float) ( oneDecimalValue / 10F); 
	}

}
