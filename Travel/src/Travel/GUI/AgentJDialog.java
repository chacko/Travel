package Travel.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Travel.DataBase.DBase;


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
public class AgentJDialog extends javax.swing.JDialog {
	private JLabel lblStatus;
	private JLabel lblFName;
	private JLabel lblMiddle;
	private JLabel lblLName;
	private JTextField txtPhone;
	private JLabel lblPhone;
	private JLabel lblEmail;
	private JLabel lblPosition;
	private JTextField txtFName;
	private JTextField txtMiddle;
	private JTextField txtLName;
	private JTextField txtEmail;
	private JTextField txtPosn;
	private JComboBox comboAgents;
	private JButton btnEdit;
	private JButton btnSave;
	
	private Integer numRows=0;
	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				AgentJDialog inst = new AgentJDialog(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public AgentJDialog(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					lblStatus = new JLabel();
					getContentPane().add(lblStatus);
					lblStatus.setText("updated " + numRows + " row(s)");
					lblStatus.setBounds(37, 292, 235, 40);
				}
				{
					btnSave = new JButton();
					getContentPane().add(btnSave);
					btnSave.setEnabled(true);
					btnSave.setText("Save");
					btnSave.setBounds(231, 249, 150, 40);
					btnSave.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							btnSaveMouseClicked(evt);
						}
					});
				}
				{
					btnEdit = new JButton();
					getContentPane().add(btnEdit);
					btnEdit.setEnabled(false);
					btnEdit.setText("Edit");
					btnEdit.setBounds(37, 249, 150, 40);
					btnEdit.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							btnEditMouseClicked(evt);
						}
					});
				}
				{
					ComboBoxModel comboAgentsModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					comboAgents = new JComboBox();
					getContentPane().add(comboAgents);
					comboAgents.setModel(comboAgentsModel);
					comboAgents.setBounds(7, 15, 183, 31);
					comboAgents.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							comboAgentsActionPerformed(evt);
						}
					});
				}
				{
					txtPosn = new JTextField();
					getContentPane().add(txtPosn);
					txtPosn.setEnabled(true);
					txtPosn.setBounds(317, 167, 232, 25);
				}
				{
					txtEmail = new JTextField();
					getContentPane().add(txtEmail);
					txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
					txtEmail.setEnabled(true);
					txtEmail.setBounds(317, 136, 232, 25);
				}
				{
					txtPhone = new JTextField();
					getContentPane().add(txtPhone);
					txtPhone.setEnabled(true);
					txtPhone.setBounds(317, 105, 232, 25);
				}
				{
					txtLName = new JTextField();
					getContentPane().add(txtLName);
					txtLName.setEnabled(true);
					txtLName.setBounds(317, 74, 232, 25);
				}
				{
					txtMiddle = new JTextField();
					getContentPane().add(txtMiddle);
					txtMiddle.setEnabled(true);
					txtMiddle.setBounds(317, 43, 232, 25);
				}
				{
					txtFName = new JTextField();
					getContentPane().add(txtFName);
					txtFName.setEnabled(true);
					txtFName.setBounds(317, 12, 232, 25);
				}
				{
					lblPosition = new JLabel();
					getContentPane().add(lblPosition);
					lblPosition.setText("Position");
					lblPosition.setBounds(202, 167, 109, 34);
					lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
				}
				{
					lblEmail = new JLabel();
					getContentPane().add(lblEmail);
					lblEmail.setText("Email");
					lblEmail.setBounds(202, 136, 109, 34);
					lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
				}
				{
					lblPhone = new JLabel();
					getContentPane().add(lblPhone);
					lblPhone.setText("Business Phone");
					lblPhone.setBounds(202, 105, 109, 34);
					lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
				}
				{
					lblLName = new JLabel();
					getContentPane().add(lblLName);
					lblLName.setText("Last Name");
					lblLName.setBounds(202, 74, 109, 34);
					lblLName.setHorizontalAlignment(SwingConstants.RIGHT);
				}
				{
					lblMiddle = new JLabel();
					getContentPane().add(lblMiddle);
					lblMiddle.setText("Middle Initial");
					lblMiddle.setBounds(202, 43, 109, 34);
					lblMiddle.setHorizontalAlignment(SwingConstants.RIGHT);
				}
				{
					lblFName = new JLabel();
					getContentPane().add(lblFName);
					lblFName.setText("First Name");
					lblFName.setBounds(202, 12, 109, 34);
					lblFName.setHorizontalAlignment(SwingConstants.RIGHT);
				}
			}
			this.setSize(638, 388);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//-----------------------------------------
	/**
	 * private methods
	 * */
	// get all agent ids from agent table
	/*private Vector<Agent> getAgentIDs() 
	{
		
		try 
		{
			Vector<Agent> agentIds = new Vector<Agent>();
			
			// get oracle connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			ResultSet rs;
			rs = stmt.executeQuery("select agentid,agtfirstname from agents");
			
			// loop through result set for ids
			
			while (rs.next())
			{
				Agent agt = new Agent(Integer.valueOf(rs.getString("agentid")), 
						rs.getString("agtfirstname"));

				agentIds.add(agt);
				//agentIds[0]= agt;
				
				agt=null;
			}
			
			// close all data base objects 
			DBase.closeDBase(conn, rs, stmt);
						
			return agentIds;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return null;
		
	}*/

	//------------------------------------------------------
	//get agent information of selected id in 
	//agent combo box
	/*protected void getAgent() {
		try 
		{
			Connection conn = DBase.getOracleConnection(); // get connection
			
			Statement stmt;
			stmt = conn.createStatement();
			
			Agent selAgent = (Agent) comboAgents.getSelectedItem();
			
			ResultSet rs;
			StringBuilder qry = new StringBuilder(); // select query
			qry.append("select agtfirstname,agtmiddleinitial,agtlastname");
			qry.append(",agtbusphone,agtemail,agtposition from agents");
			qry.append(" where agentid =");
			//qry.append(comboAgents.getSelectedItem());
			qry.append(selAgent.getId());
						
			rs = stmt.executeQuery(qry.toString());
			
			if (rs.next())
			{
				// populate data into corresponding text fields
				txtFName.setText(rs.getString("agtfirstname"));
				txtMiddle.setText(rs.getString("agtmiddleinitial"));
				txtLName.setText(rs.getString("agtlastname"));
				txtPhone.setText(rs.getString("agtbusphone"));
				txtEmail.setText(rs.getString("agtemail"));
				txtPosn.setText(rs.getString("agtposition"));
			}
			else
			{
				System.out.println("no row returned");
			}
			rs.close();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}*/
	//----------------------------------------
	// update agent information entered in text fields
	public void updateAgent()
	{
		try
		{
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			StringBuilder qry = new StringBuilder();
			qry.append("update agents set agtfirstname ='");
			qry.append(txtFName.getText());
			qry.append("',");
			qry.append(" agtmiddleinitial ='");
			qry.append(txtMiddle.getText());
			qry.append("',");
			qry.append(" agtlastname ='");
			qry.append(txtLName.getText());
			qry.append("',");
			qry.append(" agtbusphone ='");
			qry.append(txtPhone.getText());
			qry.append("',");
			qry.append(" agtemail ='");
			qry.append(txtEmail.getText());
			qry.append("',");
			qry.append(" agtposition ='");
			qry.append(txtPosn.getText());
			qry.append("' where agentid =");
			qry.append(comboAgents.getSelectedItem());
			
			int numRows = stmt.executeUpdate(qry.toString());
			if (numRows == 0)
			{
				//System.out.println("update failed");
				lblStatus.setText("updated failed"); 
			}
			else
			{
				//System.out.println("updated " + numRows + " row(s)");
				lblStatus.setText("updated " + numRows + " row(s)"); 
			}
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	//----------------------------------------
	// populating agent combo box at control using
	// method getAgentIDs()
	private JComboBox getComboAgents() {
		if(comboAgents == null) {
			ComboBoxModel comboAgentsModel = 
					new DefaultComboBoxModel();
			comboAgents = new JComboBox();
			comboAgents.setModel(comboAgentsModel);
			comboAgents.setBounds(12, 15, 93, 19);
			comboAgents.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					comboAgentsActionPerformed(evt);
				}
			});
		}
		return comboAgents;
	}
	// event method when selection changed at agents combo
	private void comboAgentsActionPerformed(ActionEvent evt) {
		//populate data into text fields 
		//getAgent();
		lblStatus.setText("");
	}
	// edit button 
	private JButton getBtnEdit() {
		if(btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit");
			btnEdit.setBounds(24, 249, 81, 22);
			btnEdit.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					btnEditMouseClicked(evt);
				}
			});
		}
		return btnEdit;
	}
	// Save button
	private JButton getJButton1() {
		if(btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("Save");
			btnSave.setBounds(142, 249, 81, 22);
			btnSave.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					btnSaveMouseClicked(evt);
				}
			});
			btnSave.setEnabled(false);
		}
		return btnSave;
	}
	//----------------------------------
	private void btnEditMouseClicked(MouseEvent evt) {
		//enable all text fields for editing
		EnableTextFields();
		btnSave.setEnabled(true);
		btnEdit.setEnabled(false);
		
	}
	//----------------------------------
	private void EnableTextFields()
	{
		txtFName.setEnabled(true);
		txtMiddle.setEnabled(true);
		txtLName.setEnabled(true);
		txtPhone.setEnabled(true);
		txtPosn.setEnabled(true);
		txtEmail.setEnabled(true);
	}
	//---------------------------------
	private void DisableTextFields()
	{
		txtFName.setEnabled(false);
		txtMiddle.setEnabled(false);
		txtLName.setEnabled(false);
		txtPhone.setEnabled(false);
		txtPosn.setEnabled(false);
		txtEmail.setEnabled(false);
	}
	//---------------------------------
	private JLabel getJLabel1() {
		if(lblStatus == null) {
			lblStatus = new JLabel();
			lblStatus.setBounds(24, 292, 441, 15);
		}
		return lblStatus;
	}
	
	private void btnSaveMouseClicked(MouseEvent evt) {
		updateAgent(); // update method to save changes in data base
		btnSave.setEnabled(false);
		btnEdit.setEnabled(true);
		DisableTextFields();
	}
	//----------------------------------
	//-----------------------------------------

}
