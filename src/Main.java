public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
        rwOnly.setName("Bhushan");
        rwOnly.getName();//'name' has private access in 'RWOnly'
    }
}