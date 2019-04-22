void setup() {
  size(596, 794);
  
}

void draw() {
    PImage img;
  img = loadImage("zombieEyes.png");
  img.resize(596, 794);
  image(img, 596, 794);
  
}