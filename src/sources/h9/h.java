package h9;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import b0.h2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y6.h0, i0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32062a;

    public h(PlayerControlView playerControlView) {
        this.f32062a = playerControlView;
    }

    @Override // h9.i0
    public final void c(long j11) {
        PlayerControlView playerControlView = this.f32062a;
        TextView textView = playerControlView.f2251o0;
        if (textView != null) {
            textView.setText(b7.f0.y(playerControlView.f2253q0, playerControlView.f2254r0, j11));
        }
        if (playerControlView.k(playerControlView.R0)) {
            PlayerControlView.a(playerControlView, playerControlView.R0, j11);
        }
    }

    @Override // h9.i0
    public final void l(long j11) {
        PlayerControlView playerControlView = this.f32062a;
        playerControlView.X0 = true;
        TextView textView = playerControlView.f2251o0;
        if (textView != null) {
            textView.setText(b7.f0.y(playerControlView.f2253q0, playerControlView.f2254r0, j11));
        }
        playerControlView.f2225a.f();
        y6.j0 j0Var = playerControlView.R0;
        if (j0Var == null || !playerControlView.Z0) {
            return;
        }
        if (playerControlView.i(j0Var)) {
            try {
                Method method = playerControlView.f2237e;
                method.getClass();
                method.invoke(playerControlView.R0, Boolean.TRUE);
                return;
            } catch (IllegalAccessException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }
        if (playerControlView.h(playerControlView.R0)) {
            try {
                Method method2 = playerControlView.H;
                method2.getClass();
                method2.invoke(playerControlView.R0, Boolean.TRUE);
                return;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        StringBuilder sb2 = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
        y6.j0 j0Var2 = playerControlView.R0;
        j0Var2.getClass();
        sb2.append(j0Var2.getClass());
        b7.a.B(sb2.toString());
    }

    @Override // h9.i0
    public final void m(long j11, boolean z11) {
        PlayerControlView playerControlView = this.f32062a;
        playerControlView.X0 = false;
        y6.j0 j0Var = playerControlView.R0;
        if (j0Var != null) {
            if (!z11) {
                PlayerControlView.a(playerControlView, j0Var, j11);
            }
            if (playerControlView.i(playerControlView.R0)) {
                try {
                    Method method = playerControlView.f2237e;
                    method.getClass();
                    method.invoke(playerControlView.R0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e8) {
                    throw new RuntimeException(e8);
                }
            } else if (playerControlView.h(playerControlView.R0)) {
                try {
                    Method method2 = playerControlView.H;
                    method2.getClass();
                    method2.invoke(playerControlView.R0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        playerControlView.f2225a.g();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView playerControlView = this.f32062a;
        ImageView imageView = playerControlView.f2243h0;
        View view2 = playerControlView.f2249m0;
        View view3 = playerControlView.f2248l0;
        View view4 = playerControlView.f2247k0;
        w wVar = playerControlView.f2225a;
        y6.j0 j0Var = playerControlView.R0;
        if (j0Var == null) {
            return;
        }
        wVar.g();
        if (playerControlView.V == view) {
            h2 h2Var = (h2) j0Var;
            if (h2Var.e0(9)) {
                h2Var.m0();
                return;
            }
            return;
        }
        if (playerControlView.U == view) {
            h2 h2Var2 = (h2) j0Var;
            if (h2Var2.e0(7)) {
                h2Var2.n0();
                return;
            }
            return;
        }
        if (playerControlView.f2226a0 == view) {
            if (j0Var.u() != 4) {
                h2 h2Var3 = (h2) j0Var;
                if (h2Var3.e0(12)) {
                    long jP = h2Var3.P() + h2Var3.s();
                    long duration = h2Var3.getDuration();
                    if (duration != -9223372036854775807L) {
                        jP = Math.min(jP, duration);
                    }
                    h2Var3.l0(12, Math.max(jP, 0L));
                    return;
                }
                return;
            }
            return;
        }
        if (playerControlView.f2229b0 == view) {
            h2 h2Var4 = (h2) j0Var;
            if (h2Var4.e0(11)) {
                long jP2 = h2Var4.P() + (-h2Var4.Q());
                long duration2 = h2Var4.getDuration();
                if (duration2 != -9223372036854775807L) {
                    jP2 = Math.min(jP2, duration2);
                }
                h2Var4.l0(11, Math.max(jP2, 0L));
                return;
            }
            return;
        }
        if (playerControlView.W == view) {
            if (b7.f0.T(j0Var, playerControlView.V0)) {
                b7.f0.D(j0Var);
                return;
            } else {
                b7.f0.C(j0Var);
                return;
            }
        }
        if (playerControlView.f2238e0 == view) {
            if (((h2) j0Var).e0(15)) {
                j0Var.z(b7.a.s(j0Var.E(), playerControlView.f2230b1));
                return;
            }
            return;
        }
        if (playerControlView.f2240f0 == view) {
            if (((h2) j0Var).e0(14)) {
                j0Var.h(!j0Var.H());
                return;
            }
            return;
        }
        if (view4 == view) {
            wVar.f();
            playerControlView.e(playerControlView.N, view4);
            return;
        }
        if (view3 == view) {
            wVar.f();
            playerControlView.e(playerControlView.O, view3);
        } else if (view2 == view) {
            wVar.f();
            playerControlView.e(playerControlView.Q, view2);
        } else if (imageView == view) {
            wVar.f();
            playerControlView.e(playerControlView.P, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.f32062a;
        if (playerControlView.f2244h1) {
            playerControlView.f2225a.g();
        }
    }

    @Override // y6.h0
    public final void x(y6.g0 g0Var) {
        boolean zA = g0Var.a(4, 5, 13);
        PlayerControlView playerControlView = this.f32062a;
        if (zA) {
            float[] fArr = PlayerControlView.f2224i1;
            playerControlView.q();
        }
        if (g0Var.a(4, 5, 7, 13)) {
            float[] fArr2 = PlayerControlView.f2224i1;
            playerControlView.s();
        }
        if (g0Var.a(8, 13)) {
            float[] fArr3 = PlayerControlView.f2224i1;
            playerControlView.t();
        }
        if (g0Var.a(9, 13)) {
            float[] fArr4 = PlayerControlView.f2224i1;
            playerControlView.v();
        }
        if (g0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = PlayerControlView.f2224i1;
            playerControlView.p();
        }
        if (g0Var.a(11, 0, 13)) {
            float[] fArr6 = PlayerControlView.f2224i1;
            playerControlView.w();
        }
        if (g0Var.a(12, 13)) {
            float[] fArr7 = PlayerControlView.f2224i1;
            playerControlView.r();
        }
        if (g0Var.a(2, 13)) {
            float[] fArr8 = PlayerControlView.f2224i1;
            playerControlView.x();
        }
    }
}
