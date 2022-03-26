class Obat{
    //atribut
    private String kode;
    private String penyakit;
    private String jenis;
    private String nama;
    private String noIjinPabrik;
    private String bentuk;
    private int DosisPerHari;

    //konstruktor 
    Obat(){}
    Obat(String kode, String nama, String jenis, int DosisPerHari, String bentuk, String penyakit, String noIjinPabrik){
        this.kode = kode;
        this.bentuk = bentuk;
        this.jenis = jenis;
        this.nama = nama;
        this.penyakit = penyakit;
        this.DosisPerHari = DosisPerHari;
        this.noIjinPabrik = noIjinPabrik;
    }

    //setter & getter kode
    public void setkode(String kode){
        this.kode = kode;
    }
    public String getkode(){
        return kode;
    }

    //setter & getter penyakit
    public void setpenyakit(String penyakit){
        this.penyakit = penyakit;
    }
    public String getpenyakit(){
        return penyakit;
    }

    //setter & getter jenis
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public String getjenis(){
        return jenis;
    }

    //setter & getter nama
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }

     //setter & getter noIjinPabrik
    public void setnoIjinPabrik(String noIjinPabrik){
        this.noIjinPabrik = noIjinPabrik;
    }
    public String getnoIjinPabrik(){
        return noIjinPabrik;
    }

     //setter & getter bentuk
    public void setbentuk(String bentuk){
        this.bentuk = bentuk;
    }
    public String getbentuk(){
        return bentuk;
    }

     //setter & getter DosisPerHari
    public void setDosisPerHari(int DosisPerHari){
        this.DosisPerHari = DosisPerHari;
    }
    public int getDosisPerHari(){
        return DosisPerHari;
    }

    //output Obat
    void printObat(){
        System.out.println("Obat:");
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Jenis Obat: " + this.jenis);
        System.out.println("Dosis per Hari: " + this.DosisPerHari);
        System.out.println("Bentuk: " + this.bentuk);
        System.out.println("Penyakit: " + this.penyakit);
        System.out.println("NoIjinPabrik: " + this.noIjinPabrik);
    }
}