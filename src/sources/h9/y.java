package h9;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import b0.h2;
import y6.o0;
import y6.v0;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements y6.h0, View.OnClickListener, r, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6.m0 f32127a = new y6.m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlayerView f32129c;

    public y(PlayerView playerView) {
        this.f32129c = playerView;
    }

    @Override // y6.h0
    public final void C(int i11, y6.i0 i0Var, y6.i0 i0Var2) {
        PlayerControlView playerControlView;
        int i12 = PlayerView.f2264l0;
        PlayerView playerView = this.f32129c;
        if (playerView.d() && playerView.f2279i0 && (playerControlView = playerView.N) != null) {
            playerControlView.g();
        }
    }

    @Override // y6.h0
    public final void E(int i11, int i12) {
        PlayerView playerView = this.f32129c;
        View view = playerView.f2271d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.f2281k0) {
            b0 b0Var = playerView.f2275f;
            b0Var.getClass();
            playerView.Q.post(new androidx.fragment.app.d(b0Var, (SurfaceView) view, new b2.a(playerView, 22), 11));
        }
    }

    @Override // y6.h0
    public final void a(z0 z0Var) {
        PlayerView playerView;
        y6.j0 j0Var;
        if (z0Var.equals(z0.f57406d) || (j0Var = (playerView = this.f32129c).U) == null || j0Var.u() == 1) {
            return;
        }
        playerView.j();
    }

    @Override // y6.h0
    public final void d(v0 v0Var) {
        PlayerView playerView = this.f32129c;
        y6.j0 j0Var = playerView.U;
        j0Var.getClass();
        h2 h2Var = (h2) j0Var;
        o0 o0VarF = h2Var.e0(17) ? j0Var.F() : o0.f57278a;
        if (o0VarF.p()) {
            this.f32128b = null;
        } else {
            boolean zE0 = h2Var.e0(30);
            y6.m0 m0Var = this.f32127a;
            if (!zE0 || j0Var.v().f57370a.isEmpty()) {
                Object obj = this.f32128b;
                if (obj != null) {
                    int iB = o0VarF.b(obj);
                    if (iB != -1) {
                        if (j0Var.y() == o0VarF.f(iB, m0Var, false).f57230c) {
                            return;
                        }
                    }
                    this.f32128b = null;
                }
            } else {
                this.f32128b = o0VarF.f(j0Var.k(), m0Var, true).f57229b;
            }
        }
        playerView.n(false);
    }

    @Override // y6.h0
    public final void e(a7.d dVar) {
        SubtitleView subtitleView = this.f32129c.K;
        if (subtitleView != null) {
            subtitleView.setCues(dVar.f433a);
        }
    }

    @Override // y6.h0
    public final void h(int i11, boolean z11) {
        int i12 = PlayerView.f2264l0;
        PlayerView playerView = this.f32129c;
        playerView.k();
        if (!playerView.d() || !playerView.f2279i0) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.N;
        if (playerControlView != null) {
            playerControlView.g();
        }
    }

    @Override // y6.h0
    public final void k(int i11) {
        int i12 = PlayerView.f2264l0;
        PlayerView playerView = this.f32129c;
        playerView.k();
        playerView.m();
        if (!playerView.d() || !playerView.f2279i0) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.N;
        if (playerControlView != null) {
            playerControlView.g();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = PlayerView.f2264l0;
        this.f32129c.i();
    }

    @Override // y6.h0
    public final void u() {
        PlayerView playerView = this.f32129c;
        View view = playerView.f2269c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.b()) {
                playerView.c();
                return;
            }
            ImageView imageView = playerView.f2282t;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }
}
