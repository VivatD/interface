package animals;

public abstract class Herbivore {

    public abstract void eat();
    public void getVegetables(){
        String[] vegetables = {"tomato","cabbage","paper","melon"};
        for (int x = 0; x < vegetables.length; x++){
            System.out.println(vegetables[x]);
        }
    }
}
