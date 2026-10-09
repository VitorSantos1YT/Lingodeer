package m00;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f40727f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f40728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f40729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f40730e;

    static {
        String str = a0.f40673b;
        f40727f = p20.c.m("/");
    }

    public l0(a0 a0Var, o oVar, LinkedHashMap linkedHashMap) {
        this.f40728c = a0Var;
        this.f40729d = oVar;
        this.f40730e = linkedHashMap;
    }

    @Override // m00.o
    public final h0 a(a0 file) throws IOException {
        kotlin.jvm.internal.m.f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // m00.o
    public final void b(a0 source, a0 target) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // m00.o
    public final void e(a0 path) throws IOException {
        kotlin.jvm.internal.m.f(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // m00.o
    public final List i(a0 dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        a0 a0Var = f40727f;
        a0Var.getClass();
        n00.g gVar = (n00.g) this.f40730e.get(n00.c.b(a0Var, dir, true));
        if (gVar != null) {
            return ry.m.a1(gVar.f43088q);
        }
        throw new IOException("not a directory: " + dir);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    @Override // m00.o
    public final e4.e q(a0 path) throws Throwable {
        Long lValueOf;
        long j11;
        Long l9;
        Long lValueOf2;
        Long l11;
        Integer num;
        Long l12;
        Long lValueOf3;
        Throwable th2;
        Throwable th3;
        n00.g gVarF;
        kotlin.jvm.internal.m.f(path, "path");
        a0 a0Var = f40727f;
        a0Var.getClass();
        n00.g gVar = (n00.g) this.f40730e.get(n00.c.b(a0Var, path, true));
        if (gVar == null) {
            return null;
        }
        long j12 = gVar.f43080h;
        if (j12 != -1) {
            w wVarV = this.f40729d.v(this.f40728c);
            try {
                d0 d0VarC = b.c(wVarV.a(j12));
                try {
                    gVarF = n00.b.f(d0VarC, gVar);
                    kotlin.jvm.internal.m.c(gVarF);
                    try {
                        d0VarC.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        d0VarC.close();
                    } catch (Throwable th6) {
                        cf.x.b(th5, th6);
                    }
                    th3 = th5;
                    gVarF = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                try {
                    wVarV.close();
                    th = null;
                } catch (Throwable th7) {
                    th = th7;
                }
                th2 = th;
                gVar = gVarF;
            } catch (Throwable th8) {
                th2 = th8;
                if (wVarV != null) {
                    try {
                        wVarV.close();
                    } catch (Throwable th9) {
                        cf.x.b(th2, th9);
                    }
                }
                gVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        boolean z11 = gVar.f43074b;
        boolean z12 = !z11;
        Long lValueOf4 = z11 ? null : Long.valueOf(gVar.f43078f);
        Long l13 = gVar.m;
        if (l13 != null) {
            lValueOf = Long.valueOf((l13.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num2 = gVar.f43087p;
            lValueOf = num2 != null ? Long.valueOf(((long) num2.intValue()) * 1000) : null;
        }
        Long l14 = gVar.f43083k;
        if (l14 != null) {
            j11 = 11644473600000L;
            lValueOf2 = Long.valueOf((l14.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            j11 = 11644473600000L;
            Integer num3 = gVar.f43085n;
            if (num3 == null) {
                int i11 = gVar.f43082j;
                if (i11 != -1) {
                    int i12 = gVar.f43081i;
                    if (i11 != -1) {
                        int i13 = (i11 >> 11) & 31;
                        int i14 = (i11 >> 5) & 63;
                        int i15 = (i11 & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i12 >> 9) & 127) + 1980, ((i12 >> 5) & 15) - 1, i12 & 31, i13, i14, i15);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                    l11 = gVar.f43084l;
                    if (l11 == null) {
                        num = gVar.f43086o;
                        if (num != null) {
                            lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                        } else {
                            l12 = null;
                        }
                        return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
                    }
                    lValueOf3 = Long.valueOf((l11.longValue() / ((long) 10000)) - j11);
                    l12 = lValueOf3;
                    return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
                }
                l9 = null;
                l11 = gVar.f43084l;
                if (l11 == null) {
                    num = gVar.f43086o;
                    if (num != null) {
                        lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                    } else {
                        l12 = null;
                    }
                    return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
                }
                lValueOf3 = Long.valueOf((l11.longValue() / ((long) 10000)) - j11);
                l12 = lValueOf3;
                return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
            }
            lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
        }
        l9 = lValueOf2;
        l11 = gVar.f43084l;
        if (l11 == null) {
            num = gVar.f43086o;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                l12 = null;
            }
            return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
        }
        lValueOf3 = Long.valueOf((l11.longValue() / ((long) 10000)) - j11);
        l12 = lValueOf3;
        return new e4.e(z12, z11, null, lValueOf4, lValueOf, l9, l12);
    }

    @Override // m00.o
    public final w v(a0 a0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // m00.o
    public final h0 x(a0 file) throws IOException {
        kotlin.jvm.internal.m.f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // m00.o
    public final i0 y(a0 file) throws Throwable {
        Throwable th2;
        d0 d0VarC;
        kotlin.jvm.internal.m.f(file, "file");
        a0 a0Var = f40727f;
        a0Var.getClass();
        n00.g gVar = (n00.g) this.f40730e.get(n00.c.b(a0Var, file, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j11 = gVar.f43078f;
        w wVarV = this.f40729d.v(this.f40728c);
        try {
            d0VarC = b.c(wVarV.a(gVar.f43080h));
            try {
                wVarV.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (wVarV != null) {
                try {
                    wVarV.close();
                } catch (Throwable th5) {
                    cf.x.b(th4, th5);
                }
            }
            th2 = th4;
            d0VarC = null;
        }
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.m.f(d0VarC, "<this>");
        n00.b.f(d0VarC, null);
        if (gVar.f43079g == 0) {
            return new n00.d(d0VarC, j11, true);
        }
        return new n00.d(new v(b.c(new n00.d(d0VarC, gVar.f43077e, true)), new Inflater(true)), j11, false);
    }

    @Override // m00.o
    public final void d(a0 dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        throw new IOException(FpIL.cugOFFHgN);
    }
}
