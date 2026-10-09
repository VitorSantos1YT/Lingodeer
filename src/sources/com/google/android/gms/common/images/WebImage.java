package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Locale;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f8882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8884d;

    public WebImage(int i11, Uri uri, int i12, int i13) {
        this.f8881a = i11;
        this.f8882b = uri;
        this.f8883c = i12;
        this.f8884d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.a(this.f8882b, webImage.f8882b) && this.f8883c == webImage.f8883c && this.f8884d == webImage.f8884d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8882b, Integer.valueOf(this.f8883c), Integer.valueOf(this.f8884d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.f8882b.toString();
        StringBuilder sbK = c.k("Image ", this.f8883c, "x", this.f8884d, " ");
        sbK.append(string);
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8881a);
        SafeParcelWriter.j(parcel, 2, this.f8882b, i11, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8883c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8884d);
        SafeParcelWriter.r(parcel, iQ);
    }
}
