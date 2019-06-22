package main.behavioral.visitor;

/**
 * Created by Sara on 10/2/2017.
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
