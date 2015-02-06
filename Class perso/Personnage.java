public abstract class Personnage
{
   // variables membres
	static String cnom;
	static char csexe;
	
	//constructeur
	public Personnage()
	{
		cnom = "Default";
		csexe = 'M';
	}
   // méthodes
	public static void setNom(String nom)
	{
		cnom = nom;
	}
	public static void setSexe(char sexe)
	{
		if (sexe == 'M' || sexe == 'F')
		{			
			csexe = sexe;			
		}
		else
		{
			csexe = 'M';
		}
	}
}