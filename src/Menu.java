public class Menu 
{

    public static void main(String[] args) {
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
   	 int opcion = Console.readInt();
   	 
   	 switch(opcion)
   	 {
   	 case 1:
   		 System.out.println("Añadir nota");
   		 System.out.println();
   		 System.out.println("Elige el alumno al que desees añadirle la nota");
   		 System.out.println("opcion 1: Juan Garfil; opcion 2: Unai Garcia");
   		 int opcionAnadirNota = Console.readInt();
   		 
   		 if (opcionAnadirNota == 1) {
   			 System.out.println("Dime la evaluación en la que desees añadir la nota (1-3)");
   			 int eval = Console.readInt();
   			 System.out.println("Dime el modulo en la que desees añadir la nota (mates = 1; lengua = 2)");
   			 int mod = Console.readInt();
   			 System.out.println("Dime la nota que desees añadir (0-10)");
   			 int nota = Console.readInt();
   			 a1.guardarNota(nota, mod, eval);
   			 
   		 }else {
   			 System.out.println("Dime la evaluación en la que desees añadir la nota (1-3)");
   			 int eval = Console.readInt();
   			 System.out.println("Dime el modulo en el que desees añadir la nota (mates = 1; lengua = 2)");
   			 int mod = Console.readInt();
   			 System.out.println("Dime la nota que desees añadir (0-10)");
   			 int nota = Console.readInt();
   			 a2.guardarNota(nota, mod, eval);
   		 }
   		 break;
   		 
   	 case 2:
   		 System.out.println("Consultar nota");
   		 System.out.println();
   		 System.out.println("Elige el alumno a quien desees consultarle la nota");
   		 System.out.println("opcion 1: Juan Garfil; opcion 2: Unai Garcia");
   		 int opcionConsultarNota = Console.readInt();
   		 
   		 if (opcionConsultarNota == 1) {
   			 System.out.println("Dime la evaluación en la que desees ver la nota (1-3)");
   			 int eval = Console.readInt();
   			 System.out.println("Dime el modulo en el que desees ver la nota (mates = 1; lengua = 2)");
   			 int mod = Console.readInt();
   			 a1.mostrarNota(mod, eval);
   			 
   		 }else {
   			 System.out.println("Dime la evaluación en la que desees ver la nota (1-3)");
   			 int eval = Console.readInt();
   			 System.out.println("Dime el modulo en el que desees ver la nota (mates = 1; lengua = 2)");
   			 int mod = Console.readInt();
   			 a2.mostrarNota(mod, eval);
   	 }
    }

 }
}
