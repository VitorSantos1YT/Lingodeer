package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import ep.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtocolVersion f9335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9336d;

    public KeyHandle(int i11, byte[] bArr, String str, ArrayList arrayList) {
        this.f9333a = i11;
        this.f9334b = bArr;
        try {
            this.f9335c = ProtocolVersion.a(str);
            this.f9336d = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        List list = keyHandle.f9336d;
        if (!Arrays.equals(this.f9334b, keyHandle.f9334b) || !this.f9335c.equals(keyHandle.f9335c)) {
            return false;
        }
        List list2 = this.f9336d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9334b)), this.f9335c, this.f9336d});
    }

    public final String toString() {
        List list = this.f9336d;
        String string = list == null ? "null" : list.toString();
        byte[] bArr = this.f9334b;
        String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb2 = new StringBuilder("{keyHandle: ");
        sb2.append(strEncodeToString);
        sb2.append(", version: ");
        sb2.append(this.f9335c);
        sb2.append(", transports: ");
        return a.k(sb2, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9333a);
        SafeParcelWriter.c(parcel, 2, this.f9334b, false);
        SafeParcelWriter.k(parcel, 3, this.f9335c.toString(), false);
        SafeParcelWriter.o(parcel, 4, this.f9336d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
