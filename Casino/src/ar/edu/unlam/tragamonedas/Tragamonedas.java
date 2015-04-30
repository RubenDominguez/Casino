package ar.edu.unlam.tragamonedas;
import java.util.Random;
public class Tragamonedas {
	
	private int tambor1;
	private int tambor2;
	private int tambor3;

	
	public void CaraAleatoria(){
		
		Random cara = new Random();
		
		 tambor1 = (int)(cara.nextDouble()*9+1);
		 tambor2 = (int)(cara.nextDouble()*9+1);
		 tambor3 = (int)(cara.nextDouble()*9+1);
		
		
		
	}
	
	
	public boolean GirarPalanca(){
		
		if((tambor1 == tambor2)&&(tambor1 == tambor3)&&(tambor2==tambor3)){
			
			
			return true;
		}
		
		
		return false;
	}
	
	
    public  void MostrarCaras() {
       
        System.out.println("Número aleatorios son: "+tambor1+" "+tambor2+" "+tambor3);
   }

}

