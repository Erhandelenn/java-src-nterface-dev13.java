package school;
public class Staff implements IPerson {
    private final String isim;
    private final String soyisim;
    private int yas;
    private String kimlikNo;
    private String gorevAlani;

    public Staff(String isim, String soyisim, int yas, String kimlikNo, String gorevAlani) {
        if (isim == null || isim.isEmpty()) {
            throw new IllegalArgumentException("İsim boş veya null olamaz.");
        }
        if (soyisim == null || soyisim.isEmpty()) {
            throw new IllegalArgumentException("Soyisim boş veya null olamaz.");
        }

        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
        this.gorevAlani = gorevAlani;
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public String getSoyisim() {
        return soyisim;
    }

    @Override
    public int getYas() {
        return yas;
    }

    @Override
    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String getKimlikNo() {
        return kimlikNo;
    }

    @Override
    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getGorevAlani() {
        return gorevAlani;
    }

    public void setGorevAlani(String gorevAlani) {
        this.gorevAlani = gorevAlani;
    }

    @Override
    public void yazdir() {
        System.out.println("Görevli: " + getIsim() + " " + getSoyisim() + ", Yaş: " + getYas() + ", Kimlik No: " + getKimlikNo() + ", Görev Alanı: " + getGorevAlani());
    }
}