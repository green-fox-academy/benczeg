import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> nums = new ArrayList<>();

  public Sum(List<Integer> numsGot) {
    this.nums = numsGot;
  }

  public int makeSum() {
    int sumSumSum = 0;
    for (Integer num :
        nums) {
      sumSumSum += num;
    }
    return sumSumSum;
  }
}
