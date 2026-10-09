package rt;

import com.lingodeer.data.model.SRSStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y7 extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f50685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ qy.l f50686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f50687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ r8 f50688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f50689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x8 f50690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(x8 x8Var, vy.d dVar) {
        super(6, dVar);
        this.f50690f = x8Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        y7 y7Var = new y7(this.f50690f, (vy.d) obj6);
        y7Var.f50685a = (List) obj;
        y7Var.f50686b = (qy.l) obj2;
        y7Var.f50687c = (List) obj3;
        y7Var.f50688d = (r8) obj4;
        y7Var.f50689e = zBooleanValue;
        return y7Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List listL;
        List list;
        int i11;
        List<y8> list2 = this.f50685a;
        qy.l lVar = this.f50686b;
        List list3 = this.f50687c;
        r8 r8Var = this.f50688d;
        boolean z11 = this.f50689e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        Set set = (Set) lVar.f48495a;
        Map map = (Map) lVar.f48496b;
        Set setF1 = ry.m.f1(list3);
        int i12 = 10;
        ArrayList arrayList = new ArrayList(ry.n.W(list2, 10));
        for (y8 y8Var : list2) {
            List<k6> list4 = y8Var.f50700j;
            ArrayList arrayList2 = new ArrayList(ry.n.W(list4, i12));
            for (k6 k6Var : list4) {
                SRSStatus sRSStatus = k6Var.f49972c;
                boolean zContains = set.contains(sRSStatus.getId());
                SRSStatus sRSStatus2 = (SRSStatus) map.get(sRSStatus.getId());
                arrayList2.add(k6.a(k6Var, zContains, true, sRSStatus2 == null ? sRSStatus : sRSStatus2, false, null, 40));
            }
            if (arrayList2.isEmpty()) {
                i11 = 0;
            } else {
                int size = arrayList2.size();
                i11 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    if (((k6) obj2).f49970a && (i11 = i11 + 1) < 0) {
                        ns.o.U();
                        throw null;
                    }
                }
            }
            arrayList.add(y8.a(y8Var, 0, i11, i11 == arrayList2.size(), setF1.contains(new Long(y8Var.f50691a)), false, arrayList2, 271));
            i12 = 10;
        }
        List listZ = nz.n.Z(nz.n.W(nz.n.R(new nz.j(ry.m.g0(arrayList), new v7(5), nz.p.f44340a), new v7(6)), new v7(7)));
        int i14 = x7.f50647a[this.f50690f.ordinal()];
        ry.r rVar = ry.r.f50854a;
        if (i14 == 1) {
            listL = ns.o.L(r8.COMPREHENSIVE, r8.LISTENING, r8.SPEAKING, r8.SPELLING);
        } else {
            if (i14 != 2) {
                if (i14 == 3) {
                    list = rVar;
                } else {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listL = ns.o.L(r8.COMPREHENSIVE, r8.LISTENING, r8.WORD_MATCH, r8.SPELLING);
                }
                return new f8(z11, r8Var, list, listZ, arrayList, null, j8.f49923a, rVar, null, false, false, i0.f49858a);
            }
            listL = ns.o.L(r8.COMPREHENSIVE, r8.LISTENING, r8.WORD_MATCH, r8.SPELLING);
        }
        list = listL;
        return new f8(z11, r8Var, list, listZ, arrayList, null, j8.f49923a, rVar, null, false, false, i0.f49858a);
    }
}
