public abstract class Personnage
{
   // variables membres
	private String cnom;
	private char csexe;
	
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
	 public String toString() 
	 {
	  return "Key: , Value: ";
    }
}