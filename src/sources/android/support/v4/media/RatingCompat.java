package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f770b;

    public RatingCompat(int i11, float f5) {
        this.f769a = i11;
        this.f770b = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f769a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f769a);
        sb2.append(" rating=");
        float f5 = this.f770b;
        sb2.append(f5 < CropImageView.DEFAULT_ASPECT_RATIO ? "unrated" : String.valueOf(f5));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f769a);
        parcel.writeFloat(this.f770b);
    }
}
