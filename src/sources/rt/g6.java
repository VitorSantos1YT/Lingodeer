package rt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6 f49781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.e f49782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.h f49783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49784d;

    public g6(x6 x6Var, vt.e eVar, vt.h hVar, vt.n0 n0Var) {
        this.f49781a = x6Var;
        this.f49782b = eVar;
        this.f49783c = hVar;
        this.f49784d = xt.d.k(((fr.o0) n0Var).f27733a.keyLanguage);
    }

    public final gp.r a(x8 x8Var) {
        return new gp.r(((vt.r) this.f49783c).e(this.f49784d, i6.a(x8Var)), 7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Map map, List list, xy.c cVar) {
        f6 f6Var;
        if (cVar instanceof f6) {
            f6Var = (f6) cVar;
            int i11 = f6Var.f49739e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f6Var.f49739e = i11 - Integer.MIN_VALUE;
            } else {
                f6Var = new f6(this, cVar);
            }
        } else {
            f6Var = new f6(this, cVar);
        }
        Object objU = f6Var.f49737c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = f6Var.f49739e;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            uz.m0 m0VarJ = uz.x0.j(a(x8.CHARACTER), a(x8.WORD), a(x8.SENTENCE), new kr.u(4, 2, dVar));
            f6Var.f49735a = map;
            f6Var.f49736b = list;
            f6Var.f49739e = 1;
            objU = uz.x0.u(m0VarJ, f6Var);
            if (objU != aVar) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
            return objU;
        }
        list = f6Var.f49736b;
        map = f6Var.f49735a;
        com.bumptech.glide.e.F(objU);
        Map map2 = (Map) objU;
        List list2 = i6.f49875a;
        int iW = ry.x.W(ry.n.W(list2, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : list2) {
            x8 x8Var = (x8) obj;
            Set set = (Set) map.get(x8Var);
            Set set2 = ry.t.f50856a;
            if (set == null) {
                set = set2;
            }
            String strA = i6.a(x8Var);
            Set set3 = (Set) map2.get(x8Var);
            if (set3 != null) {
                set2 = set3;
            }
            linkedHashMap.put(obj, i6.b(set, list, this.f49784d, strA, set2));
        }
        f6Var.f49735a = null;
        f6Var.f49736b = null;
        f6Var.f49739e = 2;
        Object objL = rz.e0.l(new h(6, linkedHashMap, this, dVar), f6Var);
        return objL == aVar ? aVar : objL;
    }
}
