package com.google.android.gms.internal.measurement;

import am.rVFB.LwKl;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.common.collect.Maps;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    public final byte[][] H;
    public final int[] K;
    public final byte[][] L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f11630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[][] f11631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f11632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f11633f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f11634t;

    static {
        byte[][] bArr = new byte[0][];
        new zzjl(BuildConfig.VERSION_NAME, null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f11628a = str;
        this.f11629b = bArr;
        this.f11630c = bArr2;
        this.f11631d = bArr3;
        this.f11632e = bArr4;
        this.f11633f = bArr5;
        this.f11634t = iArr;
        this.H = bArr6;
        this.K = iArr2;
        this.L = bArr7;
    }

    public static void D1(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
            return;
        }
        sb2.append("(");
        boolean z11 = true;
        int i11 = 0;
        while (i11 < bArr.length) {
            byte[] bArr2 = bArr[i11];
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append("'");
            Preconditions.g(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i11++;
            z11 = false;
        }
        sb2.append(")");
    }

    public static Set F1(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(Maps.c(length));
        for (byte[] bArr2 : bArr) {
            Preconditions.g(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List G1(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i11 = 0; i11 < iArr.length; i11 += 2) {
            arrayList.add(new zzju(iArr[i11], iArr[i11 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set E1() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.H;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f11629b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return F1((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object hashSet;
        Object hashSet2;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzkl.a(this.f11628a, zzjlVar.f11628a) && zzkl.a(E1(), zzjlVar.E1()) && zzkl.a(F1(this.f11630c), F1(zzjlVar.f11630c)) && zzkl.a(F1(this.f11631d), F1(zzjlVar.f11631d)) && zzkl.a(F1(this.f11632e), F1(zzjlVar.f11632e)) && zzkl.a(F1(this.f11633f), F1(zzjlVar.f11633f))) {
                int[] iArr = this.f11634t;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    hashSet = new HashSet(Maps.c(length2));
                    for (int i11 : iArr) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                }
                int[] iArr2 = zzjlVar.f11634t;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    hashSet2 = new HashSet(Maps.c(length));
                    for (int i12 : iArr2) {
                        hashSet2.add(Integer.valueOf(i12));
                    }
                }
                if (zzkl.a(hashSet, hashSet2) && zzkl.a(G1(this.K), G1(zzjlVar.K)) && zzkl.a(F1(this.L), F1(zzjlVar.L))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f11628a, false);
        SafeParcelWriter.c(parcel, 3, this.f11629b, false);
        SafeParcelWriter.d(parcel, 4, this.f11630c);
        SafeParcelWriter.d(parcel, 5, this.f11631d);
        SafeParcelWriter.d(parcel, 6, this.f11632e);
        SafeParcelWriter.d(parcel, 7, this.f11633f);
        SafeParcelWriter.g(parcel, 8, this.f11634t);
        SafeParcelWriter.d(parcel, 9, this.H);
        SafeParcelWriter.g(parcel, 10, this.K);
        SafeParcelWriter.d(parcel, 11, this.L);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f11628a;
        sb2.append(str == null ? "null" : p.u(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb2.append(", direct==");
        byte[] bArr = this.f11629b;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        D1(sb2, "GAIA=", this.f11630c);
        sb2.append(", ");
        D1(sb2, LwKl.RCMCVz, this.f11631d);
        sb2.append(", ");
        D1(sb2, "ALWAYS=", this.f11632e);
        sb2.append(", ");
        D1(sb2, "OTHER=", this.f11633f);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.f11634t));
        sb2.append(", ");
        D1(sb2, "directs=", this.H);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(G1(this.K).toArray()));
        sb2.append(", ");
        D1(sb2, "external=", this.L);
        sb2.append(")");
        return sb2.toString();
    }
}
