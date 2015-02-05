public class Test
{
   static final int MAX_PERSONNAGES = 10;

   public static void main( String args[] )
   {
      int nbPersonnages = 0; // nombre courant de personnages

      //
      // cr�ation du tableau de personnages
      //
      Personnage pers[] = new Personnage[ MAX_PERSONNAGES ];

      //
      // d�compte des personnages au d�but de l'histoire
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      System.out.println( "Au debut de l'histoire il y a " +
            nbPersonnages + " personnage(s)\n" );

      //
      // cr�ation des personnages
      //
      pers[ 0 ] = new Sorcier( "Gandalf", 'M' );
      pers[ 1 ] = new Sorcier( "Zoumtor", 'M', "air" );
      pers[ 2 ] = new Sorcier( "Sagasse", 'F', "feu" );
      pers[ 3 ] = new Voleur( "Zarpeur", 'M' );
      pers[ 4 ] = new Voleur( "Filouzine", 'F', 7 );
      pers[ 5 ] = new Voleur( "Ombro", 'M', 50 );

      //
      // modification de quelques personnages
      //
      pers[ 0 ].setNom( "Kalamanji" );
      pers[ 1 ].setNom( "   " ); // aucun effet
      ( ( Sorcier )pers[ 1 ] ).setType( "pizza" ); // aucun effet
      ( ( Sorcier )pers[ 2 ] ).setType( "eau" );
      pers[ 3 ].setSexe( 'X' ); // aucun effet
      ( ( Voleur )pers[ 5 ] ).incNbLarcins();

      //
      // pr�sentation des personnages
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      for( int i = 0; i < nbPersonnages; i++ )
         System.out.println( pers[ i ] );

      //
      // d�compte des personnages � la fin de l'histoire
      //
      System.out.println( "\nA la fin de l'histoire il y a " +
            nbPersonnages + " personnage(s)" );
   }
}