public class Notas {
	private Integer notas [][] = new Integer [2][3];
	
	public Notas ()	{}
	// en un array al ser el 0 el primer numero, hay que quitarle 1 al valor que metemos.
	// Matematicas = 1 Lengua = 2
	// Cuando no hay nota el valor es -1
	public Integer getNota (int modulo, int evaluacion)
	{
		if (notas[modulo-1][evaluacion-1] == null)
		{
			return -1;//"No hay ninguna nota asiganada a esta asignatura y evaluación".toString();
		}
		else
		{
			return notas [modulo-1][evaluacion-1];
		}
	}
	public void setNota (int nota, int modulo, int evaluacion)
	{
		notas [modulo-1][evaluacion-1] = nota;
	}
}
