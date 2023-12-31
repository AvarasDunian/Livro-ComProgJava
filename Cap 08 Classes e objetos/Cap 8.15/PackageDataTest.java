// Figura 8.20 PackageDataTest.java
// Membros de acesso de pacote de uma classe permanecem
// acess�veis a outras classes no mesmo pacote

public class PackageDataTest {
    public static void main ( String[] args ){
        PackageData packageData = new PackageData();

        // gera sa�da da representa��o String de packageData
        System.out.printf("After instantiation:\n%s\n", packageData );
        
        // muda os dados de acesso de pacote no objeto packageData
        packageData.number = 77;
        packageData.string = "GoodBye";

        // gera sa�da da representa��o String de packageData
        System.out.printf("\nAfter changing values:\n%s\n", packageData);
    }// fim de main    
} // fim da classe PackageDataTest

// classe com vari�veis de inst�ncia de acesso de pacote
class PackageData{
    int number; // vari�vel de inst�ncia de acesso de pacote
    String string; // vari�vel de inst�ncia de acesso de pacote

    // construtor
    public PackageData(){
        number = 0;
        string = "hello";
    }

    public String toString(){
        return String.format("number: %d; string: %s", number, string);
    } // fim do m�todo toString
} // fim da classe PackageData