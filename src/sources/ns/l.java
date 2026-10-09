package ns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f43999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f44000c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv.d f44001a;

    static {
        int i11 = pz.a.f47220d;
        f43999b = pz.f.p(2, pz.c.SECONDS);
    }

    public l(dv.d dVar) {
        this.f44001a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(List list, String str, List list2, xy.c cVar) {
        i iVar;
        l lVar;
        Comparable comparable;
        Integer num;
        int iIntValue;
        List candidateReferences = list;
        List inputTiles = list2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f43983f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f43983f = i11 - Integer.MIN_VALUE;
                lVar = this;
            } else {
                lVar = this;
                iVar = new i(lVar, cVar);
            }
        } else {
            lVar = this;
            iVar = new i(lVar, cVar);
        }
        i iVar2 = iVar;
        Object objB = iVar2.f43981d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar2.f43983f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objB);
            kotlin.jvm.internal.m.f(candidateReferences, "candidateReferences");
            kotlin.jvm.internal.m.f(inputTiles, "inputTiles");
            ArrayList arrayListO = o.O(inputTiles);
            Object obj = null;
            if (arrayListO.isEmpty()) {
                num = null;
            } else {
                nz.t tVarW = nz.n.W(nz.n.R(nz.n.W(ry.m.g0(candidateReferences), m.f44004a), n.f44006a), new d1.l0(1, arrayListO));
                fz.c cVar2 = tVarW.f44349b;
                Iterator it = tVarW.f44348a.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) cVar2.invoke(it.next());
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) cVar2.invoke(it.next());
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                num = (Integer) comparable;
            }
            if (num == null) {
                return h.f43975c;
            }
            iIntValue = num.intValue();
            for (Object obj2 : candidateReferences) {
                if (!o.O((List) obj2).isEmpty()) {
                    obj = obj2;
                    break;
                }
            }
            List list3 = (List) obj;
            if (list3 == null) {
                return h.f43975c;
            }
            c cVar3 = c.SCRAMBLE;
            String strY0 = ry.m.y0(list3, " ", null, null, null, 62);
            String strY1 = ry.m.y0(inputTiles, " ", null, null, null, 62);
            iVar2.f43978a = candidateReferences;
            iVar2.f43979b = inputTiles;
            iVar2.f43980c = iIntValue;
            iVar2.f43983f = 1;
            objB = lVar.b(cVar3, strY0, str, strY1, iVar2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = iVar2.f43980c;
            inputTiles = iVar2.f43979b;
            List list4 = iVar2.f43978a;
            com.bumptech.glide.e.F(objB);
            iIntValue = i13;
            candidateReferences = list4;
        }
        h modelResult = (h) objB;
        kotlin.jvm.internal.m.f(modelResult, "modelResult");
        h hVar = (modelResult.f43976a != q.RETRY || iIntValue < 2) ? modelResult : h.f43975c;
        Objects.toString(candidateReferences);
        Objects.toString(inputTiles);
        modelResult.toString();
        Objects.toString(hVar);
        return hVar;
    }

    public final Object b(c cVar, String str, String str2, String str3, xy.c cVar2) {
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new k(str, str3, this, cVar, str2, null), cVar2);
    }
}
