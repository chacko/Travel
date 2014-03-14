package Travel.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import org.jdesktop.swingx.autocomplete.*;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class AgentGUI extends javax.swing.JDialog {
	private JList lstAgent;
	private JButton btnAdd;
	private JButton jButton1;
	private JTextField txtSearchAgent;
	private JLabel jLabel1;
	private JButton btnExit;
	private JButton btnEdit;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				AgentGUI inst = new AgentGUI(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public AgentGUI(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					ArrayList<String> agents = new ArrayList<>();
					agents.add("1");
					agents.add("2");
					agents.add("3");
					agents.add("4");
					agents.add("5");
					
					lstAgent = new JList(agents.toArray());
					getContentPane().add(lstAgent);
					lstAgent.setBounds(12, 48, 303, 269);
					lstAgent.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					lstAgent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				}
				{
					btnAdd = new JButton();
					getContentPane().add(btnAdd);
					btnAdd.setText("Add New Agent");
					btnAdd.setBounds(327, 162, 143, 32);
					btnAdd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//System.out.println("btnAdd.actionPerformed, event="+evt);
							//TODO add your code for btnAdd.actionPerformed
							if(evt.getSource() == btnAdd){
								AddNewAgentGUI.main(null);
							}
						}
					});
				}
				{
					btnEdit = new JButton();
					getContentPane().add(btnEdit);
					btnEdit.setText("Edit Agent");
					btnEdit.setBounds(327, 202, 143, 32);
					btnEdit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//System.out.println("btnEdit.actionPerformed, event="+evt);
							//TODO add your code for btnEdit.actionPerformed
							if(evt.getSource() == btnEdit){
								EditAgentGUI.main(null);
							}
						}
					});
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Delete Agent");
					jButton1.setBounds(327, 242, 143, 32);
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//System.out.println("btnAdd.actionPerformed, event="+evt);
							//TODO add your code for btnAdd.actionPerformed
							if(evt.getSource() == btnAdd){
								AddNewAgentGUI.main(null);
							}
						}
					});
				}
				{
					btnExit = new JButton();
					getContentPane().add(btnExit);
					btnExit.setText("Exit");
					btnExit.setBounds(327, 285, 143, 32);
					btnExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//System.out.println("btnAdd.actionPerformed, event="+evt);
							//TODO add your code for btnAdd.actionPerformed
							System.exit(0);
						}
					});
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Search Agent:");
					jLabel1.setLayout(null);
					jLabel1.setBounds(19, 21, 108, 15);
				}
				{
					txtSearchAgent = new JTextField();
					getContentPane().add(txtSearchAgent);
					txtSearchAgent.setBounds(154, 18, 161, 22);
					
					Configurator.enableAutoCompletion(lstAgent, txtSearchAgent);
				}
			}
			this.setSize(491, 370);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
