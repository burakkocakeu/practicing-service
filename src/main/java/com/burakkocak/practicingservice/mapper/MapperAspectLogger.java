package com.burakkocak.practicingservice.mapper;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@ConditionalOnProperty(name = "aspect.enable.mapper.package", havingValue = "enabled")
public class MapperAspectLogger {

    @Pointcut(value = "execution(* com.burakkocak.practicingservice.mapper.spring..*(..))")
    public void mapperPointcut() {}

    @Around("mapperPointcut()")
    public Object loggingAspect(ProceedingJoinPoint point) throws Throwable {
        String methodName = point.getSignature().getName();
        String className = point.getTarget().getClass().getSimpleName();
        String input = getInputName(point.getSignature());
        String output = getOutputName(point.getSignature());

        log.info("Mapping: {} to {} at {}.{}()", input, output, className, methodName);
        Object o = point.proceed();

        return o;
    }

    private static String getInputName(Signature signature) {
        return getSimpleName(((MethodSignature) signature).getMethod().getGenericParameterTypes()[0].getTypeName());
    }

    private static String getOutputName(Signature signature) {
        return getSimpleName(((MethodSignature) signature).getMethod().getGenericReturnType().getTypeName());
    }

    private static String getSimpleName(String name) {
        if (name.contains("<")) {
            String[] parts = name.split("<");
            return parts[0].substring(parts[0].lastIndexOf(".") + 1) + "<" +
                    parts[1].substring(parts[1].lastIndexOf(".") + 1);
        } else {
            return name.substring(name.lastIndexOf(".") + 1);
        }
    }

}
