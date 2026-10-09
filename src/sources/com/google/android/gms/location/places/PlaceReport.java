package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12561d;

    public PlaceReport(int i11, String str, String str2, String str3) {
        this.f12558a = i11;
        this.f12559b = str;
        this.f12560c = str2;
        this.f12561d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.a(this.f12559b, placeReport.f12559b) && Objects.a(this.f12560c, placeReport.f12560c) && Objects.a(this.f12561d, placeReport.f12561d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12559b, this.f12560c, this.f12561d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f12559b, "placeId");
        toStringHelper.a(this.f12560c, "tag");
        String str = this.f12561d;
        if (!"unknown".equals(str)) {
            toStringHelper.a(str, "source");
        }
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12558a);
        SafeParcelWriter.k(parcel, 2, this.f12559b, false);
        SafeParcelWriter.k(parcel, 3, this.f12560c, false);
        SafeParcelWriter.k(parcel, 4, this.f12561d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
