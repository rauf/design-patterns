package facade;

import facade.subsystems.SubsystemA;
import facade.subsystems.SubsystemB;
import facade.subsystems.SubsystemC;

public class SystemFacade {

  private SubsystemA subsystemA;
  private SubsystemB subsystemB;
  private SubsystemC subsystemC;

  public SystemFacade() {
    this.subsystemA = new SubsystemA();
    this.subsystemB = new SubsystemB();
    this.subsystemC = new SubsystemC();
  }

  public String operation1() {
    return "Operation 1: " + subsystemA.operationA1()
        + subsystemB.operationB1()
        + subsystemC.operationC1();
  }

  public String operation2() {
    return "Operation 2: " + subsystemA.operationA2()
        + subsystemB.operationB2()
        + subsystemC.operationC2();
  }
}
