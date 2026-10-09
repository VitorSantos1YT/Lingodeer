package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    public boolean H = false;
    public final boolean K = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f8873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f8874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CursorWindow[] f8875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f8877f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f8878t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i11, String[] strArr, CursorWindow[] cursorWindowArr, int i12, Bundle bundle) {
        this.f8872a = i11;
        this.f8873b = strArr;
        this.f8875d = cursorWindowArr;
        this.f8876e = i12;
        this.f8877f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.H) {
                    this.H = true;
                    int i11 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f8875d;
                        if (i11 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i11].close();
                        i11++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z11;
        try {
            if (this.K && this.f8875d.length > 0) {
                synchronized (this) {
                    z11 = this.H;
                }
                if (!z11) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.f8873b);
        SafeParcelWriter.n(parcel, 2, this.f8875d, i11);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8876e);
        SafeParcelWriter.b(parcel, 4, this.f8877f);
        SafeParcelWriter.p(parcel, 1000, 4);
        parcel.writeInt(this.f8872a);
        SafeParcelWriter.r(parcel, iQ);
        if ((i11 & 1) != 0) {
            close();
        }
    }
}
