import javax.naming.Name;

public class Animals {

    public static void main(String[] args) {
        for (int i =0; i<50; i++){
            do { System.out.print(i++);

                Mammals nMammals = new Mammals("Tiger ");
                Reptiles nReptiles = new Reptiles("Snake ");
                Birds nBirds = new Birds("Hawk ");
                Fish nFish = new Fish("Shark ");

                if(i % 7==0){
                    System.out.println(" I am a Fish " + nFish.Name + nFish.Speak);}
                else if(i % 2 == 0){
                    System.out.println(" I am a Mammal " + nMammals.Name + nMammals.Speak);}
                else if(i % 3 == 0){
                    System.out.println(" I am a Reptile " + nReptiles.Name + nReptiles.Speak);}
                else if(i % 5 == 0){
                    System.out.println(" I am a Bird " + nBirds.Name + nBirds.Speak);}
                else if (i % 1 == 0){
                    System.out.println(" I am an Animal ");}
            }
            while(i<=50);}
    }
}
