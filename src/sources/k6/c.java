package k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f37913c = new c(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f37914d = new c(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37916b;

    public c(int i11, int i12) {
        this.f37915a = i11;
        this.f37916b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        c cVar = (c) obj;
        return this.f37915a == cVar.f37915a && this.f37916b == cVar.f37916b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37916b) + (Integer.hashCode(this.f37915a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) a.b(this.f37915a)) + ", vertical=" + ((Object) b.b(this.f37916b)) + ')';
    }
}
