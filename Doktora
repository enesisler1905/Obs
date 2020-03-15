public class Doktora extends  Ogrenci{
    private String Yuksek_Bolumu;
    private String Lisans_Okulu;
    private String Lisans_Bolumu;
    private String Yuksek_Okulu;
    public Doktora(String Isim_Soyisim, String Bolum, int Id,String Yuksek_Okulu,String Yuksek_Bolumu,String Lisans_Okulu,String Lisans_Bolumu) {
        super(Isim_Soyisim, Bolum, Id);
        this.Yuksek_Bolumu=Yuksek_Bolumu;
        this.Yuksek_Okulu=Yuksek_Okulu;
        this.Lisans_Okulu=Lisans_Okulu;
        this.Lisans_Bolumu=Lisans_Bolumu;

    }
    public Doktora(){

    }

    public void setLisans_Okulu(String lisans_Okulu) {
        Lisans_Okulu = lisans_Okulu;
    }

    public String getLisans_Okulu() {
        return Lisans_Okulu;
    }

    public void setLisans_Bolumu(String lisans_Bolumu) {
        Lisans_Bolumu = lisans_Bolumu;
    }

    public String getLisans_Bolumu() {
        return Lisans_Bolumu;
    }

    public void setYuksek_Bolumu(String yuksek_Bolumu) {
        Yuksek_Bolumu = yuksek_Bolumu;
    }

    public String getYuksek_Bolumu() {
        return Yuksek_Bolumu;
    }

    public void setYuksek_Okulu(String yuksek_Okulu) {
        Yuksek_Okulu = yuksek_Okulu;
    }

    public String getYuksek_Okulu() {
        return Yuksek_Okulu;
    }

    @Override
    public void ShowInfos() {
        super.ShowInfos();
        System.out.println("Yüksek Okulu: "+getYuksek_Okulu());
        System.out.println("Yüksek Bölümü: "+getYuksek_Bolumu());
        System.out.println("Lisans Okulu: "+getLisans_Okulu());
        System.out.println("Lisans Bölümü: "+getLisans_Bolumu());
    }
}

