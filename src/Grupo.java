import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
    private ArrayList<Integer> alumnos;  
    private String nombre;
	private int idGrupo;
	private static int contGrupo=0;
	private int contador=0;
    
	public Grupo(String nombre) {
   	 this.nombre=nombre;
    	this.idGrupo = contGrupo;
    	contGrupo++;
	}
    
	public void guardarAlumno(int codigoAlumno) {
   	 alumnos.add(codigoAlumno);
	}
    
	public int mostrarAlumnos() {
   	 for (int i = 0; i < alumnos.size(); i++) {
   		 return this.alumnos.get(i);
   	 }
   	 
	}
}
