package com.zhadan.Frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import com.zhadan.calculate.Benjin;
import com.zhadan.calculate.Fuli;
import com.zhadan.calculate.Lilv;
import com.zhadan.calculate.Nianxian;

//VS4E -- DO NOT REMOVE THIS LINE!
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JTextField jTextField0;
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JButton jButton0;
	public MainFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(22, 32, 10, 10), new Leading(36, 24, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(66, 219, 10, 10), new Leading(37, 23, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(22, 28, 12, 12), new Leading(78, 23, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(66, 218, 12, 12), new Leading(78, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(66, 218, 12, 12), new Leading(121, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(22, 12, 12), new Leading(161, 22, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(22, 12, 12), new Leading(121, 22, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(109, 10, 10), new Leading(202, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(89, 10, 10), new Leading(179, -8, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(17, 10, 10), new Leading(202, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(66, 218, 12, 12), new Leading(157, 23, 10, 10)));
		add(getJLabel5(), new Constraints(new Leading(56, 10, 10), new Leading(265, 10, 10)));
		add(getJLabel6(), new Constraints(new Leading(137, 12, 12), new Leading(12, 12, 12)));
		setSize(321, 314);
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("复利计算");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("备注：要求什么哪里就不要你填");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("要求什么就在哪里就不用写");
		}
		return jLabel4;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "复利计算", "求本金", "求利息", "求年限" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		}
		return jComboBox0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("计算");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("年限");
		}
		return jLabel2;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("总额");
		}
		return jLabel3;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("利息");
		}
		return jLabel1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("本金");
		}
		return jLabel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame();
				frame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
				frame.setTitle("MainFrame");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	Fuli f =new Fuli();
	Benjin b =new Benjin();
	Lilv l = new Lilv();
	Nianxian n = new Nianxian();
	private JComboBox jComboBox0;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private void jButton0MouseMouseClicked(MouseEvent event) {
		String p = this.jTextField0.getText();
		String i = this.jTextField1.getText();
		String year = this.jTextField2.getText();
		String sum = this.jTextField3.getText();
		if(jComboBox0.getSelectedItem()=="复利计算"){
			f.calculate(p, i, year);
			this.jTextField3.setText(f.sum);
		}
		if(jComboBox0.getSelectedItem()=="求本金"){
			b.calculate(sum, i, year);
			this.jTextField0.setText(b.p);
		}
		if(jComboBox0.getSelectedItem()=="求利息"){
			l.calculate(p, sum, year);
			this.jTextField1.setText(l.i);
		}
		if(jComboBox0.getSelectedItem()=="求年限"){
			n.calculate(p, i, sum);
			this.jTextField2.setText(n.year);
		}
	}

}
