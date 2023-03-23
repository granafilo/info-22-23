class Triangolo{
	int lato1,lato2,lato3;

	public Triangolo(int lato1, int lato2, int lato3){
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}

	void visualizza(){
		System.out.println("lato 1:"+lato1);
		System.out.println("lato 2:"+lato2);
		System.out.println("lato 3:"+lato3);
	}

	boolean isTri(){
		if((lato1+lato2>lato3)&&(lato1+lato3>lato2)&&(lato2+lato3>lato1)){
			return true;
		}
		else{
			return false;
		}
	}

	int perimetro(){
		int p;
		p=lato1+lato2+lato3;
		return p;
	}
}
		