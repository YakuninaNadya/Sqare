//class Perimeter extends Sqare{
    //public int perimeter;

    //public int a, b, c, d;
    //public double area;

    //int perimeter = (a + b + c + d);

    //public void show (){
      //  System.out.println("Периметр четырехугольника равен " + perimeter);
  //  }
//
    //public static void  main (String [] args) {
    //public void perimeter(){
        //System.out.println("Введите стороны четырехугольника:");

        //Scanner input = new Scanner(System.in);

        //int a = 0, b = 0,  c = 0, d = 0;
        //int area;
        //System.out.println("Введите сторону A:");
        //int a = input.nextInt();
        //System.out.println("Введите сторону B:");
        //int b = input.nextInt();
        //System.out.println("Введите сторону C:");
        //int c = input.nextInt();
        //System.out.println("Введите сторону D:");
        //int d = input.nextInt();



        //System.out.println("Периметр четырехугольника равен " + perimeter);

        /*double pper = perimeter / 2;
        double area = Math.sqrt((pper - a) + (pper - b) + (pper - c) + (pper - d));
        System.out.println("Площадь четырехугольника равна " + area);



        if (a+c == b+d || a+b == c+d || a+d == c+b){

            double circle_area = Math.PI * (Math.pow((area/pper),2));
            System.out.println("Площадь вписанной окружности " + circle_area);

        } else {
            System.out.println("Не удается найти площадь окружности");
        }*/
  // }

public class Perimeter {

    protected int a = 0;
    protected int b = 0;
    protected int c = 0;
    protected int d = 0;
    protected double p;
    protected double pper;
    protected double s;
    protected double c_area;


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }


    public double descriptionOfPerimeter() {
        p = (a + b + c + d);
        return p;
    }

    public void setP(double p) {
        this.p = p;

    }


    public double descriptionOfArea() {
        pper = p/2;
        s = Math.sqrt((pper - a) * (pper - b) * (pper - c) * (pper - d));
        return s;
    }

    public void setS(double s) {
        this.s = s;

    }

    public void writeOfPerimeter() {

        System.out.println("Периметр четырехугольника равен " + p);
    }


    public void writeOfArea(){

       System.out.println("Площадь четырехугольника равна " + s);
    }


    public double descriptionOfCircle() {

        c_area = Math.PI * Math.pow(s / pper , 2);
        return c_area;

    }

    public void setCir(double c_area) {
        this.c_area = c_area;

    }

    public void writeOfCircle() {

        if (a + c == b + d || a + b == c + d || a + d == c + b) { // вычисляем вписанную окружность


            System.out.println("Площадь вписанной окружности " + c_area);

        } else {
            System.out.println("Не удается найти площадь окружности");
        }
    }
}







