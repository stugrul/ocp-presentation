package immutability;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableAnimal {
    private final String species;
    private final int age;
    private final List<String> favouriteFoods;

    public ImmutableAnimal(final String species, final int age, final List<String> favouriteFoods) {
        this.species = species;
        this.age = age;
        this.favouriteFoods = new ArrayList<>(favouriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getFavouriteFoodsCount() {
        return favouriteFoods.size();
    }

    public String getFavouriteFood(int index) {
        return favouriteFoods.get(index);
    }
}
