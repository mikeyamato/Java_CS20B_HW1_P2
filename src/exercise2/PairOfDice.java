package exercise2;

import java.lang.Math;

public class PairOfDice {
  private double die1;
  private double die2;
  private double total;

  public PairOfDice(){
    this.die1 = Math.ceil(6.0 * Math.random());
    this.die2 = Math.ceil(6.0 * Math.random());
    this.total = this.die1 + this.die2;
  }

  @Override
  public String toString(){
    return Math.round(this.die1) + " : " + Math.round(this.die2) + " = " + Math.round(this.total);
  }

}
