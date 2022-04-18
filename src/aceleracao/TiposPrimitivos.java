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
		
	}

}
