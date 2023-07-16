package nthEvenNumberTest;

public class NthEvenNumber {
    public int findNthEvenNumber(int n) {
        int evenNumber = 0;
     if (n <= 0 ) {
         evenNumber = -1;
     } else {
          evenNumber = 2 * n - 2;
     }
     return evenNumber;
    }
}
