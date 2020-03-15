public class Ogrenci {
    private String Isim_Soyisim;
    private int Id;
    private String Bolum;
    public Ogrenci(String Isim_Soyisim,String Bolum,int Id){
        this.Isim_Soyisim=Isim_Soyisim;
        this.Bolum=Bolum;
        this.Id=Id;

    }
    public Ogrenci(){

    }

    public void setIsim_Soyisim(String isim_Soyisim) {
        Isim_Soyisim = isim_Soyisim;
    }

    public String getIsim_Soyisim() {
        return Isim_Soyisim;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setBolum(String bolum) {
        Bolum = bolum;
    }

    public String getBolum() {
        return Bolum;
    }


    public void ShowInfos(){
        System.out.println("Öğrenci bilgisi...");
        System.out.println("Ad Soyad: "+this.Isim_Soyisim);
        System.out.println("Bölümü: "+this.Bolum);
        System.out.println("Numarası: "+this.Id);

    }
}
