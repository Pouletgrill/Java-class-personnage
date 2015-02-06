public class Sorcier extends Personnage
{
	   // variables membres
	static String ctype;
	
	//constructeur
	public Sorcier(String Nom, char Sexe)
	{
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);
		ctype = "InconnueXXX";//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	}
	
	public Sorcier(String Nom, char Sexe, String Type)
	{	
		Personnage.setNom(Nom);
		Personnage.setSexe(Sexe);			
		this.setType(Type);
	}
   // m�thodes
	public static int getNbSorciers()
	{
		return 0;
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