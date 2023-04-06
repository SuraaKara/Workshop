public class Main {
    public static void main(String[] args) {
         /*
        char harf= 'I';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Kalın sesli harf");
            break;
            default:
                System.out.println("İnce sesli harf");
        }
         */
/*
        int number = 28;
        int total = 0;
        for(int i=1;i<number;i++){
            if(number%i ==0){
                total=total+i;
            }
        }
        if(total== number){
        System.out.println("mükemmel sayıdır");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }
 */

        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak= 5;
        boolean varMi =false;
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("sayı mevcut");
        }else{
            System.out.println("Sayı mevcut değil");
        }

    }
}