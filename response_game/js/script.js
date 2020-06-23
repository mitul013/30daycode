let count_w=0;
let count_l=0;
let diff = count_l-count_w;
let right = document.getElementById("user-score");
let wrong = document.getElementById("computer-score");
const music = document.getElementById("music");
function getrandomtd(){
	for(var i=0; i<2 ;i++){
	const dom_choice = [document.getElementById("1"),document.getElementById("2"),document.getElementById("3"),document.getElementById("4"),document.getElementById("5"),document.getElementById("6"),document.getElementById("7"),document.getElementById("8"),document.getElementById("9"),document.getElementById("10"),document.getElementById("11"),document.getElementById("12"),document.getElementById("13"),document.getElementById("14"),document.getElementById("15"),document.getElementById("16"),document.getElementById("17"),document.getElementById("18"),document.getElementById("19"),document.getElementById("20"),document.getElementById("21"),document.getElementById("22"),document.getElementById("23"),document.getElementById("24")];
	let dom =  dom_choice[Math.floor(Math.random()*24)];
	const img_choice = ["<img style='display:block;' height='100%' width='100%' src='./images/ok.png' onclick='win()' />","<img style='display:block;' height='100%' width='100%' src='./images/ok2.png' onclick='win()' />"];
	let img = img_choice[Math.floor(Math.random()*2)];
	dom.innerHTML = img;
	const time_choice = [900, 1000, 1200];
	let time = time_choice[Math.floor(Math.random()*3)];
	setInterval(function(){ dom.innerHTML=""; }, time);
	}
};


function myfunction(){
	getrandomtd();
	if(diff<6){
	setTimeout(myfunction, 2000);}
	
};

function start(){
diff = 0;
myfunction();
music.loop=true;
music.play();
}

function stop(){
diff = 10;
music.pause();
}

function win(){
	count_w++;
	right.innerHTML = count_w;
}


function lose(){
	count_l++;
	wrong.innerHTML = count_l;
}