package aceleracao;

public class TiposNaoPrimitivos {

	public static void main(String[] args) {
		// Strings
		StringBuilder stringBuilder = new StringBuilder(); 
        String eu = "Eu"; 
        String ja = " já"; 
        String sei = " sei"; 
        String usar = " usar"; 
        String strings = " Strings"; 
        String em = " em"; 
        String java = " Java";
 
        String frase = stringBuilder.append(eu) 
                .append(ja) 
                .append(sei) 
                .append(usar) 
                .append(strings) 
                .append(em) 
                .append(java) 
                .toString();
        System.out.println(frase); // Eu já sei usar Strings em Java
        
        // Arrays
        int[] intArray = new int[9]; 
        intArray[0] = 40; 
        intArray[1] = 55; 
        intArray[2] = 63;
        intArray[3] = 17; 
        intArray[4] = 22; 
        intArray[5] = 68; 
        intArray[6] = 89; 
        intArray[7] = 97; 
        intArray[8] = 89; 
 
        System.out.println(intArray[8]); // 89 
        System.out.println(intArray[2]); // 63 
 
//        intArray[9] = 89; // Estoura a pilha porque tentamos inserir um valor em um espaço inexistente do array
        
        int[] arrayDeInteiros = {1,2,3,4,5,6,767,878,8,8,9,9,9}; 
        int[][] matriz = new int[2][10]; // inicializamos uma matriz, bem parecido com uma tabela de excel com coluna e linha 
        String[] arrayDeString = new String[10]; 
 
        matriz[0][0] = 10; 
        matriz[1][0] = 20; 
 
        arrayDeString[0] = "Na Trybe"; 
        arrayDeString[1] = " eu aprendo Java!"; 
 
        System.out.println(arrayDeInteiros[3]); // 4 
        System.out.println(matriz[0][0]); // 10 
        System.out.println(matriz[1][5]); // 0  
        System.out.println(arrayDeString[0] + arrayDeString[1]); // Na Trybe eu aprendo Java! 
        System.out.println(arrayDeString.length); // 10 
	}

}
