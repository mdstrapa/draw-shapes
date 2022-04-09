public class DrawShape {
    public void drawSquare(int squareSize){
        String canvasLine = "";
        String canvas = " " + Character.toString(183) + " ";
        for(int c =0;c < squareSize + 2;c++){
            canvasLine = canvasLine + canvas;
        }

        String line = "";
        for(int c =0;c < squareSize;c++){
            line = line + " 0 ";
            
        }

        System.out.println(canvasLine);

        for(int l=0;l < squareSize;l++){
            writeLine(canvas + line + canvas);
        }

        System.out.println(canvasLine);
    }

    public void drawRetangle(int size){

        double width = size + Math.floor(size * 1.5);;
        int height =  size;
        String canvasLine = "";
        String canvas = " " + Character.toString(183) + " ";
        for(int c =0;c < width + 2;c++){
            canvasLine = canvasLine + canvas;
        }

        String line = "";
        for(int c =0;c < width;c++){
            line = line + " 0 ";
            
        }

        System.out.println(canvasLine);

        for(int l=0;l < height;l++){
            writeLine(canvas + line + canvas);
        }

        System.out.println(canvasLine);
    }

    public void drawAngledSquare(int squareSize){

        if((squareSize % 2)==0)squareSize++;
        
        String canvas = " " + Character.toString(183) + " ";
        String ch = " 0 ";
        String newCh = "";
        String line = "";
        double squareCenter = Math.floor(squareSize / 2);

        for(int l=0;l < squareSize;l++){
            for(int c =0;c < squareSize;c++){
                if(l <= squareCenter) newCh = (c >= (squareCenter - l) && c <= (squareCenter + l)) ? ch : canvas;
                else newCh = (c >= (l- squareCenter) && c <= ((squareSize - 1) - l + squareCenter)) ? ch : canvas;
                line = line + newCh;
            }

            writeLine(line);
            line = "";
        }
    }

    public void drawTriangle(int triagleSize){
        if((triagleSize % 2)==0)triagleSize++;

        String canvas = " " + Character.toString(183) + " ";
        String ch = " 0 ";
        String newCh = "";
        String line = "";
        double triangleCenter = Math.floor(triagleSize / 2);

        for(int l=0;l < (triagleSize / 2) + 1;l++){
            for(int c =0;c < triagleSize;c++){
                newCh = (c >= (triangleCenter - l) && c <= (triangleCenter + l)) ? ch : canvas;
                line = line + newCh;
            }

            writeLine(line);
            line = "";
        }
    }

    private void writeLine(String line){
        System.out.println(line);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
