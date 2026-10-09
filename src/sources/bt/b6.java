package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b6 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.q1 f5230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6(jt.q1 q1Var, CourseWord courseWord, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5228a = i11;
        this.f5230c = q1Var;
        this.f5231d = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5228a) {
            case 0:
                return new b6(this.f5230c, this.f5231d, dVar, 0);
            case 1:
                return new b6(this.f5230c, this.f5231d, dVar, 1);
            default:
                return new b6(this.f5230c, this.f5231d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5228a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b6) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5228a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f5229b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f5229b = 1;
                jt.q1 q1Var = this.f5230c;
                q1Var.getClass();
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new ad.x(q1Var, this.f5231d, uVar, null, 14), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5229b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f5229b = 1;
                jt.q1 q1Var2 = this.f5230c;
                q1Var2.getClass();
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new ad.x(q1Var2, this.f5231d, uVar2, null, 14), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f5229b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f5229b = 1;
                jt.q1 q1Var3 = this.f5230c;
                q1Var3.getClass();
                yz.f fVar3 = rz.o0.f50940a;
                Object objM3 = rz.e0.M(yz.e.f58387a, new ad.y(14, q1Var3, this.f5231d, (vy.d) null), this);
                if (objM3 != aVar3) {
                    objM3 = b0Var;
                }
                return objM3 == aVar3 ? aVar3 : b0Var;
        }
    }
}
