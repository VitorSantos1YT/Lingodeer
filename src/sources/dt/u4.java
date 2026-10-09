package dt;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u4 extends xy.i implements fz.e {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ rz.b0 K;
    public final /* synthetic */ l1.b1 L;
    public final /* synthetic */ l1.b1 M;
    public final /* synthetic */ l1.b1 N;
    public final /* synthetic */ l1.b1 O;
    public final /* synthetic */ l1.b1 P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f24250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h5 f24251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24254f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24255t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(boolean z11, ExoPlayer exoPlayer, h5 h5Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, boolean z12, rz.b0 b0Var, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7, l1.b1 b1Var8, l1.b1 b1Var9, vy.d dVar) {
        super(2, dVar);
        this.f24249a = z11;
        this.f24250b = exoPlayer;
        this.f24251c = h5Var;
        this.f24252d = b1Var;
        this.f24253e = b1Var2;
        this.f24254f = b1Var3;
        this.f24255t = b1Var4;
        this.H = z12;
        this.K = b0Var;
        this.L = b1Var5;
        this.M = b1Var6;
        this.N = b1Var7;
        this.O = b1Var8;
        this.P = b1Var9;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new u4(this.f24249a, this.f24250b, this.f24251c, this.f24252d, this.f24253e, this.f24254f, this.f24255t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        u4 u4Var = (u4) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        u4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        boolean z11 = this.f24249a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (!z11) {
            y4.b(this.f24251c);
            return b0Var;
        }
        l1.b1 b1Var = this.f24252d;
        boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
        ExoPlayer exoPlayer = this.f24250b;
        if (zBooleanValue) {
            ((b0.h2) exoPlayer).l0(5, 0L);
            Boolean bool = Boolean.FALSE;
            this.f24253e.setValue(bool);
            this.f24254f.setValue(bool);
            b1Var.setValue(bool);
        }
        if (((Boolean) this.f24255t.getValue()).booleanValue()) {
            y4.d(this.f24249a, this.H, this.f24251c, this.K, this.f24254f, b1Var, this.L, exoPlayer, this.M, this.N, this.O, this.P);
        }
        return b0Var;
    }
}
