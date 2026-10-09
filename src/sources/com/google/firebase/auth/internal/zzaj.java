package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.MultiFactorResolver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaj extends MultiFactorResolver {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzao f17944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.auth.zzc f17946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzad f17947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f17948f;

    public zzaj(ArrayList arrayList, zzao zzaoVar, String str, com.google.firebase.auth.zzc zzcVar, zzad zzadVar, ArrayList arrayList2) {
        Preconditions.g(arrayList);
        this.f17943a = arrayList;
        Preconditions.g(zzaoVar);
        this.f17944b = zzaoVar;
        Preconditions.d(str);
        this.f17945c = str;
        this.f17946d = zzcVar;
        this.f17947e = zzadVar;
        Preconditions.g(arrayList2);
        this.f17948f = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f17943a, false);
        SafeParcelWriter.j(parcel, 2, this.f17944b, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f17945c, false);
        SafeParcelWriter.j(parcel, 4, this.f17946d, i11, false);
        SafeParcelWriter.j(parcel, 5, this.f17947e, i11, false);
        SafeParcelWriter.o(parcel, 6, this.f17948f, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
