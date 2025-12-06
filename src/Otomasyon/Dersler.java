package Otomasyon;

public class Dersler {

	double vy = 0;
	double nyp = 0;
	double dvs = 0;
	double ldt = 0;
	double diff = 0;
	double olasilik = 0;
	
	Dersler (double vy, double nyp, double dvs, double ldt, double diff, double olasilik)
	{
		this.vy = vy;
		this.nyp = nyp;
		this.dvs = dvs;
		this.ldt = ldt;
		this.diff = diff;
		this.olasilik = olasilik;
	}
	public void setvy(double vy)
	{
		this.vy = vy;
	}
	public void setnyp(double nyp)
	{
		this.nyp = nyp;
	}
	public void setdvs(double dvs)
	{
		this.dvs = dvs;
	}
	public void setdiff(double diff)
	{
		this.diff = diff;
	}
	public void setolasilik(double olasilik)
	{
		this.olasilik = olasilik;
	}
	public void setldt(double ldt)
	{
		this.ldt = ldt;
	}
	
	public double getvy()
	{
		return vy;
	}
	public double getnyp()
	{
		return nyp;
	}
	public double getdvs()
	{
		return dvs;
	}
	public double getldt()
	{
		return ldt;
	}
	public double getdiff()
	{
		return diff;
	}
	public double getolasilik()
	{
		return olasilik;
	}
	
}
