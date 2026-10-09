package bt;

import android.content.Context;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a8 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5171a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(boolean z11, jt.f2 f2Var, boolean z12, Context context, l1.g1 g1Var, vy.d dVar) {
        super(2, dVar);
        this.f5172b = z11;
        this.f5174d = f2Var;
        this.f5173c = z12;
        this.f5175e = context;
        this.f5176f = g1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5171a) {
            case 0:
                return new a8(this.f5172b, (jt.f2) this.f5174d, this.f5173c, (Context) this.f5175e, (l1.g1) this.f5176f, dVar);
            default:
                return new a8(this.f5172b, this.f5173c, (e2.l) this.f5174d, (fz.a) this.f5175e, this.f5176f, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5171a) {
            case 0:
                a8 a8Var = (a8) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                a8Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                a8 a8Var2 = (a8) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                a8Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5171a;
        Object obj2 = this.f5175e;
        Object obj3 = this.f5174d;
        boolean z11 = this.f5173c;
        boolean z12 = this.f5172b;
        l1.b1 b1Var = this.f5176f;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                l1.g1 g1Var = (l1.g1) b1Var;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z12) {
                    g1Var.m(((jt.f2) obj3) instanceof jt.d2 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (z11) {
                    Context context = (Context) obj2;
                    l1.c3 c3Var = dt.k3.f23943a;
                    kotlin.jvm.internal.m.f(context, "context");
                    g1Var.m(1.0f);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z12) {
                    b1Var.setValue(Boolean.FALSE);
                } else if (z11) {
                    b1Var.setValue(Boolean.TRUE);
                } else if (((Boolean) b1Var.getValue()).booleanValue()) {
                    e2.l.a((e2.l) obj3);
                    b1Var.setValue(Boolean.FALSE);
                    ((fz.a) obj2).invoke();
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(boolean z11, boolean z12, e2.l lVar, fz.a aVar, l1.b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f5172b = z11;
        this.f5173c = z12;
        this.f5174d = lVar;
        this.f5175e = aVar;
        this.f5176f = b1Var;
    }
}
