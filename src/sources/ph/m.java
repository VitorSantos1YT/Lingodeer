package ph;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f46893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f46891a = i11;
        this.f46893c = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f46891a) {
            case 0:
                return new m(this.f46893c, dVar, 0);
            case 1:
                return new m(this.f46893c, dVar, 1);
            default:
                return new m(this.f46893c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f46891a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((m) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f46891a;
        o oVar = this.f46893c;
        int i12 = 1;
        switch (i11) {
            case 0:
                i1 i1Var = oVar.f46901f;
                i1 i1Var2 = oVar.f46899d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f46892b;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        Boolean bool = Boolean.TRUE;
                        i1Var2.getClass();
                        i1Var2.l(null, bool);
                        i1Var.k(null);
                        yz.f fVar = o0.f50940a;
                        yz.e eVar = yz.e.f58387a;
                        l lVar = new l(oVar, null);
                        this.f46892b = 1;
                        obj = e0.M(eVar, lVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    ArrayList arrayListA = o.a(oVar, (List) obj);
                    i1 i1Var3 = oVar.f46897b;
                    i1Var3.getClass();
                    i1Var3.l(null, arrayListA);
                    arrayListA.size();
                    break;
                } catch (Exception unused) {
                    i1Var.getClass();
                    i1Var.l(null, "加载收藏课程失败，请重试");
                    break;
                } finally {
                    Boolean bool2 = Boolean.FALSE;
                    i1Var2.getClass();
                    i1Var2.l(null, bool2);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f46892b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    w0 w0Var = ((vt.d) oVar.f46896a).f54203n;
                    n nVar = new n(oVar, 0);
                    this.f46892b = 1;
                    w0Var.getClass();
                    if (w0.l(w0Var, nVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f46892b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i1 i1Var4 = ((vt.d) oVar.f46896a).f54204o;
                    n nVar2 = new n(oVar, i12);
                    this.f46892b = 1;
                    if (i1Var4.collect(nVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
