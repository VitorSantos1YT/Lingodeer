package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f8345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8348f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8349t;

    public TokenData(int i11, String str, Long l9, boolean z11, boolean z12, ArrayList arrayList, String str2) {
        this.f8343a = i11;
        Preconditions.d(str);
        this.f8344b = str;
        this.f8345c = l9;
        this.f8346d = z11;
        this.f8347e = z12;
        this.f8348f = arrayList;
        this.f8349t = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f8344b, tokenData.f8344b) && Objects.a(this.f8345c, tokenData.f8345c) && this.f8346d == tokenData.f8346d && this.f8347e == tokenData.f8347e && Objects.a(this.f8348f, tokenData.f8348f) && Objects.a(this.f8349t, tokenData.f8349t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8344b, this.f8345c, Boolean.valueOf(this.f8346d), Boolean.valueOf(this.f8347e), this.f8348f, this.f8349t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8343a);
        SafeParcelWriter.k(parcel, 2, this.f8344b, false);
        SafeParcelWriter.i(parcel, 3, this.f8345c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8346d ? 1 : 0);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8347e ? 1 : 0);
        SafeParcelWriter.m(parcel, 6, this.f8348f);
        SafeParcelWriter.k(parcel, 7, this.f8349t, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
