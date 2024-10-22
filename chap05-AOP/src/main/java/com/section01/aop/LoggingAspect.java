package com.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class LoggingAspect {

    /*
    * @Aspect
    *  - pointcut 과 advice 를 하나의 클래스 단위로 정의하기 위한 어노테이션이다
    *
    *  조인포인트 = aop 에서 특정한 실행 지점을 의미한다.
    *  종류
    *  메소드 호출 = 특정 메서드가 호출될때
    *  메소드 실행 = 특정 메소드의 실행이 완료된후
    *  예외 발생 = 특정 메소드 내에서 예외가 발생
    *  필드 접근 = 객체의 필드에 접근할 떄
    *
    *  pointcut = 특정 조건에 의해 필터링된 조인포인트
    *  수많은 조인포인트 중에 특정  메소드만 횡단 공통기능을 수행하기 위해 사용한다
    *  advice =  횡단 관심에 해당하는 공통 기능의 코드
    * */
    // pointcut 관심 조인 포인트를 결정하여 어드바이스가 실행되는 시기를 제어한다
    // execution = 메소드 실행 조인 프인트를 매칭한다
    // excution (* 리턴타입. 이름(파라미터))
    // *Service.*(..) - 매개변수가 0개 이상인 모드 메서드
    // *Service.*(*) - 매개변수가 1개인 모든 메서드
    // *Service.*(*,*) - 매개변수가 2개인 모드 메서드
    @Pointcut("execution(* com.section01.aop.*Service.*(..))")
    public void logPointCut() {
        System.out.println("실행여부");
    }
    @Before("LoggingAspect.logPointCut()")
    public void logBefore(JoinPoint joinPoint) {
        //현재 실행중인 타깃 객체를 반환
        System.out.println("before joinpoint.getTartet() : " + joinPoint.getTarget());
        System.out.println("before jointpoint.getSignature() : " + joinPoint.getSignature());

        if(joinPoint.getArgs().length >0) {
            System.out.println("before joinpoint.getArgs()[] : " + joinPoint.getArgs()[0]);
        }
    }
    @After("logPointCut()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("after joinpoint.getTarget() : " + joinPoint.getTarget());

        System.out.println("after joinpoint.getSignature() : " + joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "logPointCut()",returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning result"+ result);
        if(result != null&& result instanceof Map<?,?>) {
            ((Map<Integer,MemberDTO>)result).put(100,new MemberDTO(100,"가공된값"));
        }
    }
    @AfterThrowing(pointcut = "logPointCut()", throwing = "exception")
    public void logAfterThrowing(Throwable exception){
        System.out.println("after Throwing exception : " + exception);
    }

    @Around("logPointCut()")
    /*
    * Around Advice는 가장 강력한 어드바이스이다
    * 이 어드바이스는 조인포인트를 완전히 장악한다
    * 따라서 앞에 살펴 본 어드바이스 모두 Around 어드바이스로 조합할 수 있다
    * 매개변수는 ProceedingJoinPoint 로 고정되어 있다
    * JoinPoint 의 하위 인터페이스로 원본 조인포인트의 진행 시점을 제어할 수 있다
    * */
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //메소드 실행 전 로그 출력
        System.out.println("Around Before"+joinPoint.getSignature().getName());
        //원본 메소드 실행
        Object result = joinPoint.proceed();
        if(result != null&& result instanceof Map<?,?>) {
            ((Map<Integer,MemberDTO>)result).put(111,new MemberDTO(100,"반환값 가공"));
        }
        System.out.println("Around After"+joinPoint.getSignature().getName());
        return result;
    }
}
