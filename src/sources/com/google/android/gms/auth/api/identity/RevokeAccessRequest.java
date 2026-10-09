package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p000authapi.zbbi;
import com.google.android.gms.internal.p000authapi.zbbl;
import defpackage.e;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new zbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zbbi f8447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f8448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8449c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
    }

    public RevokeAccessRequest(ArrayList arrayList, Account account, String str) {
        zbbl zbblVar = zbbi.f9411b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (array[i11] == null) {
                throw new NullPointerException(e.g(i11, "at index ", new StringBuilder(String.valueOf(i11).length() + 9)));
            }
        }
        this.f8447a = zbbi.l(array.length, array);
        this.f8448b = account;
        this.f8449c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.f8447a;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.f8447a;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && Objects.a(this.f8448b, revokeAccessRequest.f8448b) && Objects.a(this.f8449c, revokeAccessRequest.f8449c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8447a, this.f8448b, this.f8449c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f8447a, false);
        SafeParcelWriter.j(parcel, 2, this.f8448b, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f8449c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
