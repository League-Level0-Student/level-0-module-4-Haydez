void setup(){
  size(1000,1000);
}
void draw(){
  background(150,150,150);
  fill(250,250,250);
  ellipse(250,450,175,150);
  ellipse(500,450,175,150);
  fill(0,0,0);
  int tempX=mouseX;
  int tempY=mouseY;
  if(mouseX<190){
    tempX=190;
  }
  if(mouseX>325){
    tempX=325;
  }
  if(mouseY<400){
    tempY=400;
  }
  if (mouseY>500){
    tempY=500;
  }
  ellipse(tempX,tempY,50,50);
  ellipse(tempX+250,tempY,50,50);
}