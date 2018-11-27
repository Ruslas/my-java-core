package lesson16.homework;

import lesson8.clinic.Animal;
import lesson8.clinic.Cat;
import lesson8.clinic.Dog;
import lesson8.clinic.Horse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Мясо", "Дом 23", "Средний");
        Animal dog2 = new Dog("Корм", "Дом 21", "Маленикий");
        Animal dog3 = new Dog("Суп", "Дом 24", "Огромный");
        Animal cat1 = new Cat("Рыба", "Дом 16", "Белый");
        Animal cat2 = new Cat("Сметана", "Дом 10", "Черный");
        Animal cat3 = new Cat("Котлеты", "Дом 18", "Черно-белый");
        Animal cat4 = new Cat("Лазанья", "Дом 14", "Рыжий");
        Animal horse1 = new Horse("Яблоки", "Дом 2", 40);
        Animal horse2 = new Horse("Сено", "Дом 5", 36);
        Animal horse3 = new Horse("Трава", "Дом 8", 47);
        Map<String, Animal> animals = putAnimals(dog1, dog2, dog3, cat1, cat2, cat3, cat4, horse1, horse2, horse3);
        System.out.println(animals);
        pintKeys(animals);
    }

    public static Map<String, Animal> putAnimals(Animal... animals){
        Map<String, Animal> map = new HashMap<>();
        for (Animal animal: animals){
            map.put(animal.getFood(), animal);
        }
        return map;
    }

    public static void pintKeys(Map<String, Animal> animalMap){
        Set<String> animals = animalMap.keySet();
        animals.forEach((s)-> System.out.println(s));
    }
}
