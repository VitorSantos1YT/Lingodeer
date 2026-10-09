package app.rive;

import fz.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveLog {
    public static final RiveLog INSTANCE = new RiveLog();
    private static volatile Logger logger = NoOpLogger.INSTANCE;
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogcatLogger implements Logger {
        public static final int $stable = 0;

        @Override // app.rive.RiveLog.Logger
        public void d(String tag, a msg) {
            m.f(tag, "tag");
            m.f(msg, "msg");
        }

        @Override // app.rive.RiveLog.Logger
        public void e(String tag, Throwable th2, a msg) {
            m.f(tag, "tag");
            m.f(msg, "msg");
        }

        @Override // app.rive.RiveLog.Logger
        public void i(String tag, a msg) {
            m.f(tag, "tag");
            m.f(msg, "msg");
        }

        @Override // app.rive.RiveLog.Logger
        public void v(String tag, a msg) {
            m.f(tag, "tag");
            m.f(msg, "msg");
        }

        @Override // app.rive.RiveLog.Logger
        public void w(String tag, a msg) {
            m.f(tag, "tag");
            m.f(msg, "msg");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Logger {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class DefaultImpls {
            public static void d(Logger logger, String tag, a msg) {
                m.f(tag, "tag");
                m.f(msg, "msg");
            }

            public static void e(Logger logger, String tag, Throwable th2, a msg) {
                m.f(tag, "tag");
                m.f(msg, "msg");
            }

            public static /* synthetic */ void e$default(Logger logger, String str, Throwable th2, a aVar, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
                }
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                logger.e(str, th2, aVar);
            }

            public static void i(Logger logger, String tag, a msg) {
                m.f(tag, "tag");
                m.f(msg, "msg");
            }

            public static void v(Logger logger, String tag, a msg) {
                m.f(tag, "tag");
                m.f(msg, "msg");
            }

            public static void w(Logger logger, String tag, a msg) {
                m.f(tag, "tag");
                m.f(msg, "msg");
            }
        }

        void d(String str, a aVar);

        void e(String str, Throwable th2, a aVar);

        void i(String str, a aVar);

        void v(String str, a aVar);

        void w(String str, a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NoOpLogger implements Logger {
        public static final int $stable = 0;
        public static final NoOpLogger INSTANCE = new NoOpLogger();

        private NoOpLogger() {
        }

        @Override // app.rive.RiveLog.Logger
        public void d(String str, a aVar) {
            Logger.DefaultImpls.d(this, str, aVar);
        }

        @Override // app.rive.RiveLog.Logger
        public void e(String str, Throwable th2, a aVar) {
            Logger.DefaultImpls.e(this, str, th2, aVar);
        }

        @Override // app.rive.RiveLog.Logger
        public void i(String str, a aVar) {
            Logger.DefaultImpls.i(this, str, aVar);
        }

        @Override // app.rive.RiveLog.Logger
        public void v(String str, a aVar) {
            Logger.DefaultImpls.v(this, str, aVar);
        }

        @Override // app.rive.RiveLog.Logger
        public void w(String str, a aVar) {
            Logger.DefaultImpls.w(this, str, aVar);
        }
    }

    private RiveLog() {
    }

    public static final void d(String tag, a msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().d(tag, msg);
    }

    public static final void e(String tag, Throwable th2, a msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().e(tag, th2, msg);
    }

    public static /* synthetic */ void e$default(String tag, Throwable th2, a msg, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().e(tag, th2, msg);
    }

    public static final void i(String tag, a msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().i(tag, msg);
    }

    public static final void v(String tag, a msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().v(tag, msg);
    }

    public static final void w(String tag, a msg) {
        m.f(tag, "tag");
        m.f(msg, "msg");
        INSTANCE.getLogger().w(tag, msg);
    }

    public final Logger getLogger() {
        return logger;
    }

    public final void setLogger(Logger logger2) {
        m.f(logger2, "<set-?>");
        logger = logger2;
    }
}
