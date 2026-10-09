package s0;

import android.os.Build;
import android.os.Trace;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import l1.c3;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c3 f51192a = new c3(new m9(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f51193b;

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[Catch: RejectedExecutionException -> 0x0090, TryCatch #0 {RejectedExecutionException -> 0x0090, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:22:0x0068, B:24:0x007a, B:27:0x008b, B:26:0x007e, B:18:0x0062, B:10:0x0040), top: B:33:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[Catch: RejectedExecutionException -> 0x0090, TryCatch #0 {RejectedExecutionException -> 0x0090, blocks: (B:8:0x003a, B:14:0x0047, B:16:0x005c, B:22:0x0068, B:24:0x007a, B:27:0x008b, B:26:0x007e, B:18:0x0062, B:10:0x0040), top: B:33:0x003a }] */
    public static final void a(final j3.h hVar, final j3.y0 y0Var, final n3.h hVar2, final List list, l1.n nVar, int i11) {
        boolean z11;
        boolean zF;
        Object objQ;
        l1.s sVar = (l1.s) nVar;
        Executor executor = (Executor) sVar.j(f51192a);
        if (executor == null || !b(hVar.f35700b.length())) {
            sVar.d0(-517807721);
            sVar.p(false);
            return;
        }
        sVar.d0(-518708178);
        final v3.m mVar = (v3.m) sVar.j(z2.g1.f58552n);
        final v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
        boolean z12 = true;
        if (((i11 & 112) ^ 48) > 32) {
            try {
                if (sVar.f(y0Var)) {
                    z11 = true;
                } else if ((i11 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zD = z11 | sVar.d(mVar.ordinal()) | sVar.h(list);
                if ((((i11 & 14) ^ 6) > 4 || !sVar.f(hVar)) && (i11 & 6) != 4) {
                }
                zF = zD | z12 | sVar.f(cVar) | sVar.h(hVar2);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    Runnable runnable = new Runnable() { // from class: s0.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            x1.b bVarC;
                            j3.y0 y0Var2 = y0Var;
                            v3.m mVar2 = mVar;
                            j3.h hVar3 = hVar;
                            v3.c cVar2 = cVar;
                            n3.h hVar4 = hVar2;
                            Trace.beginSection("BackgroundTextMeasurement");
                            try {
                                x1.f fVarJ = x1.l.j();
                                x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
                                if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                                    throw new IllegalStateException(MzwEyWCkjXL.KFe);
                                }
                                try {
                                    x1.f fVarJ2 = bVarC.j();
                                    try {
                                        j3.y0 y0VarJ = j3.t.j(y0Var2, mVar2);
                                        List list2 = list;
                                        if (list2 == null) {
                                            list2 = ry.r.f50854a;
                                        }
                                        new a9.i(hVar3, y0VarJ, list2, cVar2, hVar4).c();
                                        x1.f.q(fVarJ2);
                                        bVarC.w().d();
                                        bVarC.c();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        x1.f.q(fVarJ2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        bVarC.c();
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                Trace.endSection();
                                throw th5;
                            }
                        }
                    };
                    sVar.o0(runnable);
                    objQ = runnable;
                }
                executor.execute((Runnable) objQ);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            if ((i11 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zD2 = z11 | sVar.d(mVar.ordinal()) | sVar.h(list);
            z12 = ((i11 & 14) ^ 6) > 4 ? false : false;
            zF = zD2 | z12 | sVar.f(cVar) | sVar.h(hVar2);
            objQ = sVar.Q();
            if (zF) {
                Runnable runnable2 = new Runnable() { // from class: s0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x1.b bVarC;
                        j3.y0 y0Var2 = y0Var;
                        v3.m mVar2 = mVar;
                        j3.h hVar3 = hVar;
                        v3.c cVar2 = cVar;
                        n3.h hVar4 = hVar2;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            x1.f fVarJ = x1.l.j();
                            x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
                            if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                                throw new IllegalStateException(MzwEyWCkjXL.KFe);
                            }
                            try {
                                x1.f fVarJ2 = bVarC.j();
                                try {
                                    j3.y0 y0VarJ = j3.t.j(y0Var2, mVar2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = ry.r.f50854a;
                                    }
                                    new a9.i(hVar3, y0VarJ, list2, cVar2, hVar4).c();
                                    x1.f.q(fVarJ2);
                                    bVarC.w().d();
                                    bVarC.c();
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    x1.f.q(fVarJ2);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    bVarC.c();
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                };
                sVar.o0(runnable2);
                objQ = runnable2;
            } else {
                Runnable runnable3 = new Runnable() { // from class: s0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x1.b bVarC;
                        j3.y0 y0Var2 = y0Var;
                        v3.m mVar2 = mVar;
                        j3.h hVar3 = hVar;
                        v3.c cVar2 = cVar;
                        n3.h hVar4 = hVar2;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            x1.f fVarJ = x1.l.j();
                            x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
                            if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                                throw new IllegalStateException(MzwEyWCkjXL.KFe);
                            }
                            try {
                                x1.f fVarJ2 = bVarC.j();
                                try {
                                    j3.y0 y0VarJ = j3.t.j(y0Var2, mVar2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = ry.r.f50854a;
                                    }
                                    new a9.i(hVar3, y0VarJ, list2, cVar2, hVar4).c();
                                    x1.f.q(fVarJ2);
                                    bVarC.w().d();
                                    bVarC.c();
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    x1.f.q(fVarJ2);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    bVarC.c();
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                };
                sVar.o0(runnable3);
                objQ = runnable3;
            }
            executor.execute((Runnable) objQ);
        }
        sVar.p(false);
    }

    public static final boolean b(int i11) {
        if (Build.VERSION.SDK_INT >= 28 && i11 >= 8 && i11 < 1000) {
            if (f51193b == null) {
                f51193b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f51193b;
            kotlin.jvm.internal.m.c(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
