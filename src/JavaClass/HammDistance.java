package JavaClass;

public class HammDistance {

    public static void main(String[] args) {
        Distance distance = new Distance();
         distance.voo(1,4);   /*main 中调用Distance的方法*/

    }


}

class Distance {
    public int voo(int x, int y) {

        int xor = x ^ y, distance = 0;
        while (xor > 0) {
            distance += xor & 1;
            xor = xor >> 1;
            System.out.println(distance);

        }

  return distance;      /*方法*/

    }


}












