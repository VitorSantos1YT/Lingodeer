package la;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f39849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f39850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e callbackName, Throwable th2) {
        super(th2);
        m.f(callbackName, "callbackName");
        this.f39849a = callbackName;
        this.f39850b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f39850b;
    }
}
