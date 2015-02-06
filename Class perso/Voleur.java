final class Voleur extends Personnage
{
	   // variables membres
	static int cnbLarcins;
	
	//constructeur
	public Voleur(String Nom, char Sexe)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		cnbLarcins = 9999;//test XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	}
	
	public Voleur(String Nom, char Sexe, int nbLarcins)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		cnbLarcins = nbLarcins;
	}

   // m�thodes
	public static int getNbVoleurs()
	{
		return 0;
	}
	
	public int incNbLarcins()
	{
		return cnbLarcins;
	}
}