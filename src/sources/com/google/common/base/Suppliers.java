package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Object f16403a;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f16403a = new Object();
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Object f16404a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Supplier f16405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile transient boolean f16406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Object f16407d;

        public MemoizingSupplier(Supplier supplier) {
            supplier.getClass();
            this.f16405b = supplier;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f16404a = new Object();
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            if (!this.f16406c) {
                synchronized (this.f16404a) {
                    try {
                        if (!this.f16406c) {
                            Object obj = this.f16405b.get();
                            this.f16407d = obj;
                            this.f16406c = true;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f16407d;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (this.f16406c) {
                obj = "<supplier that returned " + this.f16407d + ">";
            } else {
                obj = this.f16405b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f16408d = new a(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16409a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Supplier f16410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f16411c;

        public NonSerializableMemoizingSupplier(Supplier supplier) {
            supplier.getClass();
            this.f16410b = supplier;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            Supplier supplier = this.f16410b;
            a aVar = f16408d;
            if (supplier != aVar) {
                synchronized (this.f16409a) {
                    try {
                        if (this.f16410b != aVar) {
                            Object obj = this.f16410b.get();
                            this.f16411c = obj;
                            this.f16410b = aVar;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f16411c;
        }

        public final String toString() {
            Object obj = this.f16410b;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (obj == f16408d) {
                obj = "<supplier that returned " + this.f16411c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        public final boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Suppliers.compose(null, null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SupplierFunctionImpl implements SupplierFunction<Object> {
        private static final /* synthetic */ SupplierFunctionImpl[] $VALUES;
        public static final SupplierFunctionImpl INSTANCE;

        static {
            SupplierFunctionImpl supplierFunctionImpl = new SupplierFunctionImpl("INSTANCE", 0);
            INSTANCE = supplierFunctionImpl;
            $VALUES = new SupplierFunctionImpl[]{supplierFunctionImpl};
        }

        public static SupplierFunctionImpl valueOf(String str) {
            return (SupplierFunctionImpl) Enum.valueOf(SupplierFunctionImpl.class, str);
        }

        public static SupplierFunctionImpl[] values() {
            return (SupplierFunctionImpl[]) $VALUES.clone();
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return ((Supplier) obj).get();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16412a;

        public SupplierOfInstance(Object obj) {
            this.f16412a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.a(this.f16412a, ((SupplierOfInstance) obj).f16412a);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return this.f16412a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f16412a});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.f16412a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.synchronizedSupplier(null)";
        }
    }

    private Suppliers() {
    }

    public static Supplier a(Supplier supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static Supplier b(Object obj) {
        return new SupplierOfInstance(obj);
    }
}
