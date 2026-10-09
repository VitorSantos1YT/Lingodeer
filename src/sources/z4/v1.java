package z4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f58904b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f58905a;

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            f58904b = r1.f58892s;
        } else if (i11 >= 30) {
            f58904b = q1.f58882r;
        } else {
            f58904b = s1.f58899b;
        }
    }

    public v1(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            this.f58905a = new r1(this, windowInsets);
            return;
        }
        if (i11 >= 30) {
            this.f58905a = new q1(this, windowInsets);
            return;
        }
        if (i11 >= 29) {
            this.f58905a = new p1(this, windowInsets);
        } else if (i11 >= 28) {
            this.f58905a = new o1(this, windowInsets);
        } else {
            this.f58905a = new n1(this, windowInsets);
        }
    }

    public static r4.d e(r4.d dVar, int i11, int i12, int i13, int i14) {
        int iMax = Math.max(0, dVar.f48793a - i11);
        int iMax2 = Math.max(0, dVar.f48794b - i12);
        int iMax3 = Math.max(0, dVar.f48795c - i13);
        int iMax4 = Math.max(0, dVar.f48796d - i14);
        return (iMax == i11 && iMax2 == i12 && iMax3 == i13 && iMax4 == i14) ? dVar : r4.d.c(iMax, iMax2, iMax3, iMax4);
    }

    public static v1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        v1 v1Var = new v1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = s0.f58893a;
            v1 v1VarA = k0.a(view);
            s1 s1Var = v1Var.f58905a;
            s1Var.t(v1VarA);
            s1Var.d(view.getRootView());
            s1Var.v(view.getWindowSystemUiVisibility());
        }
        return v1Var;
    }

    public final int a() {
        return this.f58905a.l().f48796d;
    }

    public final int b() {
        return this.f58905a.l().f48793a;
    }

    public final int c() {
        return this.f58905a.l().f48795c;
    }

    public final int d() {
        return this.f58905a.l().f48794b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            return Objects.equals(this.f58905a, ((v1) obj).f58905a);
        }
        return false;
    }

    public final v1 f(int i11, int i12, int i13, int i14) {
        l1 i1Var;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            i1Var = new k1(this);
        } else if (i15 >= 30) {
            i1Var = new j1(this);
        } else {
            i1Var = i15 >= 29 ? new i1(this) : new h1(this);
        }
        i1Var.g(r4.d.c(i11, i12, i13, i14));
        return i1Var.b();
    }

    public final WindowInsets g() {
        s1 s1Var = this.f58905a;
        if (s1Var instanceof m1) {
            return ((m1) s1Var).f58867c;
        }
        return null;
    }

    public final int hashCode() {
        s1 s1Var = this.f58905a;
        if (s1Var == null) {
            return 0;
        }
        return s1Var.hashCode();
    }

    public v1(v1 v1Var) {
        if (v1Var != null) {
            s1 s1Var = v1Var.f58905a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34 && (s1Var instanceof r1)) {
                this.f58905a = new r1(this, (r1) s1Var);
            } else if (i11 >= 30 && (s1Var instanceof q1)) {
                this.f58905a = new q1(this, (q1) s1Var);
            } else if (i11 >= 29 && (s1Var instanceof p1)) {
                this.f58905a = new p1(this, (p1) s1Var);
            } else if (i11 >= 28 && (s1Var instanceof o1)) {
                this.f58905a = new o1(this, (o1) s1Var);
            } else if (s1Var instanceof n1) {
                this.f58905a = new n1(this, (n1) s1Var);
            } else if (s1Var instanceof m1) {
                this.f58905a = new m1(this, (m1) s1Var);
            } else {
                this.f58905a = new s1(this);
            }
            s1Var.e(this);
            return;
        }
        this.f58905a = new s1(this);
    }
}
