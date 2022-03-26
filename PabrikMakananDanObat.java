class PabrikMakananDanObat{
    //atribut
    private String NoIjin;
    private String noKTPPemilik;
    private String NamaPemilik;
    private String jenis;
     
    //konstruktor 
    PabrikMakananDanObat(){}

    //setter & getter NoIjin
    public void setNoIjin(String NoIjin){
        this.NoIjin = NoIjin;
    }
    public String getNoIjin(){
        return NoIjin;
    }

    //setter & getter noKTPPemilik
    public void setnoKTPPemilik(String noKTPPemilik){
        this.noKTPPemilik = noKTPPemilik;
    }
    public String getnoKTPPemilik(){
        return noKTPPemilik;
    }

    //setter & getter jenis
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public String getjenis(){
        return jenis;
    }

    //setter & getter NamaPemilik
    public void setNamaPemilik(String NamaPemilik){
        this.NamaPemilik = NamaPemilik;
    }
    public String getNamaPemilik(){
        return NamaPemilik;
    }
}