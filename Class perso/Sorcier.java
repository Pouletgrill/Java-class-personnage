public class Sorcier extends Personnage
{
	   // variables membres
	String type;
	
	//constructeur
	public Sorcier(String sNom, char sSexe)
	{
		Personnage.Nom = sNom;
		Personnage.Sexe = sSexe;
		type = "Inconnue";
	}
	
	public Sorcier(String sNom, char Sexe, String sType)
	{
		if (sSexe == 'M' || sSexe == 'F')
		{			
			Personnage.SetSexe(Sexe);			
		}
		else
		{
			Personnage.SetSexe('M');
		}	
	Personnage.Nom = sNom;
		if (sType == "eau" || sType == "feu" || sType == "terre" || sType == "air")
		{
			type = sType;
		}	
	}
   // m�thodes
	int getNbSorciers()
	{
		return 0;
	}
}