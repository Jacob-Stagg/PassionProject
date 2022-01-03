package characters;

public class CharacterStats {
    private Integer str;
    private Integer def;
    private Integer mana;
    private Integer agl;
    private Integer hp;

    public CharacterStats(Integer str, Integer def, Integer mana, Integer agl, Integer hp) {
        this.str = str;
        this.def = def;
        this.mana = mana;
        this.agl = agl;
        this.hp = hp;
    }

    public CharacterStats() {

    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getAgl() {
        return agl;
    }

    public void setAgl(Integer agl) {
        this.agl = agl;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer increaseStr(Integer modifier){
        return this.str = this.str + modifier;
    }

    public Integer decreaseStr(Integer modifier){
        return this.str = this.str - modifier;
    }

    public Integer increaseDef(Integer modifier){
        return this.def = this.def + modifier;
    }

    public Integer decreaseDef(Integer modifier){
        return this.def = this.def - modifier;
    }

    public Integer increaseMana(Integer modifier){
        return this.mana = this.mana + modifier;
    }

    public Integer decreaseMana(Integer modifier){
        return this.mana = this.mana - modifier;
    }

    public Integer increaseAgl(Integer modifier){
        return this.agl = this.agl + modifier;
    }

    public Integer decreaseAgl(Integer modifier){
        return this.agl = this.agl - modifier;
    }

    public Integer increaseHp(Integer modifier){
        return this.hp = this.hp + modifier;
    }

    public Integer decreaseHp(Integer modifier){
        return this.hp = this.hp - modifier;
    }
}
