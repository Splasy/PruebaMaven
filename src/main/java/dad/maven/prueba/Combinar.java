package dad.maven.prueba;

import org.apache.commons.lang.StringUtils;

public class Combinar {
	
	public static String combinar(Object [] array) {
		
		return StringUtils.join(array, " ");
		/*int i;
		String res = "";
		for(i = 0; i < array.length; i++) {
			res += array[i] + " ";
		}
		return res;*/
	}

	public static void main(String[] args) {
		
		Object [] array = {"hola", 3.1416, "adios", 4, true};
		String resultado = combinar(array);//"hola 3.1416 adios 4 true"
		System.out.println(resultado);
	}

}
