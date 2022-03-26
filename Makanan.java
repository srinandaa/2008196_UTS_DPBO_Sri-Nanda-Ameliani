class Makanan{
    //atribut
    private String kode = "";
    private String kandunganGizi = "";
    private String jenis = "";
    private String nama = "";
    private String noIjinPabrik = "";
     
    //konstruktor 
    Makanan(){}
    Makanan(String kode, String nama, String kandunganGizi, String jenis, String noIjinPabrik){
        this.kode = kode;
        this.kandunganGizi = kandunganGizi;
        this.jenis = jenis;
        this.nama = nama;
        this.noIjinPabrik = noIjinPabrik;
    }

    //setter & getter kode
    public void setkode(String kode){
        this.kode = kode;
    }
    public String getkode(){
        return kode;
    }

    //setter & getter kandunganGizi
    public void setkandunganGizi(String kandunganGizi){
        this.kandunganGizi = kandunganGizi;
    }
    public String getkandunganGizi(){
        return kandunganGizi;
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

    //output Makanan
    void printMakanan(){
        System.out.println("Makanan:");
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Kandungan Gizi: " + this.kandunganGizi);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("NoIjinPabrik: " + this.noIjinPabrik);
    }
}