package f7;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import b0.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends h2 implements ExoPlayer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f26800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.f f26801d;

    public i1(n nVar) {
        super(11);
        b7.f fVar = new b7.f();
        this.f26801d = fVar;
        try {
            this.f26800c = new a0(nVar, this);
            fVar.c();
        } catch (Throwable th2) {
            this.f26801d.c();
            throw th2;
        }
    }

    @Override // y6.j0
    public final void A(SurfaceView surfaceView) {
        s0();
        this.f26800c.A(surfaceView);
    }

    @Override // y6.j0
    public final void B(y6.h0 h0Var) {
        s0();
        this.f26800c.B(h0Var);
    }

    @Override // y6.j0
    public final int C() {
        s0();
        return this.f26800c.C();
    }

    @Override // y6.j0
    public final void D(y6.t0 t0Var) {
        s0();
        this.f26800c.D(t0Var);
    }

    @Override // y6.j0
    public final int E() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26645j0;
    }

    @Override // y6.j0
    public final y6.o0 F() {
        s0();
        return this.f26800c.F();
    }

    @Override // y6.j0
    public final Looper G() {
        s0();
        return this.f26800c.W;
    }

    @Override // y6.j0
    public final boolean H() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26646k0;
    }

    @Override // y6.j0
    public final y6.t0 J() {
        s0();
        return this.f26800c.J();
    }

    @Override // y6.j0
    public final long K() {
        s0();
        return this.f26800c.K();
    }

    @Override // y6.j0
    public final void L(TextureView textureView) {
        s0();
        this.f26800c.L(textureView);
    }

    @Override // y6.j0
    public final y6.a0 M() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26658v0;
    }

    @Override // y6.j0
    public final void N(List list) {
        s0();
        this.f26800c.N(list);
    }

    @Override // y6.j0
    public final long P() {
        s0();
        return this.f26800c.P();
    }

    @Override // y6.j0
    public final long Q() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.Y;
    }

    @Override // y6.j0
    public final void a() {
        s0();
        this.f26800c.a();
    }

    @Override // y6.j0
    public final y6.e0 b() {
        s0();
        return this.f26800c.b();
    }

    @Override // y6.j0
    public final void c(y6.e0 e0Var) {
        s0();
        this.f26800c.c(e0Var);
    }

    @Override // y6.j0
    public final boolean d() {
        s0();
        return this.f26800c.d();
    }

    @Override // y6.j0
    public final long e() {
        s0();
        return this.f26800c.e();
    }

    @Override // y6.j0
    public final y6.f0 f() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26657u0;
    }

    @Override // y6.j0
    public final boolean g() {
        s0();
        return this.f26800c.g();
    }

    @Override // y6.j0
    public final long getDuration() {
        s0();
        return this.f26800c.getDuration();
    }

    @Override // y6.j0
    public final void h(boolean z11) {
        s0();
        this.f26800c.h(z11);
    }

    @Override // y6.j0
    public final void i(y6.h0 h0Var) {
        s0();
        this.f26800c.i(h0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26650o0;
    }

    @Override // y6.j0
    public final long j() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.f26632a0;
    }

    @Override // y6.j0
    public final int k() {
        s0();
        return this.f26800c.k();
    }

    @Override // b0.h2
    public final void k0(int i11, int i12, long j11, boolean z11) {
        s0();
        this.f26800c.k0(i11, i12, j11, z11);
    }

    @Override // y6.j0
    public final void l(TextureView textureView) {
        s0();
        this.f26800c.l(textureView);
    }

    @Override // y6.j0
    public final y6.z0 m() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.L0;
    }

    @Override // y6.j0
    public final int n() {
        s0();
        return this.f26800c.n();
    }

    @Override // y6.j0
    public final void o(SurfaceView surfaceView) {
        s0();
        this.f26800c.o(surfaceView);
    }

    @Override // y6.j0
    public final ExoPlaybackException q() {
        s0();
        return this.f26800c.q();
    }

    @Override // y6.j0
    public final void r(boolean z11) {
        s0();
        this.f26800c.r(z11);
    }

    @Override // y6.j0
    public final void release() {
        s0();
        this.f26800c.release();
    }

    @Override // y6.j0
    public final long s() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.Z;
    }

    public final void s0() {
        this.f26801d.a();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        s0();
        this.f26800c.setImageOutput(imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z11) {
        s0();
        this.f26800c.setScrubbingModeEnabled(z11);
    }

    @Override // y6.j0
    public final void stop() {
        s0();
        this.f26800c.stop();
    }

    @Override // y6.j0
    public final long t() {
        s0();
        return this.f26800c.t();
    }

    @Override // y6.j0
    public final int u() {
        s0();
        return this.f26800c.u();
    }

    @Override // y6.j0
    public final y6.v0 v() {
        s0();
        return this.f26800c.v();
    }

    @Override // y6.j0
    public final a7.d w() {
        s0();
        a0 a0Var = this.f26800c;
        a0Var.Q0();
        return a0Var.H0;
    }

    @Override // y6.j0
    public final int x() {
        s0();
        return this.f26800c.x();
    }

    @Override // y6.j0
    public final int y() {
        s0();
        return this.f26800c.y();
    }

    @Override // y6.j0
    public final void z(int i11) {
        s0();
        this.f26800c.z(i11);
    }
}
