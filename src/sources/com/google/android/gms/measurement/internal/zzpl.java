package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f13636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13638f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f13639t;

    public zzpl(int i11, String str, long j11, Long l9, Float f5, String str2, String str3, Double d5) {
        this.f13633a = i11;
        this.f13634b = str;
        this.f13635c = j11;
        this.f13636d = l9;
        this.f13639t = i11 == 1 ? f5 != null ? Double.valueOf(f5.doubleValue()) : null : d5;
        this.f13637e = str2;
        this.f13638f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zzpm.a(this, parcel);
    }

    public final Object zza() {
        Long l9 = this.f13636d;
        if (l9 != null) {
            return l9;
        }
        Double d5 = this.f13639t;
        if (d5 != null) {
            return d5;
        }
        String str = this.f13637e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(zzpn zzpnVar) {
        this(zzpnVar.f13643d, zzpnVar.f13644e, zzpnVar.f13642c, zzpnVar.f13641b);
    }

    public zzpl(long j11, Object obj, String str, String str2) {
        Preconditions.d(str);
        this.f13633a = 2;
        this.f13634b = str;
        this.f13635c = j11;
        this.f13638f = str2;
        if (obj == null) {
            this.f13636d = null;
            this.f13639t = null;
            this.f13637e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f13636d = (Long) obj;
            this.f13639t = null;
            this.f13637e = null;
        } else if (obj instanceof String) {
            this.f13636d = null;
            this.f13639t = null;
            this.f13637e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f13636d = null;
                this.f13639t = (Double) obj;
                this.f13637e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
