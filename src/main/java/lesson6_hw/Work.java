package lesson6_hw;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию


import java.util.*;
public class Work {

    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }


    public static void main(String[] args) {
        Laptop appleMacBookProA2485 = new Laptop("Apple", "A2485", "серый", "16.2", "32", "10");
        Laptop asusGamingF17 = new Laptop("Asus", "F-17", "серый", "17.3", "16", "14");
        Laptop asusExpertBookB7 = new Laptop("Asus", "B-7", "черный", "14", "16", "8");
        Laptop huaweiMateBook16S = new Laptop("Huawei", "16-S", "серый", "16", "16", "14");
        Laptop asusTUF556 = new Laptop("Asus", "TUF-556", "серебристый", "15.6", "16", "8");

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(appleMacBookProA2485);
        laptops.add(asusGamingF17);
        laptops.add(asusExpertBookB7);
        laptops.add(huaweiMateBook16S);
        laptops.add(asusTUF556);

        int searchTerm = userInput("Выберите параметр фильтра:\n 1 - бренд, \n 2 - цвет" +
                " \n 3 - диагональ экрана, \n 4 - объем оперативной памяти, \n 5 - количество ядер процессора, \n 6 - показать весь список");

        if (searchTerm == 6){
            for (Laptop laptop: laptops) {
                laptop.toString();
                System.out.println();

            }
        }

        else if (searchTerm == 1){
            String numPar = userSInput("Введите интресующий бренд");
            for (Laptop brand : laptops) {
                if (brand.getBrand().equalsIgnoreCase(numPar)) {
                    System.out.println(brand.toString());
                }
            }
        }

        else if (searchTerm == 2){
            String numPar = userSInput("Введите цвет: ");
            for (Laptop color : laptops) {
                if (color.getColor().equalsIgnoreCase(numPar)) {
                    System.out.println(color.toString());
                }
            }
        }

        else if (searchTerm == 3){
            String numPar = userSInput("Введите диагональ экрана: ");
            for (Laptop screenDiagonal : laptops) {
                if (screenDiagonal.getScreenDiagonal().equalsIgnoreCase(numPar)) {
                    System.out.println(screenDiagonal.toString());
                }
            }
        }

        else if (searchTerm == 4){
            String numPar = userSInput("Введите объем оперативной памяти: ");
            for (Laptop amountOfRam : laptops) {
                if (amountOfRam.getAmountOfRam().equalsIgnoreCase(numPar)) {
                    System.out.println(amountOfRam.toString());
                }
            }
        }

        else if (searchTerm == 5){
            String numPar = userSInput("Введите количество ядер процессора: ");
            for (Laptop numberOfProcessorCores : laptops) {
                if (numberOfProcessorCores.getNumberOfProcessorCores().equalsIgnoreCase(numPar)) {
                    System.out.println(numberOfProcessorCores.toString());
                }
            }
        }

    }
}

