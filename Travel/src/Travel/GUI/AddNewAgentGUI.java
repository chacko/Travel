package Travel.GUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class AddNewAgentGUI extends javax.swing.JDialog {
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton btnExit;
	private JLabel jLabel9;
	private JPanel pnlAddAgent;
	private JButton btnReset;
	private JButton btnSave;
	private JTextField txtAgencyName;
	private JTextField txtAgencyId;
	private JTextField txtPosition;
	private JTextField txtEmail;
	private JTextField txtBusPhone;
	private JTextField txtLastName;
	private JTextField txtMiddleInitial;
	private JTextField txtFirstName;
	private JTextField txtAgentID;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel2;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.getContentPane().setLayout(null);
				AddNewAgentGUI inst = new AddNewAgentGUI(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public AddNewAgentGUI(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setModal(true);
				getContentPane().setLayout(null);
				{
					btnSave = new JButton();
					getContentPane().add(btnSave);
					btnSave.setText("Save");
					btnSave.setBounds(345, 138, 100, 36);
					btnSave.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							//System.out.println("btnSave.mouseClicked, event="+evt);
							//TODO add your code for btnSave.mouseClicked
							setVisible(false);
						}
					});
				}
				{
					btnReset = new JButton();
					getContentPane().add(btnReset);
					btnReset.setText("Reset");
					btnReset.setBounds(345, 179, 100, 36);
					btnReset.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							//System.out.println("btnReset.mouseClicked, event="+evt);
							//TODO add your code for btnReset.mouseClicked
							JTextField [] txtField = {txtAgencyName,
													txtAgencyId,
													txtAgentID,
													txtBusPhone,
													txtEmail,
													txtFirstName,
													txtLastName,
													txtMiddleInitial,
													txtPosition};
							
							for(JTextField tf: txtField)
							{
								tf.setText("");
							}
							};
						});
				}
				{
					pnlAddAgent = new JPanel();
					getContentPane().add(pnlAddAgent);
					pnlAddAgent.setLayout(null);
					pnlAddAgent.setBounds(15, 7, 318, 249);
					pnlAddAgent.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					{
						jLabel1 = new JLabel();
						pnlAddAgent.add(jLabel1);
						jLabel1.setText("Agent ID:");
						jLabel1.setBounds(15, 25, 110, 42);
					}
					{
						jLabel2 = new JLabel();
						pnlAddAgent.add(jLabel2);
						jLabel2.setText("First Name:");
						jLabel2.setBounds(15, 50, 110, 42);
					}
					{
						jLabel8 = new JLabel();
						pnlAddAgent.add(jLabel8);
						jLabel8.setText("Agency:");
						jLabel8.setBounds(15, 202, 110, 42);
					}
					{
						jLabel3 = new JLabel();
						pnlAddAgent.add(jLabel3);
						jLabel3.setText("Middle Initial:");
						jLabel3.setBounds(15, 75, 110, 42);
					}
					{
						jLabel4 = new JLabel();
						pnlAddAgent.add(jLabel4);
						jLabel4.setText("Last Name:");
						jLabel4.setBounds(15, 100, 110, 42);
					}
					{
						jLabel5 = new JLabel();
						pnlAddAgent.add(jLabel5);
						jLabel5.setText("Phone Number:");
						jLabel5.setBounds(15, 126, 110, 42);
					}
					{
						jLabel6 = new JLabel();
						pnlAddAgent.add(jLabel6);
						jLabel6.setText("Email:");
						jLabel6.setBounds(15, 151, 110, 42);
					}
					{
						jLabel7 = new JLabel();
						pnlAddAgent.add(jLabel7);
						jLabel7.setText("Position:");
						jLabel7.setBounds(16, 176, 110, 42);
					}
					{
						txtAgentID = new JTextField();
						pnlAddAgent.add(txtAgentID);
						txtAgentID.setBounds(137, 36, 163, 22);
					}
					{
						txtFirstName = new JTextField();
						pnlAddAgent.add(txtFirstName);
						txtFirstName.setBounds(137, 61, 163, 22);
					}
					{
						txtMiddleInitial = new JTextField();
						pnlAddAgent.add(txtMiddleInitial);
						txtMiddleInitial.setBounds(137, 86, 35, 22);
					}
					{
						txtLastName = new JTextField();
						pnlAddAgent.add(txtLastName);
						txtLastName.setBounds(137, 111, 163, 22);
					}
					{
						txtBusPhone = new JTextField();
						pnlAddAgent.add(txtBusPhone);
						txtBusPhone.setBounds(137, 137, 163, 22);
					}
					{
						txtEmail = new JTextField();
						pnlAddAgent.add(txtEmail);
						txtEmail.setBounds(137, 162, 163, 22);
					}
					{
						txtPosition = new JTextField();
						pnlAddAgent.add(txtPosition);
						txtPosition.setBounds(137, 187, 163, 22);
					}
					{
						txtAgencyId = new JTextField();
						pnlAddAgent.add(txtAgencyId);
						txtAgencyId.setBounds(137, 213, 35, 22);
					}
					{
						txtAgencyName = new JTextField();
						pnlAddAgent.add(txtAgencyName);
						txtAgencyName.setBounds(178, 213, 122, 22);
					}
					{
						jLabel9 = new JLabel();
						pnlAddAgent.add(jLabel9);
						jLabel9.setText("Add Agent Information");
						jLabel9.setLayout(null);
						jLabel9.setBounds(18, 1, 280, 29);
						jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
						jLabel9.setHorizontalTextPosition(SwingConstants.CENTER);
					}
				}
				{
					btnExit = new JButton();
					getContentPane().add(btnExit);
					btnExit.setText("Exit");
					btnExit.setBounds(345, 220, 100, 36);
					btnExit.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							//System.out.println("btnReset.mouseClicked, event="+evt);
							//TODO add your code for btnReset.mouseClicked
							setVisible(false);
						}
					});
				}
			}
			this.setSize(463, 297);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
