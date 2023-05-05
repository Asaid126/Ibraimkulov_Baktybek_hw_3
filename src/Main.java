import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arrayNam = {1.1, 61.2, 6.8, 8.1, 8.3, -4.2, -9.9, -3.5, -7.6, -2.3, 2.1, 2.3, 2.1, 3.2, 2.3};
        double sum = 0.0;
        double k = 0.0;
        boolean b = false;
        for (double a : arrayNam) {
            if (a > 0.0 && b) {
                sum += a;
                k += 1.0;
            }
            if (a < 0.0 && !b) {
                b = true;
            }
        }
        System.out.println("Среднее арифметическое положительных ");
        System.out.println("чисел посе первого ортиц.: " + sum / k);

        //Дз на сообразительность
        selectionSort(arrayNam);
        for (int i = 0; i < arrayNam.length; i++) {
            System.out.println(arrayNam[i]);
        }
//        //Дз на сообразительность.(результат верный,но метод решеня выбран не по уловию)
////        for (int i = 0;  i< arrayNam.length; i++) {
////            for (int a = 0; a <arrayNam.length ; a++) {
////                double n;
////                if(arrayNam[i]< arrayNam[a]){
////                    n=arrayNam[i];
////                    arrayNam[i]=arrayNam[a];
////                    arrayNam[a]=n;
////                }
////            }
////        }
//        System.out.println(Arrays.toString(arrayNam));
    }

    public static void selectionSort(double[] arrayNam) {
        for (int i = 0; i < arrayNam.length; i++) {
            int pos = i;
            double min = arrayNam[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < arrayNam.length; j++) {
                if (arrayNam[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = arrayNam[j];
                }
            }
            arrayNam[pos] = arrayNam[i];
            //меняем местами наименьший с sortArr[i]
            arrayNam[i] = min;
        }
    }
}



