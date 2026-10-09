package qh;

import fr.o0;
import hj.v5;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f47776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47774a = i11;
        this.f47776c = mVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47774a) {
            case 0:
                return new l(this.f47776c, dVar, 0);
            case 1:
                return new l(this.f47776c, dVar, 1);
            default:
                return new l(this.f47776c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47774a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((l) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f47774a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f47775b;
                m mVar = this.f47776c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarS = mVar.s();
                    this.f47775b = 1;
                    if (((o0) n0VarS).J(0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar2 = mVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((v5) aVar2).f33470j.setChecked(false);
                ta.a aVar3 = mVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((v5) aVar3).f33471k.setChecked(false);
                return qy.b0.f48488a;
            case 1:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f47775b;
                m mVar2 = this.f47776c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarS2 = mVar2.s();
                    this.f47775b = 1;
                    if (((o0) n0VarS2).J(1, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar5 = mVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((v5) aVar5).f33472l.setChecked(false);
                ta.a aVar6 = mVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((v5) aVar6).f33471k.setChecked(false);
                return qy.b0.f48488a;
            default:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f47775b;
                m mVar3 = this.f47776c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarS3 = mVar3.s();
                    this.f47775b = 1;
                    if (((o0) n0VarS3).J(2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar8 = mVar3.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((v5) aVar8).f33470j.setChecked(false);
                ta.a aVar9 = mVar3.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((v5) aVar9).f33472l.setChecked(false);
                return qy.b0.f48488a;
        }
    }
}
