package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f17740c = new Companion(0);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public final Timestamp createFromParcel(Parcel source) {
            m.f(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Timestamp[] newArray(int i11) {
            return new Timestamp[i11];
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final /* synthetic */ class AnonymousClass1 extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnonymousClass1 f17743b = new AnonymousClass1();

        public AnonymousClass1() {
            super(Timestamp.class, "seconds", "getSeconds()J", 0);
        }

        @Override // kotlin.jvm.internal.r, mz.h
        public final Object get(Object obj) {
            return Long.valueOf(((Timestamp) obj).f17741a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final /* synthetic */ class AnonymousClass2 extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnonymousClass2 f17744b = new AnonymousClass2();

        public AnonymousClass2() {
            super(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);
        }

        @Override // kotlin.jvm.internal.r, mz.h
        public final Object get(Object obj) {
            return Integer.valueOf(((Timestamp) obj).f17742b);
        }
    }

    public Timestamp(long j11, int i11) {
        f17740c.getClass();
        if (i11 < 0 || i11 >= 1000000000) {
            throw new IllegalArgumentException(p.j(i11, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j11 || j11 >= 253402300800L) {
            throw new IllegalArgumentException(e.h(j11, "Timestamp seconds out of range: ").toString());
        }
        this.f17741a = j11;
        this.f17742b = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Timestamp timestamp) {
        Timestamp other = timestamp;
        m.f(other, "other");
        c[] cVarArr = {AnonymousClass1.f17743b, AnonymousClass2.f17744b};
        for (int i11 = 0; i11 < 2; i11++) {
            c cVar = cVarArr[i11];
            int i12 = qx.b.i((Comparable) cVar.invoke(this), (Comparable) cVar.invoke(other));
            if (i12 != 0) {
                return i12;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i11;
        if (obj != this) {
            if (obj instanceof Timestamp) {
                Timestamp timestamp = (Timestamp) obj;
                c[] cVarArr = {AnonymousClass1.f17743b, AnonymousClass2.f17744b};
                for (int i12 = 0; i12 < 2; i12++) {
                    c cVar = cVarArr[i12];
                    i11 = qx.b.i((Comparable) cVar.invoke(this), (Comparable) cVar.invoke(timestamp));
                    if (i11 != 0) {
                        if (i11 == 0) {
                        }
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j11 = this.f17741a;
        return (((((int) j11) * 1369) + ((int) (j11 >> 32))) * 37) + this.f17742b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.f17741a);
        sb2.append(", nanoseconds=");
        return ep.a.j(sb2, this.f17742b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeLong(this.f17741a);
        dest.writeInt(this.f17742b);
    }
}
