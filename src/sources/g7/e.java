package g7;

import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import p7.b0;
import y6.j0;
import y6.m0;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f28798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImmutableList f28799b = ImmutableList.s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImmutableMap f28800c = ImmutableMap.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f28801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f28802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f28803f;

    public e(m0 m0Var) {
        this.f28798a = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b0 b(j0 j0Var, ImmutableList immutableList, b0 b0Var, m0 m0Var) {
        o0 o0VarF = j0Var.F();
        int iK = j0Var.k();
        Object objL = o0VarF.p() ? null : o0VarF.l(iK);
        int iB = (j0Var.d() || o0VarF.p()) ? -1 : o0VarF.f(iK, m0Var, false).b(f0.K(j0Var.P()) - m0Var.f57232e);
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            b0 b0Var2 = (b0) immutableList.get(i11);
            if (c(b0Var2, objL, j0Var.d(), j0Var.x(), j0Var.n(), iB)) {
                return b0Var2;
            }
        }
        if (immutableList.isEmpty() && b0Var != null && c(b0Var, objL, j0Var.d(), j0Var.x(), j0Var.n(), iB)) {
            return b0Var;
        }
        return null;
    }

    public static boolean c(b0 b0Var, Object obj, boolean z11, int i11, int i12, int i13) {
        Object obj2 = b0Var.f46328a;
        int i14 = b0Var.f46329b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z11 && i14 == i11 && b0Var.f46330c == i12) {
            return true;
        }
        return !z11 && i14 == -1 && b0Var.f46332e == i13;
    }

    public final void a(ImmutableMap.Builder builder, b0 b0Var, o0 o0Var) {
        if (b0Var == null) {
            return;
        }
        if (o0Var.b(b0Var.f46328a) != -1) {
            builder.c(b0Var, o0Var);
            return;
        }
        o0 o0Var2 = (o0) this.f28800c.get(b0Var);
        if (o0Var2 != null) {
            builder.c(b0Var, o0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(o0 o0Var) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        if (this.f28799b.isEmpty()) {
            a(builder, this.f28802e, o0Var);
            if (!Objects.equals(this.f28803f, this.f28802e)) {
                a(builder, this.f28803f, o0Var);
            }
            if (!Objects.equals(this.f28801d, this.f28802e) && !Objects.equals(this.f28801d, this.f28803f)) {
                a(builder, this.f28801d, o0Var);
            }
        } else {
            for (int i11 = 0; i11 < this.f28799b.size(); i11++) {
                a(builder, (b0) this.f28799b.get(i11), o0Var);
            }
            if (!this.f28799b.contains(this.f28801d)) {
                a(builder, this.f28801d, o0Var);
            }
        }
        this.f28800c = builder.a(true);
    }
}
