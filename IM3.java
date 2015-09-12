public class IM3 extends Indosat
{
//ekanaradhipad@gmail.com
	public void teleponSesamaOperator(int detik)
	{
		if (detik <=80)
		{
			setTarifTeleponSesamaOperator(15*detik);
		}
		else
		{
			setTarifTeleponSesamaOperator( (15*80) + (int) 0.1*(detik - 80));
		}
	}
	public void teleponBedaOperator(int detik)
	{
		int tarif = 0;
		if (detik <=120)
		{
			setTarifTeleponBedaOperator(25*detik);
		}
		else
		{
			for (int i = 1; detik >0; i++)
			{
				if (detik >=120 && i%2 == 1)
				{
					tarif += 120*25;
					detik = detik -120;
				}
				if (i%2 == 0 && detik >=180)
				{
					tarif += 180*0.1;
					detik -= 180;
				}
				if (detik <120 && i%2 == 1)
				{
					tarif += detik*25;
					detik -= detik;
				}
				if (detik <180 )
				{
					tarif += detik*0.1;
					detik -= detik;
				}
			}
			
			setTarifTeleponBedaOperator(tarif);
		}
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