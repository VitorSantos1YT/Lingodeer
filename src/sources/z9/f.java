package z9;

import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public byte[][] H;
    public Cursor K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f59042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f59043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f59044f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f59045t;

    public static void d(Cursor cursor, int i11) {
        if (i11 < 0 || i11 >= cursor.getColumnCount()) {
            com.bumptech.glide.f.H(25, "column index out of range");
            throw null;
        }
    }

    @Override // ja.c
    public final String B0(int i11) {
        a();
        Cursor cursorE = e();
        d(cursorE, i11);
        String string = cursorE.getString(i11);
        m.e(string, "getString(...)");
        return string;
    }

    public final void b(int i11, int i12) {
        int i13 = i12 + 1;
        int[] iArr = this.f59042d;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            m.e(iArrCopyOf, "copyOf(...)");
            this.f59042d = iArrCopyOf;
        }
        if (i11 == 1) {
            long[] jArr = this.f59043e;
            if (jArr.length < i13) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i13);
                m.e(jArrCopyOf, "copyOf(...)");
                this.f59043e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i11 == 2) {
            double[] dArr = this.f59044f;
            if (dArr.length < i13) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i13);
                m.e(dArrCopyOf, "copyOf(...)");
                this.f59044f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i11 == 3) {
            String[] strArr = this.f59045t;
            if (strArr.length < i13) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i13);
                m.e(objArrCopyOf, "copyOf(...)");
                this.f59045t = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        byte[][] bArr = this.H;
        if (bArr.length < i13) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i13);
            m.e(objArrCopyOf2, "copyOf(...)");
            this.H = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // ja.c
    public final void b0(int i11, String value) {
        m.f(value, "value");
        a();
        b(3, i11);
        this.f59042d[i11] = 3;
        this.f59045t[i11] = value;
    }

    public final void c() {
        if (this.K == null) {
            this.K = this.f59047a.N0(new t7.d(this, 11));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f59049c) {
            a();
            this.f59042d = new int[0];
            this.f59043e = new long[0];
            this.f59044f = new double[0];
            this.f59045t = new String[0];
            this.H = new byte[0][];
            reset();
        }
        this.f59049c = true;
    }

    public final Cursor e() {
        Cursor cursor = this.K;
        if (cursor != null) {
            return cursor;
        }
        com.bumptech.glide.f.H(21, "no row");
        throw null;
    }

    @Override // ja.c
    public final void e0(double d5) {
        a();
        b(2, 14);
        this.f59042d[14] = 2;
        this.f59044f[14] = d5;
    }

    @Override // ja.c
    public final void g(int i11, long j11) {
        a();
        b(1, i11);
        this.f59042d[i11] = 1;
        this.f59043e[i11] = j11;
    }

    @Override // ja.c
    public final int getColumnCount() {
        a();
        c();
        Cursor cursor = this.K;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // ja.c
    public final String getColumnName(int i11) {
        a();
        c();
        Cursor cursor = this.K;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        d(cursor, i11);
        String columnName = cursor.getColumnName(i11);
        m.e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // ja.c
    public final double getDouble(int i11) {
        a();
        Cursor cursorE = e();
        d(cursorE, i11);
        return cursorE.getDouble(i11);
    }

    @Override // ja.c
    public final long getLong(int i11) {
        a();
        Cursor cursorE = e();
        d(cursorE, i11);
        return cursorE.getLong(i11);
    }

    @Override // ja.c
    public final boolean isNull(int i11) {
        a();
        Cursor cursorE = e();
        d(cursorE, i11);
        return cursorE.isNull(i11);
    }

    @Override // ja.c
    public final boolean r1() {
        a();
        c();
        Cursor cursor = this.K;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // ja.c
    public final void reset() {
        a();
        Cursor cursor = this.K;
        if (cursor != null) {
            cursor.close();
        }
        this.K = null;
    }

    @Override // ja.c
    public final void s(int i11) {
        a();
        b(5, i11);
        this.f59042d[i11] = 5;
    }
}
