package ns;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class l0 {
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f44002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f44003b;

    public /* synthetic */ l0(int i11, i0 i0Var, o0 o0Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, j0.f43991a.getDescriptor());
            throw null;
        }
        this.f44002a = i0Var;
        this.f44003b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.m.a(this.f44002a, l0Var.f44002a) && kotlin.jvm.internal.m.a(this.f44003b, l0Var.f44003b);
    }

    public final int hashCode() {
        return this.f44003b.hashCode() + (this.f44002a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseMistakeExplainPrompt(meta=" + this.f44002a + ", questionData=" + this.f44003b + ")";
    }

    public l0(i0 i0Var, o0 o0Var) {
        this.f44002a = i0Var;
        this.f44003b = o0Var;
    }
}
