package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);
    public final Uri H;
    public Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f766f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f767t;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f761a = str;
        this.f762b = charSequence;
        this.f763c = charSequence2;
        this.f764d = charSequence3;
        this.f765e = bitmap;
        this.f766f = uri;
        this.f767t = bundle;
        this.H = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f762b) + ", " + ((Object) this.f763c) + ", " + ((Object) this.f764d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Object objBuild = this.K;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f761a);
            builder.setTitle(this.f762b);
            builder.setSubtitle(this.f763c);
            builder.setDescription(this.f764d);
            builder.setIconBitmap(this.f765e);
            builder.setIconUri(this.f766f);
            builder.setExtras(this.f767t);
            builder.setMediaUri(this.H);
            objBuild = builder.build();
            this.K = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i11);
    }
}
