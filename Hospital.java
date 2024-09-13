public interface Hospital {
     void surgery();
     void icu();
     void recpstion();
     void medicin();

}
 class PrivH implements Hospital {
     @Override
     public void surgery() {
         System.out.println("first flor");
     }

     @Override
     public void icu() {
         System.out.println("second flor");
     }

     @Override
     public void recpstion() {
         System.out.println("third flor");
     }

     @Override
     public void medicin() {
         System.out.println("ground");
     }
 }
 class Test{

    public static void main(String[] args) {
        PrivH h=new PrivH();
        h.surgery();
        h.icu();
        h.recpstion();
        h.medicin();

        System.out.println();

    }
}
