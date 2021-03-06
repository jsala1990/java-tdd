package junit4.pizza.step7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import pizza.step7.Pizza;

public class PizzaTest {
  @Test
  public void createSmallPizza() {
    Pizza pizza = Pizza.small();
    assertEquals("small", pizza.getSize());
  }
  @Test
  public void createMediumPizza() {
    Pizza pizza = Pizza.medium();
    assertEquals("medium", pizza.getSize());
  }
  @Test
  public void createLargePizza() {
    Pizza pizza = Pizza.large();
    assertEquals("large", pizza.getSize());
  }
  @Test
  public void addTopping() {
    Pizza pizza = Pizza.large();
    pizza.addTopping("mushrooms");
    assertEquals("mushrooms", pizza.getToppings());
  }
  @Test
  public void addMultipleToppings() {
    Pizza pizza = Pizza.large();
    pizza.addTopping("watermelon");
    pizza.addTopping("mayonnaise");
    assertEquals("watermelon, mayonnaise", pizza.getToppings());
  }
  @Test
  public void basePrices() {
    assertEquals(10, Pizza.small().getPrice());
    assertEquals(15, Pizza.medium().getPrice());
    assertEquals(20, Pizza.large().getPrice());
  }

  @Test
  public void toppingPrices() {
    Pizza pizza = Pizza.medium();
    int basePrice = pizza.getPrice();
    pizza.addTopping("tomato");
    assertEquals(basePrice + 1, pizza.getPrice());
  }
}
