package com.google.android.gms.common.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status H;
    public static final Status K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f8703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f8704f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Status f8705t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f8708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConnectionResult f8709d;

    static {
        new Status(-1, null, null, null);
        f8703e = new Status(0, null, null, null);
        f8704f = new Status(14, null, null, null);
        f8705t = new Status(8, null, null, null);
        H = new Status(15, null, null, null);
        K = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new zze();
    }

    public Status(int i11, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f8706a = i11;
        this.f8707b = str;
        this.f8708c = pendingIntent;
        this.f8709d = connectionResult;
    }

    public final boolean D1() {
        return this.f8706a <= 0;
    }

    public final void E1() {
        PendingIntent pendingIntent = this.f8708c;
        if (pendingIntent != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            Preconditions.g(pendingIntent);
            pendingIntent.getIntentSender();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f8706a == status.f8706a && Objects.a(this.f8707b, status.f8707b) && Objects.a(this.f8708c, status.f8708c) && Objects.a(this.f8709d, status.f8709d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8706a), this.f8707b, this.f8708c, this.f8709d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        String strA = this.f8707b;
        if (strA == null) {
            strA = CommonStatusCodes.a(this.f8706a);
        }
        toStringHelper.a(strA, "statusCode");
        toStringHelper.a(this.f8708c, "resolution");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8706a);
        SafeParcelWriter.k(parcel, 2, this.f8707b, false);
        SafeParcelWriter.j(parcel, 3, this.f8708c, i11, false);
        SafeParcelWriter.j(parcel, 4, this.f8709d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this;
    }
}
