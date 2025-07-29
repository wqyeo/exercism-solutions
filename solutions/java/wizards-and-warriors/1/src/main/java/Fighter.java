public class Fighter {

    boolean isVulnerable() { return true; }

    int getDamagePoints(Fighter fighter) {
        return -1;
    }
}

class Warrior extends Fighter {

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }

        return 6;
    }

    @Override
    boolean isVulnerable() { return false; }


    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        }

        return 3;
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }
}