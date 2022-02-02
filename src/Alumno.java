public class Alumno 
{
    private String nombre;
    private String apellido;
    private Integer codigo;
    private static int cont=0;
    
    public Alumno(String n,String a) {
        this.nombre=n;
        this.apellido=a;
        this.codigo= cont;
        cont++;
    }
    
    public int getCodigo() {
    	return this.codigo;
    }
    
    public void guardarNota(int nota, int modulo, int evaluacion) {
    	Notas.setNota(nota,modulo,evaluacion);
    }
    
    public int mostrarNota(int modulo, int evaluacion) {
    	return Notas.getNota(modulo,evaluacion);
    }
    
    
}
