package systemEvaluation;
import java.awt.EventQueue;

public class MainClass {
	public static void main(String[] args) {
;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
