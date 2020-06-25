let count_w;
let count_l;
let cnt;
let imgclear;
let imgclear2;
let cntdown_clear;
let start_ran;
let diff = count_l-count_w;
let right = document.getElementById("user-score");
let wrong = document.getElementById("computer-score");
const music = document.getElementById("music");
let dom = document.getElementById("1");
let dom2 = document.getElementById("1");
function getrandomtd(){
	dom.innerHTML="";
	dom2.innerHTML="";
	console.log('aaaa');
	const dom_choice = [document.getElementById("1"),document.getElementById("2"),document.getElementById("3"),document.getElementById("4"),document.getElementById("5"),document.getElementById("6"),document.getElementById("7"),document.getElementById("8"),document.getElementById("9"),document.getElementById("10"),document.getElementById("11"),document.getElementById("12"),document.getElementById("13"),document.getElementById("14"),document.getElementById("15"),document.getElementById("16"),document.getElementById("17"),document.getElementById("18"),document.getElementById("19"),document.getElementById("20"),document.getElementById("21"),document.getElementById("22"),document.getElementById("23"),document.getElementById("24")];
	 dom =  dom_choice[Math.floor(Math.random()*24)];
	 dom2 =  dom_choice[Math.floor(Math.random()*24)];
	const img_choice = ["<img style='display:block;' height='100%' width='100%' src='./images/ok.png' onclick='win()' />","<img style='display:block;' height='100%' width='100%' src='./images/ok2.png' onclick='lose()' />"];
	let img = img_choice[Math.floor(Math.random()*2)];
	let img2 = img_choice[Math.floor(Math.random()*2)];
	dom.innerHTML = img;
	dom2.innerHTML = img2;
	const time_choice = [900, 1000, 1200];
	let time = time_choice[Math.floor(Math.random()*3)];
	
};


function stop(){
count_l = 10;
count_w = 0;
music.pause();
clearInterval(cntdown_clear);
clearInterval(start_ran);
};

function cntdown(){
	if(cnt == 0){
		document.getElementById("countdown").innerHTML = cnt;
		stop();
	}else{
	document.getElementById("countdown").innerHTML = cnt;
	cnt--;
	}
};

function start(){
count_l = 0;
count_w = 0;
cnt = 100;
right.innerHTML = count_w;
wrong.innerHTML = count_l;
start_ran = setInterval(getrandomtd,1000);
cntdown_clear = setInterval(cntdown,1000);
music.loop=true;
music.play();
};

function win(){
	count_w++;
	right.innerHTML = count_w;
}


function lose(){
	count_l++;
	wrong.innerHTML = count_l;
}