class prime {
    public static void main(String[] args) {
        int a=11;


        if(a<=1){
            System.out.println("number is not prime");
        }
        else{
            int count=0;

            for(int i=2;i<Math.sqrt(a);i++){
                if(a%i==0){
                    System.out.println("number is not prime");
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("number is prime");
            }
        }
 }
    
}
