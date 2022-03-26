class Minuman{
    //atribut
    private String kode;
    private int kandunganGula;
    private String jenis;
    private String nama;
    private String noIjinPabrik;
     
    //konstruktor 
    Minuman(){}

    Minuman(String kode, String nama, String jenis, int kandunganGula, String noIjinPabrik){
        this.kode = kode;
        this.kandunganGula = kandunganGula;
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

    //setter & getter kandunganGula
    public void setkandunganGula(int kandunganGula){
        this.kandunganGula = kandunganGula;
    }
    public int getkandunganGula(){
        return kandunganGula;
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

    //output Minuman
    void printMinuman(){
        System.out.println("Minuman:");
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Kandungan Gula: " + this.kandunganGula);
        System.out.println("NoIjinPabrik: " + this.noIjinPabrik);
    }
}