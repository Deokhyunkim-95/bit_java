/**
 * 자바스크립트 객체
 */

const log = console.log;

let array = ['가','다','하','나'];

array[4]='~~~~~';
array.pop()
array.push('A');

for(let a ;a<array.length;a++){
	log(a);
}

//array.forEach(i=> log(i));
//array.forEach(i=> document.write("<h4>"+i+"</h4>"));

//array.filter(i => i>'다').forEach(i=> log(i));

//자바스크립트 객체 : 싱글톤
// 싱글톤 패턴 : 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴.

let student = {
	name:"홍길동",
	ko:99,
	eng:100,
	sum:function(){
		return this.ko+this.eng;
	},
	avg:function(){
		return this.sum()/2;
	}
}
/* 자바와 다르게 자바스크립트는 this생략 불가능
 * let student = {
		name:"홍길동",
		ko:99,
		eng:100,
		sum:function(){
			return ko+eng;
		},
		avg:function(){
			return sum()/2;
		}
	}*/
/*
 * let student = {
		name:"홍길동",
		ko:99,
		eng:100,
		
		avg:function(){
			return this.sum()/2;
		}
	}*/

/*student["name"];
student.name;
student.avg();

student.address='서울';

delete student.address;
//delete student.sum;

for(let data in student){
	log(student[data]);
}
/*for(let data in student){
	log(student.data); //불가능한 방법
}*/

let product= [
	{name:"바나나",price:700},
	{name:"체리",price:1700},
	{name:"사과",price:900},
	{name:"배",price:5000},
	{name:"수박",price:1700}
];

product[0].name;
product[0]["name"];
product[0].price;


for(let data in product){
	log(product[data]);
	for(let d in product[data]){
		log(product[data][d]);
		
	}
}

function print_product(data){
	log(data.name,"::",data.price);
}

print_product(product[0])

for(let data in product){
//	log(data)
	print_product(product[data])
}

array.forEach(i=>print_product[i]);


//자바스크립트 객체 => 생성자 함수를 통한 객체 생성
//객체는 자신만의 데이터를 가지며,
//함수는 공유하도록 설계한다. prototype에 등록해라

function Student(name,ko,eng){
	this.name=name;
	this.ko=ko;
	this.eng=eng;
}

Student.prototype.sum = function (){
	return this.ko+this.eng;
}
Student.prototype.avg = function(){
	return this.sum()/2;
}
Student.prototype.grade = function(){
	return this.avg()	>80?'A':'B';
}

let s1 = new Student("홍길동",90,77);
let s2 = new Student("고길동",99,77);
let s3 = new Student("박길동",69,57);

log(s1.name,"/", s1.avg());
log(s2.name, "/ ",s2.avg());
log(s3.name, "/ ",s3.avg());

//s1.grade = function(){
//	
//	return this.avg>80?'A':'B';
//}

//log(s1.name,"/", s1.avg(),"/",s1.grade());
//log(s2.name, "/ ",s2.avg(),"/",s2.grade());
//log(s3.name, "/ ",s3.avg(),"/",s3.grade());
//
//Object.prototype.grade = function(){
//	return this.avg()	>80?'A':'B';
//}

let students = [
	new Student("홍길동",90,77),
	new Student("고길동",99,77),
	new Student("박길동",69,57),
	new Student("이길동",95,77),
	new Student("김길동",26,76),
	new Student("최길동",60,50)
];


/*
let testin;
let testof;
for(let data in students){
	testin = data;
	log(students[data].name,"/",students[data].avg());
}
 //in은 인덱스가 나오고 of는 데이터가 나온다.
log('평균 리스트');

for(let data of students){
	testof = data;
	log(data.name,"/",data.avg());
}
*/
log(s1.toString());


Student.prototype.toString = function(){
	return this.name+"::"+this.avg();
}

log(s1.toString())
log(s2.toString())

for(let data in students){
	log(data.toString());
}
for(let data of students){
	log(data.toString());
}

students.forEach(i => log(i));
students.forEach(i => log(i.toString()));
students.forEach(i => log(i.avg()));


