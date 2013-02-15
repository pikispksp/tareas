class salario {
	public static void main (String[] arguments){

		System.out.println ("escriba el valor de cada hora");
		int valorh;
		String a = System.console().readLine();
		valorh = Integer.parseInt( a );

		if ( valorh > 8000){
		System.out.println ("escriba el numero de horas trabajadas");
		int horast;
		String b = System.console().readLine();
		horast = Integer.parseInt( b );

          if (horast <60){		
		  double pago;
		if ( horast < 40 ){
		pago = (horast * valorh);
		System.out.println ("el salario es de");
		System.out.println (pago);
		} else {
			int c = (horast - 40);
			pago = ( ( 40 * valorh ) + ( c * ( valorh * 1.5 ) ) );
			System.out.println ("el salario es de");
			System.out.println (pago);}

		}
			}		
	}
}