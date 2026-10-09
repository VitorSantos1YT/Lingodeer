package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzxz implements zzyi, zzzd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12163h = new String();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f12164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzxy f12166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzyc f12167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzyq f12168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzaaf f12169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f12170g;

    public zzxz(Level level) {
        zzaab.f11129a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f12166c = null;
        this.f12167d = null;
        this.f12168e = null;
        this.f12169f = null;
        this.f12170g = null;
        zzabr.a(level, "level");
        this.f12164a = level;
        this.f12165b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final void a(String str, Object[] objArr) {
        zzxy zzxyVar;
        if (this.f12167d == null) {
            ((zzaaj.AnonymousClass1) zzaab.f11129a.a()).getClass();
            this.f12167d = zzyc.f12175a;
        }
        zzyd zzydVarB = this.f12167d;
        if (zzydVarB != zzyc.f12175a) {
            zzxy zzxyVar2 = this.f12166c;
            if (zzxyVar2 != null && zzxyVar2.f12162b > 0) {
                zzabr.a(zzydVarB, "logSiteKey");
                int i11 = zzxyVar2.f12162b;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (zzxx.f12157f.equals(zzxyVar2.b(i12))) {
                        Object objC = zzxyVar2.c(i12);
                        zzydVarB = objC instanceof zzyj ? ((zzyj) objC).b() : new zzyu(zzydVarB, objC);
                    }
                }
            }
        } else {
            zzydVarB = null;
        }
        boolean zD = d(zzydVarB);
        zzyq zzyqVar = this.f12168e;
        if (zzyqVar != null) {
            zzyp zzypVar = (zzyp) zzyp.f12186c.b(zzydVarB, this.f12166c);
            AtomicInteger atomicInteger = zzypVar.f12188b;
            AtomicBoolean atomicBoolean = zzypVar.f12187a;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            int i13 = -1;
            if (zzyqVar != zzyq.f12189a && atomicBoolean.compareAndSet(false, true)) {
                try {
                    zzyqVar.a();
                    atomicBoolean.set(false);
                    atomicInteger.addAndGet(-iIncrementAndGet);
                    i13 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (zD && i13 > 0 && (zzxyVar = this.f12166c) != null) {
                zzxyVar.e(zzxx.f12156e, Integer.valueOf(i13));
            }
            zD &= i13 >= 0;
        }
        if (zD) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f12170g = objArrCopyOf;
            for (int i14 = 0; i14 < objArrCopyOf.length; i14++) {
                Object obj = objArrCopyOf[i14];
                if (obj instanceof zzxu) {
                    objArrCopyOf[i14] = ((zzxu) obj).zza();
                }
            }
            if (str != f12163h) {
                this.f12169f = new zzaaf(c(), str);
            }
            zzabe zzabeVarB = zzaab.f11129a.c().b();
            if (!zzabeVarB.f11178a.isEmpty()) {
                zzzj zzzjVarJ = j();
                zzyl zzylVar = zzxx.f12159h;
                zzabe zzabeVar = (zzabe) zzzjVarJ.d(zzylVar);
                if (zzabeVar != null) {
                    zzabc zzabcVar = zzabeVar.f11178a;
                    if (!zzabcVar.isEmpty()) {
                        zzabc zzabcVar2 = zzabeVarB.f11178a;
                        if (!zzabcVar2.isEmpty()) {
                            zzabeVar = new zzabe(new zzabc(zzabcVar2, zzabcVar));
                        }
                        zzabeVarB = zzabeVar;
                    }
                }
                k(zzylVar, zzabeVarB);
            }
            zzzf zzzfVar = e().f12145a;
            try {
                zzabt zzabtVar = (zzabt) zzabt.f11191b.get();
                int i15 = zzabtVar.f11192a + 1;
                zzabtVar.f11192a = i15;
                if (i15 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i15 <= 100) {
                        zzzfVar.c(this);
                    } else {
                        zzxi.a("unbounded recursion in log statement", this);
                    }
                    zzabtVar.close();
                } catch (Throwable th3) {
                    try {
                        zzabtVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (RuntimeException e8) {
                try {
                    zzzfVar.d(e8, this);
                } catch (zzzg e10) {
                    throw e10;
                } catch (RuntimeException e11) {
                    String name = e11.getClass().getName();
                    String message = e11.getMessage();
                    StringBuilder sb2 = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb2.append(name);
                    sb2.append(": ");
                    sb2.append(message);
                    zzxi.a(sb2.toString(), this);
                    try {
                        e11.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi b(Throwable th2) {
        zzyl zzylVar = zzxx.f12152a;
        zzabr.a(zzylVar, "metadata key");
        if (th2 != null) {
            k(zzylVar, th2);
        }
        return f();
    }

    public abstract zzabl c();

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.measurement.zzxz] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.google.android.gms.internal.measurement.zzyt] */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.google.android.gms.internal.measurement.zzyq] */
    public boolean d(zzyd zzydVar) {
        int iF;
        int i11;
        ?? zzynVar;
        zzxk zzxkVar;
        zzyq zzyqVar;
        zzyq zzyqVar2;
        zzyq zzyqVar3;
        ?? r12;
        zzyq zzyqVar4;
        zzyq zzyqVar5;
        zzxy zzxyVar = this.f12166c;
        if (zzxyVar != null) {
            if (zzydVar != null) {
                zzyf zzyfVar = zzxn.f12148d;
                if (((zzxm) zzxyVar.d(zzxx.f12155d)) == null) {
                    zzynVar = 0;
                } else {
                    zzxn zzxnVar = (zzxn) zzxn.f12148d.b(zzydVar, zzxyVar);
                    long j11 = this.f12165b;
                    if (!(j11 >= 0)) {
                        throw new IllegalArgumentException("timestamp cannot be negative");
                    }
                    AtomicLong atomicLong = zzxnVar.f12149c;
                    long j12 = atomicLong.get();
                    if (j12 >= 0) {
                        throw null;
                    }
                    atomicLong.compareAndSet(j12, -j11);
                    zzynVar = zzxnVar;
                }
                zzxy zzxyVar2 = this.f12166c;
                zzyf zzyfVar2 = zzxk.f12146d;
                Integer num = (Integer) zzxyVar2.d(zzxx.f12153b);
                if (num == null) {
                    zzyqVar = null;
                } else {
                    zzxkVar = (zzxk) zzxk.f12146d.b(zzydVar, zzxyVar2);
                    if (zzxkVar.f12147c.incrementAndGet() < num.intValue()) {
                        zzyqVar = zzxkVar;
                        zzyqVar = zzyq.f12189a;
                    }
                }
                if (zzynVar == 0) {
                    zzynVar = zzyqVar;
                } else if (zzyqVar != null && zzynVar != (zzyqVar2 = zzyq.f12189a) && zzyqVar != (zzyqVar3 = zzyq.f12190b)) {
                    if (zzyqVar == zzyqVar2 || zzynVar == zzyqVar3) {
                        zzynVar = zzyqVar;
                    } else {
                        zzynVar = new zzyn(zzynVar, zzyqVar);
                    }
                }
                zzxy zzxyVar3 = this.f12166c;
                zzyf zzyfVar3 = zzyt.f12191d;
                Integer num2 = (Integer) zzxyVar3.d(zzxx.f12154c);
                if (num2 == null || num2.intValue() <= 0) {
                    r12 = 0;
                } else {
                    r12 = (zzyt) zzyt.f12191d.b(zzydVar, zzxyVar3);
                    AtomicInteger atomicInteger = r12.f12193c;
                    if ((((Random) zzyt.f12192e.get()).nextInt(num2.intValue()) == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r12 = zzyq.f12189a;
                    }
                }
                if (zzynVar == 0) {
                    zzynVar = r12;
                } else if (r12 != 0 && zzynVar != (zzyqVar4 = zzyq.f12189a) && r12 != (zzyqVar5 = zzyq.f12190b)) {
                    if (r12 == zzyqVar4 || zzynVar == zzyqVar5) {
                        zzynVar = r12;
                    } else {
                        zzynVar = new zzyn(zzynVar, r12);
                    }
                }
                this.f12168e = zzynVar;
                if (zzynVar == zzyq.f12189a) {
                    return false;
                }
            }
            zzxy zzxyVar4 = this.f12166c;
            zzyl zzylVar = zzxx.f12160i;
            zzyv zzyvVar = (zzyv) zzxyVar4.d(zzylVar);
            if (zzyvVar != null) {
                zzxy zzxyVar5 = this.f12166c;
                if (zzxyVar5 != null && (iF = zzxyVar5.f(zzylVar)) >= 0) {
                    int i12 = iF + iF;
                    int i13 = i12 + 2;
                    while (true) {
                        i11 = zzxyVar5.f12162b;
                        if (i13 >= i11 + i11) {
                            break;
                        }
                        Object obj = zzxyVar5.f12161a[i13];
                        if (!obj.equals(zzylVar)) {
                            Object[] objArr = zzxyVar5.f12161a;
                            objArr[i12] = obj;
                            objArr[i12 + 1] = objArr[i13 + 1];
                            i12 += 2;
                        }
                        i13 += 2;
                    }
                    zzxyVar5.f12162b = i11 - ((i13 - i12) >> 1);
                    while (i12 < i13) {
                        zzxyVar5.f12161a[i12] = null;
                        i12++;
                    }
                }
                zzzj zzzjVarJ = j();
                zzyl zzylVar2 = zzxx.f12152a;
                Throwable th2 = (Throwable) zzzjVarJ.d(zzylVar2);
                int iZza = zzyvVar.zza();
                String[] strArr = zzabq.f11189a;
                if (iZza <= 0 && iZza != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                StackTraceElement[] stackTraceElementArrF = zzabq.f11190b.f(iZza);
                zzyg zzygVar = new zzyg(zzyvVar.toString(), th2);
                zzygVar.setStackTrace(stackTraceElementArrF);
                k(zzylVar2, zzygVar);
            }
        }
        return true;
    }

    public abstract zzxs e();

    public abstract zzyi f();

    public final zzyc g() {
        zzyc zzycVar = this.f12167d;
        if (zzycVar != null) {
            return zzycVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    public final Object i() {
        if (!(this.f12169f == null)) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        Object[] objArr = this.f12170g;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    public final zzzj j() {
        zzxy zzxyVar = this.f12166c;
        return zzxyVar != null ? zzxyVar : zzzi.f12212a;
    }

    public final void k(zzyl zzylVar, Object obj) {
        if (this.f12166c == null) {
            this.f12166c = new zzxy();
        }
        this.f12166c.e(zzylVar, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi zzn() {
        zzyc zzycVar = zzyc.f12175a;
        zzyb zzybVar = new zzyb();
        if (this.f12167d == null) {
            this.f12167d = zzybVar;
        }
        return f();
    }

    public final Object[] h() {
        if (!(this.f12169f != null)) {
            throw new IllegalStateException(OYAvlbfUyD.rlaNLtzdYqImiR);
        }
        Object[] objArr = this.f12170g;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }
}
