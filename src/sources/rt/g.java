package rt;

import com.lingodeer.data.model.KnowledgeNote;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f49770b;

    public /* synthetic */ g(j jVar, int i11) {
        this.f49769a = i11;
        this.f49770b = jVar;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        switch (this.f49769a) {
            case 0:
                List list = (List) obj;
                Set setA0 = nz.n.a0(nz.n.X(nz.n.R(ry.m.g0(list), new ro.e(4)), new ro.e(5)));
                Map mapI0 = ry.x.i0(nz.n.X(nz.n.R(ry.m.g0(list), new ro.e(6)), new ro.e(7)));
                j jVar = this.f49770b;
                uz.i1 i1Var = jVar.U;
                i1Var.getClass();
                i1Var.l(null, setA0);
                uz.i1 i1Var2 = jVar.V;
                i1Var2.getClass();
                i1Var2.l(null, mapI0);
                break;
            default:
                List list2 = (List) obj;
                uz.i1 i1Var3 = this.f49770b.X;
                int iW = ry.x.W(ry.n.W(list2, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (Object obj2 : list2) {
                    linkedHashMap.put(new Long(((KnowledgeNote) obj2).getElemId()), obj2);
                }
                i1Var3.getClass();
                i1Var3.l(null, linkedHashMap);
                break;
        }
        return qy.b0.f48488a;
    }
}
