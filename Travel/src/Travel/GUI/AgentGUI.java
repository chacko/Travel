package Travel.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
public class AgentGUI extends javax.swing.JDialog {
	private JList lstAgent;
	private JTextField txtSearchAgent;
	private JButton btnAdd;
	private JButton btnEdit;
	private JLabel jLabel1;

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
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Search Agent:");
					jLabel1.setBounds(12, 21, 122, 15);
				}
				{
					txtSearchAgent = new JTextField();
					getContentPane().add(txtSearchAgent);
					txtSearchAgent.setBounds(133, 18, 182, 22);
				}
				{
					ListModel lstAgentModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					lstAgent = new JList();
					getContentPane().add(lstAgent);
					lstAgent.setModel(lstAgentModel);
					lstAgent.setBounds(12, 48, 303, 269);
					lstAgent.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				}
				{
					btnAdd = new JButton();
					getContentPane().add(btnAdd);
					btnAdd.setText("Add New Agent");
					btnAdd.setBounds(327, 248, 143, 32);
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
					btnEdit.setBounds(327, 285, 143, 32);
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
			}
			this.setSize(491, 370);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
