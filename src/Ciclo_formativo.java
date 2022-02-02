import java.util.ArrayList;

public class Ciclo_formativo 
{
	private String nombre_ciclo;
	private ArrayList<Integer> grupos;
    
   	//Constructor
	public Ciclo_formativo(String nc) {
        	this.nombre_ciclo=nc;
        	grupos= new ArrayList<Integer>();
	}
    
	public void guardarGrupo(Integer codigoIDGrupo) {
   	 grupos.add(codigoIDGrupo);
	}
    
	public void mostrarGrupos() {
   	for (int i = 0; i < grupos.size(); i++) {
   		 System.out.println(this.grupos.get(i));
	 }
   	 
	}
}

