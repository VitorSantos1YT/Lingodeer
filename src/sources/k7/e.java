package k7;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import g7.j;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {
    @Override // k7.g
    public final int b(p pVar) {
        return pVar.f57295r != null ? 1 : 0;
    }

    @Override // k7.g
    public final hd.b d(c cVar, p pVar) {
        if (pVar.f57295r == null) {
            return null;
        }
        return new hd.b(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()), 25);
    }

    @Override // k7.g
    public final void c(Looper looper, j jVar) {
    }
}
