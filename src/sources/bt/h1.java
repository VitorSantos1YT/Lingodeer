package bt;

import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5467a = i11;
        this.f5468b = b1Var;
        this.f5469c = b1Var2;
        this.f5470d = b1Var3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5467a) {
            case 0:
                return new h1(this.f5468b, this.f5469c, this.f5470d, dVar, 0);
            case 1:
                return new h1(this.f5468b, this.f5469c, this.f5470d, dVar, 1);
            default:
                return new h1(this.f5468b, this.f5469c, this.f5470d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5467a) {
            case 0:
                h1 h1Var = (h1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                h1Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                h1 h1Var2 = (h1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                h1Var2.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                h1 h1Var3 = (h1) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                h1Var3.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5467a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f5470d;
        l1.b1 b1Var2 = this.f5468b;
        l1.b1 b1Var3 = this.f5469c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if ((((ht.l) b1Var2.getValue()) instanceof ht.a) && ((Boolean) b1Var3.getValue()).booleanValue()) {
                    b1Var3.setValue(Boolean.FALSE);
                    b1Var.setValue(ht.q.SELECTED);
                }
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Boolean bool = Boolean.TRUE;
                b1Var2.setValue(bool);
                b1Var3.setValue(bool);
                b1Var.setValue(new g2.x(g2.f0.e(2281701376L)));
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if ((((hu.r) b1Var2.getValue()) instanceof hu.q) && (((sr.c) b1Var3.getValue()) instanceof sr.b)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ys.r0.f58238a);
                    sr.c cVar = (sr.c) b1Var3.getValue();
                    kotlin.jvm.internal.m.d(cVar, "null cannot be cast to non-null type com.lingodeer.achievement.viewmodels.AchievementCheckStatus.LoadingSuccess");
                    List list = ((sr.b) cVar).f51754a;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ys.o0((AchievementLevel) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    hu.r rVar = (hu.r) b1Var2.getValue();
                    kotlin.jvm.internal.m.d(rVar, "null cannot be cast to non-null type com.lingodeer.daystreak.viewmodels.DayStreakFinishUiState.Success");
                    hu.q qVar = (hu.q) rVar;
                    DayStreakFinishedStatus dayStreakFinishedStatus = qVar.f33815a;
                    if (dayStreakFinishedStatus != null) {
                        if (qVar.f33817c) {
                            arrayList.add(new ys.q0(dayStreakFinishedStatus, qVar.f33816b));
                        }
                        arrayList.add(ys.p0.f58206a);
                    }
                    b1Var.setValue(arrayList);
                }
                break;
        }
        return b0Var;
    }
}
