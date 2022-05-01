package Ch03;

//첨가물(토핑)
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}
