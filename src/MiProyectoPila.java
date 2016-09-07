//package pilas;


import java.io.*;
/**
 *

 */
public class MiProyectoPila {
   public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
   public static final int MAX_LENGTH = 5;
   public static String Pila1[] = new String[MAX_LENGTH];
   public static int CimaPila1 = -1;
   public static String Pilaaux[] = new String[MAX_LENGTH];
   public static int cimaaux = -1;
   public static String Pila2[] = new String[MAX_LENGTH];
   public static int CimaPila2 = -1;
   public static int OpcionMiPila = 0;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        Menu();
    }
    
    public static void Menu()throws IOException{
       int op; 
       do {
           System.out.println(" ALDO FLORES ");
            System.out.println("\n\n\t\t\t♦ ♦ ♦ ♦ ♦ ♦  Menú Pila ♦ ♦ ♦ ♦ ♦ ♦ ");
            System.out.println("\t\t\t|                                   |");
            System.out.println("\t\t\t| 1- Insertar elemento              |");
            System.out.println("\t\t\t| 2- Eliminar elemento              |");
            System.out.println("\t\t\t| 3- Buscar elemento                |");
            System.out.println("\t\t\t| 4- Imprimir pila                  |");
            System.out.println("\t\t\t| 5- Contar pila                    |");
            System.out.println("\t\t\t| 6- Salir                          |");
            System.out.println("\t\t\t♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ");
            System.out.print("\t\t\tOpcion: ");
            op = Integer.parseInt(entrada.readLine());
            System.out.println(""); 
            System.out.println(" »»»»»»»»»»»»»»»» BIENVENIDOS ««««««««««««««««");
            System.out.println("Escoja la opción de la pila que desea trabajar");
            System.out.println("1 ►►►►►►►►►►►► Pila 1 ◄◄◄◄◄◄◄◄◄◄◄");
            System.out.println("2 ►►►►►►►►►►►► Pila 2 ◄◄◄◄◄◄◄◄◄◄◄");
            OpcionMiPila = Integer.parseInt(entrada.readLine()); //Convierte una cadena de texto en un número entero.
                 if (OpcionMiPila < 1 || OpcionMiPila >2 ) {
            Menu();
                 }
       }while (op < 1 || op > 6); // mientras
       Opciones(op);
    }

    public static void Opciones(int op)throws IOException{//throws IOException  son exepciones de java 
        switch(op){//  estructura de una selección múltiple
			case 1: Insertar();
                                Menu();
			        break;
			case 2: Eliminar();
                                Menu();
			        break;
			case 3: Buscar();
			        break;
			case 4: Imprimir();
                                Menu();
			        break;
			case 5: Contar();
                                Menu();
                                break;
			case 6: System.exit(1);
			        break;
			default:Menu();
			        break;
	   }
    }
    public static void Insertar()throws IOException{
        if (OpcionMiPila == 1) {
       System.out.print("\nDigite una Opción para la pila 1: ");
       String dato = entrada.readLine();
       Crear(dato);
        }
        if (OpcionMiPila == 2) {
       System.out.print("\nDigite una Opción para la pila 2 ");
       String dato = entrada.readLine();
       Crearaux(dato);
        }
    }

    public static void Crear(String dato)throws IOException{
      if ((Pila1.length-1)==CimaPila1){
        System.out.println("Capacidad de la pila al limite\n\n\n");
        Imprimir();
      }else{
           CimaPila1++;
           }
      Agregar(dato);
    }

    public static void Agregar(String dato)throws IOException{
      Pila1[CimaPila1]=dato;
    }
    public static void Crearaux(String dato)throws IOException{
      if ((Pilaaux.length-1)==cimaaux){
      }else{
       cimaaux++;
       }
      Agregaraux(dato);
    }
    
    public static void Agregaraux(String dato)throws IOException{
      Pilaaux[cimaaux]=dato;
    }
    
    public static void CrearPila2(String dato)throws IOException{
      if ((Pila2.length-1)==CimaPila2){
      }else{
       CimaPila2++;
       }
      Agregarpila2(dato);
    }
    public static void Agregarpila2(String dato)throws IOException{
      Pila2[CimaPila2]=dato;
    }

    public static boolean vaciaaux(){
        return (cimaaux==-1);
    }

    public static boolean vacia(){
        return (CimaPila1==-1);
    }

    public static void Imprimir()throws IOException{
    String quedata="";
        if (OpcionMiPila==1) {
         
      if (CimaPila1!=-1)
      { 
         System.out.println("Pila1");
          do {
            quedata=EliminarPila1();
            System.out.println("dato "+quedata);
            CrearPila2(quedata);            
        }while(CimaPila1!=-1);
        do {
            quedata=Eliminarpila2();
            Crear(quedata);
        }while(CimaPila2!=-1);
      }   
        }
        else{ //si no
          do { //hacemos
            System.out.println("Pila2");
            quedata=Eliminaraux();
            System.out.println("dato "+quedata);
            CrearPila2(quedata);            
        }while(cimaaux!=-1);
        do {
            quedata=Eliminarpila2();
            Crear(quedata);
        }while(CimaPila2!=-1);}
    }

public static String Eliminar()throws IOException{
	if (OpcionMiPila == 1) {
            System.out.println("Los Datos de la Pila 1 Han Sido Eliminados");
			EliminarPila1();
        }
        if (OpcionMiPila == 2) {
            System.out.println("Los Datos de la Pila 2 Han Sido Eliminados");
                    Eliminaraux();
        }
        if (OpcionMiPila < 1 || OpcionMiPila >2 ) {
            for (int i = 0; i < 35; i++) {
                System.out.print("\n");
            }
       System.out.print("\nNo Hay datos en la Pila\n");
       Eliminar();
        }
       return null;
}
	
    public static String EliminarPila1()throws IOException{
      String quedato="";
      if(CimaPila1== -1){

		  System.out.println("\n\n\nNo se puede eliminar, pila vacÃ­a !!!" );

      }else{
              quedato=Pila1[CimaPila1];
	      Pila1[CimaPila1] = null;
	      --CimaPila1;
            }
      return(quedato);
    }

    public static String Eliminaraux()throws IOException{
      String quedato="";
      if(cimaaux== -1){

		  System.out.println("\n\n\nNo se puede eliminar,en pila vacÃ­a !!!" );

      }else{
              quedato=Pilaaux[cimaaux];
	      Pilaaux[cimaaux] = null;
	      --cimaaux;
           }
      return(quedato);
    }
     public static String Eliminarpila2()throws IOException{
      String quedato="";
      if(CimaPila2== -1){

		  System.out.println("\n\n\nNo se puede eliminar, pila vacÃ­a !!!" );

      }else{
              quedato=Pila2[CimaPila2];
	      Pila2[CimaPila2] = null;
	      --CimaPila2;
           }
      return(quedato);
    }

    public static void Buscar()throws IOException{
        
        System.out.println("\n\n\nDigite la cadena a buscar: ");
        String cad = entrada.readLine();
        String quedata="";
        int bandera=0; //no se encuentra
        if (OpcionMiPila == 1){
        if (CimaPila1!=-1)
          { do {
                quedata=EliminarPila1();
                if(cad.equals(quedata)){
                    bandera=1; //si esta
                }
                Crearaux(quedata);            
            }while(CimaPila1!=-1);
            do {
                quedata=Eliminaraux();
                Crear(quedata);
            }while(cimaaux!=-1);
          }
            if (bandera==1) {
        			System.out.println("Elemento encontrado");
	    }else{
		     	System.out.println("Elemento no encontrado :(");
	         }
        }
        
        if (OpcionMiPila == 2){
        if (cimaaux!=-1)
          { do {
                quedata=EliminarPila1();
                if(cad.equals(quedata)){
                    bandera=1; //si esta
                }
                CrearPila2(quedata);            
            }while(cimaaux!=-1);
            do {
                quedata=Eliminarpila2();
                Crearaux(quedata);
            }while(CimaPila2!=-1);
          }
            if (bandera==1) {
        			System.out.println("Elemento encontrado");
	    }else{
		     	System.out.println("Elemento no encontrado :(");
	         }
        }
    }
   
    public static void Contar ()throws IOException{
       
        int contador = 0;
        String datos="";
        if (OpcionMiPila == 1) {
         if (CimaPila1!=-1)
                { do {
                      datos=EliminarPila1();
                      contador += 1;
                      CrearPila2(datos);            
                  }while(CimaPila1!=-1);
                  do {
                      datos=Eliminarpila2();
                      Crear(datos);
                  }while(CimaPila2!=-1);
                }
            System.out.println("Hay : "+contador+ " elemtentos en la pila 1");
          }
        if (OpcionMiPila == 2) {
            if (cimaaux!=-1)
                { do {
                      datos=Eliminaraux();
                      contador += 1;
                      CrearPila2(datos);            
                  }while(cimaaux!=-1);
                  do {
                      datos=Eliminarpila2();
                      Crearaux(datos);
                  }while(CimaPila2!=-1);
                }
            System.out.println("Hay : "+contador+ " elemtentos en la pila 2");
          }   
       }
}
    
