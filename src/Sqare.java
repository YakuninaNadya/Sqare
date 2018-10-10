// import java.util.Scanner;

/* public class Sqare {

    public int a, b, c, d;
    public int perimeter;
        public double area;

        public static void main (String [] args) {
        //public void perimeter(){


            System.out.println("Введите стороны четырехугольника:");

            Scanner input = new Scanner(System.in);

            //int a = 0, b = 0,  c = 0, d = 0;
            //int area;
            System.out.println("Введите сторону A:");
            int a = input.nextInt();
            System.out.println("Введите сторону B:");
            int b = input.nextInt();
            System.out.println("Введите сторону C:");
            int c = input.nextInt();
            System.out.println("Введите сторону D:");
            int d = input.nextInt();

            int perimeter = (a + b + c + d); // вычисляем периметр

                System.out.println("Периметр четырехугольника равен " + perimeter);




            //System.out.printf("Периметр четырехугольника равен " + perimeter);
            //Sqare mysqare = new Sqare();
            //mysqare.perimeter();

            //int p = a + b + c + d;



        double pper = perimeter / 2; // вычисляем площадь
        double area = Math.sqrt((pper - a) * (pper - b) * (pper - c) * (pper - d));
        System.out.println("Площадь четырехугольника равна " + area);



        if (a+c == b+d || a+b == c+d || a+d == c+b){ // вычисляем вписанную окружность

            double circle_area = Math.PI * (Math.pow((area/pper),2));
            System.out.println("Площадь вписанной окружности " + circle_area);

        } else {
            System.out.println("Не удается найти площадь окружности");
        }
            }

        }




*/
import java.util.Scanner;
public class Sqare {
    public static void main(String[] args) {


        System.out.println("Введите стороны четырехугольника:");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите сторону A:");
        int a1 = input.nextInt();
        System.out.println("Введите сторону B:");
        int b1 = input.nextInt();
        System.out.println("Введите сторону C:");
        int c1 = input.nextInt();
        System.out.println("Введите сторону D:");
        int d1 = input.nextInt();




        Perimeter per = new Perimeter();


        per.setA(a1);
        per.setB(b1);
        per.setC(c1);
        per.setD(d1);



        double p1 = per.descriptionOfPerimeter();

        per.setP(p1);

        per.writeOfPerimeter();



        double s1 = per.descriptionOfArea();
        per.setP(s1);

        per.writeOfArea();


        double c_area1 = per.descriptionOfCircle();
        per.setCir(c_area1);

        per.writeOfCircle();


    }
}