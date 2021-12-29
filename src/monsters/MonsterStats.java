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
}
