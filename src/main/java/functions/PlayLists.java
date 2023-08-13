package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PlayLists {
    public static void forEach(List<Integer>elements, Consumer<Integer>consumer){
        //highernOrder function
        
        for(Integer element:elements ){
          consumer.accept(element);
        }

    }
    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(4,10,7,4,6,2,1,10,8);
        //print all even marka scored in exam
       System.out.println("************************Even Marks**************");
   /*     for(Integer mark: marks){
   //lower order fun
            if(mark%2==0){
                System.out.println(mark);
            }
        }*/
        forEach(marks,mark-> {
            //lower orderd fun
            if (mark % 2 == 0) {
                System.out.println(mark);
            }
        });
        //print all the students who have scored odd marks more than 3

        System.out.println("*********Odd Marks**********");
  /*      for(Integer mark:marks){
            if(mark%2!=0 && mark>3){
                System.out.println(mark);
            }
        }*/
       forEach(marks,mark->{
           if(mark%2!=0 && mark>3){
               System.out.println(mark);
           }
       });


    }
}
