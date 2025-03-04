package task_10_notebook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        List<String> tacked = new LinkedList<>();
        runAppMsg();
        while (true) {
            printFunctions();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.out.println("Закрываем сканер...");
                Thread.sleep(2000);
                scanner.close();
                System.out.println("Успешное завершение работы сканера");
                Thread.sleep(2000);
                System.out.println("Завершаем работу программы...");
                Thread.sleep(2000);
                System.out.println("Все хорошо! До встречи!");
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1 -> {
                    System.out.println("Введите задачу для планирования!");
                    input = scanner.nextLine();
                    tacked.add(input);
                }
                case 2 -> printTasked(tacked);
                case 3 -> {
                    System.out.println("Введи номер задачи которую хочешь изменить!");
                    printTasked(tacked);
                    input =scanner.nextLine();
                    changingTask(tacked,input);
                }
                case 4 -> {
                    System.out.println("Введи номер задачу, которую хочешь удалить");
                    printTasked(tacked);
                    input = scanner.nextLine();
                    removeTask(tacked, input);

                }
                default -> System.out.println("Вы ввели несуществующий номер функции! Повторите снова!");
            }
        }

//        List<String> listTasks = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (true) {
//
//            System.out.println("""
//                    Choose action:
//                    1-добавить задачу.
//                    2-вывести список задач.
//                    3-удалить задачу.
//                    0 - выход""");
//
//            String inputUser = scanner.nextLine();
//            int operation = Integer.parseInt(inputUser);
//            if (operation == 0) {
//                System.out.println("выход");
//                break;
//            }
//            switch (operation) {
//                case 1 -> {
//                    System.out.println("Введите текст ");
//                    listTasks.add(scanner.nextLine());
//                }
//                case 2 -> {
////
//                    printTasks(listTasks);
//                }
//                case 3 -> {
//                    System.out.println("укажите удаляемый элемент списка");
//                    printTasks(listTasks);
//                    inputUser = scanner.nextLine();
//                    int removeTask = Integer.parseInt(inputUser) - 1;
//                    listTasks.remove(removeTask);
//                    System.out.println("задача удалена");
//                }
//            }
//        }


//
//               } else throw new UserNotFoundException();
//            }catch (UserNotFoundException e ) {
//                System.out.println("");
    }

    private static void runAppMsg() throws Exception {
        System.out.println("Добро пожаловать в менеджер задач!");
        Thread.sleep(2000);
        System.out.println("Идет запуск...");
        Thread.sleep(2000);
        System.out.println("Запуск прошел успешно!");
        Thread.sleep(2000);
    }

    private static void changingTask(List<String> tasked, String input) {
        int changingTask = Integer.parseInt(input);
        if( changingTask <1 || changingTask > tasked.size()) {
            System.out.println("Вы ввели несуществующую задачу! Попробуйте снова!");
        } else {
            System.out.println("Введите новую задачу для изменения");
            input = scanner.nextLine();
            tasked.set(changingTask -1, input);

        }
    }

    private static void removeTask(List<String> tasked, String input) {
        int removeTask = Integer.parseInt(input);
        if (removeTask < 1 || removeTask > tasked.size()) {
            System.out.println("Вы ввели несуществующую задачу! Попробуйте снова!");
        } else {
            tasked.remove(removeTask - 1);
            System.out.println("Задача удалена из списка");
        }
    }

    public static void printFunctions() {
        System.out.println("""
                Выберите действие:
                1.Добавить задачу.
                2.Вывести список задач.
                3.Изменить задачу
                4.Удалить задачу
                0.Выход
                """);
    }
    public static  void printTasked(List<String> tasked) {
        if(tasked.isEmpty()) System.out.println("У вас пока пустой список, добавьте первую задачу!");
        for (String task: tasked) {
            System.out.println(tasked.indexOf(task) +1 + "." + task);
        }
        System.out.println();
    }
//    public static void printTasks (List<String> listTasks){
//       // int i = 0;
//        if(listTasks.isEmpty()){
//            System.out.println("у Вас пустой список, добавьте задачу");
//        }
//        for (String task : listTasks) {
//            System.out.println(listTasks.indexOf(task) + 1 + "." + task);
////                        System.out.println(++i + "." + task);
//        }
//    }


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



