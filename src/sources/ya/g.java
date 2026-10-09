package ya;

import androidx.window.core.WindowStrictModeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import ry.l;
import se.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f57553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowStrictModeException f57554d;

    public g(Object value, String str, a aVar, i verificationMode) {
        m.f(value, "value");
        m.f(verificationMode, "verificationMode");
        this.f57551a = value;
        this.f57552b = str;
        this.f57553c = verificationMode;
        String message = k.m(value, str);
        m.f(message, "message");
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(message);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        m.e(stackTrace, "getStackTrace(...)");
        windowStrictModeException.setStackTrace((StackTraceElement[]) l.O(stackTrace).toArray(new StackTraceElement[0]));
        this.f57554d = windowStrictModeException;
    }

    @Override // se.k
    public final Object l() throws WindowStrictModeException {
        int i11 = f.f57550a[this.f57553c.ordinal()];
        if (i11 == 1) {
            throw this.f57554d;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String message = k.m(this.f57551a, this.f57552b);
        m.f(message, "message");
        return null;
    }

    @Override // se.k
    public final k B(String str, fz.c cVar) {
        return this;
    }
}
