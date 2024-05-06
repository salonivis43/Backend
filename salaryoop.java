class salary{
    int bs;
    float ta,da,hra,gs;

    void intData(){
        bs=10000;
    }

    void taOperationData(){
         ta=bs*5/100;
        
    }
    void daOperationData(){
         
        da=bs*10/100;
        
    }
    void hraOperationData(){
        
        hra=bs*15/100;
        
    }
    void gsOperationData(){
         
        gs=(bs+ta+da+hra);
    }

    void put(){
        System.out.println(gs);
    }
}

class mainclass{
    public static void main(String args[]){
        salary mul = new salary();
        mul.intData();
        mul.taOperationData();
        mul.daOperationData();
        mul.hraOperationData();
        mul.gsOperationData();
        mul.put();
    }
}