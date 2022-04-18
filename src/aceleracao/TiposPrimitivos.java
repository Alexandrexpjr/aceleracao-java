package aceleracao;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte type are numeric variables in range (-128, 127)
		byte b = 9;
		System.out.println(b); // 9
		
		// short type are numeric variables in range (-32768, 32767)
		short num = 300; // 300
		short underscored = 20_000; // 20000
		System.out.println(num);
		System.out.println(underscored);
		
		// int type are numeric variables in range (-2.147.483.648, 2.147.483.647)
		int intNumber = 10;
		int x = 10, y = 20, soma;
		soma = x + y;
		int bigInt = 1_345_233_213; // underscores are used to readability
		System.out.println(intNumber);
		System.out.println(soma);
		System.out.println(bigInt);
		
		// long type are numeric variables in range (-9.223.372.036.854.775.808, 9.223.372.036.854.775.807)
		long numA = 102040; 
        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long 
        System.out.println(numA); 
        System.out.println(numB);
        
        // float type are numeric variables in range (-1,4024E-37, 3,40282347E+38)
        float floatA = -101.23f; // adicionado f no final para indicar que estamos inserindo um valor do tipo float
        float floatB = 2.356f;
        System.out.println(floatA + floatB); // -98.874
        
        // double type are numeric variables in range (-4,9E-324, 1,7976931348623157E308)
        double varDouble = 2.356; // double inicializado naturalmente 
        double doubleRecebendoFloat = 1.409F; // double aceitando número float 
        double doubleRecebendoLong = 12930L; // double aceitando número long 
        System.out.println(doubleRecebendoFloat + varDouble); // 3.765000039100647
        System.out.println(doubleRecebendoLong); // 12930.0 
        
        // boolean
        
        boolean isBoolean = true; // outros exemplos: isGreaterThan, isFlexible, isStarted 
        System.out.println(isBoolean);
        
        // char: one character
        char letraA = 'a'; 
        char letraAMaiuscula = 'A'; 
        System.out.println(letraA); // a 
        System.out.println(letraAMaiuscula); // A
        System.out.println(letraAMaiuscula == letraA); // false
	}

}
