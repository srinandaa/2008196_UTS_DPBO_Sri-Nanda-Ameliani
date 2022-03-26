/*Saya Sri Nanda Ameliani 2008196 mengerjakan UTS DPBO
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka 
saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

/*Desain:
Dalam rancangan ini, BahanKonsumsiOral memiliki 3 parent yaitu Makanan, Minuman dan Obat karena memiliki
atribut Kode dan jenis (terdiri dari makanan, minuman, dan obat). 
Kemudian jenis bahan tersebut memiliki noijin pabrik juga sehingga Pabrik Makanan dan obat interface bagi Makanan/Minuman/Obat.
Pabrik Makanan dan Obat -> Makanan -> BahanKonsumsiOral
                           Minuman
                           Obat

Pemilik Pabrik -> Manusia (inheritence, karena sama di dunia nyata)
Pemilik Pabrik -> Pabrik Makanan dan Obat (interface)
*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Makanan[] arrMakanan = new Makanan[100];
        Minuman[] arrMinuman = new Minuman[100];
		Obat[] arrObat = new Obat[100];

        //data Makanan
		arrMakanan[0] = new Makanan("M001", "Kentang_Goreng", "Karbohidrat", "Snack", "LALULA01");
        arrMakanan[1] = new Makanan("M002", "Telur_Rebus", "Protein", "Makanan Pendamping", "LALULA02");
        arrMakanan[2] = new Makanan("M003", "Nasi_Merah", "Karbohidrat", "Makanan Pokok", "LALULA03");

        //data Minuman
        arrMinuman[0] = new Minuman("A001", "Aqua", "Air Bersih", 0, "DANONE01");
        arrMinuman[1] = new Minuman("A002", "Teh_Manis", "Suplemen", 20, "DANONE02");
        arrMinuman[2] = new Minuman("A003", "Apple_Juice", "Buah", 15, "DANONE03");

        //Data Obat
        arrObat[0] = new Obat("B001", "Paracetamol", "Umum", 2, "tablet", "Demam", "SIKITA01");
        arrObat[1] = new Obat("B002", "Bisolvon", "Resep dokter", 3, "table", "Batuk","SIKITA02");
        arrObat[2] = new Obat("B003", "Ibuprofen", "Umum", 3, "sirup", "Sakit Kepala", "SIKITA03");

        //Masukan user
        System.out.print("Masukan Kata Pencarian: ");
        String cari = "";
		Scanner sc = new Scanner(System.in);
		try{
		    cari = sc.next();
		}catch(Exception e){
		}
		
        //pencarian
		int status = 0, i = 0, x = -1;
        while(i<3 && status==0){
			if(cari.equals(arrMakanan[i].getkode())){ //jika data kode makanan sama dengan yang di cari
				status = 1; //maka status 1
                x = i;
			}else if(cari.equals(arrMakanan[i].getnama())){
				status = 1; //maka status 1
                x = i;
			}else if(cari.equals(arrMinuman[i].getkode())){
				status = 2; //maka status 2
                x = i;
			}else if(cari.equals(arrMinuman[i].getnama())){
				status = 2; //maka status 2
                x = i;
			}else if(cari.equals(arrObat[i].getkode())){
				status = 3; //maka status 3
                x = i;
			}else if(cari.equals(arrObat[i].getnama())){
				status = 3; //maka status 3
                x = i;
			}else{
				i++;
			}
		}
				
		//keluaran
		if(status==1){
			arrMakanan[x].printMakanan();
		}else if(status==2){
			arrMinuman[x].printMinuman();
		}else if(status==3){
			arrObat[x].printObat();
		}else{
            System.out.println("Pencarian tidak ditemukan.");
        }
    }
}