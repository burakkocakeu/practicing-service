package com.burakkocak.practicingservice.quick.strategypattern;

import com.burakkocak.practicingservice.quick.PspQrStatusType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DiscounterService {

    public static void main(String[] args) {
        PspQrStatusType pspQrStatusType = PspQrStatusType.valueOf("INITIATED");
        log.info("psp code: " + pspQrStatusType);
    }

}
