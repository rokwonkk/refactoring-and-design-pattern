package holder_initializaion;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator2 {
    /**
     *  홀더에 의한 초기화는 스레드 안정성을 보장하면서 지연 적제도 가능 .. 굿
     */
    private AtomicLong id = new AtomicLong(0);

    public IdGenerator2() {
    }


    private static class SingletonHolder{
        private static final IdGenerator2 instance = new IdGenerator2();
    }

    //getInstance() 처음 호출 되는 시점에 holder에 적재되고 인스턴스 생성.
    public static IdGenerator2 getInstance(){
        return SingletonHolder.instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
