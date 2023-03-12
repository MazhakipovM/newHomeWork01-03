public class Main {
    public static void main(String[] args) {

        //zadacha 1
        System.out.println("zadacha 1");
        int deposit = 15000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000){
            sum = sum + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + "рублей");
        }






        //zadacha 2
        System.out.println("zadacha 2");

        int number = 0;
        while ( number < 10){
            number++;

            System.out.print(number+ " ");
        }

        System.out.println(" ");
        int number2 = 10;
        for (; number2 > 0; number2--){
            System.out.print(number2 + " ");
        }


        //zadacha 3
        System.out.println("zadacha 3");
        System.out.println(" ");
        int population = 12_000_000;
        int year = 0;
        int mortalityRate = 8;
        int birthRate = 17;
        while (year< 10){
            population =population+ ((population/1000)*(birthRate-mortalityRate));
            year= year+1;
            System.out.println("Год "+year+ " численность населения составляет "+population);
        }


        //zadacha 4
        System.out.println("zadacha 4");

        int deposit2 = 15_000;
        int month2 = 0;
        int sum2 = 0;
        while (sum2 < 12_000_000){
            month2++;
            sum2= sum2+deposit2;
            sum2 = (sum2/100)*7 + sum2;
            System.out.println("месяц "+month2+ ", сумма "+ sum2);
}


        //zadacha 5
        System.out.println("zadacha 5");
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + (total/100)*7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }

        //zadacha 6
        System.out.println("zadacha 6");
        int VasilysDeposit = 15000;
        int VasiliysSum = 0;
        int VasiliysMonth = 0;
        for (; VasiliysMonth < 12*9; VasiliysMonth++){
            VasiliysSum = VasiliysSum + (VasiliysSum/100)*7;
            VasiliysSum = VasiliysSum + VasilysDeposit;
            if (VasiliysMonth % 6 ==0){
                System.out.println(VasiliysMonth+ " "+ VasiliysSum);
            }

        }

        //zadacha 7
        System.out.println("zadacha 7");

        for (int friday = 3; friday <= 31; friday = friday + 7 ){
            System.out.println("Сегодня пятница,"+friday+"-е число. Необходимо подготовить отчет");
        }



        //zadacha 8
        System.out.println("zadacha 8");
        for(i = 1896; i <= 2123; i = i + 79){
            System.out.println(i);
        }


    }
}