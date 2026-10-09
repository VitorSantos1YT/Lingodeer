package th;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import ci.m0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f52419a;

    public f(g gVar) {
        this.f52419a = gVar;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack track) {
        m.f(track, "track");
        m0 m0Var = this.f52419a.f52422c;
        if (m0Var != null) {
            Drawable drawable = m0Var.f7145b.getDrawable();
            m.e(drawable, "getDrawable(...)");
            if (drawable instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack track) {
        m.f(track, "track");
    }
}
