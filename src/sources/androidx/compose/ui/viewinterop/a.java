package androidx.compose.ui.viewinterop;

import s2.a0;
import y2.d1;
import y3.l;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f1234a;

    public a(a0 a0Var) {
        this.f1234a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1234a == ((a) obj).f1234a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        return new l(this.f1234a);
    }

    public final int hashCode() {
        return this.f1234a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        l lVar = (l) qVar;
        a0 a0Var = this.f1234a;
        lVar.Q = a0Var;
        if (lVar.P) {
            a0Var.invoke(lVar.R);
        }
    }
}
