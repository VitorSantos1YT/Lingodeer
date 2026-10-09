package vy;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f54321a = new j();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f54321a;
    }

    @Override // vy.i
    public final g get(h key) {
        m.f(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // vy.i
    public final i minusKey(h key) {
        m.f(key, "key");
        return this;
    }

    @Override // vy.i
    public final i plus(i context) {
        m.f(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return obj;
    }
}
