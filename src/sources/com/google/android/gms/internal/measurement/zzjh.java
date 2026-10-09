package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzji();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzjf[] f11623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f11624e = new TreeMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11625f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f11626t;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z11, byte[] bArr, long j11) {
        this.f11620a = str;
        this.f11622c = str2;
        this.f11623d = zzjfVarArr;
        this.f11625f = z11;
        this.f11621b = bArr;
        this.f11626t = j11;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.f11624e.put(Integer.valueOf(zzjfVar.f11616a), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return zzkl.a(this.f11620a, zzjhVar.f11620a) && zzkl.a(this.f11622c, zzjhVar.f11622c) && this.f11624e.equals(zzjhVar.f11624e) && this.f11625f == zzjhVar.f11625f && Arrays.equals(this.f11621b, zzjhVar.f11621b) && this.f11626t == zzjhVar.f11626t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11620a, this.f11622c, this.f11624e, Boolean.valueOf(this.f11625f), this.f11621b, Long.valueOf(this.f11626t)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.f11620a);
        sb2.append("', '");
        sb2.append(this.f11622c);
        sb2.append("', (");
        Iterator it = this.f11624e.values().iterator();
        while (it.hasNext()) {
            sb2.append((zzjf) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.f11625f);
        sb2.append(", ");
        byte[] bArr = this.f11621b;
        sb2.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.f11626t);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f11620a, false);
        SafeParcelWriter.k(parcel, 3, this.f11622c, false);
        SafeParcelWriter.n(parcel, 4, this.f11623d, i11);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f11625f ? 1 : 0);
        SafeParcelWriter.c(parcel, 6, this.f11621b, false);
        SafeParcelWriter.p(parcel, 7, 8);
        parcel.writeLong(this.f11626t);
        SafeParcelWriter.r(parcel, iQ);
    }
}
