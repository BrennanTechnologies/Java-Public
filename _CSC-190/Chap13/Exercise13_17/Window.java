public class Window implements GUIComponent {
    private int width = 0;
    private int height = 0;
    private int xPos = 0;
    private int yPos = 0;
    
    public Window (int w, int h) {
        this.width = w;
        this.height = h;
    }
   public boolean open() {
      System.out.println("Window opened");
      return true;
  }
  public boolean close() {
    System.out.println("Window closed");
    return true;
  }
  public void resize(int width, int height) {
    this.width = width;
    this.height = height;

  }
  public void  move(int x, int y){
    this.xPos = x;
    this.yPos = y;
  }
}

