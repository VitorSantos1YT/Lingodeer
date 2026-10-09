package g00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 implements e00.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00.g f28445a;

    public o0(e00.g gVar) {
        this.f28445a = gVar;
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
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // e00.g
    public final o00.a e() {
        return e00.m.f24701d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f28445a, o0Var.f28445a) && kotlin.jvm.internal.m.a(a(), o0Var.a());
    }

    @Override // e00.g
    public final int f() {
        return 1;
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
        StringBuilder sbI = w4.c.i(i11, "Illegal index ", ", ");
        sbI.append(a());
        sbI.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f28445a.hashCode() * 31);
    }

    @Override // e00.g
    public final e00.g i(int i11) {
        if (i11 >= 0) {
            return this.f28445a;
        }
        StringBuilder sbI = w4.c.i(i11, "Illegal index ", ", ");
        sbI.append(a());
        sbI.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbI.toString().toString());
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
        StringBuilder sbI = w4.c.i(i11, "Illegal index ", ", ");
        sbI.append(a());
        sbI.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f28445a + ')';
    }
}
