package week3day2.Objects;

public class Equipment {

    private String equipmentName;
    private String code;
    private boolean guarantee;
    private boolean crash;

    public Equipment(String equipmentName, String code, boolean guarantee, boolean crash) {
        this.equipmentName = equipmentName;
        this.code = code;
        this.guarantee = guarantee;
        this.crash = crash;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isGuarantee() {
        return guarantee;
    }

    public void setGuarantee(boolean guarantee) {
        this.guarantee = guarantee;
    }

    public boolean isCrash() {
        return crash;
    }

    public void setCrash(boolean crash) {
        this.crash = crash;
    }
}
