class Equilatero extends Triangolo{
	double altezza;
	
	public Equilatero(int lato){
		super(lato,lato,lato);
	}

	void visualizza(){
		super.visualizza();
		System.out.println("altezza:" + altezza);
	}

	double calcolaAltezza(){
		altezza=Math.sqrt(Math.pow(lato1,2)-Math.pow((double)lato1/2,2));
		return altezza;
	}

	double area(){
		double a;
		a=lato1*altezza/2;
		return a;
	}
}
