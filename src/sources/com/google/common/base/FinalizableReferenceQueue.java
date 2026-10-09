package com.google.common.base;

import com.google.common.base.internal.Finalizer;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f16358d = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f16359e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f16360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhantomReference f16361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16362c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DecoupledLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                return new URLClassLoader(new URL[]{b()}, null).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e8) {
                FinalizableReferenceQueue.f16358d.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e8);
                return null;
            }
        }

        public final URL b() throws IOException {
            String str = "com.google.common.base.internal.Finalizer".replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: ".concat(string));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DirectLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                Logger logger = Finalizer.f16418a;
                return Finalizer.class;
            } catch (ClassNotFoundException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface FinalizerLoader {
        Class a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SystemLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f16358d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static {
        FinalizerLoader[] finalizerLoaderArr = {new SystemLoader(), new DecoupledLoader(), new DirectLoader()};
        for (int i11 = 0; i11 < 3; i11++) {
            Class clsA = finalizerLoaderArr[i11].a();
            if (clsA != null) {
                try {
                    f16359e = clsA.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
                    return;
                } catch (NoSuchMethodException e8) {
                    throw new AssertionError(e8);
                }
            }
        }
        throw new AssertionError();
    }

    public FinalizableReferenceQueue() {
        boolean z11;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f16360a = referenceQueue;
        PhantomReference phantomReference = new PhantomReference(this, referenceQueue);
        this.f16361b = phantomReference;
        try {
            f16359e.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
            z11 = true;
        } catch (IllegalAccessException e8) {
            throw new AssertionError(e8);
        } catch (Throwable th2) {
            f16358d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z11 = false;
        }
        this.f16362c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16361b.enqueue();
        if (this.f16362c) {
            return;
        }
        while (true) {
            Reference referencePoll = this.f16360a.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((FinalizableReference) referencePoll).a();
            } catch (Throwable th2) {
                f16358d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }
}
