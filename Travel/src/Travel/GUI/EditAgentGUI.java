package Travel.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
public class EditAgentGUI extends javax.swing.JDialog {
	private JPanel pnlEditAgent;
	private JComboBox cmbAgency;
	private JButton btnExit;
	private ButtonGroup btnStatus;
	private JButton btnSave;
	private JLabel jLabel18;
	private JLabel jLabel17;
	private JLabel jLabel16;
	private JLabel jLabel15;
	private JLabel jLabel14;
	private JLabel jLabel13;
	private JLabel jLabel12;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JTextField txtPosition;
	private JTextField txtEmail;
	private JTextField txtBusPhone;
	private JTextField txtLastName;
	private JTextField txtMiddleInitial;
	private JTextField txtFirstName;
	private JTextField txtAgentId;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				EditAgentGUI inst = new EditAgentGUI(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public EditAgentGUI(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.setModal(true);
				{
					pnlEditAgent = new JPanel();
					getContentPane().add(pnlEditAgent);
					pnlEditAgent.setBorder(new LineBorder(new java.awt.Color(0,0,0),1,false));
					pnlEditAgent.setLayout(null);
					pnlEditAgent.setBounds(17, 11, 313, 238);
					{
						txtAgentId = new JTextField();
						pnlEditAgent.add(txtAgentId);
						txtAgentId.setBounds(135, 29, 163, 22);
					}
					{
						txtFirstName = new JTextField();
						pnlEditAgent.add(txtFirstName);
						txtFirstName.setBounds(135, 54, 163, 22);
					}
					{
						txtMiddleInitial = new JTextField();
						pnlEditAgent.add(txtMiddleInitial);
						txtMiddleInitial.setBounds(135, 79, 35, 22);
					}
					{
						txtLastName = new JTextField();
						pnlEditAgent.add(txtLastName);
						txtLastName.setBounds(135, 104, 163, 22);
					}
					{
						txtBusPhone = new JTextField();
						pnlEditAgent.add(txtBusPhone);
						txtBusPhone.setBounds(135, 130, 163, 22);
					}
					{
						txtEmail = new JTextField();
						pnlEditAgent.add(txtEmail);
						txtEmail.setBounds(135, 155, 163, 22);
					}
					{
						txtPosition = new JTextField();
						pnlEditAgent.add(txtPosition);
						txtPosition.setBounds(135, 180, 163, 22);
					}
					{
						jLabel10 = new JLabel();
						pnlEditAgent.add(jLabel10);
						jLabel10.setText("Agency:");
						jLabel10.setBounds(13, 195, 110, 42);
					}
					{
						jLabel11 = new JLabel();
						pnlEditAgent.add(jLabel11);
						jLabel11.setText("Position:");
						jLabel11.setBounds(14, 169, 110, 42);
					}
					{
						jLabel12 = new JLabel();
						pnlEditAgent.add(jLabel12);
						jLabel12.setText("Email:");
						jLabel12.setBounds(13, 144, 110, 42);
					}
					{
						jLabel13 = new JLabel();
						pnlEditAgent.add(jLabel13);
						jLabel13.setText("Phone Number:");
						jLabel13.setBounds(13, 119, 110, 42);
					}
					{
						jLabel14 = new JLabel();
						pnlEditAgent.add(jLabel14);
						jLabel14.setText("Last Name:");
						jLabel14.setBounds(13, 93, 110, 42);
					}
					{
						jLabel15 = new JLabel();
						pnlEditAgent.add(jLabel15);
						jLabel15.setText("Middle Initial:");
						jLabel15.setBounds(13, 68, 110, 42);
					}
					{
						jLabel16 = new JLabel();
						pnlEditAgent.add(jLabel16);
						jLabel16.setText("First Name:");
						jLabel16.setBounds(13, 43, 110, 42);
					}
					{
						jLabel17 = new JLabel();
						pnlEditAgent.add(jLabel17);
						jLabel17.setText("Agent ID:");
						jLabel17.setBounds(13, 18, 110, 42);
					}
					{
						jLabel18 = new JLabel();
						pnlEditAgent.add(jLabel18);
						pnlEditAgent.add(getCmbAgency());
						jLabel18.setText("Edit Agent Information");
						jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
						jLabel18.setHorizontalTextPosition(SwingConstants.CENTER);
						jLabel18.setLayout(null);
						jLabel18.setBounds(1, 2, 310, 29);
					}
				}
				{
					btnSave = new JButton();
					getContentPane().add(btnSave);
					getContentPane().add(getJButton1());
					btnSave.setText("Save");
					btnSave.setBounds(342, 169, 100, 36);
					btnSave.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//System.out.println("btnSave.actionPerformed, event="+evt);
							//TODO add your code for btnSave.actionPerformed
						}
					});
									btnSave.addMouseListener(new MouseAdapter() {
										public void mouseClicked(MouseEvent evt) {
											//System.out.println("btnSave.mouseClicked, event="+evt);
											//TODO add your code for btnSave.mouseClicked
											setVisible(false);
										}
									});
				}
			}
			this.setSize(460, 290);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getBtnStatus() {
		if(btnStatus == null) {
			btnStatus = new ButtonGroup();
		}
		return btnStatus;
	}
	
	private JButton getJButton1() {
		if(btnExit == null) {
			btnExit = new JButton();
			btnExit.setText("Exit");
			btnExit.setBounds(342, 210, 100, 36);
			btnExit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					//System.out.println("btnReset.mouseClicked, event="+evt);
					//TODO add your code for btnReset.mouseClicked
					setVisible(false);
				}
			});
		}
		return btnExit;
	}
	
	private JComboBox getCmbAgency() {
		if(cmbAgency == null) {
			ComboBoxModel cmbAgencyModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
			cmbAgency = new JComboBox();
			cmbAgency.setModel(cmbAgencyModel);
			cmbAgency.setBounds(136, 205, 160, 22);
		}
		return cmbAgency;
	}

}
