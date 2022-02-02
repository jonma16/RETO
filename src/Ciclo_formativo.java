import java.util.ArrayList;

public class Ciclo_formativo 
{
	private String nombre_ciclo;
	private ArrayList<Integer> grupos;
    
   	//Constructor
	public Ciclo_formativo(String nc) {
        	this.nombre_ciclo=nc;
	}
    
	public void guardarGrupo(int codigoIDGrupo) {
   	 grupos.add(codigoIDGrupo);
	}
    
	public int mostrarGrupos() {
   	for (int i = 0; i < grupos.size(); i++) {
   		 return this.grupos.get(i);
	 }
   	 
	}
}

