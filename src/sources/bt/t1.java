package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.h0 f6011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseWord f6012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(jt.h0 h0Var, CourseWord courseWord, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6009a = i11;
        this.f6011c = h0Var;
        this.f6012d = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6009a) {
            case 0:
                return new t1(this.f6011c, this.f6012d, dVar, 0);
            default:
                return new t1(this.f6011c, this.f6012d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6009a) {
            case 0:
                break;
        }
        return ((t1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6009a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6010b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f6010b = 1;
                jt.h0 h0Var = this.f6011c;
                h0Var.getClass();
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new ad.x(h0Var, this.f6012d, uVar, null, 12), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f6010b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f6010b = 1;
                jt.h0 h0Var2 = this.f6011c;
                h0Var2.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new ad.y(11, h0Var2, this.f6012d, (vy.d) null), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
        }
    }
}
