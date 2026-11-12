class learning{
    public void course(){
        System.out.println("recorded videos");
    }
}
class learningv2 extends learning{
    public void course(){
        super.course();
        System.out.println("Also live sessions");
    }
}

public class overridingexample2 {
    public static void main(String[] args) {
        learningv2 learning = new learningv2();
        learning.course();
    }
    
}
