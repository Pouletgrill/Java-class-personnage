public class Sorcier extends Personnage
{
	   // variables membres
	private String ctype = "inconnue";
	private static int NbSorcier=0;
	
	//constructeur
	public Sorcier(String Nom, char Sexe)
	{
		super(Nom,Sexe);
		NbSorcier += 1;
	}
	
	public Sorcier(String Nom, char Sexe, String Type)
	{	
		super(Nom,Sexe);		
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
		if (Type.toLowerCase().equals("eau") || Type.toLowerCase().equals("feu") || Type.toLowerCase().equals("terre") || Type.toLowerCase().equals("air"))
		{
			ctype = Type;
		}
	}
	
	public String getType()
	{
		return ctype;
	}
	
	public String toString()
	{
		String Phrase = "Mon nom est " + getNom() + " et je suis ";
		if (Character.toUpperCase(getSexe()) == 'M')
		{
			Phrase += "un sorcier";
		}
		else
		{
			Phrase += "une sorciere";
		}
		Phrase += " de type " + ctype;
		return Phrase;
	}
}