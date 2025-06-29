package ex_21_Interface;

interface Playable {
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable{
   public void play(){
        System.out.println("Playing Piano");
    }
}
class Mains{
    public static void main(String[] args) {
        Playable p;
        p=new Guitar();
        p.play();
        p=new Piano();
        p.play();
    }
}
