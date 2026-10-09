package bh;

import com.lingodeer.data.model.LearnProgress;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f4437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4434a = i11;
        this.f4437d = a1Var;
        this.f4438e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4434a) {
            case 0:
                return new y0(this.f4437d, this.f4438e, dVar, 0);
            default:
                return new y0(this.f4437d, this.f4438e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4434a) {
            case 0:
                break;
        }
        return ((y0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        Object objU2;
        switch (this.f4434a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4436c;
                a1 a1Var = this.f4437d;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gp.r rVarE = a1Var.e(((fr.o0) a1Var.f4149c).f27733a.keyLanguage, false);
                    this.f4436c = 1;
                    objU = uz.x0.u(rVarE, this);
                    if (objU == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = this.f4435b;
                        com.bumptech.glide.e.F(obj);
                        return obj2;
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                }
                LearnProgress learnProgress = (LearnProgress) objU;
                String main = learnProgress.getMain();
                String str = this.f4438e;
                if (!kotlin.jvm.internal.m.a(main, str)) {
                    LearnProgress learnProgressCopy$default = LearnProgress.copy$default(learnProgress, null, str, null, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, true, 1073741821, null);
                    this.f4435b = objU;
                    this.f4436c = 2;
                    if (a1Var.i(learnProgressCopy$default, false, this) == aVar) {
                        return aVar;
                    }
                }
                return objU;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4436c;
                a1 a1Var2 = this.f4437d;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gp.r rVarE2 = a1Var2.e(((fr.o0) a1Var2.f4149c).f27733a.keyLanguage, false);
                    this.f4436c = 1;
                    objU2 = uz.x0.u(rVarE2, this);
                    if (objU2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = this.f4435b;
                        com.bumptech.glide.e.F(obj);
                        return obj3;
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                }
                LearnProgress learnProgress2 = (LearnProgress) objU2;
                String mainTT = learnProgress2.getMainTT();
                String str2 = this.f4438e;
                if (!kotlin.jvm.internal.m.a(mainTT, str2)) {
                    LearnProgress learnProgressCopy$default2 = LearnProgress.copy$default(learnProgress2, null, null, str2, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, true, 1073741819, null);
                    this.f4435b = objU2;
                    this.f4436c = 2;
                    if (a1Var2.i(learnProgressCopy$default2, false, this) == aVar2) {
                        return aVar2;
                    }
                }
                return objU2;
        }
    }
}
