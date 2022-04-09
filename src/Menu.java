import java.util.Scanner;

public class Menu {

    Scanner userInput = new Scanner(System.in);
    int selectedShape,shapeSize;

    DrawShape drawShape = new DrawShape();  
    
    private void buildMenu(){
        System.out.println("Choose the shape you want to me to draw:");
        System.out.println("1 - Square");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Angled Square");
        System.out.println("4 - Triangle");
        System.out.println("99 - Exit");
        System.out.print("");
        
    }

    public void showGreetings(){
        System.out.println("========================");
        System.out.println("Welcome to Java Drawings");
        System.out.println("========================");
        System.out.println("");
    }

    private void endProgram(){
        System.out.println("========================");
        System.out.println("End of Program");
        System.out.println("========================");
    }

    private void getUserInput(){
        System.out.print("Type:");
        selectedShape = userInput.nextInt();
        if(selectedShape != 99){
            System.out.print("Type the size:");
            shapeSize = userInput.nextInt();
        }
    }

    public void startProgram(){
        buildMenu();
        getUserInput();
        evaluateUserInput();
    }

    private void evaluateUserInput(){
        switch(selectedShape){
            case 1:
            drawShape.drawSquare(shapeSize);
            startProgram();
            break;
            case 2:
            drawShape.drawRetangle(shapeSize);
            startProgram();
            break;
            case 3:
            drawShape.drawAngledSquare(shapeSize);
            startProgram();
            break;
            case 4:
            drawShape.drawTriangle(shapeSize);
            startProgram();
            break;
            case 99:
            endProgram();
            break;
            default:
            endProgram();
        }
    }

}
