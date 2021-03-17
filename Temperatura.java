import java.io.*;
public class Temperatura{
  




public static float getTempCel()throws IOException{ 
InputStreamReader ent = new InputStreamReader (System.in);
BufferedReader al  = new BufferedReader(ent);
float Temp = 0;
System.out.println("Ingrese la temperatura en Celsius: ");
Temp = Float.parseFloat(al.readLine());
return Temp;
}  

public static float getTempFar()throws IOException{ 
InputStreamReader ent = new InputStreamReader (System.in);
BufferedReader al  = new BufferedReader(ent);
float Temp = 0;
System.out.println("Ingrese la temperatura en Farenheit: ");
Temp = Float.parseFloat(al.readLine());
return Temp;
} 

public static float ConvFarCel(float dato1){
float resultado = 0;
resultado = (float)(dato1 - 32f) / 1.8f;

return resultado;
}

public static float ConvCelFar(float dato1){
  float resultado;
  resultado = 0;
  resultado = (float)(1.8 * dato1) + 32f;
  
  return resultado;
}

public static void ShowFarCel(float dato){
  System.out.println("La temperatura en Celsius es: " + dato);
  
}
public static void ShowCelFar(float dato){
  System.out.println("La temperatura en Farenheit es: " + dato);
  
}
}
