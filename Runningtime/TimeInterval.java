import java.util.*;

public class TimeInterval {
   private long startTime, endTime;
   private long elapsedTime; // Time Interval in milliseconds

   public void startTiming() {
      elapsedTime = 0;
      startTime = System.currentTimeMillis();
   }

   public void endTiming() {
      endTime = System.currentTimeMillis();
      elapsedTime = endTime - startTime;
   }

   public double getElapsedTime() {
      return  (double)elapsedTime; // Use ms to give a better result.
   }

}