package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import java.util.Objects;
import mf.sOm.txBUGYhC;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmv implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RuntimeException f11745f;

    public final Object a() {
        int i11 = this.f11742c;
        if (i11 == 0) {
            return Boolean.FALSE;
        }
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        long j11 = this.f11743d;
        if (i11 == 2) {
            return Long.valueOf(j11);
        }
        if (i11 == 3) {
            return Double.valueOf(Double.longBitsToDouble(j11));
        }
        Object obj = this.f11744e;
        if (i11 == 4) {
            obj.getClass();
            return obj;
        }
        if (i11 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((zzacr) obj).m();
        } catch (Throwable th2) {
            RuntimeException runtimeException = this.f11745f;
            if (runtimeException != null) {
                th2.addSuppressed(runtimeException);
            }
            throw th2;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j11 = zzmvVar.f11740a;
        long j12 = this.f11740a;
        int iCompare = Long.compare(j12, j11);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j12 != 0) {
            return 0;
        }
        String str = this.f11741b;
        str.getClass();
        String str2 = zzmvVar.f11741b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.f11740a == zzmvVar.f11740a && Objects.equals(this.f11741b, zzmvVar.f11741b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11740a), this.f11741b);
    }

    public final String toString() {
        String string = this.f11741b;
        if (string == null) {
            string = Long.toString(this.f11740a);
        }
        String strValueOf = String.valueOf(a());
        return p.u(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }

    public zzmv(long j11, String str, int i11, long j12, Object obj) {
        boolean z11;
        boolean z12;
        if (j11 != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (str == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        Preconditions.g(z11 == z12);
        this.f11740a = j11;
        this.f11741b = str;
        this.f11742c = i11;
        this.f11743d = j12;
        this.f11744e = obj;
        if (i11 == 5) {
            if (obj == null) {
                this.f11745f = new NullPointerException("Null stringOrBytes");
                return;
            } else if (!(obj instanceof byte[]) && !(obj instanceof zzacr)) {
                this.f11745f = new RuntimeException(txBUGYhC.PdSwHepl.concat(String.valueOf(obj.getClass())));
                return;
            } else {
                this.f11745f = null;
                return;
            }
        }
        this.f11745f = null;
    }
}
