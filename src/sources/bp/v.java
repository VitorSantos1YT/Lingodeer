package bp;

import android.content.Context;
import com.lingodeer.data.model.LessonState;
import h1.e8;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4843a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f4845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4848f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4849t;

    public /* synthetic */ v(String str, int i11, fz.c cVar, rz.b0 b0Var, e8 e8Var, fz.a aVar) {
        this.f4846d = str;
        this.f4844b = i11;
        this.f4845c = cVar;
        this.f4847e = b0Var;
        this.f4848f = e8Var;
        this.f4849t = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4843a) {
            case 0:
                String str = (String) this.f4846d;
                rz.b0 b0Var = (rz.b0) this.f4847e;
                e8 e8Var = (e8) this.f4848f;
                fz.a aVar = (fz.a) this.f4849t;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.r rVarE = j0.e2.e(j0.c.v(j0.e2.c(z1.o.f58481a, 0.8f)), 1.0f);
                    fz.c cVar = this.f4845c;
                    boolean zF = sVar.f(cVar) | sVar.h(b0Var) | sVar.f(e8Var) | sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        o oVar = new o(cVar, b0Var, e8Var, aVar, 1);
                        sVar.o0(oVar);
                        objQ = oVar;
                    }
                    g1.e(str, rVarE, this.f4844b, (fz.c) objQ, null, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                js.z zVar = (js.z) this.f4846d;
                js.w wVar = (js.w) this.f4847e;
                Context context = (Context) this.f4848f;
                js.t tVar = (js.t) this.f4849t;
                l0.c item = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str2 = zVar.f36856a;
                    boolean z11 = zVar.f36858c;
                    LessonState lessonState = zVar.f36859d;
                    boolean zH = sVar2.h(wVar);
                    int i11 = this.f4844b;
                    boolean zD = zH | sVar2.d(i11);
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zD || objQ2 == gVar) {
                        objQ2 = new f4(wVar, i11, 2);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar2 = (fz.a) objQ2;
                    List list = zVar.f36857b;
                    fz.c cVar2 = this.f4845c;
                    boolean zF2 = sVar2.f(cVar2) | sVar2.h(context);
                    Object objQ3 = sVar2.Q();
                    if (zF2 || objQ3 == gVar) {
                        objQ3 = new com.google.accompanist.permissions.a(cVar2, context);
                        sVar2.o0(objQ3);
                    }
                    es.j.e(str2, z11, lessonState, aVar2, list, (fz.c) objQ3, tVar.f36835c, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v(js.z zVar, js.w wVar, int i11, fz.c cVar, Context context, js.t tVar) {
        this.f4846d = zVar;
        this.f4847e = wVar;
        this.f4844b = i11;
        this.f4845c = cVar;
        this.f4848f = context;
        this.f4849t = tVar;
    }
}
