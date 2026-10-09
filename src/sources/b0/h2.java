package b0;

import android.content.Context;
import android.os.Bundle;
import fa.EQx.nuRcCS;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 implements ed.f, y6.j0, zd.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3561b;

    public /* synthetic */ h2(Object obj, int i11) {
        this.f3560a = i11;
        this.f3561b = obj;
    }

    @Override // ed.f
    public List O() {
        return (List) this.f3561b;
    }

    @Override // ed.f
    public boolean R() {
        List list = (List) this.f3561b;
        return list.isEmpty() || (list.size() == 1 && ((ld.a) list.get(0)).c());
    }

    public abstract void S(l1.n nVar, int i11);

    public boolean T(int i11, l1.o0 o0Var, Object obj) {
        ArrayList arrayList = o0Var.f39386a;
        if (arrayList == null) {
            U(i11, o0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            if (obj2 instanceof l1.b) {
                if (obj2.equals(obj)) {
                    U(0, o0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof l1.o0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (T(i11, (l1.o0) obj2, obj)) {
                    U(0, o0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void U(int i11, l1.o0 o0Var, Object obj) {
        ((ArrayList) this.f3561b).add(new y1.b(i11, null, null));
    }

    public void V(String msg) {
        kotlin.jvm.internal.m.f(msg, "msg");
        h0(w10.a.DEBUG, msg);
    }

    public abstract void W(w10.a aVar, String str);

    public abstract ht.o X();

    public abstract Object Y();

    public List Z(n0.d0 d0Var, int i11, long j11) {
        y.x xVar = (y.x) this.f3561b;
        List list = (List) xVar.b(i11);
        if (list != null) {
            return list;
        }
        List listA = d0Var.a(i11);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(((w2.p0) listA.get(i12)).B(j11));
        }
        xVar.h(i11, arrayList);
        return arrayList;
    }

    public abstract Object a0();

    public abstract void b0();

    public abstract void c0();

    public void d0(int i11) {
        k0(-1, i11, -9223372036854775807L, false);
    }

    public boolean e0(int i11) {
        return f().f57193a.f57235a.get(i11);
    }

    public boolean f0() {
        y6.o0 o0VarF = F();
        return !o0VarF.p() && o0VarF.m(y(), (y6.n0) this.f3561b, 0L).a();
    }

    public boolean g0() {
        return u() == 3 && g() && C() == 0;
    }

    public void h0(w10.a lvl, String msg) {
        kotlin.jvm.internal.m.f(lvl, "lvl");
        kotlin.jvm.internal.m.f(msg, "msg");
        if (((w10.a) this.f3561b).compareTo(lvl) <= 0) {
            W(lvl, msg);
        }
    }

    public void i0(wd.g gVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3561b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(gVar);
        }
    }

    public void j0(int i11, Object obj, l1.o0 o0Var, Object obj2) {
        if (kotlin.jvm.internal.m.a(obj, l1.m.f39353a)) {
            U(i11, o0Var, null);
        }
    }

    public abstract void k0(int i11, int i12, long j11, boolean z11);

    public void l0(int i11, long j11) {
        k0(y(), i11, j11, false);
    }

    public void m0() {
        int iE;
        int iE2;
        if (F().p() || d()) {
            d0(9);
            return;
        }
        y6.o0 o0VarF = F();
        if (o0VarF.p()) {
            iE = -1;
        } else {
            int iY = y();
            int iE3 = E();
            if (iE3 == 1) {
                iE3 = 0;
            }
            iE = o0VarF.e(iY, iE3, H());
        }
        if (!(iE != -1)) {
            if (f0()) {
                y6.o0 o0VarF2 = F();
                if (!o0VarF2.p() && o0VarF2.m(y(), (y6.n0) this.f3561b, 0L).f57246i) {
                    k0(y(), 9, -9223372036854775807L, false);
                    return;
                }
            }
            d0(9);
            return;
        }
        y6.o0 o0VarF3 = F();
        if (o0VarF3.p()) {
            iE2 = -1;
        } else {
            int iY2 = y();
            int iE4 = E();
            iE2 = o0VarF3.e(iY2, iE4 != 1 ? iE4 : 0, H());
        }
        if (iE2 == -1) {
            d0(9);
        } else if (iE2 == y()) {
            k0(y(), 9, -9223372036854775807L, true);
        } else {
            k0(iE2, 9, -9223372036854775807L, false);
        }
    }

    public void n0() {
        int iK;
        int iK2;
        int iK3;
        if (F().p() || d()) {
            d0(7);
            return;
        }
        y6.o0 o0VarF = F();
        if (o0VarF.p()) {
            iK = -1;
        } else {
            int iY = y();
            int iE = E();
            if (iE == 1) {
                iE = 0;
            }
            iK = o0VarF.k(iY, iE, H());
        }
        boolean z11 = iK != -1;
        if (f0()) {
            y6.o0 o0VarF2 = F();
            if (!(!o0VarF2.p() && o0VarF2.m(y(), (y6.n0) this.f3561b, 0L).f57245h)) {
                if (!z11) {
                    d0(7);
                    return;
                }
                y6.o0 o0VarF3 = F();
                if (o0VarF3.p()) {
                    iK3 = -1;
                } else {
                    int iY2 = y();
                    int iE2 = E();
                    iK3 = o0VarF3.k(iY2, iE2 != 1 ? iE2 : 0, H());
                }
                if (iK3 == -1) {
                    d0(7);
                    return;
                } else if (iK3 == y()) {
                    k0(y(), 7, -9223372036854775807L, true);
                    return;
                } else {
                    k0(iK3, 7, -9223372036854775807L, false);
                    return;
                }
            }
        }
        if (!z11 || P() > j()) {
            l0(7, 0L);
            return;
        }
        y6.o0 o0VarF4 = F();
        if (o0VarF4.p()) {
            iK2 = -1;
        } else {
            int iY3 = y();
            int iE3 = E();
            iK2 = o0VarF4.k(iY3, iE3 != 1 ? iE3 : 0, H());
        }
        if (iK2 == -1) {
            d0(7);
        } else if (iK2 == y()) {
            k0(y(), 7, -9223372036854775807L, true);
        } else {
            k0(iK2, 7, -9223372036854775807L, false);
        }
    }

    public abstract void o0(Object obj);

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new zd.c((zd.x) this.f3561b, 2);
    }

    public abstract void p0(c2 c2Var);

    public abstract void q0();

    public void r0(Object obj, boolean z11) {
        Set set = (Set) this.f3561b;
        int size = set.size();
        if (z11) {
            set.add(obj);
            if (size == 0) {
                b0();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            c0();
        }
    }

    public h2(Context context, ht.o courseTestParams) {
        this.f3560a = 1;
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
    }

    public String toString() {
        switch (this.f3560a) {
            case 3:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f3561b;
                if (!list.isEmpty()) {
                    sb2.append(nuRcCS.FQk);
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public h2(w10.a level) {
        this.f3560a = 7;
        kotlin.jvm.internal.m.f(level, "level");
        this.f3561b = level;
    }

    public h2(int i11) {
        this.f3560a = i11;
        switch (i11) {
            case 5:
                this.f3561b = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 6:
                y.x xVar = y.n.f56742a;
                this.f3561b = new y.x();
                break;
            case 7:
            default:
                this.f3561b = l1.t.B(Boolean.FALSE);
                break;
            case 8:
                char[] cArr = pe.m.f46830a;
                this.f3561b = new ArrayDeque(20);
                break;
            case 9:
                this.f3561b = new Bundle();
                break;
            case 10:
                this.f3561b = new ArrayList();
                break;
            case 11:
                this.f3561b = new y6.n0();
                break;
        }
    }
}
