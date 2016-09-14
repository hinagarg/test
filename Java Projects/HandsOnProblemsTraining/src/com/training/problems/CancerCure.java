package com.training.problems;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
/**
 * 
 * @author hgarg1.
 *
 */

public class CancerCure extends AbstractPortal {
  /**
   * @serialField.
   */
  private int projectId;
  /**
   * @serialField.
   */
  private String projectDescription;
  /**
   * @serialField.
   */
  private int projectCost;
  /**
   * @serialField.
   */
  public int amountCollected;
  /**
   * @serialField.
   */
  private int amountPending;
  /**
   * @constructor.
   */
  public CancerCure() {
    super();
  }
  /**
   * 
  * @param projectId.
  * @param projectDescription.
  * @param projectCost.
  * @param amountCollected.
  * @param amountPending.
   */
  
  public CancerCure(int projectId, String projectDescription, int projectCost, int amountCollected,int amountPending) {
    super();
    this.projectId = projectId;
    this.projectDescription = projectDescription;
    this.projectCost = projectCost;
    this.amountCollected = amountCollected;
    this.amountPending = amountPending;
  }

  /**
   * 
   * @return
   */

  public int getProjectId() {
    return projectId;
  }

  /**
   * 
   * @param projectId
   */

  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }

  /**
   * 
   * @return
   */

  public String getProjectDescription() {
    return projectDescription;
  }

  /**
   * 
   * @param projectDescription
   */

  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }

  /**
   * 
   * @return
   */

  public int getProjectCost() {
    return projectCost;
  }

  /**
   * 
   * @param projectCost
   */

  public void setProjectCost(int projectCost) {
    this.projectCost = projectCost;
  }

  /**
   * 
   * @return
   */

  public int getAmountCollected() {
    return amountCollected;
  }

  /**
   * 
   * @param amountCollected
   */

  public void setAmountCollected(int amountCollected) {
    this.amountCollected = amountCollected;
  }

  /**
   * 
   * @return
   */

  public int getAmountPending() {
    return amountPending;
  }

  /**
   * 
   * @param amountPending
   */

  public void setAmountPending(int amountPending) {
    this.amountPending = amountPending;
  }

  /**
   * This method prints product details
   */

  @Override
  public void addProjectDetails() {
    System.out.println("Enter Your username");
    Scanner sc = new Scanner(System.in);
    BufferedImage img = null;
    if (sc.hasNextLine()) {
      String input = sc.next();
      if (input.equals("admin") ) {
        System.out.println("Enter the product id");
        int projectId = sc.nextInt();
        setProjectId(projectId);
        System.out.println("Enter the product description");
        String projectDescription = sc.next();
        setProjectDescription(projectDescription);
        System.out.println("Enter the product cost");
        int projectCost = sc.nextInt();
        setProjectCost(projectCost);
        try {
          img = ImageIO.read(new File("images/1.png"));
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  
  @Override
  public void addMoneyDonated() {
  }
  /**
   * This method print product details.
   */
  @Override
  public void printProjectDetails() {
    System.out.println("Product Id is:= " + getProjectId());
    System.out.println("Product Description is:= " + getProjectDescription());
    System.out.println("Product Cost is:= " + getProjectCost());
    System.out.println("Amount Collected is:= " + getAmountCollected());
    System.out.println("Amount Pending is:= " + (getProjectCost() - getAmountCollected()));
  }
}