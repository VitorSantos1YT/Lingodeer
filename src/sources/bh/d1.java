package bh;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f4190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(s1 s1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4187a = i11;
        this.f4190d = s1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4187a) {
            case 0:
                d1 d1Var = new d1(this.f4190d, dVar, 0);
                d1Var.f4189c = obj;
                return d1Var;
            default:
                d1 d1Var2 = new d1(this.f4190d, dVar, 1);
                d1Var2.f4189c = obj;
                return d1Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4187a) {
            case 0:
                break;
        }
        return ((d1) create(list, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4187a) {
            case 0:
                List list = (List) this.f4189c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4188b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                s1 s1Var = this.f4190d;
                vt.d0 d0Var = s1Var.f4363d;
                int i12 = ((fr.o0) s1Var.f4362c).f27733a.keyLanguage;
                this.f4189c = null;
                this.f4188b = 1;
                Object objB = d0Var.b(i12, ry.r.f50854a, new n5.d(list, null, 1), this);
                return objB == aVar ? aVar : objB;
            default:
                List list2 = (List) this.f4189c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4188b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                s1 s1Var2 = this.f4190d;
                vt.d0 d0Var2 = s1Var2.f4363d;
                int i14 = ((fr.o0) s1Var2.f4362c).f27733a.keyLanguage;
                this.f4189c = null;
                this.f4188b = 1;
                Object objB2 = d0Var2.b(i14, ry.r.f50854a, new n5.d(list2, null, 1), this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
