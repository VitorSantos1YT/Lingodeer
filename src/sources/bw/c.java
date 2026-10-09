package bw;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e;
import ew.f;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(18);
    public long H;
    public String K;
    public String L;
    public int M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f6395f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicLong f6396t;

    public c() {
        this.f6396t = new AtomicLong();
        this.f6395f = new AtomicInteger();
    }

    public final byte a() {
        return (byte) this.f6395f.get();
    }

    public final String b() {
        String str = this.f6392c;
        boolean z11 = this.f6393d;
        String str2 = this.f6394e;
        int i11 = f.f25949a;
        if (str == null) {
            return null;
        }
        if (!z11) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return f.c(str, str2);
    }

    public final String c() {
        if (b() == null) {
            return null;
        }
        String strB = b();
        Locale locale = Locale.ENGLISH;
        return e.m(strB, ".temp");
    }

    public final void d(long j11) {
        this.f6396t.set(j11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(byte b3) {
        this.f6395f.set(b3);
    }

    public final void g(long j11) {
        this.N = j11 > 2147483647L;
        this.H = j11;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f6390a), this.f6391b, this.f6392c, Integer.valueOf(this.f6395f.get()), this.f6396t, Long.valueOf(this.H), this.L, super.toString()};
        int i11 = f.f25949a;
        return String.format(Locale.ENGLISH, "id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6390a);
        parcel.writeString(this.f6391b);
        parcel.writeString(this.f6392c);
        parcel.writeByte(this.f6393d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f6394e);
        parcel.writeByte((byte) this.f6395f.get());
        parcel.writeLong(this.f6396t.get());
        parcel.writeLong(this.H);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeInt(this.M);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
    }

    public final ContentValues i() {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f6390a));
        contentValues.put("url", this.f6391b);
        contentValues.put("path", this.f6392c);
        contentValues.put("status", Byte.valueOf(a()));
        contentValues.put("sofar", Long.valueOf(this.f6396t.get()));
        contentValues.put("total", Long.valueOf(this.H));
        contentValues.put("errMsg", this.K);
        contentValues.put("etag", this.L);
        contentValues.put("connectionCount", Integer.valueOf(this.M));
        contentValues.put("pathAsDirectory", Boolean.valueOf(this.f6393d));
        if (this.f6393d && (str = this.f6394e) != null) {
            contentValues.put(anrPHlQ.uBUNAZwsBXm, str);
        }
        return contentValues;
    }

    public c(Parcel parcel) {
        this.f6390a = parcel.readInt();
        this.f6391b = parcel.readString();
        this.f6392c = parcel.readString();
        this.f6393d = parcel.readByte() != 0;
        this.f6394e = parcel.readString();
        this.f6395f = new AtomicInteger(parcel.readByte());
        this.f6396t = new AtomicLong(parcel.readLong());
        this.H = parcel.readLong();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readInt();
        this.N = parcel.readByte() != 0;
    }
}
