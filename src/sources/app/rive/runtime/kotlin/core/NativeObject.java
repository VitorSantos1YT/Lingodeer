package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import fz.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import nv.p;
import nz.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeObject implements RefCount {
    public static final long NULL_POINTER = 0;
    private final List<RefCount> dependencies;
    private l disposeStackTrace;
    private AtomicInteger refs;
    private final AtomicLong unsafeCppPointer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$buildCombinedStackTrace$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 extends n implements c {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // fz.c
        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!m.a(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$dispose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // fz.c
        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!m.a(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    public NativeObject(long j11) {
        this.unsafeCppPointer = new AtomicLong(j11);
        this.refs = new AtomicInteger(j11 == 0 ? 0 : 1);
        List<RefCount> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        m.e(listSynchronizedList, "synchronizedList(...)");
        this.dependencies = listSynchronizedList;
    }

    private final List<StackTraceElement> buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        l lVar = this.disposeStackTrace;
        if (lVar != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", BuildConfig.VERSION_NAME, null, -1));
            ry.m.c0(arrayList, lVar);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", BuildConfig.VERSION_NAME, null, -1));
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        m.e(stackTrace, "getStackTrace(...)");
        l lVarB = ry.l.B(stackTrace);
        AnonymousClass2 predicate = AnonymousClass2.INSTANCE;
        m.f(predicate, "predicate");
        ry.m.c0(arrayList, nz.n.Q(new nz.c(lVarB, predicate), 1));
        return arrayList;
    }

    private final synchronized void dispose() {
        try {
            if (this.refs.get() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            m.e(stackTrace, "getStackTrace(...)");
            l lVarB = ry.l.B(stackTrace);
            AnonymousClass1 predicate = AnonymousClass1.INSTANCE;
            m.f(predicate, "predicate");
            this.disposeStackTrace = new nz.c(lVarB, predicate);
            List<RefCount> list = this.dependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RefCount) it.next()).release();
            }
            list.clear();
            cppDelete(this.unsafeCppPointer.get());
            this.unsafeCppPointer.set(0L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() {
        int iAcquire;
        iAcquire = RefCount.DefaultImpls.acquire(this);
        if (iAcquire <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return iAcquire;
    }

    public void cppDelete(long j11) {
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        return this.unsafeCppPointer.get() != 0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int release() {
        int iRelease;
        iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease == 0 && getHasCppObject()) {
            dispose();
        }
        return iRelease;
    }

    public final void setCppPointer(long j11) {
        this.unsafeCppPointer.set(j11);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final void setRefs(AtomicInteger atomicInteger) {
        m.f(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }

    public final long getCppPointer() throws RiveException {
        long j11 = this.unsafeCppPointer.get();
        if (j11 != 0) {
            return j11;
        }
        RiveException riveException = new RiveException(p.q(xItStCyvVEZ.CHirrZatzWpRjXe, getClass().getSimpleName(), '.'));
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }
}
