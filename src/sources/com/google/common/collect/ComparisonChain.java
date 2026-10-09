package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComparisonChain f16669a = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        public static ComparisonChain g(int i11) {
            if (i11 < 0) {
                return ComparisonChain.f16670b;
            }
            return i11 > 0 ? ComparisonChain.f16671c : ComparisonChain.f16669a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i11, int i12) {
            return g(Integer.compare(i11, i12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return g(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z11, boolean z12) {
            return g(Boolean.compare(z11, z12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z11, boolean z12) {
            return g(Boolean.compare(z12, z11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return 0;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComparisonChain f16670b = new InactiveComparisonChain(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComparisonChain f16671c = new InactiveComparisonChain(1);

    public /* synthetic */ ComparisonChain(int i11) {
        this();
    }

    public abstract ComparisonChain a(int i11, int i12);

    public abstract ComparisonChain b(Comparable comparable, Comparable comparable2);

    public abstract ComparisonChain c(Object obj, Object obj2, Comparator comparator);

    public abstract ComparisonChain d(boolean z11, boolean z12);

    public abstract ComparisonChain e(boolean z11, boolean z12);

    public abstract int f();

    private ComparisonChain() {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InactiveComparisonChain extends ComparisonChain {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16672d;

        public InactiveComparisonChain(int i11) {
            super(0);
            this.f16672d = i11;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return this.f16672d;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
