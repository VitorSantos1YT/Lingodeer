package x1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, gz.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f55681e = new j(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f55685d;

    public j(long j11, long j12, long j13, long[] jArr) {
        this.f55682a = j11;
        this.f55683b = j12;
        this.f55684c = j13;
        this.f55685d = jArr;
    }

    public final j b(j jVar) {
        j jVarD;
        long[] jArr;
        j jVar2 = f55681e;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j11 = jVar.f55684c;
        long j12 = jVar.f55684c;
        long[] jArr2 = jVar.f55685d;
        long j13 = jVar.f55683b;
        long j14 = jVar.f55682a;
        long j15 = this.f55684c;
        if (j11 == j15 && jArr2 == (jArr = this.f55685d)) {
            return new j(this.f55682a & (~j14), this.f55683b & (~j13), j15, jArr);
        }
        if (jArr2 != null) {
            jVarD = this;
            for (long j16 : jArr2) {
                jVarD = jVarD.d(j16);
            }
        } else {
            jVarD = this;
        }
        long j17 = 0;
        if (j13 != 0) {
            int i11 = 0;
            while (i11 < 64) {
                if (((1 << i11) & j13) != j17) {
                    jVarD = jVarD.d(((long) i11) + j12);
                }
                i11++;
                j17 = j17;
            }
        }
        long j18 = j17;
        if (j14 != j18) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != j18) {
                    jVarD = jVarD.d(((long) i12) + j12 + ((long) 64));
                }
            }
        }
        return jVarD;
    }

    public final j d(long j11) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j12 = j11 - this.f55684c;
        long j13 = 0;
        if (kotlin.jvm.internal.m.i(j12, j13) >= 0 && kotlin.jvm.internal.m.i(j12, 64) < 0) {
            long j14 = 1 << ((int) j12);
            long j15 = this.f55683b;
            if ((j15 & j14) != 0) {
                return new j(this.f55682a, j15 & (~j14), this.f55684c, this.f55685d);
            }
        } else if (kotlin.jvm.internal.m.i(j12, 64) >= 0 && kotlin.jvm.internal.m.i(j12, 128) < 0) {
            long j16 = 1 << (((int) j12) - 64);
            long j17 = this.f55682a;
            if ((j17 & j16) != 0) {
                return new j(j17 & (~j16), this.f55683b, this.f55684c, this.f55685d);
            }
        } else if (kotlin.jvm.internal.m.i(j12, j13) < 0 && (jArr = this.f55685d) != null && (iC = q.c(jArr, j11)) >= 0) {
            int length = jArr.length;
            int i11 = length - 1;
            if (i11 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i11];
                if (iC > 0) {
                    ry.l.J(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i11) {
                    ry.l.J(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f55682a, this.f55683b, this.f55684c, jArr2);
        }
        return this;
    }

    public final boolean e(long j11) {
        long[] jArr;
        long j12 = j11 - this.f55684c;
        long j13 = 0;
        if (kotlin.jvm.internal.m.i(j12, j13) >= 0 && kotlin.jvm.internal.m.i(j12, 64) < 0) {
            return ((1 << ((int) j12)) & this.f55683b) != 0;
        }
        if (kotlin.jvm.internal.m.i(j12, 64) < 0 || kotlin.jvm.internal.m.i(j12, 128) >= 0) {
            return kotlin.jvm.internal.m.i(j12, j13) <= 0 && (jArr = this.f55685d) != null && q.c(jArr, j11) >= 0;
        }
        return ((1 << (((int) j12) - 64)) & this.f55682a) != 0;
    }

    public final j f(j jVar) {
        j jVarG;
        j jVarG2;
        long[] jArr;
        j jVar2 = f55681e;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar;
        }
        long j11 = jVar.f55684c;
        long j12 = jVar.f55684c;
        long[] jArr2 = jVar.f55685d;
        long j13 = jVar.f55683b;
        long j14 = jVar.f55682a;
        long j15 = this.f55684c;
        long j16 = this.f55683b;
        long j17 = this.f55682a;
        if (j11 == j15 && jArr2 == (jArr = this.f55685d)) {
            return new j(j17 | j14, j16 | j13, j15, jArr);
        }
        int i11 = 0;
        long[] jArr3 = this.f55685d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                jVarG = this;
                for (long j18 : jArr2) {
                    jVarG = jVarG.g(j18);
                }
            } else {
                jVarG = this;
            }
            if (j13 != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if (((1 << i12) & j13) != 0) {
                        jVarG = jVarG.g(((long) i12) + j12);
                    }
                }
            }
            if (j14 != 0) {
                while (i11 < 64) {
                    if (((1 << i11) & j14) != 0) {
                        jVarG = jVarG.g(((long) i11) + j12 + ((long) 64));
                    }
                    i11++;
                }
            }
            return jVarG;
        }
        if (jArr3 != null) {
            jVarG2 = jVar;
            for (long j19 : jArr3) {
                jVarG2 = jVarG2.g(j19);
            }
        } else {
            jVarG2 = jVar;
        }
        long j21 = this.f55684c;
        if (j16 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if (((1 << i13) & j16) != 0) {
                    jVarG2 = jVarG2.g(((long) i13) + j21);
                }
            }
        }
        if (j17 != 0) {
            while (i11 < 64) {
                if (((1 << i11) & j17) != 0) {
                    jVarG2 = jVarG2.g(((long) i11) + j21 + ((long) 64));
                }
                i11++;
            }
        }
        return jVarG2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    public final j g(long j11) {
        long[] jArr;
        long j12;
        long[] jArr2;
        long[] jArr3;
        long j13 = this.f55684c;
        long j14 = j11 - j13;
        long j15 = 0;
        int i11 = kotlin.jvm.internal.m.i(j14, j15);
        long j16 = this.f55683b;
        int i12 = 64;
        long j17 = 0;
        if (i11 < 0 || kotlin.jvm.internal.m.i(j14, 64) >= 0) {
            long j18 = 64;
            int i13 = kotlin.jvm.internal.m.i(j14, j18);
            long j19 = this.f55682a;
            if (i13 < 0 || kotlin.jvm.internal.m.i(j14, 128) >= 0) {
                long j21 = 128;
                int i14 = kotlin.jvm.internal.m.i(j14, j21);
                long[] jArr4 = this.f55685d;
                if (i14 < 0) {
                    if (jArr4 == null) {
                        return new j(this.f55682a, this.f55683b, this.f55684c, new long[]{j11});
                    }
                    int iC = q.c(jArr4, j11);
                    if (iC < 0) {
                        int i15 = -(iC + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        ry.l.J(jArr4, jArr5, 0, 0, i15);
                        ry.l.J(jArr4, jArr5, i15 + 1, i15, length);
                        jArr5[i15] = j11;
                        return new j(this.f55682a, this.f55683b, this.f55684c, jArr5);
                    }
                } else if (!e(j11)) {
                    long j22 = 1;
                    long j23 = ((j11 + j22) / j18) * j18;
                    if (kotlin.jvm.internal.m.i(j23, j15) < 0) {
                        j23 = (Long.MAX_VALUE - j21) + j22;
                    }
                    long j24 = j13;
                    long j25 = j19;
                    tp.g gVar = null;
                    while (true) {
                        if (kotlin.jvm.internal.m.i(j24, j23) >= 0) {
                            jArr = jArr4;
                            j12 = j24;
                            j17 = j16;
                            break;
                        }
                        if (j16 != 0) {
                            if (gVar == null) {
                                gVar = new tp.g(jArr4);
                            }
                            int i16 = 0;
                            while (i16 < i12) {
                                if ((j16 & (1 << i16)) != 0) {
                                    ((y.z) gVar.f52461b).a(((long) i16) + j24);
                                }
                                i16++;
                                jArr4 = jArr4;
                                i12 = 64;
                            }
                        }
                        long[] jArr6 = jArr4;
                        if (j25 == 0) {
                            j12 = j23;
                            jArr = jArr6;
                            break;
                        }
                        j24 += j18;
                        jArr4 = jArr6;
                        j16 = j25;
                        i12 = 64;
                        j25 = 0;
                    }
                    if (gVar == null) {
                        jArr2 = jArr;
                    } else {
                        y.z zVar = (y.z) gVar.f52461b;
                        int i17 = zVar.f56791b;
                        if (i17 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr7 = new long[i17];
                            long[] jArr8 = zVar.f56790a;
                            for (int i18 = 0; i18 < i17; i18++) {
                                jArr7[i18] = jArr8[i18];
                            }
                            jArr3 = jArr7;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new j(j25, j17, j12, jArr2).g(j11);
                }
            } else {
                long j26 = 1 << (((int) j14) - 64);
                if ((j19 & j26) == 0) {
                    return new j(j19 | j26, this.f55683b, this.f55684c, this.f55685d);
                }
            }
        } else {
            long j27 = 1 << ((int) j14);
            if ((j16 & j27) == 0) {
                return new j(this.f55682a, j16 | j27, this.f55684c, this.f55685d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return v10.c.B(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(ry.n.W(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) BuildConfig.VERSION_NAME);
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            i11++;
            if (i11 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) BuildConfig.VERSION_NAME);
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
