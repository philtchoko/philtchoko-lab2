import java.util.Random;

public class Thing {
    public Random rand = new Random(System.currentTimeMillis());

    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;
      
    public void rightTurn() {
        dir = (dir + 1) % 4;
      }
    
      public void leftTurn() {
        dir = (dir + 3) % 4;
      }
    
      public void maybeTurn() {
        int i = rand.nextInt(3);
    
        if (isTypeB) {
           timeSinceLast++;
    
          if (timeSinceLast == 10) {
             timeSinceLast = 0;
    
            if (i == 1) {
              rightTurn();
            }
    
            if (i == 2) {
              leftTurn();
            }
          }
        } else   {
          if (i == 1) {
            rightTurn();
          }
    
          if (i == 2) {
            leftTurn();
          }
        }
      }
    
      public void step() {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
         row += dr[dir];
         col += dc[dir];
      }    


      public String tothingString(){
        String output = row + " " + col + " " + lab;
        return output;
          

      }


    
}