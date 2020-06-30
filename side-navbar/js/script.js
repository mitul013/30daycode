function scrollAppear(){
	var text = document.getElementsByClassName("text");
	for(var i=0;i<text.length;i++){
	var textposition = text[i].getBoundingClientRect().top;
	var screenposition = window.innerHeight/1.2;
	
	if(screenposition > textposition){
		console.log('xx');
		text[i].classList.add('text-appear');
	}
	}
}
scrollAppear();
window.addEventListener('scroll',scrollAppear);