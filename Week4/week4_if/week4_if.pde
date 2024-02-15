void setup(){
  size(500,500);
  colorMode(HSB,360,100,100);
  background(215,99,99);
  fill(35,99,99);
  
}

void draw(){
  //Setup
  background(215,99,99);
  stroke(0,0,0);
  line(width/2,0,width/2,height);
  noStroke();
  
  //Draw bottom cirlce
  ellipse(mouseX,height/1.5,50,50);
  
  //Draw middle circle
  if(mouseX > width/2){
    int offset = width/2 - (mouseX % (width/2));
    println(offset);
    ellipse(offset,height/2,50,50);
  }else{
    ellipse(mouseX,height/2,50,50);
  }
  
  //Draw top circle
  ellipse(mouseX,height/3,50,50);
}
