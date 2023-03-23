class Isoscele extends Triangolo{
    float area;
    int base, altezza, obliquo, p;

    public Isoscele(int lato1, int lato2, int lato3, int altezza){
        super(lato1, lato2, lato3);
        this.altezza = altezza;
    }

    boolean isIsoscele(){
        if(isTri()){
             if((lato1 == lato2 && lato1 != lato3) || (lato1 == lato3 && lato1 != lato2) || (lato2 == lato3 && lato2 != lato1) ){
                return true;
            }
        }else{
            System.out.println("L'oggetto non è un triangolo");
        }
       
        return false;
    }
    
    void calcolaBase(){
        if(lato1 == lato2){
            base = lato3;
            obliquo = lato1;
        }else{
            if(lato2==lato3){
                base = lato1;
                obliquo = lato2;
            }else{
                base = lato2;
                obliquo = lato3;
            }
        }
    }

    float area(){
        area= base*altezza/2;
        return area;
    }


    int perimetro(){
        p = base + obliquo*2;
        return p;
    }

    void visualizza(boolean baseCheck, boolean pCheck, boolean areaCheck){
        if(!baseCheck){
            super.visualizza();
                if(pCheck){
                    System.out.println("Perimetro: " + p);
                }
                if(areaCheck){
                    System.out.println("Area: " + area);
                }
        }else{
            System.out.println("Base:"+ this.base);
		    System.out.println("Obliquo:"+this.obliquo);
            if(pCheck){
                System.out.println("Perimetro: " + p);
            }
            if(areaCheck){
                System.out.println("Area: " + area);
            }
        }
        System.out.println("altezza: " + altezza);

    }
}