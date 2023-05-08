import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1 - Параллелепипед, 2 - ЦилиндрВыберите фигуру: 1 - Параллелепипед, 2 - Цилиндр");
        int a= scanner.nextInt();
        try {
            if (a == 1) {
                System.out.println("Введите длину, ширину и высоту параллелепипеда:");

                double width = scanner.nextDouble();
                double lenght = scanner.nextDouble();
                double height = scanner.nextDouble();
                if (lenght <= 0 || width <= 0 || height <= 0) {
                    throw new Exception("Недопустимые размеры. Длина, ширина и высота должны быть положительными");
                }
                Parallelepeped parallelepeped = new Parallelepeped(width, lenght, height);
                System.out.println("Area: " + parallelepeped.getArea());
                System.out.println("Volume" + parallelepeped.getVolume());
            } else if (a == 2) {
                System.out.println("Введите радиус и высоту цилиндра:");
                double height = scanner.nextDouble();
                double radius = scanner.nextDouble();
                if (height <= 0 || radius <= 0) {
                    throw new Exception("Недопустимые размеры. Радиус и высота должны быть положительными");
                }
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Area" + cylinder.getArea());
                System.out.println("volume" + cylinder.getVolume());
            } else {
                throw new Exception("Неверный выбор. Пожалуйста, выберите 1 или 2.");

            }
        }catch (Exception e){
            System.out.println("Erpor"+e.getMessage());
        }
            }
    }
