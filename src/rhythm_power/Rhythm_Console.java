package rhythm_power;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.player.Player;



public class Rhythm_Console extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Label lbl=new Label("RHYTHM POWER CONSOLE", Label.CENTER);
	TextField tf=new TextField();

	public Rhythm_Console() {

		lbl.setText("RHYTHM POWER CONSOLE");
		setTitle("Console");
		setSize(300, 200);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		add(lbl,BorderLayout.CENTER);
		lbl.setBackground(new Color(119, 220, 107));
		add(tf,BorderLayout.SOUTH);
		tf.addKeyListener(new KeyHandler());
		tf.setBackground(new Color(184, 237, 177));
		setVisible(true);
	}

	public class KeyHandler extends KeyAdapter {



		@Override
		public void keyPressed(KeyEvent e) {

			try {
				FileInputStream fisGood=new FileInputStream("C:\\Users\\FrankRosii\\Desktop\\Developing\\ITWill\\class\\Java£¯struts£¯struts2£¯spring2.5\\JavaText\\goodsound.mp3");
				Player playGood=new Player(fisGood);
				FileInputStream fisBad=new FileInputStream("C:\\Users\\FrankRosii\\Desktop\\Developing\\ITWill\\class\\Java£¯struts£¯struts2£¯spring2.5\\JavaText\\badsound.mp3");
				Player playBad=new Player(fisBad);


				Object ob=e.getSource();
				if(e.getKeyCode()!=KeyEvent.VK_S&&
						e.getKeyCode()!=KeyEvent.VK_D&&
						e.getKeyCode()!=KeyEvent.VK_K&&
						e.getKeyCode()!=KeyEvent.VK_L&&
						e.getKeyCode()!=KeyEvent.VK_SPACE&&
						e.getKeyCode()!=KeyEvent.VK_Q) {
					lbl.setText("Wrong Key");
					tf.setText(" ");
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_S) {
					if(Rhythm_Cell.cellS.get(29).equals("¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ")) {
						Rhythm_Frame_Thread.score++;
						lbl.setText("GOOD!");
						Rhythm_Frame_Thread.good++;
						Rhythm_Cell.cellS.set(29, "¡¡¡¡¡¡¡¡¡¡¡¡");
						playGood.play();
					}else if(Rhythm_Cell.cellS.get(29).equals("¡¡¡¡¡¡¡¡¡¡¡¡")) {
						Rhythm_Frame_Thread.score--;
						Rhythm_Frame_Thread.bad++;
						lbl.setText("BAD!");
						playBad.play();
					}
					tf.setText(" ");
					tf.requestFocus();
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_D) {
					if(Rhythm_Cell.cellD.get(29).equals("¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ")) {
						Rhythm_Frame_Thread.score++;
						lbl.setText("GOOD!");
						Rhythm_Frame_Thread.good++;
						Rhythm_Cell.cellD.set(29, "¡¡¡¡¡¡¡¡¡¡¡¡");
						playGood.play();
					}else if(Rhythm_Cell.cellD.get(29).equals("¡¡¡¡¡¡¡¡¡¡¡¡")) {
						Rhythm_Frame_Thread.score--;
						Rhythm_Frame_Thread.bad++;
						lbl.setText("BAD!");
						playBad.play();
						
					}
					tf.setText(" ");
					tf.requestFocus();
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					if(Rhythm_Cell.cellSP.get(29).equals("¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ")) {
						Rhythm_Frame_Thread.score++;
						lbl.setText("GOOD!");
						Rhythm_Frame_Thread.good++;
						Rhythm_Cell.cellSP.set(29, "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
						playGood.play();
					}else if(Rhythm_Cell.cellSP.get(29).equals("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡")) {
						Rhythm_Frame_Thread.score--;
						Rhythm_Frame_Thread.bad++;
						lbl.setText("BAD!");
						playBad.play();
					}
					tf.setText(" ");
					tf.requestFocus();
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_K) {
					if(Rhythm_Cell.cellK.get(29).equals("¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ")) {
						Rhythm_Frame_Thread.score++;
						lbl.setText("GOOD!");
						Rhythm_Frame_Thread.good++;
						Rhythm_Cell.cellK.set(29, "¡¡¡¡¡¡¡¡¡¡¡¡");
						playGood.play();
					}else if(Rhythm_Cell.cellK.get(29).equals("¡¡¡¡¡¡¡¡¡¡¡¡")) {
						Rhythm_Frame_Thread.score--;
						Rhythm_Frame_Thread.bad++;
						lbl.setText("BAD!");
						playBad.play();
					}
					tf.setText(" ");
					tf.requestFocus();
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_L) {
					if(Rhythm_Cell.cellL.get(29).equals("¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ")) {
						Rhythm_Frame_Thread.score++;
						lbl.setText("GOOD!");
						Rhythm_Frame_Thread.good++;
						Rhythm_Cell.cellL.set(29, "¡¡¡¡¡¡¡¡¡¡¡¡");
						playGood.play();
					}else if(Rhythm_Cell.cellL.get(29).equals("¡¡¡¡¡¡¡¡¡¡¡¡")) {
						Rhythm_Frame_Thread.score--;
						lbl.setText("BAD!");
						Rhythm_Frame_Thread.bad++;
						playBad.play();
					}
					tf.setText(" ");
					tf.requestFocus();
					return;
				}else if(e.getKeyCode()==KeyEvent.VK_Q) {
					setVisible(false);
					Rhythm_Music.play.close();
					Rhythm_Music.flag=true;
				}

			} catch (Exception e1) {
				System.out.println(e1.toString());
			}

		}


	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
	}
}
