package wz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55544a = 0;

    static {
        Object objL;
        Object objL2;
        Exception exc = new Exception();
        String simpleName = c.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objL = xy.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        if (qy.o.a(objL) != null) {
            objL = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objL2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            objL2 = com.bumptech.glide.e.l(th3);
        }
        if (qy.o.a(objL2) != null) {
            objL2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
