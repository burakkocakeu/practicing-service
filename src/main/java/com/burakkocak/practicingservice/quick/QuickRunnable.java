package com.burakkocak.practicingservice.quick;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickRunnable {

    public static void main(String[] args) {
        log.error("A status '{}' PSP QR Code payment is not found.", PspQrStatusType.COMPLETED);
    }

}
