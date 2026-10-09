package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(jt.j0 j0Var, CourseSentence courseSentence, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5703a = i11;
        this.f5705c = j0Var;
        this.f5706d = courseSentence;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5703a) {
            case 0:
                return new m3(this.f5705c, this.f5706d, dVar, 0);
            default:
                return new m3(this.f5705c, this.f5706d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5703a) {
            case 0:
                break;
        }
        return ((m3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5703a;
        int i12 = 3;
        vy.d dVar = null;
        CourseSentence courseSentence = this.f5706d;
        jt.j0 j0Var = this.f5705c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5704b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f5704b = 1;
                j0Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new iv.h0(i12, j0Var, courseSentence, dVar), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f5704b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f5704b = 1;
                j0Var.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new iv.h0(i12, j0Var, courseSentence, dVar), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
        }
    }
}
