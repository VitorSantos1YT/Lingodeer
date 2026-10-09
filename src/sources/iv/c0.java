package iv;

import com.lingodeer.data.model.SyllableLessonStatus;
import j0.e2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f34693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f34696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f34697e;

    public c0(List list, String str, boolean z11, fz.a aVar, fz.c cVar) {
        this.f34693a = list;
        this.f34694b = str;
        this.f34695c = z11;
        this.f34696d = aVar;
        this.f34697e = cVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
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
            kv.i0 i0Var = (kv.i0) this.f34693a.get(iIntValue);
            sVar.d0(1034459906);
            SyllableLessonStatus syllableLessonStatus = i0Var.f38754g;
            int i12 = i0Var.f38749b;
            String strValueOf = String.valueOf(i12);
            String str = i0Var.f38751d;
            boolean zA = kotlin.jvm.internal.m.a(this.f34694b, i0Var.f38755h.name() + ":" + i12);
            z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
            fz.c cVar2 = this.f34697e;
            boolean zF = sVar.f(cVar2) | sVar.h(i0Var);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new bp.b1(15, cVar2, i0Var);
                sVar.o0(objQ);
            }
            a.j(syllableLessonStatus, strValueOf, str, zA, this.f34695c, rVarE, this.f34696d, (fz.a) objQ, sVar, 196608);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
