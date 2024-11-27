package rpl2_pert2_50421209;

public class RPL2_Pert2_50421209 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setName("Ario");
        mahasiswa.setNpm("50421209");
        mahasiswa.setClassNumber("4IA06");
        mahasiswa.setBirthYear(2002);
        mahasiswa.setAlamat("Depok");
        
        System.out.println(mahasiswa.toString());
    }
    
}