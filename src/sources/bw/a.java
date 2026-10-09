package bw;

import android.content.ContentValues;
import defpackage.e;
import ew.f;
import java.util.Locale;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6388e;

    public final String toString() {
        int i11 = this.f6384a;
        int i12 = this.f6385b;
        long j11 = this.f6386c;
        long j12 = this.f6388e;
        long j13 = this.f6387d;
        int i13 = f.f25949a;
        Locale locale = Locale.ENGLISH;
        StringBuilder sbK = w4.c.k("id[", i11, "] index[", i12, "] range[");
        sbK.append(j11);
        ep.a.y(j12, ", ", ") current offset(", sbK);
        return e.i(j13, ")", sbK);
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.f6384a));
        contentValues.put(PQgum.ELCNsl, Integer.valueOf(this.f6385b));
        contentValues.put("startOffset", Long.valueOf(this.f6386c));
        contentValues.put("currentOffset", Long.valueOf(this.f6387d));
        contentValues.put("endOffset", Long.valueOf(this.f6388e));
        return contentValues;
    }
}
