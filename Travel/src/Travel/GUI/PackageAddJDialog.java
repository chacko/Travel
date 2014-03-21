package Travel.GUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.DateFormatter;

import org.jdesktop.swingx.autocomplete.*;
import org.jdesktop.swingx.JXDatePicker;

import Travel.DataBase.*;
import Travel.Entity.*;
import Travel.Util.*;

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
public class PackageAddJDialog extends javax.swing.JDialog {
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel lblmsg1;
	private JLabel lblMessage;
	private JButton btnExit;
	private JLabel jLabel9;
	private JPanel pnlAddPackage;
	private JButton btnReset;
	private JButton btnSave;
	private JTextField txtPackageId;
	private JTextField txtPackageName;
	private JTextField txtPackageDesc;
	private JTextField txtPackageBaseprice;
	private JTextField txtPackageStartDate;
	private JTextField txtPackageEndDate;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel2;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.getContentPane().setLayout(null);
				PackageAddJDialog inst = new PackageAddJDialog(frame);
				inst.setVisible(true);
			}
		});
	}
    
	public PackageAddJDialog(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		JXDatePicker picker = new JXDatePicker();
	    picker.setDate(Calendar.getInstance().getTime());
	    //picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
	    //picker.setFormat(new DateFormatter(DateFormat("dd.MM.yyyy")));
		try {
			{
				this.setModal(true);
				getContentPane().setLayout(null);
				
				{
					btnSave = new JButton();
					getContentPane().add(btnSave);
					btnSave.setText("Save");
					btnSave.setBounds(345, 154, 100, 36);
					btnSave.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) 
						{
							lblMessage.setText("");
							if(validateFields())
							{
								lblmsg1.setText("It is VALID");
								
								if(insertPackage() <=0)
								{
									lblMessage.setText("Insert failed !!!");
								}
								else
								{
									// On successful insertion return to main App
									PackageAddJDialog.this.dispose();
								}
							}
							else
							{
								lblmsg1.setText("It is NOT VALID");
							}							
							
						}
					});
				}
				{
					btnReset = new JButton();
					getContentPane().add(btnReset);
					btnReset.setText("Reset");
					btnReset.setBounds(345, 195, 100, 36);
					btnReset.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							JTextField [] txtField = {txtPackageId,
									txtPackageName,
									txtPackageDesc,
									txtPackageBaseprice,
									txtPackageStartDate,
									txtPackageEndDate};
							
							for(JTextField tf: txtField)
							{
								tf.setText("");
							}
							};
						});
				}
				{
					pnlAddPackage = new JPanel();
					getContentPane().add(pnlAddPackage);
					pnlAddPackage.setLayout(null);
					pnlAddPackage.setBounds(16, 7, 318, 267);
					pnlAddPackage.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
					{
						jLabel2 = new JLabel();
						pnlAddPackage.add(jLabel2);
						jLabel2.setText("Package Id:(*)");
						jLabel2.setBounds(15, 50, 110, 19);
					}
					{
						jLabel3 = new JLabel();
						pnlAddPackage.add(jLabel3);
						jLabel3.setText("Package Name:");
						jLabel3.setBounds(15, 77, 110, 19);
					}
					{
						jLabel4 = new JLabel();
						pnlAddPackage.add(jLabel4);
						jLabel4.setText("Package Desc:");
						jLabel4.setBounds(15, 105, 110, 19);
					}
					{
						jLabel5 = new JLabel();
						pnlAddPackage.add(jLabel5);
						jLabel5.setText("Package Base Price:");
						jLabel5.setBounds(15, 133, 110, 19);
					}
					{
						jLabel6 = new JLabel();
						pnlAddPackage.add(jLabel6);
						jLabel6.setText("Package Start Date:");
						jLabel6.setBounds(15, 161, 110, 19);
					}
					{
						jLabel7 = new JLabel();
						pnlAddPackage.add(jLabel7);
						jLabel7.setText("Package End Date:");
						jLabel7.setBounds(16, 189, 110, 19);
					}
					{						
						txtPackageId = new LimitedJTextField(40);
						pnlAddPackage.add(txtPackageId);
						txtPackageId.setBounds(137, 50, 163, 22);
						txtPackageId.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
						txtPackageId.setToolTipText("Mandatory");
					}
					{
						txtPackageName = new LimitedJTextField(40);
						pnlAddPackage.add(txtPackageName);
						txtPackageName.setBounds(137, 77, 163, 22);
						txtPackageName.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
					}
					{
						txtPackageDesc = new LimitedJTextField(40);
						pnlAddPackage.add(txtPackageDesc);
						txtPackageDesc.setBounds(137, 105, 163, 22);
						txtPackageDesc.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
					}
					{
						txtPackageBaseprice = new LimitedJTextField(40);
						pnlAddPackage.add(txtPackageBaseprice);
						txtPackageBaseprice.setBounds(137, 133, 163, 22);
						txtPackageBaseprice.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
					}
					{
						txtPackageStartDate = new LimitedJTextField(100);
						pnlAddPackage.add(picker);
						txtPackageStartDate.setBounds(137, 161, 163, 22);
						txtPackageStartDate.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
					}
					{
						txtPackageEndDate = new LimitedJTextField(40);
						pnlAddPackage.add(picker);
						txtPackageEndDate.setBounds(137, 189, 163, 22);
						txtPackageEndDate.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
					}
					{
						jLabel9 = new JLabel();
						pnlAddPackage.add(jLabel9);
						jLabel9.setText("Add Package Information");
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
					btnExit.setBounds(345, 236, 100, 36);
					btnExit.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							//System.out.println("btnReset.mouseClicked, event="+evt);
							//TODO add your code for btnReset.mouseClicked
							
							try {
								this.finalize();
							} catch (Throwable e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							setVisible(false);
						}
					});
				}
				{
					lblMessage = new JLabel();
					getContentPane().add(lblMessage);
					lblMessage.setText("lblMessage");
					lblMessage.setBounds(16, 286, 301, 15);
				}
				{
					lblmsg1 = new JLabel();
					getContentPane().add(lblmsg1);
					lblmsg1.setBounds(16, 311, 215, 15);
				}
			}
			this.setSize(491, 356);
			lblMessage.setText("");
			lblmsg1.setText("");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//----------------------------------
	private Integer insertPackage()
	{
		Packages pkg = new Packages();
		
		pkg.setPackageId(Integer.valueOf(txtPackageId.getText()));
		pkg.setPackageName(txtPackageName.getText());
		pkg.setPackageDesc(txtPackageDesc.getText());
		pkg.setPackagePrice(Double.valueOf(txtPackageBaseprice.getText()));
		//pkg.setPackageStartDate(txtPackageStartDate.getD);
		//pkg.setPackageEndDate((txtPackageEndDate.getText());
		
		return PackagesDB.insertPackage(pkg);// call db layer for insert
	}
	//----------------------------------
	private boolean validateFields()
	{
		// Package Id - mandatory check
		if(txtPackageId.getText().trim().isEmpty())
		{
			lblMessage.setText("Pacakge Id is mandatory");
			return false;
		}
		
		// Package Name - mandatory check
		if(txtPackageName.getText().trim().isEmpty())
		{
			lblMessage.setText("Package Name is mandatory");
			return false;
		}
		
		/*// Email - mandatory check
		if(txtEmail.getText().trim().isEmpty())
		{
			return false;
		}
		
		// check email format
		if(!Validator.isValidEmail(txtEmail.getText()))
		{ 
			return false;
		}
		*/
		return true;
	}
	//----------------------------------
}
