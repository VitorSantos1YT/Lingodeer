package g00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements e00.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00.f f28430b;

    public k1(String str, e00.f kind) {
        kotlin.jvm.internal.m.f(kind, "kind");
        this.f28429a = str;
        this.f28430b = kind;
    }

    @Override // e00.g
    public final String a() {
        return this.f28429a;
    }

    public final void b() {
        throw new IllegalStateException(ep.a.k(new StringBuilder("Primitive descriptor "), this.f28429a, " does not have elements"));
    }

    @Override // e00.g
    public final boolean c() {
        return false;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        b();
        throw null;
    }

    @Override // e00.g
    public final o00.a e() {
        return this.f28430b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.m.a(this.f28429a, k1Var.f28429a) && kotlin.jvm.internal.m.a(this.f28430b, k1Var.f28430b);
    }

    @Override // e00.g
    public final int f() {
        return 0;
    }

    @Override // e00.g
    public final String g(int i11) {
        b();
        throw null;
    }

    @Override // e00.g
    public final List getAnnotations() {
        return ry.r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f28430b.hashCode() * 31) + this.f28429a.hashCode();
    }

    @Override // e00.g
    public final e00.g i(int i11) {
        b();
        throw null;
    }

    @Override // e00.g
    public final boolean isInline() {
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        b();
        throw null;
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("PrimitiveDescriptor("), this.f28429a, ')');
    }
}
