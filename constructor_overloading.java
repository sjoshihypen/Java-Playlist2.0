class Box {
  private double height;
  private double width;
  private double depth;

  public Box(double height, double width, double depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  public Box(double side) {
    this.height = side;
    this.width = side;
    this.depth = side;
  }

  public double get_volume() {
    return height * width * depth;
  }
}

class box_new extends Box {
  private double weight;

  public box_new(double height, double width, double depth, double weight) {
    super(height, width, depth);
    this.weight = weight;
  }

  public box_new(double side, double weight) {
    super(side);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }
}