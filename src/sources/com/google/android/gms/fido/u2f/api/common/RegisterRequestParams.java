package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new zzh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f9342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f9343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ChannelIdValue f9346f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9347t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.f9345e;
        return Objects.a(this.f9341a, registerRequestParams.f9341a) && Objects.a(this.f9342b, registerRequestParams.f9342b) && Objects.a(this.f9343c, registerRequestParams.f9343c) && Objects.a(this.f9344d, registerRequestParams.f9344d) && (((list = this.f9345e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.a(this.f9346f, registerRequestParams.f9346f) && Objects.a(this.f9347t, registerRequestParams.f9347t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9341a, this.f9343c, this.f9342b, this.f9344d, this.f9345e, this.f9346f, this.f9347t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.h(parcel, 2, this.f9341a);
        SafeParcelWriter.e(parcel, 3, this.f9342b);
        SafeParcelWriter.j(parcel, 4, this.f9343c, i11, false);
        SafeParcelWriter.o(parcel, 5, this.f9344d, false);
        SafeParcelWriter.o(parcel, 6, this.f9345e, false);
        SafeParcelWriter.j(parcel, 7, this.f9346f, i11, false);
        SafeParcelWriter.k(parcel, 8, this.f9347t, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public RegisterRequestParams(Integer num, Double d5, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        this.f9341a = num;
        this.f9342b = d5;
        this.f9343c = uri;
        if (arrayList != null && !arrayList.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.a(DytezVyM.kUwMmdANkteBBIh, z11);
        this.f9344d = arrayList;
        this.f9345e = arrayList2;
        this.f9346f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            RegisterRequest registerRequest = (RegisterRequest) obj;
            if (uri != null || registerRequest.f9340d != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            Preconditions.a("register request has null appId and no request appId is provided", z13);
            String str2 = registerRequest.f9340d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            RegisteredKey registeredKey = (RegisteredKey) obj2;
            if (uri != null || registeredKey.f9352b != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            Preconditions.a(ualZoVVCQs.DyR, z12);
            String str3 = registeredKey.f9352b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        Preconditions.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f9347t = str;
    }
}
