For NvaBar always use display:flex for responsiveness


(1) For scroll bar Css :-

body::-webkit-scrollbar{
	width: .3rem;
}

body::-webkit-scrollbar-track{
	background:grey;
}

body::-webkit-scrollbar-thumb{
	background:black;
}


(2) When we use display:none to display:block we are not able to transition effect

sol 1 :- use opacity 0 and pointer-events:none 
problem:- but this sol take space

sol2 :- add css like below using key frames
@-webkit-keyframes slide-down {
      0% { opacity: 0; -webkit-transform: translateY(-50%); }   
    100% { opacity: 1; -webkit-transform: translateY(0); }
}
@-moz-keyframes slide-down {
      0% { opacity: 0; -moz-transform: translateY(-50%); }   
    100% { opacity: 1; -moz-transform: translateY(0); }
}

apply in any css like
	-webkit-animation: slide-down .6s ease-out;
    	-moz-animation: slide-down .6s ease-out;
      
also we modify this to translae X ,rotate and e.t.c
