package Three.threeTwo.ClassWork;

import Three.threeTwo.ClassWork.entity.Figure;
import Three.threeTwo.ClassWork.entity.Square;

public class Main {

    public static void main(String[] args) {
        printAll(getFigures());
    }

    private static void printAll(Figure[] figures){

        for (Figure figure:figures) {
            System.out.printf("Тип фигуры: "+figure.getClass().getSimpleName()+
                    "\nЦвет фигуры: "+figure.getColor()+
                    "\nПериметр фигуры: "+figure.getPerimeter()+
                    "\nПлощадь фигуры: %2f\n\n\n",figure.getArea());
        }
    }

    private static Figure[] getFigures(){
        Figure[] figures=new Figure[]{
                new Square("black",5.9f),
                new Square("red",4.2f),
                new Square("yellow",7.5f)};
        return figures;
    }
}
