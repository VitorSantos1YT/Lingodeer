package wz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements vy.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f55549a;

    public v(ThreadLocal threadLocal) {
        this.f55549a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.m.a(this.f55549a, ((v) obj).f55549a);
    }

    public final int hashCode() {
        return this.f55549a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f55549a + ')';
    }
}
