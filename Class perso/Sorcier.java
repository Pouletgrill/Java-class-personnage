public class Sorcier extends Personnage
{
	   // variables membres
	static String ctype;
	static int NbSorcier=0;
	
	//constructeur
	public Sorcier(String Nom, char Sexe)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		ctype = "InconnueXXX";//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		NbSorcier += 1;
	}
	
	public Sorcier(String Nom, char Sexe, String Type)
	{	
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);			
		this.setType(Type);
		NbSorcier += 1;
	}
   // m�thodes
	public static int getNbSorciers()
	{
		return NbSorcier;
	}
	
	public void setType(String Type)
	{
		if (Type == "eau" || Type == "feu" || Type == "terre" || Type == "air")
		{
			ctype = Type;
		}
		else
		{
			ctype = "XXX";//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		}
	}
}