package CharSequence;

public class Gnirts implements CharSequence {
  private String gnirts = new String();

  public Gnirts(String gnirts) {
    this.gnirts = gnirts;
  }


  @Override
  public int length() {
    return gnirts.length();
  }

  @Override
  public char charAt(int index) {
    return gnirts.charAt(gnirts.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return gnirts.subSequence(start, end);


  }


}
