function scrollAppear(){
	var text = document.getElementsByClassName("text");
	for(var i=0;i<text.length;i++){
	var textposition = text[i].getBoundingClientRect().top;
	var screenposition = window.innerHeight/1.2;
	
	if(screenposition > textposition){
		text[i].classList.add('text-appear');
		console.log("zz");
	}
	}
	
	var image = document.getElementsByClassName("image");
	
	for(var i=0;i<image.length;i++){
		var imageposition = image[i].getBoundingClientRect().top;
		var screenposition = window.innerHeight/2;
			console.log(imageposition);
		if(imageposition < screenposition){
		if(i%2){
		gsap.fromTo(image[i], {x: 100}, {x: 0,opacity:1, duration: 1.5});}
		else{
		gsap.fromTo(image[i], {x: -100}, {x: 0,opacity:1 duration: 1.5})}
			gsap.fromTo(image[i], {scale: 1.2}, {scale: 1, duration: 1});
		}
	}
}
scrollAppear();
window.addEventListener('scroll',scrollAppear);