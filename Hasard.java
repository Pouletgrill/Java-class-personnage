//Lancé de dés JAVA
//Xavier Brosseau
//2015-01-30
public class Hasard
{
   public static void main( String args[] )
   {
      int NbLancer = 0;
      try 
      {

         if(args.length <= 0)
         {
            System.out.println("Aucun parametre:");
            System.out.println("Veuillez entrer un nombre de lancer valide");
            return;            
         }         
         else if (Integer.parseInt(args[0])>0)
         {
            NbLancer = Integer.parseInt(args[0]);
         }
         else
         {
            System.out.println("Parametre hors intervale");
            return;
         }
      }
      catch( NumberFormatException e )
      {
         System.out.println("Parametre invalide\n" + e);
         return;
      }
      int tab[] = new int [11];
      System.out.println( "Valeur | Nombre d'occurence" );
      System.out.println( "-------|-------------------" );
      for (int i = 0; i<NbLancer;i++)
      {
         // génération d'un entier >= 1 et <= 6
         int d1 = 1 + ( int )( Math.random() * 6 );
         int d2 = 1 + ( int )( Math.random() * 6 );
         int somme = d1 + d2;
         
         tab [somme -2]++;      
      }
      Imprimer(tab);
   }
   
   static void PrintHashTag(int tab[], int i, int MaxOcurr)
   {
      int percent = 0;
      int caractereMax = 60;
      percent = (tab[i-2] * caractereMax / MaxOcurr);
      for (int z =0;z<percent;++z)
      {
         System.out.print( "#" );
      }
      System.out.println(" "+tab [i-2]);
   }
   
   static void Imprimer(int tab[])
   {
      int MaxOcurr = 1;
      for (int i=2; i<=12;++i)
      {
         if (tab [i-2]>MaxOcurr)
         {
            MaxOcurr = tab [i-2];
         }
      }
      for (int i=2; i<=12;++i)
      {
         
         if (i < 10)
         {
            System.out.print( "     " + i + " | " );
            PrintHashTag(tab,i,MaxOcurr);
         }
         else
         {
            System.out.print( "    " + i + " | " );
            PrintHashTag(tab,i,MaxOcurr);
         }
      }
   }
}