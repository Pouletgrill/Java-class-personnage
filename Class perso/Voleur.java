final class Voleur extends Personnage
{
	   // variables membres
	private int cnbLarcins=0;
	private static int NbVoleur=0;
	
	//constructeur
	public Voleur(String Nom, char Sexe)
	{
		//Personnage.setNom(Nom);
		//Personnage.setSexe(Sexe);
		super(Nom,Sexe);
		cnbLarcins = 0;
		NbVoleur += 1;
	}
	
	public Voleur(String Nom, char Sexe, int nbLarcins)
	{
		//Personnage.setNom(Nom);
		//Personnage.setSexe(Sexe);
		super(Nom,Sexe);
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
		cnbLarcins +=1;
		return cnbLarcins;
	}
	
	public String toString()
	{
		String Phrase = "Mon nom est " + getNom() + " et je suis ";
		if (Character.toUpperCase(getSexe()) == 'M')
		{
			Phrase += "un voleur";
		}
		else
		{
			Phrase += "une voleuse";
		}
		Phrase += " ayant commis " + cnbLarcins + " larcin(s)";
		return Phrase;
	}
}