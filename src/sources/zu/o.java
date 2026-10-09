package zu;

import fr.x4;
import fr.z3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f59506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f59507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f59508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, fz.a aVar, fz.a aVar2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f59504a = i11;
        this.f59506c = qVar;
        this.f59507d = aVar;
        this.f59508e = aVar2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59504a) {
            case 0:
                return new o(this.f59506c, this.f59507d, this.f59508e, dVar, 0);
            default:
                return new o(this.f59506c, this.f59507d, this.f59508e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59504a) {
            case 0:
                break;
        }
        return ((o) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i11 = this.f59504a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.a aVar = this.f59508e;
        fz.a aVar2 = this.f59507d;
        q qVar = this.f59506c;
        switch (i11) {
            case 0:
                uz.i1 i1Var = qVar.f59534e;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f59505b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value = i1Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!i1Var.j(value, Boolean.TRUE));
                    vt.h1 h1Var = qVar.f59531b;
                    this.f59505b = 1;
                    x4 x4Var = (x4) h1Var;
                    x4Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    obj = rz.e0.M(yz.e.f58387a, new z3(x4Var, null), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                do {
                    value2 = i1Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!i1Var.j(value2, Boolean.FALSE));
                if (zBooleanValue) {
                    aVar2.invoke();
                    return b0Var;
                }
                aVar.invoke();
                return b0Var;
            default:
                uz.i1 i1Var2 = qVar.f59534e;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f59505b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value3 = i1Var2.getValue();
                        ((Boolean) value3).getClass();
                    } while (!i1Var2.j(value3, Boolean.TRUE));
                    vt.h1 h1Var2 = qVar.f59531b;
                    this.f59505b = 1;
                    obj = vt.h1.a(h1Var2, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                do {
                    value4 = i1Var2.getValue();
                    ((Boolean) value4).getClass();
                } while (!i1Var2.j(value4, Boolean.FALSE));
                if (zBooleanValue2) {
                    aVar2.invoke();
                    return b0Var;
                }
                aVar.invoke();
                return b0Var;
        }
    }
}
