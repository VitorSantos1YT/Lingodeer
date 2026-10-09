package bh;

import com.lingodeer.data.model.LearnProgress;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f4175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4172a = i11;
        this.f4175d = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4172a) {
            case 0:
                c0 c0Var = new c0(0, this.f4175d, dVar);
                c0Var.f4174c = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(1, this.f4175d, dVar);
                c0Var2.f4174c = obj;
                return c0Var2;
            default:
                c0 c0Var3 = new c0(2, this.f4175d, dVar);
                c0Var3.f4174c = obj;
                return c0Var3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4172a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c0) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4172a) {
            case 0:
                uz.j jVar = (uz.j) this.f4174c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4173b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                a1 a1Var = this.f4175d;
                gp.r rVarE = a1Var.e(((fr.o0) a1Var.f4149c).f27733a.keyLanguage, false);
                this.f4174c = jVar;
                this.f4173b = 1;
                obj = uz.x0.u(rVarE, this);
                if (obj == aVar) {
                    return aVar;
                }
                Long l9 = new Long(((LearnProgress) obj).getCurrentEnteredUnitId());
                this.f4174c = null;
                this.f4173b = 2;
                if (jVar.emit(l9, this) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            case 1:
                uz.j jVar2 = (uz.j) this.f4174c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4173b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                a1 a1Var2 = this.f4175d;
                gp.r rVarE2 = a1Var2.e(((fr.o0) a1Var2.f4149c).f27733a.keyLanguage, false);
                this.f4174c = jVar2;
                this.f4173b = 1;
                obj = uz.x0.u(rVarE2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                String main = ((LearnProgress) obj).getMain();
                this.f4174c = null;
                this.f4173b = 2;
                if (jVar2.emit(main, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
            default:
                uz.j jVar3 = (uz.j) this.f4174c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4173b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                a1 a1Var3 = this.f4175d;
                gp.r rVarE3 = a1Var3.e(((fr.o0) a1Var3.f4149c).f27733a.keyLanguage, false);
                this.f4174c = jVar3;
                this.f4173b = 1;
                obj = uz.x0.u(rVarE3, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                String mainTT = ((LearnProgress) obj).getMainTT();
                this.f4174c = null;
                this.f4173b = 2;
                if (jVar3.emit(mainTT, this) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
        }
    }
}
