package sevenSegment;

public class Seven_segment {

	let num = [0x7E, 0x30,0x6D,0X79,0X33,0X5B,0X5F,0X70,0X7F];
	let index = 	0;
	function setup() {
	  createCanvas(400, 400);
		frameRate(3);
	}

	function draw() {
	  background(220);
		sevenSegment(num[index]);
		index = (index+1) % num.length;
	}

	function getColor(val, shift){
	 let r = 255;	
	 let g =0;
	 let b= 0;
	 let a = 255 * ((val >> shift) & 1);
	 return color(r, g, b,a);
	}

	function sevenSegment(val){
	  push();
		fill(0);
		//stroke(0);
		colorMode(RGB, 1);
		//noFill();
		fill(getColor(val, 6));
	  rect(60,20,78,18);
		fill(getColor(val, 5));
		rect(140,40,18,98);
		fill(getColor(val, 4));
		rect(140,160,18,98);
		fill(getColor(val, 3));
		rect(60,260,78,18);
		fill(getColor(val, 2));
		rect(40,160,18,98);
		fill(getColor(val, 1));
		rect(40,40,18,98);
		fill(getColor(val, 0));
		rect(60,140,78,18);
		pop();
		
		
		
	}
}
