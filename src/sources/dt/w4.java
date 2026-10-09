package dt;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w4 extends xy.i implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f24329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f24330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f24331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h5 f24333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24334f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24335t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(long j11, ExoPlayer exoPlayer, fz.c cVar, l1.b1 b1Var, h5 h5Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, vy.d dVar) {
        super(2, dVar);
        this.f24329a = j11;
        this.f24330b = exoPlayer;
        this.f24331c = cVar;
        this.f24332d = b1Var;
        this.f24333e = h5Var;
        this.f24334f = b1Var2;
        this.f24335t = b1Var3;
        this.H = b1Var4;
        this.K = b1Var5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new w4(this.f24329a, this.f24330b, this.f24331c, this.f24332d, this.f24333e, this.f24334f, this.f24335t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        w4 w4Var = (w4) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        w4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        l1.b1 b1Var = this.f24332d;
        long jLongValue = ((Number) b1Var.getValue()).longValue();
        long j11 = this.f24329a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (j11 <= jLongValue) {
            if (j11 < ((Number) b1Var.getValue()).longValue()) {
                b1Var.setValue(Long.valueOf(j11));
            }
            return b0Var;
        }
        b1Var.setValue(Long.valueOf(j11));
        y4.b(this.f24333e);
        l1.b1 b1Var2 = this.f24334f;
        boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
        y6.j0 j0Var = this.f24330b;
        boolean z11 = zBooleanValue || j0Var.u() == 4;
        j0Var.r(false);
        if (!z11) {
            ((b0.h2) j0Var).l0(5, 0L);
        }
        b1Var2.setValue(Boolean.valueOf(z11));
        y4.c(this.f24335t, z11);
        Boolean bool = Boolean.TRUE;
        this.H.setValue(bool);
        this.K.setValue(bool);
        this.f24331c.invoke(z4.Idle);
        return b0Var;
    }
}
