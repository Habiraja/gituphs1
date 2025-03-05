var num = document.getElementById("give");
var random = Math.floor(Math.random()*10);
var scoreBoard = document.getElementById("scoreBoard");
var score = 10;
function check(){
    var numValue = Number(num.value);
    if(numValue == random){
        alert("You are Won !!!");
    }else{
        score = score - 1;
        scoreBoard.textContent = score;
        if(score == 0){
            alert("You are lose !!!");
        }
    }
}