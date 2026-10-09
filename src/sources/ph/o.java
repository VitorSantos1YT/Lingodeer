package ph;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import fr.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rz.e0;
import uz.i1;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends ViewModel {
    public final i1 H;
    public final i1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.c f46896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f46897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f46898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f46899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f46900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f46901f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f46902t;

    public o(fh.e eVar, h1 h1Var, vt.c cVar) {
        this.f46896a = cVar;
        i1 i1VarC = x0.c(ry.r.f50854a);
        this.f46897b = i1VarC;
        this.f46898c = i1VarC;
        i1 i1VarC2 = x0.c(Boolean.FALSE);
        this.f46899d = i1VarC2;
        this.f46900e = i1VarC2;
        vy.d dVar = null;
        i1 i1VarC3 = x0.c(null);
        this.f46901f = i1VarC3;
        this.f46902t = i1VarC3;
        this.H = x0.c(ry.s.f50855a);
        this.K = x0.c(nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0)));
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new m(this, dVar, 0), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new m(this, dVar, 1), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new m(this, dVar, 2), 3);
    }

    public static final ArrayList a(o oVar, List list) {
        mh.i iVarA;
        Map map = (Map) oVar.H.getValue();
        List list2 = (List) oVar.K.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mh.i iVar = (mh.i) it.next();
            if (kotlin.jvm.internal.m.a((Boolean) map.get(Long.valueOf(iVar.f41135a)), Boolean.FALSE)) {
                iVarA = null;
            } else {
                iVarA = mh.i.a(iVar, list2.contains(Long.valueOf(iVar.f41135a)) ? mh.f.IN_PROGRESS : mh.f.NOT_STUDY, false, false, 447);
            }
            if (iVarA != null) {
                arrayList.add(iVarA);
            }
        }
        return arrayList;
    }

    public static final void b(o oVar, long j11, boolean z11) {
        i1 i1Var = oVar.H;
        LinkedHashMap linkedHashMapK0 = ry.x.k0((Map) i1Var.getValue());
        linkedHashMapK0.put(Long.valueOf(j11), Boolean.valueOf(z11));
        i1Var.l(null, linkedHashMapK0);
        i1 i1Var2 = oVar.f46897b;
        List list = (List) i1Var2.getValue();
        if (!z11) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((mh.i) obj).f41135a != j11) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        i1Var2.k(list);
    }
}
