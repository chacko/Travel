package Travel.GUI;

import java.util.ArrayList;
import java.util.List;

import Travel.DataBase.FeesDB;
import Travel.Entity.Fees;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fees fee = new Fees();
		
		//BK
		fee = FeesDB.getFees("BK");
		
		/*FeesDB feeInfo = new FeesDB();
		fee = feeInfo.getFees("BK");*/
		
		List<Fees> feeLst =  new ArrayList<Fees>();
		feeLst = FeesDB.getAllFees();
		
		for(Fees objFee:feeLst)
		{
			System.out.print(objFee.getFeeId() + "\t" + objFee.getFeeName() + "\t" + objFee.getFeeDesc() + "\t" + objFee.getFeeAmount());
			System.out.println();
		}
		
		fee.setFeeId("BK");
		fee.setFeeAmount(899.99);
		fee.setFeeName("BKG Charges");
		fee.setFeeDesc("travel agent charges");
		
		System.out.println("------ UPDATE ----------");
		// to test update statement
		int rows = FeesDB.updateFees(fee);
		
		feeLst = FeesDB.getAllFees();
		for(Fees objFee:feeLst)
		{
			System.out.print(objFee.getFeeId() + "\t" + objFee.getFeeName() + "\t" + objFee.getFeeDesc() + "\t" + objFee.getFeeAmount());
			System.out.println();
		}
		
		fee = null;
		fee = new Fees();
		
		fee.setFeeId("MF6");
		fee.setFeeAmount(2599.99);
		fee.setFeeName("Manufacture Charges");
		fee.setFeeDesc("manufacture calling charges");
		
		System.out.println("------ INSERT ----------");
		// test insert statement
		rows = FeesDB.insertFees(fee);
		
		feeLst = FeesDB.getAllFees();
		for(Fees objFee:feeLst)
		{
			System.out.print(objFee.getFeeId() + "\t" + objFee.getFeeName() + "\t" + objFee.getFeeDesc() + "\t" + objFee.getFeeAmount());
			System.out.println();
		}
		
		System.out.println("------ DELETE ----------");
		rows = FeesDB.deleteFees("MF3");
		feeLst = FeesDB.getAllFees();
		for(Fees objFee:feeLst)
		{
			System.out.print(objFee.getFeeId() + "\t" + objFee.getFeeName() + "\t" + objFee.getFeeDesc() + "\t" + objFee.getFeeAmount());
			System.out.println();
		}
	}

}
