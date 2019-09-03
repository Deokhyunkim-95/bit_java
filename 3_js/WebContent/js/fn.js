/**
 * 
 */
console.log("fn.js log");
let name = "홍길동";
let flag = true<10;
let now = new Date();
let num = 99;
const pi = 3.14;

/*자바스크립트 함수는 일급함수
	-함수를 값으로 다룰수 있다.
	-변수에 함수를 담을 수 있다.
	-함수의 결과 값 리턴값으로 사용가능
	-함수의 인자로 사용가능
*/

const log = console.log;

function f1(){
	alert("hello javascript");
}

const f2 = f1;

const f3 = () => alert("hello javascript");

const f4 = (i) => alert(i);

function sum(a,b,c) {
	if(!c) c=0;
	return a+b+c;
}
function sumAll(){
	let sum = 0;
	
	for(let i=0 ;i < arguments.length ; i++){
		sum += arguments[i];
		}
	
	return sum;
}

function small(a,b){
	if(a<b)	return a;
	else if(b<a) return b;
}

const min = (a,b) => a > b ? b : a;

function callback(){
	log('callback');	
}

function callTenTimes(fn){
	for(let i = 0 ;i<3;i++){
		try {
			fn();	
		} catch (e) {
			log("함수를 넘겨주세요");
		}
	}
}
//callTenTimes(callback);

//callTenTimes(function(){
//	log("~~~~~~~");
//});

//callTenTimes(()=>alert("~~~~~~~"));
//
//let fc;
//callTenTimes(fc = ()=>alert("~~~~~~~"));

//let intervalId = setInterval(callback,3000); //3초마다 callback함수 호출
//clearInterval(intervalId); //멈추게하는 명령어

//let id2 = setInterval(function() {
//	log(new Date());
//}, 1000);
//
//
//setTimeout(function() {
//	clearInterval(id2);	
////	location.href="http://www.naver.com";	
//	location.href="http://localhost:8000/2_css/submenu/prob1_teacher.html";
//},5000);

function fa() {
	let data = 0;
	function inner(){
		return ++data;
	}
	return inner;
};

let ff1 = fa;

let ff2 = fa();

ff1()()
ff1()()
ff1()()
ff1()()

ff2()
ff2()
ff2()
ff2()

let fb1 =function fb() {
		let data = 0;
		function inner(){
			return ++data;
		}
		return inner;
	};
	
	let fb2 =function fb() {
		let data = 0;
		function inner(){
			return ++data;
		}
		return inner;
	}();

