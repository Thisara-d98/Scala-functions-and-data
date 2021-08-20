package mypackage4


class  Account(id:String,n:Int,b:Double) {
  val nic:String =id;
  val acnumber:Int=n;
  var balance:Double=b;
  
  def Withdraw(a:Double)=this.balance=this.balance-a;
  def Deposit(a:Double)=this.balance=this.balance+a;
  
  override def toString="["+nic+":"+acnumber+":"+balance+"]"
}

object problem4 {
  
  def main(args:Array[String]){
     var bank:List[Account]=List(new Account("981531418v",3145683,10000)
  ,new Account("985145642v",8345167,15000),new Account("19995671345",5643145,12800)
  ,new Account("923456722v",5678903,-2000));
  
  def IsNegative=(I:Account)=>I.balance<0
  def NegativeBalance=bank.filter(IsNegative);
  
  def balance=(I:Account)=>I.balance
  var total=bank.map(balance).reduce((x,y)=>(x+y))
  val Interest=(I:Account)=>if(I.balance<0)I.balance=I.balance-I.balance*0.1/100 else I.balance=I.balance+I.balance*0.5/100
  val x=bank.map(Interest);
  
  println(bank);
  }
 
}

