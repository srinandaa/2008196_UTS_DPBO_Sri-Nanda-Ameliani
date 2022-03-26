class BahanKonsumsiOral{
    //atribut
    private String kode;
    private String deskripsi;
    private String jenis;
    private String kegunaan;
     
    //konstruktor 
    BahanKonsumsiOral(){}

    //setter & getter kode
    public void setkode(String kode){
        this.kode = kode;
    }
    public String getkode(){
        return kode;
    }

    //setter & getter deskripsi
    public void setdeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public String getdeskripsi(){
        return deskripsi;
    }

    //setter & getter jenis
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public String getjenis(){
        return jenis;
    }

    //setter & getter kegunaan
    public void setkegunaan(String kegunaan){
        this.kegunaan = kegunaan;
    }
    public String getkegunaan(){
        return kegunaan;
    }
}