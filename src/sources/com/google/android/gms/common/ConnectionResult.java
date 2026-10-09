package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.api.Service;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f8632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f8634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f8629f = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();

    public ConnectionResult(int i11, int i12, PendingIntent pendingIntent, String str, Integer num) {
        this.f8630a = i11;
        this.f8631b = i12;
        this.f8632c = pendingIntent;
        this.f8633d = str;
        this.f8634e = num;
    }

    public static String F1(int i11) {
        if (i11 == 99) {
            return "UNFINISHED";
        }
        if (i11 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i11) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i11) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i11);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean D1() {
        return (this.f8631b == 0 || this.f8632c == null) ? false : true;
    }

    public final boolean E1() {
        return this.f8631b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f8631b == connectionResult.f8631b && Objects.a(this.f8632c, connectionResult.f8632c) && Objects.a(this.f8633d, connectionResult.f8633d) && Objects.a(this.f8634e, connectionResult.f8634e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8631b), this.f8632c, this.f8633d, this.f8634e});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(F1(this.f8631b), "statusCode");
        toStringHelper.a(this.f8632c, "resolution");
        toStringHelper.a(this.f8633d, "message");
        toStringHelper.a(this.f8634e, "clientMethodKey");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8630a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8631b);
        SafeParcelWriter.j(parcel, 3, this.f8632c, i11, false);
        SafeParcelWriter.k(parcel, 4, this.f8633d, false);
        SafeParcelWriter.h(parcel, 5, this.f8634e);
        SafeParcelWriter.r(parcel, iQ);
    }

    public ConnectionResult(int i11, PendingIntent pendingIntent, String str) {
        this(1, i11, pendingIntent, str, null);
    }
}
