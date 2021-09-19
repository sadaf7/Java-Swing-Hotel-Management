package hotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class HotelManagement {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtFriedRice;
	private JTextField txtChickenFry;
	private JTextField txtBurger;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
	private JComboBox btnChooseRoom;
	private JTextField txtTotalCostOfMeal;
	private JTextField txtTotalCostOfDrink;
	private JTextField txtTotalCostOfDelivery;
	private JTextField txtTotalCostOfRoom;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	
	double firstNum;
	double secondNum;
	double result;
	String ans;
	String operations;
	
	double nigerianNaira=360.00;
	double kenyanShilling=101.00;
	double chineseYuan=6.29;
	double indianRupee=65.02;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelManagement window = new HotelManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setForeground(Color.GRAY);
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(10, 39, 382, 638);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 362, 616);
		panel.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(27, 11, 306, 60);
		panel_3.add(txtDisplay);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
					String Backspace=null;
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					Backspace=strB.toString();
					txtDisplay.setText(Backspace);
				}
			}
		});
		btnBackSpace.setHorizontalAlignment(SwingConstants.RIGHT);
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD | Font.ITALIC, 18));
		btnBackSpace.setBounds(27, 82, 70, 70);
		panel_3.add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn7.setBounds(27, 163, 70, 70);
		panel_3.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn4.setBounds(27, 244, 70, 70);
		panel_3.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn1.setBounds(27, 325, 70, 70);
		panel_3.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn0.setBounds(27, 411, 70, 70);
		panel_3.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnDot.setBounds(107, 411, 70, 70);
		panel_3.add(btnDot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn2.setBounds(107, 325, 70, 70);
		panel_3.add(btn2);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				
				 secondNum=Double.parseDouble(txtDisplay.getText());
				if(operations=="+") {
					double result=firstNum+secondNum;
					ans=String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if(operations=="-") {
					result=firstNum-secondNum;
					ans=String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if(operations=="X") {
					result=firstNum*secondNum;
					ans=String.format("%.2f",result);
					txtDisplay.setText(ans);
				}
				else if(operations=="/") {
					result=firstNum/secondNum;
					ans=String.format("%.2f", result);
					txtDisplay.setText(ans);
				}
				else if(operations=="%") {
					result=firstNum%secondNum;
					ans=String.format("%.2f",result);
					txtDisplay.setText(ans);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnEquals.setBounds(187, 411, 70, 70);
		panel_3.add(btnEquals);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn3.setBounds(187, 325, 70, 70);
		panel_3.add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
			     operations="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnDivide.setBounds(267, 325, 70, 70);
		panel_3.add(btnDivide);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusMinus=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusMinus = plusMinus*(-1);
				txtDisplay.setText(String.valueOf(plusMinus));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnPM.setBounds(263, 411, 70, 70);
		panel_3.add(btnPM);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
			     operations="X";
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnX.setBounds(263, 244, 70, 70);
		panel_3.add(btnX);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn6.setBounds(187, 244, 70, 70);
		panel_3.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterValue=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn5.setBounds(107, 244, 70, 70);
		panel_3.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn8.setBounds(107, 163, 70, 70);
		panel_3.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btn9.setBounds(187, 163, 70, 70);
		panel_3.add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
			     operations="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnMinus.setBounds(263, 163, 70, 70);
		panel_3.add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				 operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnPlus.setBounds(263, 82, 70, 70);
		panel_3.add(btnPlus);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				 txtDisplay.setText("");
				 operations="%";
			}
		});
		btnModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnModulo.setBounds(187, 82, 70, 70);
		panel_3.add(btnModulo);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnClear.setBounds(107, 82, 70, 70);
		panel_3.add(btnClear);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Reciept", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea RecieptArea = new JTextArea();
		RecieptArea.setBounds(0, 11, 357, 581);
		panel_4.add(RecieptArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setBounds(418, 126, 850, 270);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.ORANGE);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblMenu.setBounds(21, 14, 65, 22);
		panel_1.add(lblMenu);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setForeground(Color.ORANGE);
		lblQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblQty.setBounds(156, 11, 65, 22);
		panel_1.add(lblQty);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.ORANGE);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPrice.setBounds(277, 14, 65, 22);
		panel_1.add(lblPrice);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFriedRice.setBounds(21, 44, 93, 22);
		panel_1.add(btnFriedRice);
		
		JLabel btnChickenFry = new JLabel("Chicken Fry");
		btnChickenFry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChickenFry.setBounds(21, 77, 93, 22);
		panel_1.add(btnChickenFry);
		
		JLabel btnBurger = new JLabel("Burger");
		btnBurger.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBurger.setBounds(21, 110, 76, 22);
		panel_1.add(btnBurger);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtFriedRice.setBounds(156, 44, 76, 22);
		panel_1.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtChickenFry = new JTextField();
		txtChickenFry.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChickenFry.setColumns(10);
		txtChickenFry.setBounds(156, 77, 76, 22);
		panel_1.add(txtChickenFry);
		
		txtBurger = new JTextField();
		txtBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBurger.setColumns(10);
		txtBurger.setBounds(156, 110, 76, 22);
		panel_1.add(txtBurger);
		
		JLabel label = new JLabel("5.505");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(277, 44, 65, 22);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("3.304");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(277, 77, 93, 22);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("16.504");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(277, 110, 93, 22);
		panel_1.add(label_2);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a Drink", "CocaCola", "SevenUP", "Sprite"}));
		btnChooseDrink.setBounds(21, 143, 125, 20);
		panel_1.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChooseDrink.setColumns(10);
		txtChooseDrink.setBounds(156, 143, 76, 22);
		panel_1.add(txtChooseDrink);
		
		JLabel label_3 = new JLabel("_");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(287, 129, 18, 22);
		panel_1.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(380, 147, 76, -123);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(390, 14, 2, 232);
		panel_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(21, 174, 327, 7);
		panel_1.add(separator_4);
		
		btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose Room", "Room 101", "Room 202", "VIP"}));
		btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChooseRoom.setBounds(21, 180, 125, 20);
		panel_1.add(btnChooseRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDelivery.setBounds(17, 202, 97, 23);
		panel_1.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTax.setBounds(17, 220, 97, 23);
		panel_1.add(btnTax);
		
		
		
		
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.ORANGE);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCurrencyConverter.setBounds(437, 9, 259, 41);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Choose Country", "Nigeria", "Kenya", "India", "China"}));
		btnSelectCountry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSelectCountry.setBounds(447, 55, 171, 23);
		panel_1.add(btnSelectCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(447, 89, 171, 30);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCurrencyOutput.setBounds(449, 143, 171, 24);
		panel_1.add(txtCurrencyOutput);
		
		/*double nigerianNaira=360.00;
	      double kenyanShilling=101.00;
	      double chineseYuan=6.29;
	      double indianRupee=65.02;*/
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USADollar=Double.parseDouble(txtEnterCurrency.getText());
				if(btnSelectCountry.getSelectedItem().equals("Nigeria")) {
					double naira=USADollar*nigerianNaira;
					String pNaira=String.format("N %.2f",naira);
					txtCurrencyOutput.setText(pNaira);
				}
				if(btnSelectCountry.getSelectedItem().equals("Kenya")) {
					double shilling=USADollar*kenyanShilling;
					String pShilling=String.format("KS %.2f", shilling);
					txtCurrencyOutput.setText(pShilling);
				}
				if(btnSelectCountry.getSelectedItem().equals("India")) {
					double rupee=USADollar*indianRupee;
					String pRupee=String.format("INR %.2f",rupee);
					txtCurrencyOutput.setText(pRupee);
				}
				if(btnSelectCountry.getSelectedItem().equals("China")) {
					double yuan=USADollar*chineseYuan;
					String pYuan=String.format("CY %.2f", yuan);
					txtCurrencyOutput.setText(pYuan);
				}
				
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConvert.setBounds(457, 187, 93, 23);
		panel_1.add(btnConvert);
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnSelectCountry.setSelectedItem("Choose Country");
			}
		});
		btnReset2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset2.setBounds(549, 187, 76, 23);
		panel_1.add(btnReset2);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 52));
		lblNewLabel.setBounds(483, 50, 803, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1354, 33);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("SansSerif", Font.PLAIN, 20));
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnFile.add(mnNew);
		
		JMenuItem mntmReciept = new JMenuItem("Reciept");
		mntmReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double invoice1=Double.parseDouble(txtFriedRice.getText());
				Double invoice2=Double.parseDouble(txtChickenFry.getText());
				Double invoice3=Double.parseDouble(txtBurger.getText());
				Double invoice4=Double.parseDouble(txtChooseDrink.getText());
				//Double invoice5=Double.parseDouble(txtTotal.getText());
				
				RecieptArea.append("\t\n Hotel Management System: \n"
						+"\n Fried Rice: \t\t"+invoice1
						+"\n Chicken Fry: \t\t"+invoice2
						+"\n Burger: \t\t"+invoice3
						+"\n"+btnChooseDrink.getSelectedItem()+": \t\t"+invoice4
						+"\nTotal: \t\t" + txtTotal.getText()
						+"\n\n Thank You"
						);
				               
				
			}
		});
		mntmReciept.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNew.add(mntmReciept);
		
		
		
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USADollar=Double.parseDouble(txtEnterCurrency.getText());
				if(btnSelectCountry.getSelectedItem().equals("Nigeria")) {
					double naira=USADollar*nigerianNaira;
					String pNaira=String.format("N %.2f",naira);
					txtCurrencyOutput.setText(pNaira);
				}
				if(btnSelectCountry.getSelectedItem().equals("Kenya")) {
					double shilling=USADollar*kenyanShilling;
					String pShilling=String.format("KS %.2f", shilling);
					txtCurrencyOutput.setText(pShilling);
				}
				if(btnSelectCountry.getSelectedItem().equals("India")) {
					double rupee=USADollar*indianRupee;
					String pRupee=String.format("INR %.2f",rupee);
					txtCurrencyOutput.setText(pRupee);
				}
				if(btnSelectCountry.getSelectedItem().equals("China")) {
					double yuan=USADollar*chineseYuan;
					String pYuan=String.format("CY %.2f", yuan);
					txtCurrencyOutput.setText(pYuan);
				}
			}
		});
		mntmConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmConvert);
		
		JMenuItem mntmTotal = new JMenuItem("Total");
		mntmTotal.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnFile.add(mntmTotal);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null); 
				txtChickenFry.setText(null);
				txtBurger.setText(null); 
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null); 
				 txtTotalCostOfDrink.setText(null); 
				 txtTotalCostOfDelivery.setText(null); 
				 txtTotalCostOfRoom.setText(null); 
				 txtTax.setText(null); 
				 txtSubTotal.setText(null); 
				 txtTotal.setText(null);
				 txtEnterCurrency.setText(null); 
				 txtCurrencyOutput.setText(null); 
				 txtDisplay.setText(null); 
				 btnChooseDrink.setSelectedItem("Choose a drink"); 
				 btnChooseRoom.setSelectedItem("Choose a room"); 
				 btnSelectCountry.setSelectedItem("Country"); 
				 RecieptArea.setText(null);
				}
		});
		mntmRefresh.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnFile.add(mntmRefresh);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnFile.add(mntmExit);
		
		JMenu mnConvert = new JMenu("Convert");
		mnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USADollar=Double.parseDouble(txtEnterCurrency.getText());
				if(btnSelectCountry.getSelectedItem().equals("Nigeria")) {
					double naira=USADollar*nigerianNaira;
					String pNaira=String.format("N %.2f",naira);
					txtCurrencyOutput.setText(pNaira);
				}
				if(btnSelectCountry.getSelectedItem().equals("Kenya")) {
					double shilling=USADollar*kenyanShilling;
					String pShilling=String.format("KS %.2f", shilling);
					txtCurrencyOutput.setText(pShilling);
				}
				if(btnSelectCountry.getSelectedItem().equals("India")) {
					double rupee=USADollar*indianRupee;
					String pRupee=String.format("INR %.2f",rupee);
					txtCurrencyOutput.setText(pRupee);
				}
				if(btnSelectCountry.getSelectedItem().equals("China")) {
					double yuan=USADollar*chineseYuan;
					String pYuan=String.format("CY %.2f", yuan);
					txtCurrencyOutput.setText(pYuan);
				}
			}
		});
		mnConvert.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnConvert);
		
		JMenu mnTotal = new JMenu("Total");
		mnTotal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnTotal);
		
		JMenu mnReset = new JMenu("Reset");
		mnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMenuItem mntmRefresh = new JMenuItem("Refresh");
				mntmRefresh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtFriedRice.setText(null); 
						txtChickenFry.setText(null);
						txtBurger.setText(null); 
						txtChooseDrink.setText(null);
						txtTotalCostOfMeal.setText(null); 
						 txtTotalCostOfDrink.setText(null); 
						 txtTotalCostOfDelivery.setText(null); 
						 txtTotalCostOfRoom.setText(null); 
						 txtTax.setText(null); 
						 txtSubTotal.setText(null); 
						 txtTotal.setText(null);
						 txtEnterCurrency.setText(null); 
						 txtCurrencyOutput.setText(null); 
						 txtDisplay.setText(null); 
						 btnChooseDrink.setSelectedItem("Choose a drink"); 
						 btnChooseRoom.setSelectedItem("Choose a room"); 
						 btnSelectCountry.setSelectedItem("Country"); 
						 RecieptArea.setText(null);
						}
				});
				mntmRefresh.setFont(new Font("Segoe UI", Font.BOLD, 15));
				mnFile.add(mntmRefresh);
			}
		});
		mnReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReset);
		
		JMenu mnReciept = new JMenu("Reciept");
		mnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double invoice1=Double.parseDouble(txtFriedRice.getText());
				Double invoice2=Double.parseDouble(txtChickenFry.getText());
				Double invoice3=Double.parseDouble(txtBurger.getText());
				Double invoice4=Double.parseDouble(txtChooseDrink.getText());
				//Double invoice5=Double.parseDouble(txtTotal.getText());
				
				RecieptArea.append("\t\n Hotel Management System: \n"
						+"\n Fried Rice: \t\t"+invoice1
						+"\n Chicken Fry: \t\t"+invoice2
						+"\n Burger: \t\t"+invoice3
						+"\n"+btnChooseDrink.getSelectedItem()+": \t\t"+invoice4
						+"\nTotal: \t" 
						+ txtTotal.getText()
						+"\n\n Thank You"
						);
			}
		});
		mnReciept.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnReciept);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.setForeground(Color.RED);
		mnExit.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_2.setBounds(418, 407, 850, 270);
		frame.getContentPane().add(panel_2);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost of Meal");
		btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotalCostOfMeal.setBounds(29, 48, 166, 31);
		panel_2.add(btnTotalCostOfMeal);
		
		JLabel btnTotalCostOfDrink = new JLabel("Total Cost of Drink");
		btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotalCostOfDrink.setBounds(29, 96, 166, 31);
		panel_2.add(btnTotalCostOfDrink);
		
		JLabel btnCostOfDelivery = new JLabel("Cost of Delivery");
		btnCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCostOfDelivery.setBounds(29, 142, 166, 31);
		panel_2.add(btnCostOfDelivery);
		
		JLabel btnCostOfRoom = new JLabel("Cost of Room");
		btnCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCostOfRoom.setBounds(29, 184, 166, 31);
		panel_2.add(btnCostOfRoom);
		
		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfMeal.setBounds(200, 48, 171, 24);
		panel_2.add(txtTotalCostOfMeal);
		
		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfDrink.setBounds(201, 96, 171, 24);
		panel_2.add(txtTotalCostOfDrink);
		
		JLabel txtTotalCostOfDelivery = new JLabel("");
		txtTotalCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfDelivery.setBounds(200, 141, 171, 24);
		panel_2.add(txtTotalCostOfDelivery);
		
		JLabel txtTotalCostOfRoom = new JLabel("");
		txtTotalCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfRoom.setBounds(201, 184, 171, 24);
		panel_2.add(txtTotalCostOfRoom);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(392, 27, 2, 212);
		panel_2.add(separator_5);
		
		JLabel btntax1 = new JLabel("Tax");
		btntax1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntax1.setBounds(404, 78, 47, 31);
		panel_2.add(btntax1);
		
		JLabel btnSubTotal = new JLabel("Sub-Total");
		btnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubTotal.setBounds(403, 134, 85, 31);
		panel_2.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotal.setBounds(408, 184, 67, 31);
		panel_2.add(btnTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTax.setBounds(498, 78, 133, 31);
		panel_2.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtSubTotal.setBounds(498, 134, 133, 31);
		panel_2.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotal.setBounds(498, 184, 133, 31);
		panel_2.add(txtTotal);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				////////Drink////////
				double drink=Double.parseDouble(txtChooseDrink.getText());
				double CocaCola=0.578*drink;
				double SevenUP=0.234*drink;
				double Sprite=0.456*drink;
				
				if(btnChooseDrink.getSelectedItem().equals("CocaCola")) {
					String pCocaCola=String.format("%.3f",CocaCola);
					txtTotalCostOfDrink.setText(pCocaCola);
				}
				if(btnChooseDrink.getSelectedItem().equals("SevenUP")) {
					String pSevenUP=String.format("%.3f",SevenUP);
					txtTotalCostOfDrink.setText(pSevenUP);
				}
				if(btnChooseDrink.getSelectedItem().equals("Sprite")) {
					String pSprite=String.format("%.3f",Sprite);
					txtTotalCostOfDrink.setText(pSprite);
				}
				if(btnChooseDrink.getSelectedItem().equals("Choose a Drink")) {
					txtTotalCostOfDrink.setText("0.000");
				}
				
				
				//////////Meal///////////
				
				double friedRice=Double.parseDouble(txtFriedRice.getText());
				double pFriedRice = 5.505;
				double getFriedRice = friedRice*pFriedRice;
				String totalFriedRice=String.format("%.3f",getFriedRice);
				txtTotalCostOfMeal.setText(totalFriedRice);
				
				double chickenFry=Double.parseDouble(txtChickenFry.getText());
				double pChickenFry=3.304;
				double getChickenFry=chickenFry*pChickenFry;
				String totalChickenFry=String.format("%.3f",getChickenFry+getFriedRice);
				txtTotalCostOfMeal.setText(totalChickenFry);
				
				double burger=Double.parseDouble(txtBurger.getText());
				double pBurger=16.504;
				double getBurger=burger*pBurger;
				String totalBurger=String.format("%.3f",getBurger+getFriedRice+getChickenFry);
				txtTotalCostOfMeal.setText(totalBurger);
				
				/////Delivery////////
				double cDelivery=4.50;
				if(btnDelivery.isSelected()) {
					String pDelivery=String.format("%.3f",cDelivery);
					txtTotalCostOfDelivery.setText(pDelivery);
				}
				else {
					txtTotalCostOfDelivery.setText("0.00");
				}
				/////////Tax////////
				double pTotal1=Double.parseDouble(txtTotalCostOfMeal.getText());
				double pTotal2=Double.parseDouble(txtTotalCostOfDrink.getText());
				double pTotal3=Double.parseDouble(txtTotalCostOfDelivery.getText());
				double cTotal=(pTotal1+pTotal2+pTotal3)/100;
				
				if(btnTax.isSelected()) {
					String xTotal=String.format("%.3f",cTotal);
					txtTax.setText(xTotal);
				}
				/////Total////
				double pTotal4=Double.parseDouble(txtTax.getText());
				String zTaxTotal=String.format("$%.3f",pTotal4);
				txtTax.setText(zTaxTotal);
				
				double subTotal=(pTotal1+pTotal2+pTotal3);
				String pSubTotal=String.format("$%.3f", subTotal);
				txtSubTotal.setText(pSubTotal);
				
				double xTotal=(pTotal1+pTotal2+pTotal3+pTotal4);
				String yTotal=String.format("$%.3f",xTotal);
				txtTotal.setText(yTotal);
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.setBounds(200, 201, 79, 23);
		panel_1.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFriedRice.setText(null); 
				txtChickenFry.setText(null);
				txtBurger.setText(null); 
				txtChooseDrink.setText(null);
				txtTotalCostOfMeal.setText(null); 
				 txtTotalCostOfDrink.setText(null); 
				 txtTotalCostOfDelivery.setText(null); 
				 txtTotalCostOfRoom.setText(null); 
				 txtTax.setText(null); 
				 txtSubTotal.setText(null); 
				 txtTotal.setText(null);
				 txtEnterCurrency.setText(null); 
				 txtCurrencyOutput.setText(null); 
				 txtDisplay.setText(null); 
				 btnChooseDrink.setSelectedItem("Choose a drink"); 
				 btnChooseRoom.setSelectedItem("Choose a room"); 
				 btnSelectCountry.setSelectedItem("Country"); 
				 RecieptArea.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(279, 201, 79, 23);
		panel_1.add(btnReset);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null); 
				txtChickenFry.setText(null);
				txtBurger.setText(null); 
				txtChooseDrink.setText(null);
				 txtTotalCostOfMeal.setText(null); 
				 txtTotalCostOfDrink.setText(null); 
				 txtTotalCostOfDelivery.setText(null); 
				 txtTotalCostOfRoom.setText(null); 
				 txtTax.setText(null); 
				 txtSubTotal.setText(null); 
				 txtTotal.setText(null);
				 txtEnterCurrency.setText(null); 
				 txtCurrencyOutput.setText(null); 
				 txtDisplay.setText(null); 
				 btnChooseDrink.setSelectedItem("Choose a drink"); 
				 btnChooseRoom.setSelectedItem("Choose a room"); 
				 btnSelectCountry.setSelectedItem("Country"); 
				 RecieptArea.setText(null);
			}
		});
		mntmReset.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNew.add(mntmReset);
	}
}
