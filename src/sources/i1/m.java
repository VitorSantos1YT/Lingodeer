package i1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ u f34039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ o0 f34040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ob.s f34042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f34043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ob.s sVar, float f5, vy.d dVar) {
        super(4, dVar);
        this.f34042e = sVar;
        this.f34043f = f5;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        m mVar = new m(this.f34042e, this.f34043f, (vy.d) obj4);
        mVar.f34039b = (u) obj;
        mVar.f34040c = (o0) obj2;
        mVar.f34041d = obj3;
        return mVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f34038a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            u uVar = this.f34039b;
            float fD = this.f34040c.d(this.f34041d);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                ob.s sVar = this.f34042e;
                float fL = Float.isNaN(((l1.g1) sVar.f44884j).l()) ? CropImageView.DEFAULT_ASPECT_RATIO : ((l1.g1) sVar.f44884j).l();
                vVar.f38358a = fL;
                b0.m mVar = (b0.m) sVar.f44877c;
                b2.h hVar = new b2.h(8, uVar, vVar);
                this.f34039b = null;
                this.f34040c = null;
                this.f34038a = 1;
                if (b0.e.c(fL, fD, this.f34043f, mVar, hVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
