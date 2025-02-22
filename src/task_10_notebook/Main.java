package task_10_notebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<String> listTasks = new LinkedList<>();
        while (true) {
            // TODO try catch
            //  try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose action: 1-добавить задачу, 2-вывести список задач, 3-удалить задачу, 0 - выход");


            int inputUser = scanner.nextInt();

            String textInputUser = scanner.nextLine();



            if (inputUser == 1) {
                System.out.println("Введите текст ");
              textInputUser = scanner.nextLine();

                listTasks.add(textInputUser);
                continue;
            }
            if (inputUser == 2) {
                for (String task : listTasks) {
                    System.out.println(task);;

                }
                continue;
            }
            if (inputUser == 3) {
                listTasks.remove(listTasks.size() - 1);
                System.out.println("Последняя задача удалена");
                continue;
            }
            if (inputUser == 0) {

                break;
            }
//
//               } else throw new UserNotFoundException();
//            }catch (UserNotFoundException e ) {
//                System.out.println("");
        }


//        public static String addTask() {
//            //System.out.println("введите какую задачу добавляем");
//            String strInput= sc.nextLine();
//
//
//
//            return strInput;
//
//        }


    }
}


