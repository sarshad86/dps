package main.behavioral.visitor;

/**
 * Created by Sara on 10/2/2017.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);

}
