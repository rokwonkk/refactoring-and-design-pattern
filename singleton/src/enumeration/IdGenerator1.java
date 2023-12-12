package enumeration;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator1 {
    /**
     *  열거형 특성을 이용해 인스턴스 생성 시 스레드 안전성과 인스턴스 유일성을 보장.
     */
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public Long getId(){
        return id.incrementAndGet();
    }
}
