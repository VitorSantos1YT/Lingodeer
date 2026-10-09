package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Range f17134c = new Range(Cut.BelowAll.f16681b, Cut.AboveAll.f16680b);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cut f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cut f17136b;

    /* JADX INFO: renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17137a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f17137a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17137a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ordering f17138a = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return ComparisonChain.f16669a.b(range.f17135a, range2.f17135a).b(range.f17136b, range2.f17136b).f();
        }
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.f17135a = cut;
        cut2.getClass();
        this.f17136b = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.f16680b || cut2 == Cut.BelowAll.f16681b) {
            StringBuilder sb2 = new StringBuilder("Invalid range: ");
            StringBuilder sb3 = new StringBuilder(16);
            cut.c(sb3);
            sb3.append("..");
            cut2.e(sb3);
            sb2.append(sb3.toString());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static Range b(Comparable comparable, BoundType boundType) {
        int i11 = AnonymousClass1.f17137a[boundType.ordinal()];
        if (i11 == 1) {
            return new Range(new Cut.AboveValue(comparable), Cut.AboveAll.f16680b);
        }
        if (i11 == 2) {
            return new Range(Cut.a(comparable), Cut.AboveAll.f16680b);
        }
        throw new AssertionError();
    }

    public static Range g(Comparable comparable, BoundType boundType, Comparable comparable2, BoundType boundType2) {
        boundType.getClass();
        boundType2.getClass();
        BoundType boundType3 = BoundType.OPEN;
        return new Range(boundType == boundType3 ? new Cut.AboveValue(comparable) : Cut.a(comparable), boundType2 == boundType3 ? Cut.a(comparable2) : new Cut.AboveValue(comparable2));
    }

    public static Range h(Comparable comparable, BoundType boundType) {
        int i11 = AnonymousClass1.f17137a[boundType.ordinal()];
        if (i11 == 1) {
            return new Range(Cut.BelowAll.f16681b, Cut.a(comparable));
        }
        if (i11 == 2) {
            return new Range(Cut.BelowAll.f16681b, new Cut.AboveValue(comparable));
        }
        throw new AssertionError();
    }

    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.f17135a.h(comparable) && !this.f17136b.h(comparable);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return a((Comparable) obj);
    }

    public final boolean c() {
        return this.f17136b != Cut.AboveAll.f16680b;
    }

    public final Range d(Range range) {
        Cut cut = range.f17135a;
        Cut cut2 = this.f17135a;
        int iCompareTo = cut2.compareTo(cut);
        Cut cut3 = range.f17136b;
        Cut cut4 = this.f17136b;
        int iCompareTo2 = cut4.compareTo(cut3);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        if (iCompareTo < 0) {
            cut2 = range.f17135a;
        }
        if (iCompareTo2 <= 0) {
            cut3 = cut4;
        }
        Preconditions.h(cut2.compareTo(cut3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return new Range(cut2, cut3);
    }

    public final boolean e(Range range) {
        return this.f17135a.compareTo(range.f17136b) <= 0 && range.f17135a.compareTo(this.f17136b) <= 0;
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.f17135a.equals(range.f17135a) && this.f17136b.equals(range.f17136b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f17135a.equals(this.f17136b);
    }

    public final int hashCode() {
        return (this.f17135a.hashCode() * 31) + this.f17136b.hashCode();
    }

    public Object readResolve() {
        Range range = f17134c;
        return equals(range) ? range : this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f17135a.c(sb2);
        sb2.append("..");
        this.f17136b.e(sb2);
        return sb2.toString();
    }
}
