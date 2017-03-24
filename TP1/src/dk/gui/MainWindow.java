package dk.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {
	
	private GUI gui;
	private JFrame mainFrame;
	private JButton btnPlayDK, btnPlayCustom, btnDev;
	private GUI.Window buttonClicked;
	
	public MainWindow(GUI gui){
		this.gui = gui;
		init();
	}
	
	public void setGUI(GUI gui){
		this.gui = gui;
	}
	
	public boolean isEnabled(){
		return mainFrame.isVisible();
	}
	
	public GUI.Window getButtonClicked(){
		return buttonClicked;
	}
	
	public void enable(){
		mainFrame.setVisible(true);
	}
	
	public void disable(){
		mainFrame.setVisible(false);
		gui.run(buttonClicked);
	}
	
	private void initFrame(){
		mainFrame = new JFrame();
		mainFrame.setBounds(0, 0, 1000, 700);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initButtons(){
		initPlayDefaultButton();
		initPlayCustomButton();
		initDevButton();
	}
	
	private void initDevButton() {
		btnDev = new JButton("Develop a new Level");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = GUI.Window.Developer;
				disable();
			}
		});
		btnDev.setBounds(0, 100, 100, 25);		
	}

	private void initPlayCustomButton() {
		btnPlayCustom = new JButton("Play Custom Levels");
		btnPlayCustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = GUI.Window.PlayCustom;
				disable();
			}
		});
		btnPlayCustom.setBounds(0, 50, 100, 25);		
	}

	private void initPlayDefaultButton() {
		btnPlayDK = new JButton("Play Dungeon Keep");
		btnPlayDK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = GUI.Window.PlayDefault;
				disable();
			}
		});
		btnPlayDK.setBounds(0, 0, 100, 25);		
	}

	private void init(){		
		//TODO SETBOUNDS
		initFrame();
		initButtons();
		addToFrame();	
	}

	private void addToFrame() {
		mainFrame.setResizable(false);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.getContentPane().add(btnDev);	
		mainFrame.getContentPane().add(btnPlayCustom);	
		mainFrame.getContentPane().add(btnPlayDK);		
	}
}
