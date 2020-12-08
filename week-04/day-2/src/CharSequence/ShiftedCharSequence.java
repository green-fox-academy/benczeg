package CharSequence;

public class ShiftedCharSequence implements CharSequence {
  int charNum;
  String shift;

  public ShiftedCharSequence(String shift, int charNum) {
    this.charNum = charNum;
    this.shift = shift;
  }

  @Override
  public int length() {
    return shift.length();
  }

  @Override
  public char charAt(int index) {
    return shift.charAt(index + charNum);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return shift.subSequence(start, end);
  }
}
