void setup() {
 
  size(600, 600); 
  fill(#D3C289);
 noStroke();
 ellipse(300, 300, 500, 500);
 
 fill(#EA4F07);
 noStroke();
 ellipse(300, 300, 450, 450);
 
 fill(#F5E900);
 noStroke();
 ellipse(300, 300, 445, 445);
  
}

void draw() {
 PImage img;
 img = loadImage("peperoni.png");
 img.resize(450, 450);
 image(img, 70, 80);
 
 PImage pepper;
 pepper = loadImage("pepper.png");
 pepper.resize(375, 375);
 image(pepper, 210, 100);
}