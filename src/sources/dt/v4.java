package dt;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f24288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f24289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h5 f24291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24292f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(boolean z11, ExoPlayer exoPlayer, fz.c cVar, boolean z12, h5 h5Var, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.f24287a = z11;
        this.f24288b = exoPlayer;
        this.f24289c = cVar;
        this.f24290d = z12;
        this.f24291e = h5Var;
        this.f24292f = b1Var;
        this.f24293t = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new v4(this.f24287a, this.f24288b, this.f24289c, this.f24290d, this.f24291e, this.f24292f, this.f24293t, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        v4 v4Var = (v4) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        v4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        boolean z11 = this.f24287a;
        fz.c cVar = this.f24289c;
        ExoPlayer exoPlayer = this.f24288b;
        if (z11) {
            y4.b(this.f24291e);
            exoPlayer.r(false);
            cVar.invoke(z4.Idle);
        } else if (((Boolean) this.f24292f.getValue()).booleanValue() && this.f24290d && !((Boolean) this.f24293t.getValue()).booleanValue()) {
            exoPlayer.r(true);
            cVar.invoke(exoPlayer.b().f57185a < 0.95f ? z4.SlowPlaying : z4.NormalPlaying);
        }
        return qy.b0.f48488a;
    }
}
