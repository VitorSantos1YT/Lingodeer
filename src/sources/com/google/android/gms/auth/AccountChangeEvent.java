package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.e;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8336f;

    public AccountChangeEvent(int i11, long j11, String str, int i12, int i13, String str2) {
        this.f8331a = i11;
        this.f8332b = j11;
        Preconditions.g(str);
        this.f8333c = str;
        this.f8334d = i12;
        this.f8335e = i13;
        this.f8336f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f8331a == accountChangeEvent.f8331a && this.f8332b == accountChangeEvent.f8332b && Objects.a(this.f8333c, accountChangeEvent.f8333c) && this.f8334d == accountChangeEvent.f8334d && this.f8335e == accountChangeEvent.f8335e && Objects.a(this.f8336f, accountChangeEvent.f8336f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8331a), Long.valueOf(this.f8332b), this.f8333c, Integer.valueOf(this.f8334d), Integer.valueOf(this.f8335e), this.f8336f});
    }

    public final String toString() {
        String str;
        int i11 = this.f8334d;
        if (i11 == 1) {
            str = "ADDED";
        } else if (i11 == 2) {
            str = "REMOVED";
        } else if (i11 != 3) {
            str = i11 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        StringBuilder sbS = e.s("AccountChangeEvent {accountName = ", this.f8333c, ", changeType = ", str, ", changeData = ");
        sbS.append(this.f8336f);
        sbS.append(", eventIndex = ");
        sbS.append(this.f8335e);
        sbS.append("}");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8331a);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f8332b);
        SafeParcelWriter.k(parcel, 3, this.f8333c, false);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8334d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8335e);
        SafeParcelWriter.k(parcel, 6, this.f8336f, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
