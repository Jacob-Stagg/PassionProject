package monsters;

public class MonsterStats {
    private Integer str;
    private Integer def;
    private Integer agl;
    private Integer hp;

    public MonsterStats(Integer str, Integer def, Integer agl, Integer hp) {
        this.str = str;
        this.def = def;
        this.agl = agl;
        this.hp = hp;
    }

    public MonsterStats() {

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
