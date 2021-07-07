package learn.transaction;


import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class DefaultFooService implements FooService{
    @Override
    public Foo getFoo(String fooName) {
        System.out.println("getFoo(String) been called");
        throw new UnsupportedOperationException();
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        System.out.println("getFoo(String, String) been called");
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertFoo(Foo foo) {
        System.out.println("insertFoo been called");
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateFoo(Foo foo) {
        System.out.println("updateFoo been called");
        throw new UnsupportedOperationException();
    }
}
