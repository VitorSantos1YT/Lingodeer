package com.google.logging.type;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(NOTICE_VALUE),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(ALERT_VALUE),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);

    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap = new Internal.EnumLiteMap<LogSeverity>() { // from class: com.google.logging.type.LogSeverity.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            return LogSeverity.a(i11);
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogSeverityVerifier implements Internal.EnumVerifier {
        static {
            new LogSeverityVerifier();
        }

        private LogSeverityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            return LogSeverity.a(i11) != null;
        }
    }

    LogSeverity(int i11) {
        this.value = i11;
    }

    public static LogSeverity a(int i11) {
        if (i11 == 0) {
            return DEFAULT;
        }
        if (i11 == 100) {
            return DEBUG;
        }
        if (i11 == 200) {
            return INFO;
        }
        if (i11 == 300) {
            return NOTICE;
        }
        if (i11 == 400) {
            return WARNING;
        }
        if (i11 == 500) {
            return ERROR;
        }
        if (i11 == 600) {
            return CRITICAL;
        }
        if (i11 == 700) {
            return ALERT;
        }
        if (i11 != 800) {
            return null;
        }
        return EMERGENCY;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
