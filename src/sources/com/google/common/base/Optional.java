package com.google.common.base;

import com.google.common.collect.FluentIterable;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterable<Object> {

        /* JADX INFO: renamed from: com.google.common.base.Optional$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class C00171 extends AbstractIterator<Object> {
            @Override // com.google.common.base.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            new C00171();
            throw null;
        }
    }

    public static Optional a() {
        return Absent.f16327a;
    }

    public static Optional d(Object obj) {
        obj.getClass();
        return new Present(obj);
    }

    public abstract Object b();

    public abstract boolean c();

    public abstract Object e(Supplier supplier);

    public abstract boolean equals(Object obj);

    public abstract Object f(FluentIterable fluentIterable);

    public abstract Object g();

    public abstract int hashCode();
}
