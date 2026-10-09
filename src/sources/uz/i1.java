package uz;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends vz.a implements p0, i, vz.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f53318f = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53319e;

    public i1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // uz.s0
    public final List a() {
        return ns.o.K(getValue());
    }

    @Override // vz.l
    public final i b(vy.i iVar, int i11, tz.a aVar) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || aVar != tz.a.DROP_OLDEST) ? x0.x(this, iVar, i11, aVar) : this;
    }

    @Override // uz.o0
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:58:0x00f9->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dc -> B:36:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // uz.i
    public final java.lang.Object collect(uz.j r18, vy.d r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.i1.collect(uz.j, vy.d):java.lang.Object");
    }

    @Override // uz.o0
    public final boolean d(Object obj) {
        k(obj);
        return true;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        k(obj);
        return qy.b0.f48488a;
    }

    @Override // vz.a
    public final vz.c f() {
        return new j1();
    }

    @Override // vz.a
    public final vz.c[] g() {
        return new j1[2];
    }

    @Override // uz.g1
    public final Object getValue() {
        com.android.billingclient.api.a aVar = vz.b.f54329b;
        Object obj = f53318f.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final boolean j(Object obj, Object obj2) {
        com.android.billingclient.api.a aVar = vz.b.f54329b;
        if (obj == null) {
            obj = aVar;
        }
        if (obj2 == null) {
            obj2 = aVar;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = vz.b.f54329b;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i11;
        vz.c[] cVarArr;
        com.android.billingclient.api.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53318f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i12 = this.f53319e;
            if ((i12 & 1) != 0) {
                this.f53319e = i12 + 2;
                return true;
            }
            int i13 = i12 + 1;
            this.f53319e = i13;
            vz.c[] cVarArr2 = this.f54324a;
            while (true) {
                j1[] j1VarArr = (j1[]) cVarArr2;
                if (j1VarArr != null) {
                    for (j1 j1Var : j1VarArr) {
                        if (j1Var != null) {
                            AtomicReference atomicReference = j1Var.f53325a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (aVar = x0.f53436c)) {
                                    break;
                                }
                                com.android.billingclient.api.a aVar2 = x0.f53435b;
                                if (obj4 != aVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, aVar2)) {
                                            ((rz.m) obj4).resumeWith(qy.b0.f48488a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, aVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i11 = this.f53319e;
                    if (i11 == i13) {
                        this.f53319e = i13 + 1;
                        return true;
                    }
                    cVarArr = this.f54324a;
                }
                cVarArr2 = cVarArr;
                i13 = i11;
            }
        }
    }
}
