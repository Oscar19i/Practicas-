import java.io.*;
public class Conversor{
  public static void main(String args[]) throws IOException{
   InputStreamReader ent = new InputStreamReader (System.in);
   BufferedReader al  = new BufferedReader(ent);
   boolean terminar = true;
   Temperatura Farenheit = new Temperatura();
   Temperatura Celcius = new Temperatura();
   while (terminar){
   System.out.println("\nElija una opcion: ");
   System.out.println("Opcion 1: Convertir de Farenheit a Celsius");
   System.out.println("Opcion 2: Convertir de Celsius a Farenheit");
   System.out.println("Opcion 3: Salir");
   int dato = Integer.parseInt(al.readLine());
   switch(dato){
     case 1: 
      float temp = 0, tempT = 0;
      temp = Farenheit.getTempFar();
      tempT = Farenheit.ConvFarCel(temp);
      Farenheit.ShowFarCel(tempT);
      break;
     case 2:
      float temp2 = 0, tempT2;
      temp2 = Celcius.getTempCel();
      tempT2 = Celcius.ConvCelFar(temp2);
      Celcius.ShowCelFar(tempT2);
      break;
     case 3:
        terminar = false;
      
   }
   }  
     
    
   
  
    
  }
  
  
  
}