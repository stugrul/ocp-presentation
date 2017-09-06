package immutability;

import java.util.List;

public class MutableAnimal {
    private final List<String> favouriteFoods;

    public MutableAnimal(final List<String> favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

    public List<String> getFavouriteFoods() {
        return favouriteFoods;
    }
}
