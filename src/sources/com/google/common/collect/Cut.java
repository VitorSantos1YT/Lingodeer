package com.google.common.collect;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f16678a;

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16679a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f16679a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16679a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AboveAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AboveAll f16680b = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super(BuildConfig.VERSION_NAME);
        }

        private Object readResolve() {
            return f16680b;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final boolean h(Comparable comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut m(BoundType boundType) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut n(BoundType boundType) {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "+∞";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveValue(Comparable comparable) {
            super(comparable);
            comparable.getClass();
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f16678a);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb2) {
            sb2.append(this.f16678a);
            sb2.append(']');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            return this.f16678a;
        }

        @Override // com.google.common.collect.Cut
        public final boolean h(Comparable comparable) {
            Range range = Range.f17134c;
            return this.f16678a.compareTo(comparable) < 0;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.f16678a.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        public final Cut m(BoundType boundType) {
            int i11 = AnonymousClass1.f16679a[boundType.ordinal()];
            if (i11 == 1) {
                throw null;
            }
            if (i11 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Cut n(BoundType boundType) {
            int i11 = AnonymousClass1.f16679a[boundType.ordinal()];
            if (i11 == 1) {
                return this;
            }
            if (i11 == 2) {
                throw null;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "/" + this.f16678a + "\\";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BelowAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BelowAll f16681b = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super(BuildConfig.VERSION_NAME);
        }

        private Object readResolve() {
            return f16681b;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final boolean h(Comparable comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut m(BoundType boundType) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut n(BoundType boundType) {
            throw new AssertionError("this statement should be unreachable");
        }

        public final String toString() {
            return "-∞";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f16678a);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb2) {
            sb2.append(this.f16678a);
            sb2.append(')');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable g() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final boolean h(Comparable comparable) {
            Range range = Range.f17134c;
            return this.f16678a.compareTo(comparable) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.f16678a.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable j() {
            return this.f16678a;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType k() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType l() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        public final Cut m(BoundType boundType) {
            int i11 = AnonymousClass1.f16679a[boundType.ordinal()];
            if (i11 == 1) {
                return this;
            }
            if (i11 == 2) {
                throw null;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Cut n(BoundType boundType) {
            int i11 = AnonymousClass1.f16679a[boundType.ordinal()];
            if (i11 == 1) {
                throw null;
            }
            if (i11 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "\\" + this.f16678a + "/";
        }
    }

    public Cut(Comparable comparable) {
        this.f16678a = comparable;
    }

    public static BelowValue a(Comparable comparable) {
        comparable.getClass();
        return new BelowValue(comparable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cut cut) {
        if (cut == BelowAll.f16681b) {
            return 1;
        }
        if (cut == AboveAll.f16680b) {
            return -1;
        }
        Comparable comparable = cut.f16678a;
        Range range = Range.f17134c;
        int iCompareTo = this.f16678a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract void c(StringBuilder sb2);

    public abstract void e(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public Comparable f() {
        return this.f16678a;
    }

    public abstract Comparable g();

    public abstract boolean h(Comparable comparable);

    public abstract int hashCode();

    public abstract Comparable j();

    public abstract BoundType k();

    public abstract BoundType l();

    public abstract Cut m(BoundType boundType);

    public abstract Cut n(BoundType boundType);
}
