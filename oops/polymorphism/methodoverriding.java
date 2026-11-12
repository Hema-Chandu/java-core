class Whatsapp{
    public void status(){
        System.out.println("Seeing status");
    }
    public void calls(){
        System.out.println("we can make audio and video calls");
    }
    public void msg(){
        System.out.println("We can text, share audio and video calls and share images also");
    }
}

class Whatsapp2 extends Whatsapp{
    public void status(){
        System.out.println("Seeing status and reacting");
    }
    
}
public class methodoverriding {
    public static void main(String[] args) {
        Whatsapp whatsapp= new Whatsapp();
        whatsapp.status();
        whatsapp = new Whatsapp2();
        whatsapp.status();
        whatsapp.msg();
    }
}
