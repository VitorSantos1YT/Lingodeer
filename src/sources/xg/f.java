package xg;

import android.app.Activity;
import l1.b1;
import rz.b0;
import rz.o0;
import uz.x0;
import wz.m;
import y0.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f56071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.c f56072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f56073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f56074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f56075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, v3.c cVar, float f5, float f11, b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f56071b = activity;
        this.f56072c = cVar;
        this.f56073d = f5;
        this.f56074e = f11;
        this.f56075f = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new f(this.f56071b, this.f56072c, this.f56073d, this.f56074e, this.f56075f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f56070a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            za.g.f59070a.getClass();
            Activity activity = this.f56071b;
            uz.c cVarG = x0.g(new j(5, za.f.a(activity), activity, null));
            yz.f fVar = o0.f50940a;
            uz.i iVarW = x0.w(cVarG, m.f55536a);
            e eVar = new e(activity, this.f56072c, this.f56073d, this.f56074e, this.f56075f);
            this.f56070a = 1;
            if (iVarW.collect(eVar, this) == aVar) {
                return aVar;
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
