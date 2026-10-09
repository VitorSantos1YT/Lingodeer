package fu;

import l1.b1;
import mt.m3;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f28176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f28177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(b1 b1Var, b1 b1Var2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28174a = i11;
        this.f28176c = b1Var;
        this.f28177d = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28174a) {
            case 0:
                return new y(this.f28176c, this.f28177d, dVar, 0);
            case 1:
                return new y(this.f28176c, this.f28177d, dVar, 1);
            case 2:
                return new y(this.f28176c, this.f28177d, dVar, 2);
            case 3:
                return new y(this.f28176c, this.f28177d, dVar, 3);
            case 4:
                return new y(this.f28176c, this.f28177d, dVar, 4);
            case 5:
                return new y(this.f28176c, this.f28177d, dVar, 5);
            case 6:
                return new y(this.f28176c, this.f28177d, dVar, 6);
            case 7:
                return new y(this.f28176c, this.f28177d, dVar, 7);
            case 8:
                return new y(this.f28176c, this.f28177d, dVar, 8);
            case 9:
                return new y(this.f28176c, this.f28177d, dVar, 9);
            default:
                return new y(this.f28176c, this.f28177d, dVar, 10);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28174a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((y) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f28174a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f28177d;
        b1 b1Var2 = this.f28176c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f28175b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b1Var2.setValue(Boolean.TRUE);
                    this.f28175b = 1;
                    if (rz.e0.m(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f28175b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b1Var2.setValue(Boolean.TRUE);
                    this.f28175b = 1;
                    if (rz.e0.m(300L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f28175b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                int i15 = m3.f41654a;
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f28175b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f28175b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f28175b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f28175b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b1Var2.setValue(Boolean.TRUE);
                    this.f28175b = 1;
                    if (rz.e0.m(300L, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f28175b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f28175b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f28175b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                float f5 = p2.f58208a;
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
            default:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f28175b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28175b = 1;
                    if (rz.e0.m(1500L, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                float f11 = p2.f58208a;
                b1Var2.setValue(Boolean.FALSE);
                b1Var.setValue(null);
                return b0Var;
        }
    }
}
