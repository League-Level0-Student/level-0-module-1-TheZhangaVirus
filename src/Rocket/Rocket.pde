int x = 400; 
int y = 600; 

void setup() {

    background(0, 0, 40); size(800, 800);
    fill(#DEDEDE);
    ellipse(90, 90, 160, 160);
    fill(#939393);
    noStroke();
    ellipse(135, 100, 60, 60);
    ellipse(110, 40, 15, 15);
    ellipse(60, 130, 40, 40);
    
}

void draw() {
  
  if(y>-200) {
   
    y--;
    
  } else {
    
  }
  
    stroke(0, 0, 40);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);

}