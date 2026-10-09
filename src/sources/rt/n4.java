package rt;

import android.media.session.MediaSession;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n4 extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o4 f50121a;

    public n4(o4 o4Var) {
        this.f50121a = o4Var;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        lp.j jVar = this.f50121a.f50184b;
        if (jVar != null) {
            ((r5) jVar.f40203b).k();
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        lp.j jVar = this.f50121a.f50184b;
        if (jVar != null) {
            jVar.p();
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        lp.j jVar = this.f50121a.f50184b;
        if (jVar != null) {
            ((r5) jVar.f40203b).k();
        }
    }
}
