
package distance_time_calculator;


public class NewClass {
    public static void main(String[] args) {
           java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DistanceSpeedTimeCalculator().setVisible(true);
            }
        });
    }
}
