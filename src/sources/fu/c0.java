package fu;

import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import l1.a1;
import l1.b1;
import l1.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.o f28075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f28076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f28077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(hu.o oVar, a1 a1Var, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28073a = i11;
        this.f28075c = oVar;
        this.f28076d = a1Var;
        this.f28077e = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28073a) {
            case 0:
                return new c0(this.f28075c, this.f28076d, this.f28077e, dVar, 0);
            default:
                return new c0(this.f28075c, this.f28076d, this.f28077e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28073a) {
            case 0:
                break;
        }
        return ((c0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28073a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f28074b;
                hu.o oVar = this.f28075c;
                a1 a1Var = this.f28076d;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else if (i11 == 2) {
                        com.bumptech.glide.e.F(obj);
                        e0.c(a1Var, 3);
                        oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                        this.f28074b = 3;
                        if (rz.e0.m(3000L, this) == aVar) {
                            return aVar;
                        }
                        e0.c(a1Var, 4);
                        oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                        this.f28074b = 4;
                        if (rz.e0.m(3000L, this) == aVar) {
                            return aVar;
                        }
                    } else if (i11 == 3) {
                        com.bumptech.glide.e.F(obj);
                        e0.c(a1Var, 4);
                        oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                        this.f28074b = 4;
                        if (rz.e0.m(3000L, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    e0.c(a1Var, 5);
                    oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                    this.f28077e.setValue(Boolean.TRUE);
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                e0.c(a1Var, 1);
                oVar.a(1, DayStreakWeeklyItemStatus.STREAK);
                this.f28074b = 1;
                if (rz.e0.m(3000L, this) == aVar) {
                    return aVar;
                }
                e0.c(a1Var, 2);
                oVar.a(2, DayStreakWeeklyItemStatus.STREAK);
                this.f28074b = 2;
                if (rz.e0.m(3000L, this) == aVar) {
                    return aVar;
                }
                e0.c(a1Var, 3);
                oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                this.f28074b = 3;
                if (rz.e0.m(3000L, this) == aVar) {
                    return aVar;
                }
                e0.c(a1Var, 4);
                oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                this.f28074b = 4;
                if (rz.e0.m(3000L, this) == aVar) {
                    return aVar;
                }
                e0.c(a1Var, 5);
                oVar.a(((h1) a1Var).l(), DayStreakWeeklyItemStatus.STREAK);
                this.f28077e.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f28074b;
                b1 b1Var = this.f28077e;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    e0.c(this.f28076d, 0);
                    this.f28075c.a(6, DayStreakWeeklyItemStatus.STREAK_RESET);
                    b1Var.setValue(Boolean.FALSE);
                    this.f28074b = 1;
                    if (rz.e0.m(1000L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
        }
    }
}
