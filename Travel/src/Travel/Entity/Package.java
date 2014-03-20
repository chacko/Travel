package Travel.Entity;


import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the PACKAGES database table.
 * 
 */

public class Package 
{

	private long packageid;
	private BigDecimal pkgagencycommission;
	private BigDecimal pkgbaseprice;
	private String pkgdesc;
	private Date pkgenddate;
	private String pkgname;
	private Date pkgstartdate;

	public Package() {
	}


	
	public long getPackageid() {
		return this.packageid;
	}

	public void setPackageid(long packageid) {
		this.packageid = packageid;
	}


	public BigDecimal getPkgagencycommission() {
		return this.pkgagencycommission;
	}

	public void setPkgagencycommission(BigDecimal pkgagencycommission) {
		this.pkgagencycommission = pkgagencycommission;
	}


	public BigDecimal getPkgbaseprice() {
		return this.pkgbaseprice;
	}

	public void setPkgbaseprice(BigDecimal pkgbaseprice) {
		this.pkgbaseprice = pkgbaseprice;
	}


	public String getPkgdesc() {
		return this.pkgdesc;
	}

	public void setPkgdesc(String pkgdesc) {
		this.pkgdesc = pkgdesc;
	}
	
	public Date getPkgenddate() 
	{
		return this.pkgenddate;
	}

	public void setPkgenddate(Date pkgenddate) 
	{
		this.pkgenddate = pkgenddate;
	}


	public String getPkgname() 
	{
		return this.pkgname;
	}

	public void setPkgname(String pkgname) 
	{
		this.pkgname = pkgname;
	}

	
	public Date getPkgstartdate() 
	{
		return this.pkgstartdate;
	}

	public void setPkgstartdate(Date pkgstartdate) 
	{
		this.pkgstartdate = pkgstartdate;
	}

}