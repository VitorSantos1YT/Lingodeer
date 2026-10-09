package y;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f56752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f56753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f56754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f56755d;

    public r(int i11) {
        if (i11 == 0) {
            this.f56753b = z.a.f58408b;
            this.f56754c = z.a.f58409c;
            return;
        }
        int i12 = i11 * 8;
        for (int i13 = 4; i13 < 32; i13++) {
            int i14 = (1 << i13) - 12;
            if (i12 <= i14) {
                i12 = i14;
                break;
            }
        }
        int i15 = i12 / 8;
        this.f56753b = new long[i15];
        this.f56754c = new Object[i15];
    }

    public final void a() {
        int i11 = this.f56755d;
        Object[] objArr = this.f56754c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f56755d = 0;
        this.f56752a = false;
    }

    public final Object c(long j11) {
        Object obj;
        int iB = z.a.b(this.f56753b, this.f56755d, j11);
        if (iB < 0 || (obj = this.f56754c[iB]) == s.f56757a) {
            return null;
        }
        return obj;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) objClone;
        rVar.f56753b = (long[]) this.f56753b.clone();
        rVar.f56754c = (Object[]) this.f56754c.clone();
        return rVar;
    }

    public final int d(long j11) {
        if (this.f56752a) {
            int i11 = this.f56755d;
            long[] jArr = this.f56753b;
            Object[] objArr = this.f56754c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != s.f56757a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f56752a = false;
            this.f56755d = i12;
        }
        return z.a.b(this.f56753b, this.f56755d, j11);
    }

    public final boolean f() {
        return j() == 0;
    }

    public final long g(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f56755d)) {
            z.a.c("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        if (this.f56752a) {
            long[] jArr = this.f56753b;
            Object[] objArr = this.f56754c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != s.f56757a) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f56752a = false;
            this.f56755d = i13;
        }
        return this.f56753b[i11];
    }

    public final void h(long j11, Object obj) {
        Object obj2 = s.f56757a;
        int iB = z.a.b(this.f56753b, this.f56755d, j11);
        if (iB >= 0) {
            this.f56754c[iB] = obj;
            return;
        }
        int i11 = ~iB;
        int i12 = this.f56755d;
        if (i11 < i12) {
            Object[] objArr = this.f56754c;
            if (objArr[i11] == obj2) {
                this.f56753b[i11] = j11;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f56752a) {
            long[] jArr = this.f56753b;
            if (i12 >= jArr.length) {
                Object[] objArr2 = this.f56754c;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj3 = objArr2[i14];
                    if (obj3 != obj2) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr2[i13] = obj3;
                            objArr2[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f56752a = false;
                this.f56755d = i13;
                i11 = ~z.a.b(this.f56753b, i13, j11);
            }
        }
        int i15 = this.f56755d;
        if (i15 >= this.f56753b.length) {
            int i16 = (i15 + 1) * 8;
            for (int i17 = 4; i17 < 32; i17++) {
                int i18 = (1 << i17) - 12;
                if (i16 <= i18) {
                    i16 = i18;
                    break;
                }
            }
            int i19 = i16 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f56753b, i19);
            kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
            this.f56753b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56754c, i19);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56754c = objArrCopyOf;
        }
        int i21 = this.f56755d;
        if (i21 - i11 != 0) {
            long[] jArr2 = this.f56753b;
            int i22 = i11 + 1;
            ry.l.J(jArr2, jArr2, i22, i11, i21);
            Object[] objArr3 = this.f56754c;
            ry.l.G(i22, i11, this.f56755d, objArr3, objArr3);
        }
        this.f56753b[i11] = j11;
        this.f56754c[i11] = obj;
        this.f56755d++;
    }

    public final void i(long j11) {
        int iB = z.a.b(this.f56753b, this.f56755d, j11);
        if (iB >= 0) {
            Object[] objArr = this.f56754c;
            Object obj = objArr[iB];
            Object obj2 = s.f56757a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f56752a = true;
            }
        }
    }

    public final int j() {
        if (this.f56752a) {
            int i11 = this.f56755d;
            long[] jArr = this.f56753b;
            Object[] objArr = this.f56754c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != s.f56757a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f56752a = false;
            this.f56755d = i12;
        }
        return this.f56755d;
    }

    public final Object k(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f56755d)) {
            z.a.c("Expected index to be within 0..size()-1, but was " + i11);
            throw null;
        }
        if (this.f56752a) {
            long[] jArr = this.f56753b;
            Object[] objArr = this.f56754c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != s.f56757a) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f56752a = false;
            this.f56755d = i13;
        }
        return this.f56754c[i11];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f56755d * 28);
        sb2.append('{');
        int i11 = this.f56755d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i12));
            sb2.append('=');
            Object objK = k(i12);
            if (objK != sb2) {
                sb2.append(objK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ r(Object obj) {
        this(10);
    }
}
