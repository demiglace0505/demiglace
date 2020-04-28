let myButton = document.querySelector('button');
let myHeading = document.querySelector('h1');

myButton.onclick = function () {
	setUserName();
}

function setUserName() {
	let myName = prompt('Please enter your name.');
	if (!myName || myName === null) {
		setUserName();
	} else {
	localStorage.setItem('name', myName);
	myHeading.textContent = 'Hello, ' + myName;
	}
}

//initialization block

if(!localStorage.getItem('name')) { 
	setUserName();
} else {
	let storedName = localStorage.getItem('name');
	myHeading.textContent = 'Hello, ' + storedName;
}


let imageIcon = document.querySelector('img');

imageIcon.onclick = function () {
	let imgSrc = imageIcon.getAttribute('src');
	if (imgSrc === 'images/icon_01.png'){
		imageIcon.setAttribute('src', 'images/icon_02.png');
	} else if (imgSrc === 'images/icon_02.png') {
		imageIcon.setAttribute('src', 'images/icon_03.png');
	} else if (imgSrc === 'images/icon_03.png') {
		imageIcon.setAttribute('src', 'images/icon_04.png');
	} else if (imgSrc === 'images/icon_04.png') {
		imageIcon.setAttribute('src', 'images/icon_05.png');
	} else if (imgSrc === 'images/icon_05.png') {
		imageIcon.setAttribute('src', 'images/icon_01.png');
	}
}

