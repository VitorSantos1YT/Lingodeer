package f0;

import a.ar.MFeWs;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends xy.i implements fz.e {
    public final /* synthetic */ long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i2 f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.x f26269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f26272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2 f26273f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f26274t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i2 i2Var, kotlin.jvm.internal.x xVar, long j11, vy.d dVar) {
        super(2, dVar);
        this.f26273f = i2Var;
        this.f26274t = xVar;
        this.H = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        f2 f2Var = new f2(this.f26273f, this.f26274t, this.H, dVar);
        f2Var.f26272e = obj;
        return f2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f2) create((g2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        i2 i2Var;
        kotlin.jvm.internal.x xVar;
        long j11;
        i2 i2Var2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f26271d;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            g2 g2Var = (g2) this.f26272e;
            i2Var = this.f26273f;
            e2 e2Var = new e2(i2Var, g2Var);
            t0 t0Var = i2Var.f26307c;
            xVar = this.f26274t;
            long j12 = xVar.f38360a;
            h1 h1Var = i2Var.f26308d;
            h1 h1Var2 = h1.Horizontal;
            long j13 = this.H;
            float fD = i2Var.d(h1Var == h1Var2 ? v3.q.b(j13) : v3.q.c(j13));
            this.f26272e = i2Var;
            this.f26268a = i2Var;
            this.f26269b = xVar;
            this.f26270c = j12;
            this.f26271d = 1;
            obj = t0Var.a(e2Var, fD, this);
            if (obj == aVar) {
                return aVar;
            }
            j11 = j12;
            i2Var2 = i2Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(MFeWs.KBeaSKAA);
            }
            j11 = this.f26270c;
            xVar = this.f26269b;
            i2Var = this.f26268a;
            i2Var2 = (i2) this.f26272e;
            com.bumptech.glide.e.F(obj);
        }
        float fD2 = i2Var2.d(((Number) obj).floatValue());
        xVar.f38360a = i2Var.f26308d == h1.Horizontal ? v3.q.a(j11, 2, fD2, CropImageView.DEFAULT_ASPECT_RATIO) : v3.q.a(j11, 1, CropImageView.DEFAULT_ASPECT_RATIO, fD2);
        return qy.b0.f48488a;
    }
}
