package Travel.GUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

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
public class CustomerGUI extends javax.swing.JDialog {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton btnExit;
	private JButton btnSave;
	private JComboBox cmbAgents;
	private JButton btnRemove;
	private JButton btnAssign;
	private JList lstAgents;
	private JList lstCustomers;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				CustomerGUI inst = new CustomerGUI(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public CustomerGUI(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setModal(true);
				getContentPane().setLayout(null);
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("The following customers are assigned to the agent you are about to delete.");
					jLabel1.setBounds(12, 12, 561, 15);
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Please assign them to a new agent to continue.");
					jLabel2.setBounds(12, 30, 368, 15);
				}
				{
					ListModel lstCustomersModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					lstCustomers = new JList();
					getContentPane().add(lstCustomers);
					lstCustomers.setModel(lstCustomersModel);
					lstCustomers.setBounds(12, 57, 175, 220);
					lstCustomers.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				}
				{
					ListModel lstAgentsModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					lstAgents = new JList();
					getContentPane().add(lstAgents);
					lstAgents.setModel(lstAgentsModel);
					lstAgents.setBounds(290, 91, 191, 186);
					lstAgents.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				}
				{
					btnAssign = new JButton();
					getContentPane().add(btnAssign);
					btnAssign.setText("Assign");
					btnAssign.setBounds(193, 123, 92, 38);
				}
				{
					btnRemove = new JButton();
					getContentPane().add(btnRemove);
					btnRemove.setText("Remove");
					btnRemove.setBounds(193, 174, 92, 38);
				}
				{
					ComboBoxModel cmbAgentsModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					cmbAgents = new JComboBox();
					getContentPane().add(cmbAgents);
					cmbAgents.setModel(cmbAgentsModel);
					cmbAgents.setBounds(357, 57, 121, 22);
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("Agents:");
					jLabel3.setBounds(290, 57, 62, 22);
				}
				{
					btnSave = new JButton();
					getContentPane().add(btnSave);
					btnSave.setText("Save");
					btnSave.setBounds(487, 181, 78, 46);
				}
				{
					btnExit = new JButton();
					getContentPane().add(btnExit);
					btnExit.setText("Exit");
					btnExit.setBounds(487, 231, 78, 46);
					btnExit.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							//System.out.println("btnExit.mouseClicked, event="+evt);
							//TODO add your code for btnExit.mouseClicked
							setVisible(false);
						}
					});
				}
			}
			this.setSize(579, 317);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
