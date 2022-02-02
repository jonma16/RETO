public class Menu 
{

    public static void main(String[] args) throws Exception {
    int nota,mod,eval=0;
   	 Ciclo_formativo c1=new Ciclo_formativo("Informatica");
   	 
   	 Grupo g1=new Grupo("Grupo ingles");
   	 Grupo g2=new Grupo("Grupo frances");
   	 
   	 Alumno a1=new Alumno("Juan", "Garfil");
   	 Alumno a2=new Alumno("Unai", "Garcia");
   	 
   	 c1.guardarGrupo(0);
   	 c1.guardarGrupo(1);
   	 
   	 g1.guardarAlumno(0);
   	 g2.guardarAlumno(1);
   	 
   	 System.out.println("Si desea añadir una nota pulse 1");
   	 System.out.println("Si desea consultar una nota pulse 2");
   	 System.out.println("Si desea salir pulse 0");
   	 int opcion = Console.readInt();
   	 
   	 while (opcion != 0)
   	 {
   		 switch(opcion)
   	   	 {
   	   	 case 1:
   	   		 System.out.println("Seleccione el alumno al que añadirle la nota");
   	   		 System.out.println("1- Juan Garfil     2-Unai García");
   	   		 int opcionAnadirNota = Console.readInt();
   	   		 switch(opcionAnadirNota)
   	   		 {
   	   		 case 1:
   	   			 System.out.println("Dime la evaluación en la que desees añadir la nota (1-3)");
	   			 eval = Console.readInt();
	   			 System.out.println("Dime el modulo en la que desees añadir la nota (mates = 1; lengua = 2)");
	   			 mod = Console.readInt();
	   			 System.out.println("Dime la nota que desees añadir (0-10)");
	   			 nota = Console.readInt();
	   			 a1.guardarNota(nota, mod, eval);
	   			 break;
   	   		 case 2:
   	   			 System.out.println("Dime la evaluación en la que desees añadir la nota (1-3)");
	   			 eval = Console.readInt();
	   			 System.out.println("Dime el modulo en el que desees añadir la nota (mates = 1; lengua = 2)");
	   			 mod = Console.readInt();
	   			 System.out.println("Dime la nota que desees añadir (0-10)");
	   			 nota = Console.readInt();
	   			 a2.guardarNota(nota, mod, eval);
	   			 break;
	   		default:
	   			System.out.println("Selección incorrecta");
   	   		 }
   	   		 break; 
   	   	 case 2:
   	   		 System.out.println("Selecciona el alumno a quien desea consultarle la nota");
   	   		 System.out.println("1- Juan Garfil        2- Unai García");
   	   		 int opcionConsultarNota = Console.readInt();
   	   		 switch (opcionConsultarNota)
   	   		 {
   	   		 case 1:
   	   			 System.out.println("Dime la evaluación en la que desees ver la nota (1-3)");
	   			 eval = Console.readInt();
	   			 System.out.println("Dime el modulo en el que desees ver la nota (mates = 1; lengua = 2)");
	   			 mod = Console.readInt();
	   			 a1.mostrarNota(mod, eval);
	   			 break;
   	   		 case 2:
   	   			 System.out.println("Dime la evaluación en la que desees ver la nota (1-3)");
	   			 eval = Console.readInt();
	   			 System.out.println("Dime el modulo en el que desees ver la nota (mates = 1; lengua = 2)");
	   			 mod = Console.readInt();
	   			 a2.mostrarNota(mod, eval);
	   			 break;
	   		default:
	   			System.out.println("Seleccion incorrecta");
   	   		 }
   	   		 break;
   	   	default:
   	   		System.out.println("Selección incorrecta");
   	    }
   		System.out.println("Si desea añadir una nota pulse 1");
      	System.out.println("Si desea consultar una nota pulse 2");
      	System.out.println("Si desea salir pulse 0");
      	opcion = Console.readInt(); 
   	 }
	 	System.out.println("Has salido");
    }
 }
