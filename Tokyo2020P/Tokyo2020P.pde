size(600, 600);
background(41,41,41);
noStroke();

float a = 200;

fill(163,127,55);
rect(0, 0, a, a);

fill(165,165,165);
rect(2*a, 2*a, 3*a, 3*a);

ellipseMode(RADIUS);
float r = sqrt(1.5*1.5+0.5*0.5)*a;
fill(41,41,41);
ellipse(1.5*a, 1.5*a, r, r);

fill(#FFFFFF);
rect(a, 0, a, 3*a);

fill(218,0,17);
ellipse(2.5*a, 0.5*a, 0.5*a, 0.5*a); 
