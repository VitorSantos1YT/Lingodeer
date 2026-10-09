package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f45538a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i11;
        m.f(record, "record");
        AndroidLog androidLog = AndroidLog.f45535a;
        String loggerName = record.getLoggerName();
        m.e(loggerName, "getLoggerName(...)");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i11 = 5;
        } else {
            i11 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        m.e(message, "getMessage(...)");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        AndroidLog.a(loggerName, i11, message, thrown);
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
