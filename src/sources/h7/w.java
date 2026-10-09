package h7;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31957a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f31958b = new v(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f31959c;

    public w(x xVar) {
        this.f31959c = xVar;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f31958b);
        this.f31957a.removeCallbacksAndMessages(null);
    }
}
