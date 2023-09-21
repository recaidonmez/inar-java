package week_6_Class_live;

public class ÖRNEK_6_1_2_MAX_MetodÇağırma {
    public static void main(String[] args) {

        int i = 2;
        int j = 5;
        int k =max(i, j);

        System.out.println(i +" ile "+ j +" arasınına büyük olan rakam "+ k +" dır.");

    }

    public static int max(int i, int j) {
        int sonuç;
        if(i>j){
            sonuç =i;
        }else{
            sonuç=j;
        }
            return sonuç;

    }
}
