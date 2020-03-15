
public class Dersler {
    String[] dersKod=new String[10];
    String[] dersAdi=new String[10];
    double[] dersAKTS=new double[10];
    double[] dersNotu=new double[10];
    int akts;
    int not;
    double Topakts=0.0;
    double Topnot=0.0;

    public Dersler(String dersKod,String dersAdi,double dersAKTS,double dersNotu){
        for(int i=0;i<1;i++){
            this.dersNotu[i]=dersNotu;
            this.dersAKTS[i]=dersAKTS;
            this.dersKod[i]=dersKod;
            this.dersAdi[i]=dersAdi;
            //this.akts=dersAKTS;
            //this.not=dersNotu;


         this.Topakts+=dersAKTS;
         this.Topnot+=(dersNotu*dersAKTS);

        }


    }
    public Dersler(){

    }
    public void KümülatifHesap(){
        double a=this.Topnot/this.Topakts;
        System.out.println("Öğrencinin kümülatifi: "+a);

    }




    public void ShowInfos(){
        System.out.println("          "+this.dersKod[0]+"   "+this.dersAdi[0]+"   "+this.dersAKTS[0]+"    "+dersNotu[0]);
    }

}

