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
	public Personnage(String Nom, char Sexe)
	{
		cnom = Nom;
		csexe = Sexe;
	}
   // méthodes
	public void setNom(String nom)
	{
		if (nom.trim().length() != 0)
		cnom = nom;
	}
		
	public void setSexe(char sexe)
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
	
	public String getNom()
	{
		return cnom;
	}
	
	public char getSexe()
	{
		return csexe;
	}
}