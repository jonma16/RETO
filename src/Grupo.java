import java.util.ArrayList;
import java.util.Iterator;

public class Grupo 
{
    private ArrayList<Integer> alumnos;  
    private String nombre;
	private int idGrupo;
	private static int contGrupo=0;
    
	public Grupo(String nombre) {
   	 this.nombre=nombre;
    	this.idGrupo = contGrupo;
    	contGrupo++;
    	alumnos = new ArrayList<Integer>();
	}
    
	public void guardarAlumno(Integer codigoAlumno) {
   	 alumnos.add(codigoAlumno);
	}
    
	public void mostrarAlumnos() {
   	 for (int i = 0; i < alumnos.size(); i++) {
   		 System.out.println(this.alumnos.get(i)); 
   	 }
   	 
	}
}
