/**
 * 싱글톤 패턴 : 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴.
 * 호이스팅 : 변수의 선언문을 유효 범위의 최상단으로 끌어올리는 행위
 	변수나 함수의 호출,코드가 선언 코드보다 아래쪽에 있음에도 불구하고 에러가 발생하지 않고, 마치 선언코드가 호출 코드보다 더 위에 선언된 것과 같이 동작하는 특성
 	변수의 사용 및 함수의 실행 코드가 선언보다 먼저 일어나도 정상 진행이 되도록 해주는 것
 	함수는 함수의 선언식만 호이스팅이 일어난다.
 * 클로져 : 외부함수의 변수에 접글할 수 있는 내부함수를 일컫습니다
 * var : 변수 재선언 가능, 변수 재할당 가능
 * let : 변수 재선언 불가능, 변수 재할당 가능
 * const : 변수 재선언 불가능, 변수 재할당 불가능
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
	
let fb3 = fb1();
	
	let fb2 =function fb() {
		let data = 0;
		function inner(){
			return ++data;
		}
		return inner;
	}();
	
let fb4 = fb2;

