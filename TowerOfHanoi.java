public class TowerOfHanoi {

    public static void hanoiTower(int n, String src, String help, String dest){
        
        if(n==1){
            System.out.println(n + "  to  " + src + "----->" + dest);
           
            return;
        }
        
        hanoiTower(n-1, src, dest, help);
        System.out.println(n + "  to  " + src + "----->" + dest);        
        hanoiTower(n-1, help, src, dest); 


    }
   public static void main(String[] args) {
    hanoiTower(3, "s", "h", "d");
   } 
}
