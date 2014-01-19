public class Main {

public static void main(String[] args){

Person org = new Person();
org.setUmur(20);
org.setNama("ABDULRAHMAN");
org.setNpm("4512210033");
org.setJurusan("TEKNIK INFORMATIKA");
System.out.println(" Nama     : " +org.getNama() +"\n"+" Umur     : "+ org.getUmur() +" tahun"+"\n"+" NPM      : "+org.getNpm()+"\n"+" Jurusan  : "+org.getJurusan());

}

}