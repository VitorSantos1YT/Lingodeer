package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new zzjg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzjo[] f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f11618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeMap f11619d = new TreeMap();

    public zzjf(int i11, zzjo[] zzjoVarArr, String[] strArr) {
        this.f11616a = i11;
        this.f11617b = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.f11619d.put(zzjoVar.f11639a, zzjoVar);
        }
        this.f11618c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.f11616a - zzjfVar.f11616a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.f11616a == zzjfVar.f11616a && zzkl.a(this.f11619d, zzjfVar.f11619d) && Arrays.equals(this.f11618c, zzjfVar.f11618c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f11616a);
        SafeParcelWriter.n(parcel, 3, this.f11617b, i11);
        SafeParcelWriter.l(parcel, 4, this.f11618c);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.f11616a);
        sb2.append(", (");
        Iterator it = this.f11619d.values().iterator();
        while (it.hasNext()) {
            sb2.append((zzjo) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.f11618c;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append(IMCc.VFiQGsA);
        }
        sb2.append("))");
        return sb2.toString();
    }
}
