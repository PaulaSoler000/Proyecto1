package romper;

public class RomperCosas {

	static int divideByZero(int a, int b){
		int i=a/b;
		return i;
	}

	static int computeDivision(int a, int b) {
		int res=0;
		try {
			res=divideByZero(a,b);

		}catch(NumberFormatException e) {
			System.out.println("tenemos una excemcion NumberFormatException");
		}

		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=0;

		int i=3;
		try {
			i=computeDivision(a,b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Estoy vivo");
		
		int[] lista= {1,2,3,4};
		try {
			i=a/b;
			i=lista[4];
			System.out.println("el valor de i es: "+i);
		System.out.println("termino el try");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("estoy en la excepcion del Array out of bounds");	
		}finally {
			System.out.println("estoy en el finally");
		}

		System.out.println("Sigo vivo");
	}

}
