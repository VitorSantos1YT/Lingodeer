package dt;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t4 extends xy.i implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f24224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f24225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f24226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h5 f24227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24229f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Uri uri, ExoPlayer exoPlayer, fz.c cVar, h5 h5Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, vy.d dVar) {
        super(2, dVar);
        this.f24224a = uri;
        this.f24225b = exoPlayer;
        this.f24226c = cVar;
        this.f24227d = h5Var;
        this.f24228e = b1Var;
        this.f24229f = b1Var2;
        this.f24230t = b1Var3;
        this.H = b1Var4;
        this.K = b1Var5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new t4(this.f24224a, this.f24225b, this.f24226c, this.f24227d, this.f24228e, this.f24229f, this.f24230t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        t4 t4Var = (t4) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        t4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        y6.j0 j0Var = this.f24225b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        try {
            y4.b(this.f24227d);
            ((b0.h2) j0Var).N(ImmutableList.u(y6.x.a(this.f24224a)));
            j0Var.r(false);
            j0Var.a();
            l1.b1 b1Var = this.f24228e;
            Boolean bool = Boolean.FALSE;
            b1Var.setValue(bool);
            this.f24229f.setValue(bool);
            this.f24230t.setValue(bool);
            this.H.setValue(bool);
            y4.c(this.K, false);
            this.f24226c.invoke(z4.Idle);
        } catch (Exception unused) {
        }
        return qy.b0.f48488a;
    }
}
