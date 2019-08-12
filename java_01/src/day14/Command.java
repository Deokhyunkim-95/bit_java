package day14;

@FunctionalInterface //람다로 표현이 가능한 대상들
public interface Command {
	public void exec();
	default public void check() {
		System.out.println("Command check() 함수");
	} //인터페이스 안에는 추상메소드 이외에 디폴트메소드 추가가능 디폴트메소드는 인스턴스메소드가 아니다.
		
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Delete(삭제) 수행");
	}
	
	public void check() {
		System.out.println("DeleteCommand check() 함수");
	}
	
}
class InsertCommand implements Command{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Insert(등록) 수행");
	}
}
class UpdateCommand implements Command{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Update(수정) 수행");
	}
}
class ListCommand implements Command{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("List(목록) 수행");
	}
}
