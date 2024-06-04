package school;

public class Teacher implements IPerson {
    private final String isim;
    private final String soyisim;
    private int yas;
    private String kimlikNo;
    private String[] dersler;
    private String bolum;

    public Teacher(String isim, String soyisim, int yas, String kimlikNo, String[] dersler, String bolum) {
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
        this.dersler = dersler;
        this.bolum = bolum;
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

    public String[] getDersler() {
        return dersler;
    }

    public void setDersler(String[] dersler) {
        this.dersler = dersler;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public void yazdir() {
        System.out.print("Öğretmen: " + getIsim() + " " + getSoyisim() + ", Yaş: " + getYas() + ", Kimlik No: " + getKimlikNo()
                + ", Bölüm: " + getBolum() + ", Verdiği Dersler: ");
        for (String ders : dersler) {
            System.out.print(ders + " ");
        }
        System.out.println();
    }
}