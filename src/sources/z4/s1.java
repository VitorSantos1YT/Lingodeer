package z4;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f58899b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f58900a;

    static {
        l1 i1Var;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            i1Var = new k1();
        } else if (i11 >= 30) {
            i1Var = new j1();
        } else {
            i1Var = i11 >= 29 ? new i1() : new h1();
        }
        f58899b = i1Var.b().f58905a.a().f58905a.b().f58905a.c();
    }

    public s1(v1 v1Var) {
        this.f58900a = v1Var;
    }

    public v1 a() {
        return this.f58900a;
    }

    public v1 b() {
        return this.f58900a;
    }

    public v1 c() {
        return this.f58900a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return p() == s1Var.p() && o() == s1Var.o() && Objects.equals(l(), s1Var.l()) && Objects.equals(j(), s1Var.j()) && Objects.equals(f(), s1Var.f());
    }

    public j f() {
        return null;
    }

    public r4.d g(int i11) {
        return r4.d.f48792e;
    }

    public r4.d h(int i11) {
        if ((i11 & 8) == 0) {
            return r4.d.f48792e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public r4.d i() {
        return l();
    }

    public r4.d j() {
        return r4.d.f48792e;
    }

    public r4.d k() {
        return l();
    }

    public r4.d l() {
        return r4.d.f48792e;
    }

    public r4.d m() {
        return l();
    }

    public v1 n(int i11, int i12, int i13, int i14) {
        return f58899b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i11) {
        return true;
    }

    public void d(View view) {
    }

    public void e(v1 v1Var) {
    }

    public void r(r4.d[] dVarArr) {
    }

    public void s(r4.d dVar) {
    }

    public void t(v1 v1Var) {
    }

    public void u(r4.d dVar) {
    }

    public void v(int i11) {
    }
}
