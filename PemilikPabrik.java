class PemilikPabrik{
    //atribut
    private String noKTP;
    private String nama;
    private String alamat;
    private double kekayaan;
     
    //konstruktor 
    PemilikPabrik(){}

    //setter & getter noKTP
    public void setnoKTP(String noKTP){
        this.noKTP = noKTP;
    }
    public String getnoKTP(){
        return noKTP;
    }

    //setter & getter nama
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }

    //setter & getter alamat
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public String getalamat(){
        return alamat;
    }

    //setter & getter kekayaan
    public void setkekayaan(double kekayaan){
        this.kekayaan = kekayaan;
    }
    public double getkekayaan(){
        return kekayaan;
    }
}