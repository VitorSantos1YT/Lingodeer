package z4;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class m1 extends s1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f58863i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f58864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Class f58865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f58866l;
    public static Field m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f58867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r4.d[] f58868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r4.d f58869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v1 f58870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r4.d f58871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58872h;

    public m1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var);
        this.f58869e = null;
        this.f58867c = windowInsets;
    }

    private static void B() {
        try {
            f58864j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f58865k = cls;
            f58866l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f58866l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e8) {
            e8.getMessage();
        }
        f58863i = true;
    }

    public static boolean C(int i11, int i12) {
        return (i11 & 6) == (i12 & 6);
    }

    private r4.d w(int i11, boolean z11) {
        r4.d dVarA = r4.d.f48792e;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                dVarA = r4.d.a(dVarA, x(i12, z11));
            }
        }
        return dVarA;
    }

    private r4.d y() {
        v1 v1Var = this.f58870f;
        return v1Var != null ? v1Var.f58905a.j() : r4.d.f48792e;
    }

    private r4.d z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f58863i) {
            B();
        }
        Method method = f58864j;
        if (method != null && f58865k != null && f58866l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f58866l.get(m.get(objInvoke));
                    if (rect != null) {
                        return r4.d.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e8) {
                e8.getMessage();
            }
        }
        return null;
    }

    public boolean A(int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 8 && i11 != 128) {
                return true;
            }
        }
        return !x(i11, false).equals(r4.d.f48792e);
    }

    @Override // z4.s1
    public void d(View view) {
        r4.d dVarZ = z(view);
        if (dVarZ == null) {
            dVarZ = r4.d.f48792e;
        }
        s(dVarZ);
    }

    @Override // z4.s1
    public void e(v1 v1Var) {
        v1Var.f58905a.t(this.f58870f);
        r4.d dVar = this.f58871g;
        s1 s1Var = v1Var.f58905a;
        s1Var.s(dVar);
        s1Var.v(this.f58872h);
    }

    @Override // z4.s1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.f58871g, m1Var.f58871g) && C(this.f58872h, m1Var.f58872h);
    }

    @Override // z4.s1
    public r4.d g(int i11) {
        return w(i11, false);
    }

    @Override // z4.s1
    public r4.d h(int i11) {
        return w(i11, true);
    }

    @Override // z4.s1
    public final r4.d l() {
        if (this.f58869e == null) {
            WindowInsets windowInsets = this.f58867c;
            this.f58869e = r4.d.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f58869e;
    }

    @Override // z4.s1
    public v1 n(int i11, int i12, int i13, int i14) {
        l1 i1Var;
        v1 v1VarH = v1.h(null, this.f58867c);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            i1Var = new k1(v1VarH);
        } else if (i15 >= 30) {
            i1Var = new j1(v1VarH);
        } else {
            i1Var = i15 >= 29 ? new i1(v1VarH) : new h1(v1VarH);
        }
        i1Var.g(v1.e(l(), i11, i12, i13, i14));
        i1Var.e(v1.e(j(), i11, i12, i13, i14));
        return i1Var.b();
    }

    @Override // z4.s1
    public boolean p() {
        return this.f58867c.isRound();
    }

    @Override // z4.s1
    public boolean q(int i11) {
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0 && !A(i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // z4.s1
    public void r(r4.d[] dVarArr) {
        this.f58868d = dVarArr;
    }

    @Override // z4.s1
    public void s(r4.d dVar) {
        this.f58871g = dVar;
    }

    @Override // z4.s1
    public void t(v1 v1Var) {
        this.f58870f = v1Var;
    }

    @Override // z4.s1
    public void v(int i11) {
        this.f58872h = i11;
    }

    public r4.d x(int i11, boolean z11) {
        r4.d dVarJ;
        int i12;
        r4.d dVar = r4.d.f48792e;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 8) {
                    r4.d[] dVarArr = this.f58868d;
                    dVarJ = dVarArr != null ? dVarArr[c.a.y(8)] : null;
                    if (dVarJ != null) {
                        return dVarJ;
                    }
                    r4.d dVarL = l();
                    r4.d dVarY = y();
                    int i13 = dVarL.f48796d;
                    if (i13 > dVarY.f48796d) {
                        return r4.d.c(0, 0, 0, i13);
                    }
                    r4.d dVar2 = this.f58871g;
                    if (dVar2 != null && !dVar2.equals(dVar) && (i12 = this.f58871g.f48796d) > dVarY.f48796d) {
                        return r4.d.c(0, 0, 0, i12);
                    }
                } else {
                    if (i11 == 16) {
                        return k();
                    }
                    if (i11 == 32) {
                        return i();
                    }
                    if (i11 == 64) {
                        return m();
                    }
                    if (i11 == 128) {
                        v1 v1Var = this.f58870f;
                        j jVarF = v1Var != null ? v1Var.f58905a.f() : f();
                        if (jVarF != null) {
                            int i14 = Build.VERSION.SDK_INT;
                            return r4.d.c(i14 >= 28 ? a2.l.p(jVarF.f58859a) : 0, i14 >= 28 ? a2.l.r(jVarF.f58859a) : 0, i14 >= 28 ? a2.l.q(jVarF.f58859a) : 0, i14 >= 28 ? a2.l.o(jVarF.f58859a) : 0);
                        }
                    }
                }
            } else {
                if (z11) {
                    r4.d dVarY2 = y();
                    r4.d dVarJ2 = j();
                    return r4.d.c(Math.max(dVarY2.f48793a, dVarJ2.f48793a), 0, Math.max(dVarY2.f48795c, dVarJ2.f48795c), Math.max(dVarY2.f48796d, dVarJ2.f48796d));
                }
                if ((this.f58872h & 2) == 0) {
                    r4.d dVarL2 = l();
                    v1 v1Var2 = this.f58870f;
                    dVarJ = v1Var2 != null ? v1Var2.f58905a.j() : null;
                    int iMin = dVarL2.f48796d;
                    if (dVarJ != null) {
                        iMin = Math.min(iMin, dVarJ.f48796d);
                    }
                    return r4.d.c(dVarL2.f48793a, 0, dVarL2.f48795c, iMin);
                }
            }
        } else {
            if (z11) {
                return r4.d.c(0, Math.max(y().f48794b, l().f48794b), 0, 0);
            }
            if ((this.f58872h & 4) == 0) {
                return r4.d.c(0, l().f48794b, 0, 0);
            }
        }
        return dVar;
    }

    public m1(v1 v1Var, m1 m1Var) {
        this(v1Var, new WindowInsets(m1Var.f58867c));
    }
}
