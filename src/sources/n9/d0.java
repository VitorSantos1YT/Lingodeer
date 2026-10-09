package n9;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import java.util.Iterator;
import java.util.List;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f43529g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f43530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f43534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f43535f;

    static {
        List listK = ns.o.K(d2.f43537d);
        u uVar = u.f43702c;
        u uVar2 = u.f43701b;
        f43529g = new d0(y.REFRESH, listK, 0, 0, new x(uVar, uVar2, uVar2), null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:18:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00db -> B:24:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // n9.f0
    public final java.lang.Object a(fz.e r17, vy.d r18) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.d0.a(fz.e, vy.d):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f43530a == d0Var.f43530a && kotlin.jvm.internal.m.a(this.f43531b, d0Var.f43531b) && this.f43532c == d0Var.f43532c && this.f43533d == d0Var.f43533d && kotlin.jvm.internal.m.a(this.f43534e, d0Var.f43534e) && kotlin.jvm.internal.m.a(this.f43535f, d0Var.f43535f);
    }

    public final int hashCode() {
        int iHashCode = (this.f43534e.hashCode() + defpackage.e.b(this.f43533d, defpackage.e.b(this.f43532c, hh.p0.b(this.f43530a.hashCode() * 31, 31, this.f43531b), 31), 31)) * 31;
        x xVar = this.f43535f;
        return iHashCode + (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.f43531b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((d2) it.next()).f43539b.size();
        }
        int i11 = this.f43532c;
        String strValueOf = i11 != -1 ? String.valueOf(i11) : "none";
        int i12 = this.f43533d;
        String strValueOf2 = i12 != -1 ? String.valueOf(i12) : "none";
        StringBuilder sb2 = new StringBuilder("PageEvent.Insert for ");
        sb2.append(this.f43530a);
        sb2.append(", with ");
        sb2.append(size);
        sb2.append(" items (\n                    |   first item: ");
        d2 d2Var = (d2) ry.m.s0(list3);
        Object objA0 = null;
        sb2.append((d2Var == null || (list2 = d2Var.f43539b) == null) ? null : ry.m.s0(list2));
        sb2.append("\n                    |   last item: ");
        d2 d2Var2 = (d2) ry.m.A0(list3);
        if (d2Var2 != null && (list = d2Var2.f43539b) != null) {
            objA0 = ry.m.A0(list);
        }
        sb2.append(objA0);
        sb2.append("\n                    |   placeholdersBefore: ");
        sb2.append(strValueOf);
        sb2.append("\n                    |   placeholdersAfter: ");
        sb2.append(strValueOf2);
        sb2.append("\n                    |   sourceLoadStates: ");
        sb2.append(this.f43534e);
        sb2.append("\n                    ");
        String string = sb2.toString();
        x xVar = this.f43535f;
        if (xVar != null) {
            string = string + ualZoVVCQs.ZVuYC + xVar + '\n';
        }
        return oz.r.h0(string + "|)");
    }

    public d0(y yVar, List list, int i11, int i12, x xVar, x xVar2) {
        this.f43530a = yVar;
        this.f43531b = list;
        this.f43532c = i11;
        this.f43533d = i12;
        this.f43534e = xVar;
        this.f43535f = xVar2;
        if (yVar != y.APPEND && i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, txBUGYhC.cvAqOeZHPdkxX).toString());
        }
        if (yVar != y.PREPEND && i12 < 0) {
            throw new IllegalArgumentException(nv.p.j(i12, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
        }
        if (yVar == y.REFRESH && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }
}
