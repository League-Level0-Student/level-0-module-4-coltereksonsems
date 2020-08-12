int x= 320;
int y=280;
void setup() {
  size(800,800);
  face = loadImage("wsl.jpg");
   face.resize(800,800); 
  
  
  
}

void draw() {
 image(face,0,0);
 fill(#FFFFFF);
  ellipse(320,280,50,50);
  ellipse(450,280,50,50);
  if (mouseX>306&&mouseX<336&&mouseY>266&&mouseY<295){
  x=mouseX;
  y=mouseY;
  }
  
  
  fill(#000000);
  ellipse(x,y,20,20);
  ellipse(x+130,y,20,20);
  if (mousePressed){
  println(" x: "+mouseX+" y; "+mouseY);
  
  //right x= 306
  //left x=280
  //up y=266
  //down y=295
  }
  
  
  
}
PImage face;
