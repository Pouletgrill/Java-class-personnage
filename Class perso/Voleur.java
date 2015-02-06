final class Voleur extends Personnage
{
	   // variables membres
	static int cnbLarcins;
	static int NbVoleur=0;
	
	//constructeur
	public Voleur(String Nom, char Sexe)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		cnbLarcins = 9999;//test XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		NbVoleur += 1;
	}
	
	public Voleur(String Nom, char Sexe, int nbLarcins)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		cnbLarcins = nbLarcins;
		NbVoleur += 1;
	}

   // m�thodes
	public static int getNbVoleurs()
	{
		return NbVoleur;
	}
	
	public int incNbLarcins()
	{
		return cnbLarcins;
	}
}