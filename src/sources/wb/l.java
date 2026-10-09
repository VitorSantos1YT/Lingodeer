package wb;

import hh.p0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f54919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.f f54920c;

    public l(Object obj, r rVar, vb.f fVar) {
        this.f54918a = obj;
        this.f54919b = rVar;
        this.f54920c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                Object obj2 = lVar.f54918a;
                this.f54919b.getClass();
                Object obj3 = this.f54918a;
                if (obj3 == obj2) {
                    zA = true;
                } else if ((obj3 instanceof gc.i) && (obj2 instanceof gc.i)) {
                    gc.i iVar = (gc.i) obj3;
                    gc.i iVar2 = (gc.i) obj2;
                    if (kotlin.jvm.internal.m.a(iVar.f29018a, iVar2.f29018a) && iVar.f29019b.equals(iVar2.f29019b) && iVar.f29021d == iVar2.f29021d && kotlin.jvm.internal.m.a(iVar.f29023f, iVar2.f29023f) && kotlin.jvm.internal.m.a(iVar.f29025h, iVar2.f29025h) && iVar.f29027j == iVar2.f29027j && iVar.f29028k == iVar2.f29028k && iVar.f29029l == iVar2.f29029l && iVar.m == iVar2.m && iVar.f29030n == iVar2.f29030n && iVar.f29031o == iVar2.f29031o && iVar.f29032p == iVar2.f29032p && iVar.f29038v.equals(iVar2.f29038v) && iVar.f29039w == iVar2.f29039w && iVar.f29022e == iVar2.f29022e && iVar.f29040x.equals(iVar2.f29040x)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = kotlin.jvm.internal.m.a(obj3, obj2);
                }
                if (!zA || !this.f54920c.equals(lVar.f54920c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        this.f54919b.getClass();
        Object obj = this.f54918a;
        if (obj instanceof gc.i) {
            gc.i iVar = (gc.i) obj;
            iHashCode = iVar.f29040x.f29060a.hashCode() + ((iVar.f29022e.hashCode() + ((iVar.f29039w.hashCode() + ((iVar.f29038v.hashCode() + ((iVar.f29032p.hashCode() + ((iVar.f29031o.hashCode() + ((iVar.f29030n.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e((p0.b((iVar.f29021d.hashCode() + ((iVar.f29019b.hashCode() + (iVar.f29018a.hashCode() * 31)) * 923521)) * 961, 31, iVar.f29023f) + Arrays.hashCode(iVar.f29025h.f45042a)) * 31, 31, iVar.f29027j), 31, iVar.f29028k), 31, iVar.f29029l), 31, iVar.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f54920c.hashCode() + (iHashCode * 31);
    }
}
