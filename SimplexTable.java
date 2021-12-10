//  Контрольний приклад рішення задачі 
//  згідно алгоритму на рис. 4.3
//
import static javax.swing.JOptionPane.*;

class SimplexTable {
  public static void main(String[] args) {
    String recviziti, maxznach, oporniyplan;
    String koeff;
    int ikoeff;
    boolean endcikle = false;

    recviziti = showInputDialog(null, "Введіть початкові значення матриці", 
        "Початкові значення матриці", 
        QUESTION_MESSAGE);

    maxznach = showInputDialog(null, "Визначимо максимальне значення цільової функції за умов-обмежень", 
        "Максимальне значення цільової функції", 
        QUESTION_MESSAGE);
    maxznach = calculateMaxZnach();

    do {
    oporniyplan = showInputDialog(null, "Будуємо опорного плану системи нерівностей", 
        "Опорний план системи нерівностей", 
        QUESTION_MESSAGE);
    oporniyplan = calculateOporniyPlan();

    koeff = showInputDialog(null, "В індексному рядку є негативні коефіцієнти (ні - 0, так - 1) ?", 
        "Результати проведення рекламної кампанії", 
        QUESTION_MESSAGE);

    ikoeff = Integer.parseInt(koeff);

    if (ikoeff == 1) 
      System.out.println("Поточний опорний план є не оптимальним");
    else
      endcikle = true;

    } while(endcikle);

    System.out.println("Поточний опорний план є оптимальним");

  }

  public static String calculateMaxZnach() {
  // Використання "заплаток"
    String varmaxznach;
    varmaxznach = "1";
    return varmaxznach;
  }

  public static String calculateOporniyPlan() {
  // Використання "заплаток"
    String varoporniyplan;
    varoporniyplan = "2";
    return varoporniyplan;
  }

}
