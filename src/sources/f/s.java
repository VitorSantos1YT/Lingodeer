package f;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements b7.k, b7.l, x7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26168a;

    public /* synthetic */ s(int i11) {
        this.f26168a = i11;
    }

    @Override // b7.l
    public void a(Object obj, y6.n nVar) {
        ((y6.h0) obj).x(new y6.g0(nVar));
    }

    @Override // x7.p
    public x7.m[] c() {
        return new x7.m[]{new f9.d()};
    }

    @Override // b7.k
    public void invoke(Object obj) {
        y6.h0 h0Var = (y6.h0) obj;
        switch (this.f26168a) {
            case 1:
                h0Var.D(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                h0Var.u();
                break;
        }
    }

    public /* synthetic */ s(f7.a0 a0Var) {
        this.f26168a = 2;
    }
}
