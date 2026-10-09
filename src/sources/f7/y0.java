package f7;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p7.b0 f26952u = new p7.b0(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6.o0 f26953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.b0 f26954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f26958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p7.g1 f26960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s7.w f26961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f26962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p7.b0 f26963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26964l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y6.e0 f26966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f26968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f26969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f26970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f26971t;

    public y0(y6.o0 o0Var, p7.b0 b0Var, long j11, long j12, int i11, ExoPlaybackException exoPlaybackException, boolean z11, p7.g1 g1Var, s7.w wVar, List list, p7.b0 b0Var2, boolean z12, int i12, int i13, y6.e0 e0Var, long j13, long j14, long j15, long j16, boolean z13) {
        this.f26953a = o0Var;
        this.f26954b = b0Var;
        this.f26955c = j11;
        this.f26956d = j12;
        this.f26957e = i11;
        this.f26958f = exoPlaybackException;
        this.f26959g = z11;
        this.f26960h = g1Var;
        this.f26961i = wVar;
        this.f26962j = list;
        this.f26963k = b0Var2;
        this.f26964l = z12;
        this.m = i12;
        this.f26965n = i13;
        this.f26966o = e0Var;
        this.f26968q = j13;
        this.f26969r = j14;
        this.f26970s = j15;
        this.f26971t = j16;
        this.f26967p = z13;
    }

    public static y0 k(s7.w wVar) {
        y6.l0 l0Var = y6.o0.f57278a;
        p7.g1 g1Var = p7.g1.f46387d;
        ImmutableList immutableListS = ImmutableList.s();
        y6.e0 e0Var = y6.e0.f57184d;
        p7.b0 b0Var = f26952u;
        return new y0(l0Var, b0Var, -9223372036854775807L, 0L, 1, null, false, g1Var, wVar, immutableListS, b0Var, false, 1, 0, e0Var, 0L, 0L, 0L, 0L, false);
    }

    public final y0 a() {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, l(), SystemClock.elapsedRealtime(), this.f26967p);
    }

    public final y0 b(boolean z11) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, z11, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 c(p7.b0 b0Var) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, b0Var, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 d(p7.b0 b0Var, long j11, long j12, long j13, long j14, p7.g1 g1Var, s7.w wVar, List list) {
        return new y0(this.f26953a, b0Var, j12, j13, this.f26957e, this.f26958f, this.f26959g, g1Var, wVar, list, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, j14, j11, SystemClock.elapsedRealtime(), this.f26967p);
    }

    public final y0 e(int i11, int i12, boolean z11) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, z11, i11, i12, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 f(ExoPlaybackException exoPlaybackException) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, exoPlaybackException, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 g(y6.e0 e0Var) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, e0Var, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 h(int i11) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, i11, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final y0 i(boolean z11) {
        return new y0(this.f26953a, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, z11);
    }

    public final y0 j(y6.o0 o0Var) {
        return new y0(o0Var, this.f26954b, this.f26955c, this.f26956d, this.f26957e, this.f26958f, this.f26959g, this.f26960h, this.f26961i, this.f26962j, this.f26963k, this.f26964l, this.m, this.f26965n, this.f26966o, this.f26968q, this.f26969r, this.f26970s, this.f26971t, this.f26967p);
    }

    public final long l() {
        long j11;
        long j12;
        if (!m()) {
            return this.f26970s;
        }
        do {
            j11 = this.f26971t;
            j12 = this.f26970s;
        } while (j11 != this.f26971t);
        return b7.f0.K(b7.f0.V(j12) + ((long) ((SystemClock.elapsedRealtime() - j11) * this.f26966o.f57185a)));
    }

    public final boolean m() {
        return this.f26957e == 3 && this.f26964l && this.f26965n == 0;
    }
}
