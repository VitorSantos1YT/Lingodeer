package l1;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f39369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f39370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f39371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.e f39372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f39374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f39375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f39376h = new AtomicReference(o1.InitialPending);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39377i = t1.e.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y.j0 f39378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t1.j f39379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ob.m f39380l;

    public n1(z zVar, w wVar, s sVar, y.l0 l0Var, fz.e eVar, boolean z11, a aVar, Object obj) {
        this.f39369a = zVar;
        this.f39370b = wVar;
        this.f39371c = sVar;
        this.f39372d = eVar;
        this.f39373e = z11;
        this.f39374f = aVar;
        this.f39375g = obj;
        y.j0 j0Var = y.s0.f56760a;
        kotlin.jvm.internal.m.d(j0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f39378j = j0Var;
        t1.j jVar = new t1.j();
        jVar.g(l0Var, sVar.D());
        this.f39379k = jVar;
        this.f39380l = new ob.m(aVar.f39228b);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f39376h;
        try {
            switch (m1.f39357a[((o1) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    o1 o1Var = o1.ApplyPending;
                    o1 o1Var2 = o1.Applied;
                    while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                        if (atomicReference.get() != o1Var) {
                            r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e8) {
            atomicReference.set(o1.Invalid);
            throw e8;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f39375g) {
                try {
                    this.f39380l.N(this.f39374f, this.f39379k);
                    this.f39379k.c();
                    this.f39379k.d();
                    this.f39379k.b();
                    this.f39369a.S = null;
                } catch (Throwable th2) {
                    this.f39379k.b();
                    this.f39369a.S = null;
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final boolean c() {
        return ((o1) this.f39376h.get()).compareTo(o1.ApplyPending) >= 0;
    }

    public final void d() {
        boolean z11;
        o1 o1Var = o1.RecomposePending;
        o1 o1Var2 = o1.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f39376h;
            if (atomicReference.compareAndSet(o1Var, o1Var2)) {
                z11 = true;
                break;
            } else if (atomicReference.get() != o1Var) {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return;
        }
        r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x0100, B:54:0x010f, B:55:0x0112, B:56:0x0116, B:62:0x013e, B:64:0x0146, B:59:0x011d, B:61:0x0123, B:69:0x0151, B:70:0x0154, B:28:0x007f, B:52:0x0105), top: B:75:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x0100, B:54:0x010f, B:55:0x0112, B:56:0x0116, B:62:0x013e, B:64:0x0146, B:59:0x011d, B:61:0x0123, B:69:0x0151, B:70:0x0154, B:28:0x007f, B:52:0x0105), top: B:75:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x0100, B:54:0x010f, B:55:0x0112, B:56:0x0116, B:62:0x013e, B:64:0x0146, B:59:0x011d, B:61:0x0123, B:69:0x0151, B:70:0x0154, B:28:0x007f, B:52:0x0105), top: B:75:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:30:0x0093->B:83:?, LOOP_END, SYNTHETIC] */
    public final boolean e(se.n nVar) throws Exception {
        long j11;
        o1 o1Var;
        o1 o1Var2;
        AtomicReference atomicReference = this.f39376h;
        try {
            int i11 = m1.f39357a[((o1) atomicReference.get()).ordinal()];
            z zVar = this.f39369a;
            w wVar = this.f39370b;
            switch (i11) {
                case 1:
                    s sVar = this.f39371c;
                    boolean z11 = this.f39373e;
                    if (z11) {
                        sVar.f39458z = 100;
                        sVar.f39457y = true;
                    }
                    try {
                        this.f39378j = wVar.b(zVar, nVar, this.f39372d);
                        if (z11) {
                            sVar.u();
                        }
                        o1 o1Var3 = o1.InitialPending;
                        o1 o1Var4 = o1.RecomposePending;
                        while (!atomicReference.compareAndSet(o1Var3, o1Var4)) {
                            if (atomicReference.get() != o1Var3) {
                                r1.b("Unexpected state change from: " + o1Var3 + " to: " + o1Var4 + '.');
                                if (this.f39378j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.f39378j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        if (z11) {
                            sVar.u();
                        }
                        throw th2;
                    }
                case 2:
                    o1 o1Var5 = o1.RecomposePending;
                    o1 o1Var6 = o1.Recomposing;
                    try {
                        while (!atomicReference.compareAndSet(o1Var5, o1Var6)) {
                            if (atomicReference.get() != o1Var5) {
                                r1.b("Unexpected state change from: " + o1Var5 + " to: " + o1Var6 + '.');
                                j11 = this.f39377i;
                                this.f39377i = t1.e.c();
                                this.f39378j = wVar.n(zVar, nVar, this.f39378j);
                                this.f39377i = j11;
                                o1Var = o1.Recomposing;
                                o1Var2 = o1.RecomposePending;
                                while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                                    if (atomicReference.get() != o1Var) {
                                        r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                                        if (this.f39378j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.f39378j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.f39377i = t1.e.c();
                        this.f39378j = wVar.n(zVar, nVar, this.f39378j);
                        this.f39377i = j11;
                        o1Var = o1.Recomposing;
                        o1Var2 = o1.RecomposePending;
                        while (!atomicReference.compareAndSet(o1Var, o1Var2)) {
                            if (atomicReference.get() != o1Var) {
                                r1.b("Unexpected state change from: " + o1Var + " to: " + o1Var2 + '.');
                                if (this.f39378j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.f39378j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th3) {
                        this.f39377i = j11;
                        o1 o1Var7 = o1.Recomposing;
                        o1 o1Var8 = o1.RecomposePending;
                        while (!atomicReference.compareAndSet(o1Var7, o1Var8)) {
                            if (atomicReference.get() != o1Var7) {
                                r1.b("Unexpected state change from: " + o1Var7 + " to: " + o1Var8 + '.');
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                    j11 = this.f39377i;
                case 3:
                    u.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e8) {
            atomicReference.set(o1.Invalid);
            throw e8;
        }
    }
}
