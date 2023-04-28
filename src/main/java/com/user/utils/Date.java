package com.user.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public final class Date {

    public static final String DATE_PATTERN = "dd-MM-yyyy HH:mm:ss";

    public static String dateNow() {
        return DateTimeFormatter.ofPattern(DATE_PATTERN)
                .withZone(ZoneOffset.UTC)
                .format(LocalDateTime.now());
    }

    public Date() {}
}
