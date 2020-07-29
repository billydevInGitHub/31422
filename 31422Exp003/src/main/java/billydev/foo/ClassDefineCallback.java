package billydev.foo;

import billydev.bar.ClassUseCallback;

public class ClassDefineCallback {
    public void defineCallback(){
        String str = "Env variable";
        ClassUseCallback classUseCallback = new ClassUseCallback();
        classUseCallback.setConsumer((a) -> {
            System.out.println(str);}
        );


        classUseCallback.operate();

    }
}
