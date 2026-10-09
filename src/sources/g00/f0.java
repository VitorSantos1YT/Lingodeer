package g00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements e00.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00.g f28387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00.g f28388c;

    public f0(String str, e00.g gVar, e00.g gVar2) {
        this.f28386a = str;
        this.f28387b = gVar;
        this.f28388c = gVar2;
    }

    @Override // e00.g
    public final String a() {
        return this.f28386a;
    }

    @Override // e00.g
    public final boolean c() {
        return false;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        Integer numT0 = oz.x.t0(name);
        if (numT0 != null) {
            return numT0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // e00.g
    public final o00.a e() {
        return e00.m.f24702e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f28386a, f0Var.f28386a) && kotlin.jvm.internal.m.a(this.f28387b, f0Var.f28387b) && kotlin.jvm.internal.m.a(this.f28388c, f0Var.f28388c);
    }

    @Override // e00.g
    public final int f() {
        return 2;
    }

    @Override // e00.g
    public final String g(int i11) {
        return String.valueOf(i11);
    }

    @Override // e00.g
    public final List getAnnotations() {
        return ry.r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        if (i11 >= 0) {
            return ry.r.f50854a;
        }
        throw new IllegalArgumentException(ep.a.k(w4.c.i(i11, "Illegal index ", ", "), this.f28386a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f28388c.hashCode() + ((this.f28387b.hashCode() + (this.f28386a.hashCode() * 31)) * 31);
    }

    @Override // e00.g
    public final e00.g i(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(ep.a.k(w4.c.i(i11, "Illegal index ", ", "), this.f28386a, " expects only non-negative indices").toString());
        }
        int i12 = i11 % 2;
        if (i12 == 0) {
            return this.f28387b;
        }
        if (i12 == 1) {
            return this.f28388c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // e00.g
    public final boolean isInline() {
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        if (i11 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(ep.a.k(w4.c.i(i11, "Illegal index ", ", "), this.f28386a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f28386a + '(' + this.f28387b + ", " + this.f28388c + ')';
    }
}
