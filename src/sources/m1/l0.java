package m1;

import java.lang.reflect.InvocationTargetException;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends se.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40798e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40800g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40802i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0[] f40797d = new j0[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f40799f = new int[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f40801h = new Object[16];

    public final void G() {
        this.f40798e = 0;
        this.f40800g = 0;
        ry.l.P(0, this.f40802i, null, this.f40801h);
        this.f40802i = 0;
    }

    public final void H(l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) throws IllegalAccessException, InvocationTargetException {
        if (J()) {
            d1.t tVar = new d1.t(this);
            l0 l0Var = (l0) tVar.f22994e;
            while (true) {
                j0 j0Var = l0Var.f40797d[tVar.f22991b];
                l1.b bVarB = j0Var.b(tVar);
                l1.d dVar2 = dVar;
                p2 p2Var2 = p2Var;
                t1.j jVar2 = jVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(tVar, dVar2, p2Var2, jVar2, k0Var2);
                    int i11 = tVar.f22991b;
                    int i12 = l0Var.f40798e;
                    if (i11 < i12) {
                        j0 j0Var2 = l0Var.f40797d[i11];
                        tVar.f22992c += j0Var2.f40793a;
                        tVar.f22993d += j0Var2.f40794b;
                        int i13 = i11 + 1;
                        tVar.f22991b = i13;
                        if (i13 >= i12) {
                            break;
                        }
                        dVar = dVar2;
                        p2Var = p2Var2;
                        jVar = jVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    if (k0Var2 == null) {
                        throw th2;
                    }
                    hz.b.T(th2, new androidx.lifecycle.compose.a(bVarB, p2Var2, k0Var2, 26));
                    throw th2;
                }
            }
        }
        G();
    }

    public final boolean I() {
        return this.f40798e == 0;
    }

    public final boolean J() {
        return this.f40798e != 0;
    }

    public final void K(j0 j0Var) {
        int i11 = this.f40798e;
        j0[] j0VarArr = this.f40797d;
        if (i11 == j0VarArr.length) {
            j0[] j0VarArr2 = new j0[(i11 > 1024 ? 1024 : i11) + i11];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i11);
            this.f40797d = j0VarArr2;
        }
        int i12 = this.f40800g;
        int i13 = j0Var.f40793a;
        int i14 = j0Var.f40794b;
        int i15 = i12 + i13;
        int[] iArr = this.f40799f;
        int length = iArr.length;
        if (i15 > length) {
            int i16 = (length > 1024 ? 1024 : length) + length;
            if (i16 >= i15) {
                i15 = i16;
            }
            int[] iArr2 = new int[i15];
            ry.l.H(0, 0, iArr, iArr2, length);
            this.f40799f = iArr2;
        }
        int i17 = this.f40802i + i14;
        Object[] objArr = this.f40801h;
        int length2 = objArr.length;
        if (i17 > length2) {
            int i18 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i18 >= i17) {
                i17 = i18;
            }
            Object[] objArr2 = new Object[i17];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f40801h = objArr2;
        }
        j0[] j0VarArr3 = this.f40797d;
        int i19 = this.f40798e;
        this.f40798e = i19 + 1;
        j0VarArr3[i19] = j0Var;
        this.f40800g += j0Var.f40793a;
        this.f40802i += i14;
    }
}
