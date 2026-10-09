package tz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f52705a;

    public m(Throwable th2) {
        this.f52705a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.m.a(this.f52705a, ((m) obj).f52705a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f52705a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // tz.n
    public final String toString() {
        return "Closed(" + this.f52705a + ')';
    }
}
