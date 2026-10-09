package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {

    /* JADX INFO: renamed from: com.google.common.base.Converter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            new Iterator<Object>() { // from class: com.google.common.base.Converter.1.1
                {
                    throw null;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    throw null;
                }

                @Override // java.util.Iterator
                public final Object next() {
                    AnonymousClass1.this.getClass();
                    throw null;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    throw null;
                }
            };
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.andThen(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Converter.from(null, null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.reverse()";
        }
    }

    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        objB.getClass();
        return objB;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return a(obj);
    }

    public abstract Object b(Object obj);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Converter f16355a = new IdentityConverter();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return f16355a;
        }

        public final String toString() {
            return "Converter.identity()";
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return obj;
        }
    }
}
