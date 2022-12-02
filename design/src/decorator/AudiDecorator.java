package decorator;

public class AudiDecorator implements ICar{

    protected ICar audi;
    protected String modeName;
    protected int modelPrice;

    public AudiDecorator(ICar audi,String modeName,int modelPrice){
        this.audi = audi;
        this.modeName = modeName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modeName + "의 가격은 " + getPrice() + "원 입니다.");
    }
}
