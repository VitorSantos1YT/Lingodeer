package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import e.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d {
    @Override // e.d
    public final void a(int i11, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
        }
        if (i11 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
