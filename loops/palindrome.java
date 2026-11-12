class palindrome {
    public static void main(String [] args){
        int num =122;
        int temp=num;
        int sum=0;
        while(temp!=0){
            int rem = temp%10;
            sum = sum*10 + rem;
            temp = temp/10; 
        }
        if (num == sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
