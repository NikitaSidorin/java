





// Задача 2 
public class hm_2 {
    public static void main(String[] args) {
         
        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }
    }

} 


