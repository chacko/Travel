package Travel.GUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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
public class TravelApp extends javax.swing.JFrame {

	private JLabel lblMain;
	private JMenuItem mnuItmAgentExit;
	private JSeparator jSeparator1;
	private JMenuItem mnuItmAgentEdit;
	private JMenuItem mnuItmAgentAdd;
	private JMenu mnuAgent;
	private JMenuItem mnuItmPkgExit;
	private JSeparator jSeparator2;
	private JMenuItem mnuItmPkgEdit;
	private JMenuItem mnuItmPkgAdd;
	private JMenu mnuPackage;
	private JMenuBar jMenuBar1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TravelApp inst = new TravelApp();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public TravelApp() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setTitle("TEAM 6 OOSD");
			}
			{
				lblMain = new JLabel();
				getContentPane().add(lblMain, BorderLayout.CENTER);
				lblMain.setText("TRAVEL EXPERTS ");
				lblMain.setFont(new java.awt.Font("Abyssinica SIL",1,48));
			}
			this.setSize(755, 391);
			this.setBounds(0, 0, 1200, 800);
			this.setResizable(false);

			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					mnuPackage = new JMenu();
					jMenuBar1.add(mnuPackage);
					mnuPackage.setText("Package");
					{
						mnuItmPkgAdd = new JMenuItem();
						mnuPackage.add(mnuItmPkgAdd);
						mnuItmPkgAdd.setText("Add");
					}
					{
						mnuItmPkgEdit = new JMenuItem();
						mnuPackage.add(mnuItmPkgEdit);
						mnuItmPkgEdit.setText("Edit");
					}
					{
						jSeparator2 = new JSeparator();
						mnuPackage.add(jSeparator2);
					}
					{
						mnuItmPkgExit = new JMenuItem();
						mnuPackage.add(mnuItmPkgExit);
						mnuItmPkgExit.setText("Exit");
					}
				}
				{
					mnuAgent = new JMenu();
					jMenuBar1.add(mnuAgent);
					mnuAgent.setText("Agent");
					{
						mnuItmAgentAdd = new JMenuItem();
						mnuAgent.add(mnuItmAgentAdd);
						mnuItmAgentAdd.setText("Add");
						mnuItmAgentAdd.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnuItmAgentAddActionPerformed(evt);
							}
						});
					}
					{
						mnuItmAgentEdit = new JMenuItem();
						mnuAgent.add(mnuItmAgentEdit);
						mnuItmAgentEdit.setText("Edit");
						mnuItmAgentEdit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnuItmAgentEditActionPerformed(evt);
							}
						});
					}
					{
						mnuItmAgentExit = new JMenuItem();
						mnuAgent.add(mnuItmAgentExit);
						mnuItmAgentExit.setText("Exit");
						mnuItmAgentExit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								mnuItmAgentExitActionPerformed(evt);
							}
						});
					}
					{
						jSeparator1 = new JSeparator();
						mnuAgent.add(jSeparator1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void mnuItmAgentAddActionPerformed(ActionEvent evt) {
		AgentAddJDialog.main(null);
		
	}
	
	private void mnuItmAgentExitActionPerformed(ActionEvent evt) {
		
		System.exit(0);
	}
	
	private void mnuItmAgentEditActionPerformed(ActionEvent evt) {
		AgentSearchJDialog.main(null);
		
	}

	/*private void mnuItmPkgAddActionPerformed(ActionEvent evt) {
		System.out.println("mnuItmPkgAdd.actionPerformed, event="+evt);
		//TODO add your code for mnuItmPkgAdd.actionPerformed
	}*/

}
