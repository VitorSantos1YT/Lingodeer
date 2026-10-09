package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f9355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f9356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f9359f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9360t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public SignRequestParams(Integer num, Double d5, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.f9354a = num;
        this.f9355b = d5;
        this.f9356c = uri;
        this.f9357d = bArr;
        Preconditions.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f9358e = arrayList;
        this.f9359f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RegisteredKey registeredKey = (RegisteredKey) obj;
            Preconditions.a("registered key has null appId and no request appId is provided", (registeredKey.f9352b == null && uri == null) ? false : true);
            String str2 = registeredKey.f9352b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Preconditions.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f9360t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.f9358e;
        if (Objects.a(this.f9354a, signRequestParams.f9354a) && Objects.a(this.f9355b, signRequestParams.f9355b) && Objects.a(this.f9356c, signRequestParams.f9356c) && Arrays.equals(this.f9357d, signRequestParams.f9357d)) {
            List list2 = this.f9358e;
            if (list2.containsAll(list) && list.containsAll(list2) && Objects.a(this.f9359f, signRequestParams.f9359f) && Objects.a(this.f9360t, signRequestParams.f9360t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9354a, this.f9356c, this.f9355b, this.f9358e, this.f9359f, this.f9360t, Integer.valueOf(Arrays.hashCode(this.f9357d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.h(parcel, 2, this.f9354a);
        SafeParcelWriter.e(parcel, 3, this.f9355b);
        SafeParcelWriter.j(parcel, 4, this.f9356c, i11, false);
        SafeParcelWriter.c(parcel, 5, this.f9357d, false);
        SafeParcelWriter.o(parcel, 6, this.f9358e, false);
        SafeParcelWriter.j(parcel, 7, this.f9359f, i11, false);
        SafeParcelWriter.k(parcel, 8, this.f9360t, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
