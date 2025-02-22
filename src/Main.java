//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;

public class Main {
    public static void main(String[] args) {


        //TIP  _ _ _ _ _ _ _ _  + _ _ _ _ _ _ _
        //        ArrayList<String> list = new ArrayList<>();
        //[1 1,3 _ _ _ 4 5 _ _  __  _ _ __ ]

         List<String> list = new LinkedList<>();

        // add {..} ->  <-{...} -> <- {....} ->  <-add{..}




        list.add("Лев");
        list.add("Мурат");
        list.add("Вальтер");
        list.set(0,"Джек");
        System.out.println(list.get(1));

//
        for(String name :list) {
            System.out.println(name);
        }







//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        System.out.println(list.getFirst());
//        list.add(1,"Здесь будет какое-то имя");
//        System.out.println(list);
//        System.out.println(list.contains("Джек"));
    }
}