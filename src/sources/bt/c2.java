package bt;

import android.content.Context;
import com.google.accompanist.permissions.PermissionState;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.DayStreakWeeklyItem;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5263f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5264t;

    public /* synthetic */ c2(fz.c cVar, kr.h0 h0Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f5258a = 2;
        this.f5264t = cVar;
        this.f5261d = h0Var;
        this.f5259b = b1Var;
        this.f5262e = b1Var2;
        this.f5263f = b1Var3;
        this.f5260c = b1Var4;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean z11;
        switch (this.f5258a) {
            case 0:
                e2.l lVar = (e2.l) this.f5261d;
                rz.b0 b0Var = (rz.b0) this.f5259b;
                jt.m1 m1Var = (jt.m1) this.f5262e;
                CourseSentence courseSentence = (CourseSentence) this.f5263f;
                fz.c cVar = (fz.c) this.f5264t;
                fz.a aVar = (fz.a) this.f5260c;
                e2.l.a(lVar);
                rz.e0.B(b0Var, null, null, new b0.f(m1Var, courseSentence, cVar, aVar, (vy.d) null, 8), 3);
                break;
            case 1:
                rz.b0 b0Var2 = (rz.b0) this.f5259b;
                fz.a aVar2 = (fz.a) this.f5260c;
                l1.b1 b1Var = (l1.b1) this.f5261d;
                hu.o oVar = (hu.o) this.f5262e;
                l1.a1 a1Var = (l1.a1) this.f5263f;
                l1.b1 b1Var2 = (l1.b1) this.f5264t;
                DayStreakWeeklyItemStatus status = ((DayStreakWeeklyItem) ((List) b1Var.getValue()).get(5)).getStatus();
                DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                vy.d dVar = null;
                if (status == dayStreakWeeklyItemStatus) {
                    rz.e0.B(b0Var2, null, null, new fu.c0(oVar, a1Var, b1Var2, dVar, 1), 3);
                } else if (((DayStreakWeeklyItem) ((List) b1Var.getValue()).get(6)).getStatus() == dayStreakWeeklyItemStatus) {
                    rz.e0.B(b0Var2, null, null, new ad.y(oVar, b1Var2, a1Var, dVar, 10), 3);
                } else {
                    aVar2.invoke();
                }
                return qy.b0.f48488a;
            case 2:
                fz.c cVar2 = (fz.c) this.f5264t;
                kr.h0 h0Var = (kr.h0) this.f5261d;
                l1.b1 b1Var3 = (l1.b1) this.f5259b;
                l1.b1 b1Var4 = (l1.b1) this.f5262e;
                l1.b1 b1Var5 = (l1.b1) this.f5263f;
                l1.b1 b1Var6 = (l1.b1) this.f5260c;
                cVar2.invoke(new kr.h0(((Number) b1Var3.getValue()).intValue(), h0Var.f38477b, h0Var.f38478c, h0Var.f38479d, ((Number) b1Var6.getValue()).intValue(), h0Var.f38481f, ((Number) b1Var4.getValue()).intValue(), ((Boolean) b1Var5.getValue()).booleanValue()));
                break;
            case 3:
                PermissionState permissionState = (PermissionState) this.f5261d;
                l1.b1 b1Var7 = (l1.b1) this.f5259b;
                l1.b1 b1Var8 = (l1.b1) this.f5262e;
                l1.b1 b1Var9 = (l1.b1) this.f5263f;
                Context context = (Context) this.f5264t;
                l1.b1 b1Var10 = (l1.b1) this.f5260c;
                av.n nVar = (av.n) b1Var7.getValue();
                if (nVar != null) {
                    nVar.n();
                }
                av.b bVar = (av.b) b1Var8.getValue();
                if (bVar != null && bVar.f3111d) {
                    av.b bVar2 = (av.b) b1Var8.getValue();
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                } else if (((Boolean) b1Var9.getValue()).booleanValue()) {
                    ls.f.c(context, b1Var7, b1Var8, b1Var10);
                } else {
                    permissionState.a();
                }
                return qy.b0.f48488a;
            case 4:
                w1.a aVar3 = (w1.a) this.f5261d;
                w1.i iVar = (w1.i) this.f5259b;
                w1.e eVar = (w1.e) this.f5262e;
                String str = (String) this.f5263f;
                Object[] objArr = (Object[]) this.f5260c;
                boolean z12 = true;
                if (aVar3.f54451b != eVar) {
                    aVar3.f54451b = eVar;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (kotlin.jvm.internal.m.a(aVar3.f54452c, str)) {
                    z12 = z11;
                } else {
                    aVar3.f54452c = str;
                }
                aVar3.f54450a = iVar;
                aVar3.f54453d = this.f5264t;
                aVar3.f54454e = objArr;
                w1.d dVar2 = aVar3.f54455f;
                if (dVar2 != null && z12) {
                    ((qp.m3) dVar2).j();
                    aVar3.f54455f = null;
                    aVar3.b();
                }
                return qy.b0.f48488a;
            default:
                ys.s0 s0Var = (ys.s0) this.f5261d;
                fz.a aVar4 = (fz.a) this.f5260c;
                l1.b1 b1Var11 = (l1.b1) this.f5259b;
                fz.a aVar5 = (fz.a) this.f5262e;
                l1.b1 b1Var12 = (l1.b1) this.f5263f;
                l1.a1 a1Var2 = (l1.a1) this.f5264t;
                if (s0Var instanceof ys.r0) {
                    b1Var11.setValue(Boolean.TRUE);
                    aVar4.invoke();
                } else {
                    ys.a.b(aVar5, b1Var12, a1Var2);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f5258a = i11;
        this.f5261d = obj;
        this.f5259b = obj2;
        this.f5262e = obj3;
        this.f5263f = obj4;
        this.f5264t = obj5;
        this.f5260c = obj6;
    }

    public /* synthetic */ c2(rz.b0 b0Var, fz.a aVar, l1.b1 b1Var, hu.o oVar, l1.a1 a1Var, l1.b1 b1Var2) {
        this.f5258a = 1;
        this.f5259b = b0Var;
        this.f5260c = aVar;
        this.f5261d = b1Var;
        this.f5262e = oVar;
        this.f5263f = a1Var;
        this.f5264t = b1Var2;
    }

    public /* synthetic */ c2(ys.s0 s0Var, fz.a aVar, l1.b1 b1Var, fz.a aVar2, l1.b1 b1Var2, l1.a1 a1Var) {
        this.f5258a = 5;
        this.f5261d = s0Var;
        this.f5260c = aVar;
        this.f5259b = b1Var;
        this.f5262e = aVar2;
        this.f5263f = b1Var2;
        this.f5264t = a1Var;
    }
}
