import javax.swing.JFrame;


public class MainFrame extends JFrame{


	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // при нажатии крестика программа закрывается, а не остается в потоке
		setVisible(true);   // окно видимое
		setLocationRelativeTo(null);   // середина. окно располагается относительно чего-то
		setSize(800, 600);   // размер окна
		
	}
}
