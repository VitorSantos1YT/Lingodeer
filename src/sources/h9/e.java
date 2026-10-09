package h9;

import android.view.View;
import android.widget.TextView;
import androidx.media3.ui.LegacyPlayerControlView;
import b0.h2;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements y6.h0, i0, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyPlayerControlView f32029a;

    public e(LegacyPlayerControlView legacyPlayerControlView) {
        this.f32029a = legacyPlayerControlView;
    }

    @Override // h9.i0
    public final void c(long j11) {
        LegacyPlayerControlView legacyPlayerControlView = this.f32029a;
        TextView textView = legacyPlayerControlView.O;
        if (textView != null) {
            textView.setText(b7.f0.y(legacyPlayerControlView.Q, legacyPlayerControlView.R, j11));
        }
    }

    @Override // h9.i0
    public final void l(long j11) {
        LegacyPlayerControlView legacyPlayerControlView = this.f32029a;
        legacyPlayerControlView.f2213q0 = true;
        TextView textView = legacyPlayerControlView.O;
        if (textView != null) {
            textView.setText(b7.f0.y(legacyPlayerControlView.Q, legacyPlayerControlView.R, j11));
        }
    }

    @Override // h9.i0
    public final void m(long j11, boolean z11) {
        y6.j0 j0Var;
        LegacyPlayerControlView legacyPlayerControlView = this.f32029a;
        int iY = 0;
        legacyPlayerControlView.f2213q0 = false;
        if (z11 || (j0Var = legacyPlayerControlView.f2208l0) == null) {
            return;
        }
        o0 o0VarF = j0Var.F();
        if (legacyPlayerControlView.f2212p0 && !o0VarF.p()) {
            int iO = o0VarF.o();
            while (true) {
                long jV = b7.f0.V(o0VarF.m(iY, legacyPlayerControlView.T, 0L).m);
                if (j11 < jV) {
                    break;
                }
                if (iY == iO - 1) {
                    j11 = jV;
                    break;
                } else {
                    j11 -= jV;
                    iY++;
                }
            }
        } else {
            iY = j0Var.y();
        }
        ((h2) j0Var).k0(iY, 10, j11, false);
        legacyPlayerControlView.g();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LegacyPlayerControlView legacyPlayerControlView = this.f32029a;
        y6.j0 j0Var = legacyPlayerControlView.f2208l0;
        if (j0Var == null) {
            return;
        }
        if (legacyPlayerControlView.f2197d == view) {
            ((h2) j0Var).m0();
            return;
        }
        if (legacyPlayerControlView.f2195c == view) {
            ((h2) j0Var).n0();
            return;
        }
        if (legacyPlayerControlView.f2216t == view) {
            if (j0Var.u() != 4) {
                h2 h2Var = (h2) j0Var;
                long jP = h2Var.P() + h2Var.s();
                long duration = h2Var.getDuration();
                if (duration != -9223372036854775807L) {
                    jP = Math.min(jP, duration);
                }
                h2Var.l0(12, Math.max(jP, 0L));
                return;
            }
            return;
        }
        if (legacyPlayerControlView.H == view) {
            h2 h2Var2 = (h2) j0Var;
            long jP2 = h2Var2.P() + (-h2Var2.Q());
            long duration2 = h2Var2.getDuration();
            if (duration2 != -9223372036854775807L) {
                jP2 = Math.min(jP2, duration2);
            }
            h2Var2.l0(11, Math.max(jP2, 0L));
            return;
        }
        if (legacyPlayerControlView.f2199e == view) {
            b7.f0.D(j0Var);
            return;
        }
        if (legacyPlayerControlView.f2201f == view) {
            b7.f0.C(j0Var);
        } else if (legacyPlayerControlView.K == view) {
            j0Var.z(b7.a.s(j0Var.E(), legacyPlayerControlView.f2217t0));
        } else if (legacyPlayerControlView.L == view) {
            j0Var.h(!j0Var.H());
        }
    }

    @Override // y6.h0
    public final void x(y6.g0 g0Var) {
        y6.n nVar = g0Var.f57202a;
        boolean zA = g0Var.a(4, 5);
        LegacyPlayerControlView legacyPlayerControlView = this.f32029a;
        if (zA) {
            int i11 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.f();
        }
        if (g0Var.a(4, 5, 7)) {
            int i12 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.g();
        }
        if (nVar.f57235a.get(8)) {
            int i13 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.h();
        }
        if (nVar.f57235a.get(9)) {
            int i14 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.i();
        }
        if (g0Var.a(8, 9, 11, 0, 13)) {
            int i15 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.e();
        }
        if (g0Var.a(11, 0)) {
            int i16 = LegacyPlayerControlView.G0;
            legacyPlayerControlView.j();
        }
    }
}
