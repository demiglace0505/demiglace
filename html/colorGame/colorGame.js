var numOfSquares = 6;
var colors = [];
var pickedColor;
var squares = document.querySelectorAll(".square");
var colorDisplay = document.querySelector("#colorDisplay");
var messageDisplay = document.querySelector("#message");
var heading = document.querySelector("#heading");
var resetButton = document.querySelector("#reset");
var modeButton = document.querySelectorAll(".mode");

init();

function init(){
    resetButton.addEventListener("click", function(){
        reset();
    });
    initmodeButton();
    //mode listeners 
    initsquareListeners();
    reset();
}

function reset(){
    //generate new set of colors
    colors=generateRandomColor(numOfSquares);
    //pick a color from new colors
    pickedColor = pickColor();
    //change color displayed
    colorDisplay.textContent = pickedColor;
    //reset heading color
    heading.style.backgroundColor = "rgb(216,185,216)";
    //reset message
    messageDisplay.textContent = "";
    resetButton.textContent = "NEW COLORS";

    //change all square colors
    for(var i = 0; i < squares.length; i++){
        if(colors[i]){//if square has a color
            squares[i].style.display ="block";
            squares[i].style.backgroundColor = colors[i];
        }
        else {//if square has no color
            squares[i].style.display ="none";
        }
        
    }
    
    reset();
}

function changeColors(color){
    //all squares match given color
    for (var i=0; i<squares.length; i++){
        squares[i].style.backgroundColor = color;
    }
}

function pickColor(){
    var random = Math.floor(Math.random() * colors.length);
    return colors[random];
}

function generateRandomColor(num){
    //add num random colors to array
    var arr = [];
    for(var i = 0; i < num; i++){
        //random color into array
        arr.push(randomColor());
    }
    return arr;
}

function randomColor(){
    //R channel
    var rChannel = Math.floor(Math.random() * 256);
    //G channel
    var gChannel = Math.floor(Math.random() * 256);
    //B channel
    var bChannel = Math.floor(Math.random()* 256);
    //return
    return "rgb(" + rChannel + ", " + gChannel + ", " + bChannel + ")";
}

function initmodeButton(){
    for (var i =0; i<modeButton.length; i++){
        modeButton[i].addEventListener("click", function(){
            //mode selector
            modeButton[0].classList.remove("selected");
            modeButton[1].classList.remove("selected");
            this.classList.add("selected");
            if (this.textContent === "Easy"){
                numOfSquares = 3;
            }
            else {
                numOfSquares =6;
            }
            reset();
        })
    }
}

function initsquareListeners(){
    for(var i = 0; i < squares.length; i++){
        //click listeners to squares
        squares[i].addEventListener("click", function(){
            //color grab
            var clickedColor = (this.style.backgroundColor);
            //compare color
            if(clickedColor === pickedColor){
                //win
                messageDisplay.textContent = "Correct";
                changeColors(clickedColor);
                heading.style.backgroundColor = clickedColor;
                resetButton.textContent = "Play Again?";
    
            }
            else{
                this.style.backgroundColor = "#232323";
                messageDisplay.textContent = "Try again";
            }
    
        });
    }
}