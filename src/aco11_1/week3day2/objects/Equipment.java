package aco11_1.week3day2.objects;

public class Equipment {

    private String equipmentName;
    private String equipmentCode;
    private int equipmentPrice;
    private boolean guarantee;
    private boolean crash;

    public Equipment(String equipmentName, String code, int price, boolean guarantee, boolean crash) {
        this.equipmentName = equipmentName;
        this.equipmentCode = code;
        this.equipmentPrice = price;
        this.guarantee = guarantee;
        this.crash = crash;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
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

    public int getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(int equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }
}
