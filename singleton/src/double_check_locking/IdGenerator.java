package double_check_locking;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    /**
     * AtomicLong은 Java동시성 라이브러리에서 제공하는 원자 변수 유형
     * 스레드부터 안전한 원자 연산으로 잠글 필요가 있는 일부 스레드로 부터
     * 안전하지 않은 복합 연산을 캡슐화, 아래의 incrementAndGet()에서 사용
     */
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;


    private IdGenerator(){

    }

    public static IdGenerator getInstance() {
        if (instance == null){
            synchronized (IdGenerator.class){   //class 잠금 처리
                instance = new IdGenerator();
            }
        }
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
