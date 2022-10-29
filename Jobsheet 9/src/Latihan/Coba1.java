public class Coba1 {
    public boolean pintu= false;
    public int pemberhentian = 1;
    public final int stasiun_up = 5;
    public final int stasiun_down = 1;

    public void buka(){
        System.out.println("Pintu dibuka");
        pintu = true;
        System.out.println("Pintu terbuka");
    }
    
    public  void tutup(){
        System.out.println("Pintu ditutup");
        pintu = false;
        System.out.println("pintu telah ditutup");

    }

    public void berangkat(){
        System.out.println("Kereta berangkat");
        pemberhentian++;
        System.out.println("Stasiun : "+ pemberhentian);

    }

    public void pulang(){
        System.out.println("Kereta Kembali");
        pemberhentian--;
        System.out.println("stasiun :"+pemberhentian);
    }
    public void setkereta(int berhenti){
        while(pemberhentian != berhenti) {
            if(pemberhentian < berhenti) {
                berangkat();
            } 
            else {
                pulang();
            }
        }
    }    
    
    public int getFloor() {
        return pemberhentian;
    }
    
    public boolean checkDoorStatus() {
        return pintu;
    }

{
    
}

    }



