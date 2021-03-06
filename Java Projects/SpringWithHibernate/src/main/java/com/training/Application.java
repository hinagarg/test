/**
 * 
 */
package com.training;

import org.services.daos.ShoppingCartDaoImpl;
import org.services.entity.ShoppingCart;
import org.services.ifaces.MyDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hgarg1
 *
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
  
    MyDao<ShoppingCart> dao = (ShoppingCartDaoImpl)context.getBean(ShoppingCartDaoImpl.class);
  
    ShoppingCart cart = context.getBean(ShoppingCart.class);
  
    cart.setCardId(2020);
    cart.setItem("SmartPhone");
  
    Integer key = (Integer)dao.add(cart);
  
    System.out.println("One Cart Added");
  }

}
