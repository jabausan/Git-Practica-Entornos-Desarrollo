import java.util.Scanner;
public class Padawanej4 {

  
    public static void main(String[] args) {
   
        final int posCanonMundoX = 0, posCanonMundoY = 0;
        final int posCanonPantallaX = posCanonMundoX + 5;
        final int posCanonPantallaY = posCanonMundoY + 5;
        final int posInicialPantallaX = 0 , posInicialPantallaY = 24;
        double angulo, velocidad,posInicialProyectilX,posInicialProyectilY;
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Teclee angulo (grados): ");
        angulo =sc.nextDouble()*(2*Math.PI)/360;
         
        System.out.printf("Teclee velocidad (m/s): ");
        velocidad = sc.nextDouble();
        posInicialProyectilX= Math.cos(angulo)*posCanonPantallaX;
        posInicialProyectilY= Math.sin(angulo)*posCanonPantallaY;
        System.out.printf("Pos. inicial del proyectil: ( %.2f" ,posInicialProyectilX);
        System.out.printf("  %.2f )\n " ,posInicialProyectilY);
        
        double hMax,xMax,tSubida,xProyectil0,yProyectil0,tVuelo,t0,t1,t2,t3,t4;
        double xProyectil1,xProyectil2,xProyectil3,xProyectil4,yProyectil1,yProyectil2,yProyectil3,
	yProyectil4;
        final double g=9.8;
      
        tSubida=velocidad*Math.sin(angulo)/g;
        System.out.printf("Tiempo de subida es; %5.2f segundos ",tSubida);
        System.out.printf("y de vuelo %.2f \n ", 2*tSubida);
        
        hMax= Math.pow(velocidad,2)*Math.pow(Math.sin(angulo),2)/(2*g);
        xMax=Math.pow(velocidad,2)*Math.sin(2*angulo)/g;
        System.out.printf("Max. altura:%14.2f metros\n",hMax);
        System.out.printf(" Max. distancia:%11.2f metros\n",xMax);
        tVuelo=2*tSubida;
        t0=0;
        t1=0.25*tVuelo;
        t2=0.50*tVuelo;
        t3=0.75*tVuelo;
        t4=tVuelo;
        
        xProyectil0=posInicialProyectilX+ velocidad*Math.cos(angulo)*2*t0;
        yProyectil0=posInicialProyectilY+velocidad*Math.sin(angulo)*t0-0.5*Math.pow(t0,2)*g;
         xProyectil1=posInicialProyectilX+ velocidad*Math.cos(angulo)*t1;
        yProyectil1=posInicialProyectilY+velocidad*Math.sin(angulo)*t1-0.5*Math.pow(t1,2)*g;
         xProyectil2=posInicialProyectilX+ velocidad*Math.cos(angulo)*t2;
        yProyectil2=posInicialProyectilY+velocidad*Math.sin(angulo)*t2-0.5*Math.pow(t2,2)*g;
         xProyectil3=posInicialProyectilX+ velocidad*Math.cos(angulo)*t3;
        yProyectil3=posInicialProyectilY+velocidad*Math.sin(angulo)*t3-0.5*Math.pow(t3,2)*g;
         xProyectil4=posInicialProyectilX+ velocidad*Math.cos(angulo)*t4;
        yProyectil4=posInicialProyectilY+velocidad*Math.sin(angulo)*t4-0.5*Math.pow(t4,2)*g;
        
        
        System.out.println("+------------+--------------------------+----------------------+");
        System.out.println("|  Tiempo    |  Posicion en el mundo    | Posicion en Pantalla |");
        System.out.println("+------------+--------------------------+----------------------+");
        
	
        System.out.printf("|%10.2f  | ",t0);
        System.out.printf("(%10.2f,",xProyectil0  );   
        System.out.printf("%10.2f)  | ",yProyectil0  ); 
        System.out.printf("(%3d,",posInicialPantallaX  );   
        System.out.printf("%3d)            |\n",posInicialPantallaY  ); 
        System.out.println("+------------+-----------------------+-------------------------+");
        System.out.printf("|%10.2f  | ",t1);
        System.out.printf("(%10.2f,",xProyectil1  );   
        System.out.printf("%10.2f)  | ",yProyectil1  ); 
        System.out.printf("(%3d,",(int)xProyectil1/5  );   
        System.out.printf("%3d)            |\n",(24-(int)(xProyectil1+yProyectil1)/16)); 
        System.out.println("+------------+-----------------------+-------------------------+");
        System.out.printf("|%10.2f  | ",t2);
        System.out.printf("(%10.2f,",xProyectil2  );   
        System.out.printf("%10.2f)  | ",yProyectil2  ); 
        System.out.printf("(%3d,",(int)xProyectil2/5  );   
        System.out.printf("%3d)            |\n",(24-(int)(xProyectil2+yProyectil2)/16)); 
        System.out.println("+------------+-----------------------+-------------------------+");
        System.out.printf("|%10.2f  | ",t3);
        System.out.printf("(%10.2f,",xProyectil3  );   
        System.out.printf("%10.2f)  | ",yProyectil3  ); 
        System.out.printf("(%3d,",(int)xProyectil3/5  );   
        System.out.printf("%3d)            |\n",(24-(int)(xProyectil3+yProyectil3)/16)); 
        System.out.println("+------------+-----------------------+-------------------------+");
        System.out.printf("|%10.2f  | ",t4);
        System.out.printf("(%10.2f,",xProyectil4  );   
        System.out.printf("%10.2f)  | ",yProyectil4  ); 
        System.out.printf("(%3d,",(int)(xProyectil4/5));   
        System.out.printf("%3d)            |\n",posInicialPantallaY );
	System.out.println("+------------+--------------------------+----------------------+"); 
            }
    
}
