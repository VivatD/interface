package animals;

public interface Animal {

    default void sleep() {
        System.out.println("sleep -> zzZZzz");
    }

    static void move(){
        System.out.println("Animal moving");
    }

    void getAge(int age);
    void getName(String name);
}
