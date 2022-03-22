/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectoop1;

/**
 *
 * @author PAVILION GAMING
 */
class Person {
        protected String nama;
        protected String alamat;
        
        public Person(String nama, String alamat) {
            this.nama = nama;
            this.alamat = alamat;
        }
        
        public void hello() {
            System.out.println("Hello namaku " + nama);
        }
    }
    
    class Mahasiswa extends Person {
        private String nim;
        
        Mahasiswa(String nama, String alamat) {
            super(nama, alamat);
        }
        
        public void setNim(String nim) {
            this.nim = nim;
        }
        
        public void dataDiri() {
            System.out.println(String.format("Nama : %s\nNIM : %s",nama,nim));
        }
        
    }



public class ProjectOOP1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Person orang = new Person("Jonas","Batam");
        orang.hello();
        
        Person orang2 = new Person("Dorothy","Tulungagung");
        orang2.hello();
        
        Mahasiswa mhs1 = new Mahasiswa("Jahames","Denpasar");
        mhs1.setNim("215232776");
        mhs1.dataDiri();
        mhs1.hello();
    }
    
}
