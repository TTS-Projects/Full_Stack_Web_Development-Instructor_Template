package oop_part2;

public enum VehicleClassification2
{
	//  NEW(true, true, false),
  NEW(true, true),
  USED(false, true),
  OFF_LEASE(true, true),
  SHUTTLE(true, false),
  LOANER(false, false),
  PARTS_RUNNER(true, true);

  
  private boolean warranty;
  private boolean freeService;
//  private boolean hasWork;
//  
//  
//  public boolean hasWork() {
//	  return hasWork;
//  }
  public boolean WarrentyOffered()
  {
    return warranty;
  }
  
  public boolean FreeServiceOffered()
  {
    return freeService;
  }
  
  // constructor must be private or have no modifier
  private VehicleClassification2(boolean warranty, boolean freeService)
  {
    this.warranty = warranty;
    this.freeService = freeService;
    //this.hasWork = hasWork;
  } 
}