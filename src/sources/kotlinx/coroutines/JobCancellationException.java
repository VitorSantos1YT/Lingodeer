package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import rz.g1;
import rz.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g1 f38364a;

    public JobCancellationException(String str, Throwable th2, g1 g1Var) {
        super(str);
        this.f38364a = g1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!m.a(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.f38364a;
        if (obj2 == null) {
            obj2 = v1.f50964a;
        }
        Object obj3 = this.f38364a;
        if (obj3 == null) {
            obj3 = v1.f50964a;
        }
        return m.a(obj2, obj3) && m.a(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        m.c(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f38364a;
        if (obj == null) {
            obj = v1.f50964a;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f38364a;
        if (obj == null) {
            obj = v1.f50964a;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
