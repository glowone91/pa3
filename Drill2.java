class C1 {
    C2 other;
    C1(C2 other) {
      this.other = other;
    }
  }
  
  class C2 {
    int x;
    double y;
    C2(int x, double y) {
      this.x = x;
      this.y = y;
    }
  }

class Drill2{
    C2 first = new C2(10, 3.5); 
    C2 createanotherc2objectforthis = new C2(10, 10); 
    C1 second = new C1(createanotherc2objectforthis); 
    C1 third =  new C1(first); 
}