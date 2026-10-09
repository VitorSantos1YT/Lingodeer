package com.lingo.lingoskill.object;

import android.net.Uri;
import androidx.recyclerview.widget.q;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaItemData {
    public static final int PLAYBACK_RES_CHANGED = 1;
    private final Uri albumArtUri;
    private final boolean browsable;
    private final String mediaId;
    private int playbackRes;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final q diffCallback = new q() { // from class: com.lingo.lingoskill.object.MediaItemData$Companion$diffCallback$1
        public boolean areContentsTheSame(MediaItemData oldItem, MediaItemData newItem) {
            m.f(oldItem, "oldItem");
            m.f(newItem, "newItem");
            return m.a(oldItem.getMediaId(), newItem.getMediaId()) && oldItem.getPlaybackRes() == newItem.getPlaybackRes();
        }

        public boolean areItemsTheSame(MediaItemData oldItem, MediaItemData newItem) {
            m.f(oldItem, "oldItem");
            m.f(newItem, "newItem");
            return m.a(oldItem.getMediaId(), newItem.getMediaId());
        }

        public Integer getChangePayload(MediaItemData oldItem, MediaItemData newItem) {
            m.f(oldItem, "oldItem");
            m.f(newItem, "newItem");
            return oldItem.getPlaybackRes() != newItem.getPlaybackRes() ? 1 : null;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final q getDiffCallback() {
            return MediaItemData.diffCallback;
        }

        private Companion() {
        }
    }

    public MediaItemData(String mediaId, String title, String subtitle, Uri albumArtUri, boolean z11, int i11) {
        m.f(mediaId, "mediaId");
        m.f(title, "title");
        m.f(subtitle, "subtitle");
        m.f(albumArtUri, "albumArtUri");
        this.mediaId = mediaId;
        this.title = title;
        this.subtitle = subtitle;
        this.albumArtUri = albumArtUri;
        this.browsable = z11;
        this.playbackRes = i11;
    }

    public static /* synthetic */ MediaItemData copy$default(MediaItemData mediaItemData, String str, String str2, String str3, Uri uri, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mediaItemData.mediaId;
        }
        if ((i12 & 2) != 0) {
            str2 = mediaItemData.title;
        }
        if ((i12 & 4) != 0) {
            str3 = mediaItemData.subtitle;
        }
        if ((i12 & 8) != 0) {
            uri = mediaItemData.albumArtUri;
        }
        if ((i12 & 16) != 0) {
            z11 = mediaItemData.browsable;
        }
        if ((i12 & 32) != 0) {
            i11 = mediaItemData.playbackRes;
        }
        boolean z12 = z11;
        int i13 = i11;
        return mediaItemData.copy(str, str2, str3, uri, z12, i13);
    }

    public final String component1() {
        return this.mediaId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final Uri component4() {
        return this.albumArtUri;
    }

    public final boolean component5() {
        return this.browsable;
    }

    public final int component6() {
        return this.playbackRes;
    }

    public final MediaItemData copy(String mediaId, String title, String subtitle, Uri albumArtUri, boolean z11, int i11) {
        m.f(mediaId, "mediaId");
        m.f(title, "title");
        m.f(subtitle, "subtitle");
        m.f(albumArtUri, "albumArtUri");
        return new MediaItemData(mediaId, title, subtitle, albumArtUri, z11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItemData)) {
            return false;
        }
        MediaItemData mediaItemData = (MediaItemData) obj;
        return m.a(this.mediaId, mediaItemData.mediaId) && m.a(this.title, mediaItemData.title) && m.a(this.subtitle, mediaItemData.subtitle) && m.a(this.albumArtUri, mediaItemData.albumArtUri) && this.browsable == mediaItemData.browsable && this.playbackRes == mediaItemData.playbackRes;
    }

    public final Uri getAlbumArtUri() {
        return this.albumArtUri;
    }

    public final boolean getBrowsable() {
        return this.browsable;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final int getPlaybackRes() {
        return this.playbackRes;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.playbackRes) + e.e((this.albumArtUri.hashCode() + e.d(e.d(this.mediaId.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.browsable);
    }

    public final void setPlaybackRes(int i11) {
        this.playbackRes = i11;
    }

    public String toString() {
        String str = this.mediaId;
        String str2 = this.title;
        String str3 = this.subtitle;
        Uri uri = this.albumArtUri;
        boolean z11 = this.browsable;
        int i11 = this.playbackRes;
        StringBuilder sbS = e.s("MediaItemData(mediaId=", str, ", title=", str2, ", subtitle=");
        sbS.append(str3);
        sbS.append(", albumArtUri=");
        sbS.append(uri);
        sbS.append(", browsable=");
        sbS.append(z11);
        sbS.append(", playbackRes=");
        sbS.append(i11);
        sbS.append(")");
        return sbS.toString();
    }
}
