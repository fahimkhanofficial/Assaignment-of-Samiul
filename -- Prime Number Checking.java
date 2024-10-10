public class checkpmnumber {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;

    if (num == 0 || num == 1) {
        flag = true;
    }

    for (int i = 2; i <= num / 2; ++i) {

  
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " IS A PRIME NUMBER");
    else
      System.out.println(num + " IS NOT A PRIME NUMBER");
  }
}