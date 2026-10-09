package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46332e;

    public b0(Object obj) {
        this(-1L, obj);
    }

    public final b0 a(Object obj) {
        if (this.f46328a.equals(obj)) {
            return this;
        }
        return new b0(obj, this.f46329b, this.f46330c, this.f46331d, this.f46332e);
    }

    public final boolean b() {
        return this.f46329b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f46328a.equals(b0Var.f46328a) && this.f46329b == b0Var.f46329b && this.f46330c == b0Var.f46330c && this.f46331d == b0Var.f46331d && this.f46332e == b0Var.f46332e;
    }

    public final int hashCode() {
        return ((((((((this.f46328a.hashCode() + 527) * 31) + this.f46329b) * 31) + this.f46330c) * 31) + ((int) this.f46331d)) * 31) + this.f46332e;
    }

    public b0(long j11, Object obj) {
        this(obj, -1, -1, j11, -1);
    }

    public b0(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }

    public b0(Object obj, int i11, int i12, long j11, int i13) {
        this.f46328a = obj;
        this.f46329b = i11;
        this.f46330c = i12;
        this.f46331d = j11;
        this.f46332e = i13;
    }
}
