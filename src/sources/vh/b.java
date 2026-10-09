package vh;

import com.lingo.lingoskill.LingoSkillApplication;
import fz.e;
import n9.n0;
import rz.b0;
import uz.x0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vt.c f54058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LingoSkillApplication f54059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(vt.c cVar, LingoSkillApplication lingoSkillApplication, d dVar, int i11) {
        super(2, dVar);
        this.f54056a = i11;
        this.f54058c = cVar;
        this.f54059d = lingoSkillApplication;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f54056a) {
            case 0:
                return new b(this.f54058c, this.f54059d, dVar, 0);
            default:
                return new b(this.f54058c, this.f54059d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        d dVar = (d) obj2;
        switch (this.f54056a) {
            case 0:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f54056a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54057b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarP = x0.p(((vt.d) this.f54058c).f54195e, 1);
                    a aVar2 = new a(this.f54059d, null, 0);
                    this.f54057b = 1;
                    if (x0.i(n0VarP, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f54057b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarP2 = x0.p(((vt.d) this.f54058c).f54194d, 1);
                    a aVar4 = new a(this.f54059d, null, 1);
                    this.f54057b = 1;
                    if (x0.i(n0VarP2, aVar4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
