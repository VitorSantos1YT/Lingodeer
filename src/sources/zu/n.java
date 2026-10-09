package zu;

import fr.r4;
import fr.s4;
import fr.v3;
import fr.x4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f59498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f59499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, j jVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f59496a = i11;
        this.f59498c = qVar;
        this.f59499d = jVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59496a) {
            case 0:
                return new n(this.f59498c, this.f59499d, dVar, 0);
            case 1:
                return new n(this.f59498c, this.f59499d, dVar, 1);
            default:
                return new n(this.f59498c, this.f59499d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59496a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        int i11 = this.f59496a;
        qy.b0 b0Var = qy.b0.f48488a;
        j jVar = this.f59499d;
        q qVar = this.f59498c;
        switch (i11) {
            case 0:
                uz.i1 i1Var = qVar.f59534e;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f59497b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value = i1Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!i1Var.j(value, Boolean.TRUE));
                    vt.h1 h1Var = qVar.f59531b;
                    String str = ((i) jVar).f59440a;
                    this.f59497b = 1;
                    x4 x4Var = (x4) h1Var;
                    x4Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new s4(x4Var, str, null), this);
                    if (objM != wy.a.COROUTINE_SUSPENDED) {
                        objM = b0Var;
                    }
                    if (objM != aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                do {
                    value2 = i1Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!i1Var.j(value2, Boolean.FALSE));
                vt.c cVar = qVar.f59532c;
                this.f59497b = 2;
                ((vt.d) cVar).n(this);
                if (b0Var != aVar) {
                    return b0Var;
                }
                return aVar;
            case 1:
                uz.i1 i1Var2 = qVar.f59534e;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f59497b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value3 = i1Var2.getValue();
                        ((Boolean) value3).getClass();
                    } while (!i1Var2.j(value3, Boolean.TRUE));
                    vt.h1 h1Var2 = qVar.f59531b;
                    String str2 = ((h) jVar).f59428a;
                    this.f59497b = 1;
                    x4 x4Var2 = (x4) h1Var2;
                    x4Var2.getClass();
                    yz.f fVar2 = rz.o0.f50940a;
                    Object objM2 = rz.e0.M(yz.e.f58387a, new r4(x4Var2, str2, null), this);
                    if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                        objM2 = b0Var;
                    }
                    if (objM2 != aVar2) {
                    }
                    return aVar2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                do {
                    value4 = i1Var2.getValue();
                    ((Boolean) value4).getClass();
                } while (!i1Var2.j(value4, Boolean.FALSE));
                vt.c cVar2 = qVar.f59532c;
                this.f59497b = 2;
                ((vt.d) cVar2).n(this);
                if (b0Var != aVar2) {
                    return b0Var;
                }
                return aVar2;
            default:
                uz.i1 i1Var3 = qVar.f59534e;
                uz.i1 i1Var4 = qVar.f59535f;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f59497b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value5 = i1Var3.getValue();
                        ((Boolean) value5).getClass();
                    } while (!i1Var3.j(value5, Boolean.TRUE));
                    do {
                        value6 = i1Var4.getValue();
                    } while (!i1Var4.j(value6, a.Loading));
                    vt.h1 h1Var3 = qVar.f59531b;
                    b bVar = (b) jVar;
                    String str3 = bVar.f59381a;
                    String str4 = bVar.f59382b;
                    this.f59497b = 1;
                    x4 x4Var3 = (x4) h1Var3;
                    x4Var3.getClass();
                    yz.f fVar3 = rz.o0.f50940a;
                    obj = rz.e0.M(yz.e.f58387a, new v3(x4Var3, str3, str4, null), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    do {
                        value9 = i1Var4.getValue();
                    } while (!i1Var4.j(value9, a.Success));
                } else {
                    do {
                        value7 = i1Var4.getValue();
                    } while (!i1Var4.j(value7, a.Error));
                }
                do {
                    value8 = i1Var3.getValue();
                    ((Boolean) value8).getClass();
                } while (!i1Var3.j(value8, Boolean.FALSE));
                return b0Var;
        }
    }
}
