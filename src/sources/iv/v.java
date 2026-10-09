package iv;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.SyllableWriteCharacter;
import dt.m4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f34844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f34845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f34846d;

    public /* synthetic */ v(List list, fz.c cVar, l1.b1 b1Var, int i11) {
        this.f34843a = i11;
        this.f34844b = list;
        this.f34845c = cVar;
        this.f34846d = b1Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        switch (this.f34843a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    CourseCharacter courseCharacter = (CourseCharacter) this.f34844b.get(iIntValue);
                    sVar.d0(-1273298913);
                    l1.b1 b1Var = this.f34846d;
                    boolean zA = kotlin.jvm.internal.m.a(courseCharacter, (CourseCharacter) b1Var.getValue());
                    fz.c cVar2 = this.f34845c;
                    boolean zF = sVar.f(cVar2);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new m4(cVar2, b1Var, 1);
                        sVar.o0(objQ);
                    }
                    a.e(courseCharacter, zA, (fz.c) objQ, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    ps.b bVar = (ps.b) this.f34844b.get(iIntValue3);
                    sVar2.d0(1561436438);
                    fz.c cVar4 = this.f34845c;
                    boolean zF2 = sVar2.f(cVar4) | sVar2.h(bVar);
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new lt.f(cVar4, bVar, 0);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zF3 = sVar2.f(cVar4) | sVar2.h(bVar);
                    Object objQ3 = sVar2.Q();
                    if (zF3 || objQ3 == gVar) {
                        objQ3 = new lt.f(cVar4, bVar, 1);
                        sVar2.o0(objQ3);
                    }
                    fz.a aVar2 = (fz.a) objQ3;
                    boolean zH = sVar2.h(bVar);
                    Object objQ4 = sVar2.Q();
                    if (zH || objQ4 == gVar) {
                        objQ4 = new bp.b1(20, bVar, this.f34846d);
                        sVar2.o0(objQ4);
                    }
                    lt.b.d(bVar, aVar, aVar2, (fz.a) objQ4, null, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l0.c cVar5 = (l0.c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(cVar5) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) this.f34844b.get(iIntValue5);
                    sVar3.d0(-523909340);
                    l1.b1 b1Var2 = this.f34846d;
                    boolean zA2 = kotlin.jvm.internal.m.a(syllableWriteCharacter, (SyllableWriteCharacter) b1Var2.getValue());
                    fz.c cVar6 = this.f34845c;
                    boolean zF4 = sVar3.f(cVar6);
                    Object objQ5 = sVar3.Q();
                    if (zF4 || objQ5 == l1.m.f39353a) {
                        objQ5 = new m4(b1Var2, cVar6);
                        sVar3.o0(objQ5);
                    }
                    pv.a.c(syllableWriteCharacter, zA2, (fz.c) objQ5, sVar3, 0);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
