package qa;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import f7.f1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends v {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String[] f47641j0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f47642i0 = 3;

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static f1 T(d0 d0Var, d0 d0Var2) {
        f1 f1Var = new f1();
        f1Var.f26730a = false;
        f1Var.f26731b = false;
        if (d0Var != null) {
            HashMap map = d0Var.f47604a;
            if (map.containsKey("android:visibility:visibility")) {
                f1Var.f26732c = ((Integer) map.get("android:visibility:visibility")).intValue();
                f1Var.f26734e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                f1Var.f26732c = -1;
                f1Var.f26734e = null;
            }
        } else {
            f1Var.f26732c = -1;
            f1Var.f26734e = null;
        }
        if (d0Var2 != null) {
            HashMap map2 = d0Var2.f47604a;
            if (map2.containsKey("android:visibility:visibility")) {
                f1Var.f26733d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                f1Var.f26735f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                f1Var.f26733d = -1;
                f1Var.f26735f = null;
            }
        } else {
            f1Var.f26733d = -1;
            f1Var.f26735f = null;
        }
        if (d0Var != null && d0Var2 != null) {
            int i11 = f1Var.f26732c;
            int i12 = f1Var.f26733d;
            if (i11 != i12 || ((ViewGroup) f1Var.f26734e) != ((ViewGroup) f1Var.f26735f)) {
                if (i11 != i12) {
                    if (i11 == 0) {
                        f1Var.f26731b = false;
                        f1Var.f26730a = true;
                        return f1Var;
                    }
                    if (i12 == 0) {
                        f1Var.f26731b = true;
                        f1Var.f26730a = true;
                        return f1Var;
                    }
                } else {
                    if (((ViewGroup) f1Var.f26735f) == null) {
                        f1Var.f26731b = false;
                        f1Var.f26730a = true;
                        return f1Var;
                    }
                    if (((ViewGroup) f1Var.f26734e) == null) {
                        f1Var.f26731b = true;
                        f1Var.f26730a = true;
                        return f1Var;
                    }
                }
            }
        } else {
            if (d0Var == null && f1Var.f26733d == 0) {
                f1Var.f26731b = true;
                f1Var.f26730a = true;
                return f1Var;
            }
            if (d0Var2 == null && f1Var.f26732c == 0) {
                f1Var.f26731b = false;
                f1Var.f26730a = true;
            }
        }
        return f1Var;
    }

    public abstract Animator U(ViewGroup viewGroup, View view, d0 d0Var);

    public abstract Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2);

    @Override // qa.v
    public final void f(d0 d0Var) {
        S(d0Var);
    }

    @Override // qa.v
    public void i(d0 d0Var) {
        S(d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0211  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (T(r(r4, false), v(r4, false)).f26730a != false) goto L9;
     */
    @Override // qa.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(android.view.ViewGroup r25, qa.d0 r26, qa.d0 r27) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.j0.m(android.view.ViewGroup, qa.d0, qa.d0):android.animation.Animator");
    }

    @Override // qa.v
    public final String[] u() {
        return f47641j0;
    }

    @Override // qa.v
    public final boolean y(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f47604a.containsKey("android:visibility:visibility") != d0Var.f47604a.containsKey("android:visibility:visibility")) {
            return false;
        }
        f1 f1VarT = T(d0Var, d0Var2);
        if (f1VarT.f26730a) {
            return f1VarT.f26732c == 0 || f1VarT.f26733d == 0;
        }
        return false;
    }

    public static void S(d0 d0Var) {
        int visibility = d0Var.f47605b.getVisibility();
        HashMap map = d0Var.f47604a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", d0Var.f47605b.getParent());
        int[] iArr = new int[2];
        d0Var.f47605b.getLocationOnScreen(iArr);
        map.put(gkbGsXmgaxRjJ.gLLhcumrBybP, iArr);
    }
}
