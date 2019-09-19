package aop.static_proxy;

/**
 * 静态代理的代理方
 * @Author: fnbory
 * @Date: 2019/9/19 14:01
 */
public class SubjectProxy implements Subject {

    private  Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int request(int i) {
        if(i>10){
            return subject.request(i);
        }
        return 0;
    }

    public static void main(String[] args) {

        Subject subject=new SubjectInstance();
        SubjectProxy subjectProxy=new SubjectProxy(subject);
        System.out.println(subjectProxy.request(4));
    }
}
