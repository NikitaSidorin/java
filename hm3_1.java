
import java.util.ArrayList;
import java.util.Arrays;

public class hm3_1 {
    static public void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 4, 7, 8, 9));
        int i = 0;
        while(i<ints.size())
            {
                if (ints.get(i) % 2 == 0) {
                    ints.remove(i);
                }
                else i++;
            }
            System.out.println(ints);    
            
    }
 }

 //задание 2



    