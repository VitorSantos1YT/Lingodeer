package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableRangeMap f16822c;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ImmutableList f16823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ImmutableList f16824b;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ImmutableList<Range<Comparable<?>>> {
        @Override // java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, 0);
            if (i11 == 0 || i11 == -1) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends ImmutableRangeMap<Comparable<?>, Object> {
        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public final /* bridge */ /* synthetic */ Map a() {
            return a();
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f16825a = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap f16826a;

        public SerializedForm(ImmutableMap immutableMap) {
            this.f16826a = immutableMap;
        }

        public Object readResolve() {
            ArrayList arrayList;
            ImmutableMap immutableMap = this.f16826a;
            if (immutableMap.isEmpty()) {
                return ImmutableRangeMap.f16822c;
            }
            Builder builder = new Builder();
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = builder.f16825a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Range range = (Range) entry.getKey();
                Object value = entry.getValue();
                range.getClass();
                value.getClass();
                Preconditions.f("Range must not be empty, but was %s", !range.f(), range);
                arrayList.add(new ImmutableEntry(range, value));
            }
            Range range2 = Range.f17134c;
            Ordering ordering = Range.RangeLexOrdering.f17138a;
            ordering.getClass();
            Collections.sort(arrayList, new ByFunctionOrdering(Maps.EntryFunction.KEY, ordering));
            ImmutableList.Builder builder2 = new ImmutableList.Builder(arrayList.size());
            ImmutableList.Builder builder3 = new ImmutableList.Builder(arrayList.size());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Range range3 = (Range) ((Map.Entry) arrayList.get(i11)).getKey();
                if (i11 > 0) {
                    Range range4 = (Range) ((Map.Entry) arrayList.get(i11 - 1)).getKey();
                    if (range3.e(range4) && !range3.d(range4).f()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range4 + " overlaps with entry " + range3);
                    }
                }
                builder2.h(range3);
                builder3.h(((Map.Entry) arrayList.get(i11)).getValue());
            }
            return new ImmutableRangeMap(builder2.j(), builder3.j());
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList immutableList = RegularImmutableList.f17147e;
        f16822c = new ImmutableRangeMap(immutableList, immutableList);
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.f16823a = immutableList;
        this.f16824b = immutableList2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.RangeMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap a() {
        ImmutableList immutableList = this.f16823a;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.f17150t;
        }
        Range range = Range.f17134c;
        return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.f17138a), this.f16824b, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return a().equals(((RangeMap) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMapA = a();
        immutableMapA.getClass();
        return Maps.h(immutableMapA);
    }

    public Object writeReplace() {
        return new SerializedForm(a());
    }
}
