package com.google.common.collect;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function f16626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ordering f16627b;

    public ByFunctionOrdering(Function function, Ordering ordering) {
        function.getClass();
        this.f16626a = function;
        this.f16627b = ordering;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.f16626a;
        return this.f16627b.compare(function.apply(obj), function.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.f16626a.equals(byFunctionOrdering.f16626a) && this.f16627b.equals(byFunctionOrdering.f16627b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16626a, this.f16627b});
    }

    public final String toString() {
        return this.f16627b + ".onResultOf(" + this.f16626a + ")";
    }
}
