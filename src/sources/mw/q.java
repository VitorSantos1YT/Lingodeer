package mw;

import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f42625c = Logger.getLogger(lw.f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42626a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.f0 f42627b;

    public q(lw.f0 f0Var, long j11, String str) {
        Preconditions.k(str, "description");
        this.f42627b = f0Var;
        String strConcat = str.concat(" created");
        lw.a0 a0Var = lw.a0.CT_INFO;
        Preconditions.k(strConcat, "description");
        Preconditions.k(a0Var, "severity");
        b(new lw.b0(strConcat, a0Var, j11, null));
    }

    public static void a(lw.f0 f0Var, Level level, String str) {
        Logger logger = f42625c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + f0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(lw.b0 b0Var) {
        Level level;
        int i11 = p.f42609a[b0Var.f40345b.ordinal()];
        if (i11 != 1) {
            level = i11 != 2 ? Level.FINEST : Level.FINER;
        } else {
            level = Level.FINE;
        }
        synchronized (this.f42626a) {
        }
        a(this.f42627b, level, b0Var.f40344a);
    }
}
