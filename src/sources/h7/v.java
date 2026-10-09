package h7;

import a0.b2;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f31956a;

    public v(w wVar) {
        this.f31956a = wVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i11) {
        x xVar;
        b2 b2Var;
        f7.c0 c0Var;
        if (audioTrack.equals(this.f31956a.f31959c.f31997w) && (b2Var = (xVar = this.f31956a.f31959c).f31993s) != null && xVar.W && (c0Var = ((a0) b2Var.f27b).f41014i0) != null) {
            c0Var.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f31956a.f31959c.f31997w)) {
            this.f31956a.f31959c.V = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        x xVar;
        b2 b2Var;
        f7.c0 c0Var;
        if (audioTrack.equals(this.f31956a.f31959c.f31997w) && (b2Var = (xVar = this.f31956a.f31959c).f31993s) != null && xVar.W && (c0Var = ((a0) b2Var.f27b).f41014i0) != null) {
            c0Var.a();
        }
    }
}
