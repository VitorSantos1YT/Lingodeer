package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f8450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8455f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i11) {
        this.f8450a = pendingIntent;
        this.f8451b = str;
        this.f8452c = str2;
        this.f8453d = arrayList;
        this.f8454e = str3;
        this.f8455f = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f8453d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.f8453d;
        return size == list2.size() && list.containsAll(list2) && Objects.a(this.f8450a, saveAccountLinkingTokenRequest.f8450a) && Objects.a(this.f8451b, saveAccountLinkingTokenRequest.f8451b) && Objects.a(this.f8452c, saveAccountLinkingTokenRequest.f8452c) && Objects.a(this.f8454e, saveAccountLinkingTokenRequest.f8454e) && this.f8455f == saveAccountLinkingTokenRequest.f8455f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8450a, this.f8451b, this.f8452c, this.f8453d, this.f8454e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f8450a, i11, false);
        SafeParcelWriter.k(parcel, 2, this.f8451b, false);
        SafeParcelWriter.k(parcel, 3, this.f8452c, false);
        SafeParcelWriter.m(parcel, 4, this.f8453d);
        SafeParcelWriter.k(parcel, 5, this.f8454e, false);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f8455f);
        SafeParcelWriter.r(parcel, iQ);
    }
}
