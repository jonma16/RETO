public class Notas 
{
	private static Integer notas [][] = new Integer [2][3];
	
	public Notas ()	{}
	// en un array al ser el 0 el primer numero, hay que quitarle 1 al valor que metemos.
	// Matematicas = 1 Lengua = 2
	// Cuando no hay nota el valor es -1
	public static Integer getNota (int modulo, int evaluacion)
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
	public static void setNota (int nota, int modulo, int evaluacion) throws Exception
	{
		if (modulo < 1 || modulo > 2) {
			throw new Exception("El modulo no entra dentro del rango");
		}
		else if (evaluacion < 1 || evaluacion > 3) {
			throw new Exception("La evaluación no entra dentro del rango");
		}
		else if (nota < 0 || nota > 10) {
			throw new Exception("La nota no entra dentro del rango");
		}else {
			notas [modulo-1][evaluacion-1] = nota;
		}
	}
}
