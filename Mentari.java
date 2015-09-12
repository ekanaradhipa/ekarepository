public class Mentari extends Indosat
{
	public Mentari()
	{
		
	}
	public void teleponSemuaOperator(int detik)
	{
		setTarifTeleponSesamaOperator(((detik/30)+1)*700);
		setTarifTeleponBedaOperator(((detik/30)+1)*700);
	}
	public void sendSMSBedaOperator(int jumlah)
	{
		setTarifSMSBedaOperator(149*jumlah);
	}
	public void sendSMSSesamaOperator(int jumlah)
	{
		setTarifSMSSesamaOperator(99*jumlah);
	}
	
}