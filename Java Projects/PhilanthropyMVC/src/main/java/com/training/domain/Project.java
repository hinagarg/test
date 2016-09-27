/**
 * 
 */
package com.training.domain;

import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author hgarg1
 *
 */
@Component("projBean1")
public class Project {
  
  private long projectId;
  private String projectName;
  private double projectBudget;  
  private double amountCollected;  
  private Set<Donor> donorList;
  /**
   * 
   */
  public Project() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param projectId
   * @param projectName
   * @param projectBudget
   * @param amountCollected
   * @param donorList
   */
  public Project(long projectId, String projectName, double projectBudget, double amountCollected,
      Set<Donor> donorList) {
  super();
  this.projectId = projectId;
  this.projectName = projectName;
  this.projectBudget = projectBudget;
  this.amountCollected = amountCollected;
  this.donorList = donorList;
  }
  /**
   * @return the projectId
   */
  public long getProjectId() {
  return projectId;
  }
  /**
   * @param projectId the projectId to set
   */
  public void setProjectId(long projectId) {
  this.projectId = projectId;
  }
  /**
   * @return the projectName
   */
  public String getProjectName() {
  return projectName;
  }
  /**
   * @param projectName the projectName to set
   */
  public void setProjectName(String projectName) {
  this.projectName = projectName;
  }
  /**
   * @return the projectBudget
   */
  public double getProjectBudget() {
  return projectBudget;
  }
  /**
   * @param projectBudget the projectBudget to set
   */
  public void setProjectBudget(double projectBudget) {
  this.projectBudget = projectBudget;
  }
  /**
   * @return the amountCollected
   */
  public double getAmountCollected() {
  return amountCollected;
  }
  /**
   * @param amountCollected the amountCollected to set
   */
  public void setAmountCollected(double amountCollected) {
  this.amountCollected = amountCollected;
  }
  /**
   * @return the donorList
   */
  public Set<Donor> getDonorList() {
  return donorList;
  }
  /**
   * @param donorList the donorList to set
   */
  public void setDonorList(Set<Donor> donorList) {
  this.donorList = donorList;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectBudget=" + projectBudget
      + ", amountCollected=" + amountCollected + ", donorList=" + donorList + "]";
  }
  
  
}
