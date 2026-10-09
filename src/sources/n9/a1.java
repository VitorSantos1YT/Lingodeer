package n9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.j f43481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tz.h f43485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tz.h f43486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f43487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xq.c f43488h;

    public a1(c7.j jVar) {
        this.f43481a = jVar;
        ArrayList arrayList = new ArrayList();
        this.f43482b = arrayList;
        this.f43483c = arrayList;
        this.f43485e = qx.p.b(-1, 6, null);
        this.f43486f = qx.p.b(-1, 6, null);
        this.f43487g = new LinkedHashMap();
        xq.c cVar = new xq.c(24);
        cVar.P(y.REFRESH, t.f43692b);
        this.f43488h = cVar;
    }

    public final w1 a(f2 f2Var) {
        Integer numValueOf;
        c7.j jVar = this.f43481a;
        int i11 = jVar.f6660a;
        ArrayList arrayList = this.f43483c;
        List listA1 = ry.m.a1(arrayList);
        if (f2Var != null) {
            int i12 = f2Var.f43559e;
            int i13 = -this.f43484d;
            int iA = ns.o.A(arrayList) - this.f43484d;
            int size = 0;
            int i14 = i13;
            while (i14 < i12) {
                size += i14 > iA ? i11 : ((u1) arrayList.get(this.f43484d + i14)).f43705a.size();
                i14++;
            }
            int i15 = size + f2Var.f43560f;
            if (i12 < i13) {
                i15 -= i11;
            }
            numValueOf = Integer.valueOf(i15);
        } else {
            numValueOf = null;
        }
        return new w1(listA1, numValueOf, jVar, 0);
    }

    public final boolean b(int i11, y loadType, u1 page) {
        kotlin.jvm.internal.m.f(loadType, "loadType");
        kotlin.jvm.internal.m.f(page, "page");
        int i12 = page.f43708d;
        List list = page.f43705a;
        int i13 = page.f43709e;
        int i14 = y0.f43738a[loadType.ordinal()];
        ArrayList arrayList = this.f43482b;
        ArrayList arrayList2 = this.f43483c;
        if (i14 == 1) {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i11 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(page);
            this.f43484d = 0;
            return true;
        }
        LinkedHashMap linkedHashMap = this.f43487g;
        if (i14 != 2) {
            if (i14 != 3) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before append");
            }
            if (i11 == 0) {
                arrayList.add(page);
                if (i13 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap.remove(y.APPEND);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            }
            if (i11 == 0) {
                arrayList.add(0, page);
                this.f43484d++;
                if (i12 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap.remove(y.PREPEND);
                return true;
            }
        }
        return false;
    }

    public final d0 c(u1 u1Var, y loadType) {
        kotlin.jvm.internal.m.f(u1Var, "<this>");
        kotlin.jvm.internal.m.f(loadType, "loadType");
        int[] iArr = y0.f43738a;
        int i11 = iArr[loadType.ordinal()];
        int size = 0;
        if (i11 != 1) {
            if (i11 == 2) {
                size = 0 - this.f43484d;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.f43483c.size() - this.f43484d) - 1;
            }
        }
        List listK = ns.o.K(new d2(size, u1Var.f43705a));
        int i12 = iArr[loadType.ordinal()];
        xq.c cVar = this.f43488h;
        if (i12 == 1) {
            d0 d0Var = d0.f43529g;
            return new d0(y.REFRESH, listK, 0, 0, cVar.U(), null);
        }
        if (i12 == 2) {
            d0 d0Var2 = d0.f43529g;
            return new d0(y.PREPEND, listK, 0, -1, cVar.U(), null);
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        d0 d0Var3 = d0.f43529g;
        return new d0(y.APPEND, listK, -1, 0, cVar.U(), null);
    }
}
