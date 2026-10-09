package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17308a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f17308a) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                EnumSet enumSet = enumSetAccumulator.f16629a;
                if (enumSet == null) {
                    int i11 = ImmutableSet.f16842c;
                    return RegularImmutableSet.L;
                }
                int i12 = ImmutableEnumSet.f16767f;
                int size = enumSet.size();
                Object immutableEnumSet = size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : new SingletonImmutableSet((Enum) Iterables.d(enumSet)) : RegularImmutableSet.L;
                enumSetAccumulator.f16629a = null;
                return immutableEnumSet;
            case 1:
                ArrayList arrayList = ((ImmutableRangeSet.Builder) obj).f16840a;
                ImmutableList.Builder builder = new ImmutableList.Builder(arrayList.size());
                Range range = Range.f17134c;
                Collections.sort(arrayList, Range.RangeLexOrdering.f17138a);
                PeekingIterator peekingIteratorI = Iterators.i(arrayList.iterator());
                while (peekingIteratorI.hasNext()) {
                    Range range2 = (Range) peekingIteratorI.next();
                    while (peekingIteratorI.hasNext()) {
                        Range range3 = (Range) ((Iterators.PeekingImpl) peekingIteratorI).a();
                        if (!range2.e(range3)) {
                        }
                        Preconditions.h(range2.d(range3).f(), "Overlapping ranges not permitted but found %s overlapping %s", range2, range3);
                        Range range4 = (Range) peekingIteratorI.next();
                        Cut cut = range2.f17135a;
                        int iCompareTo = cut.compareTo(range4.f17135a);
                        Cut cut2 = range2.f17136b;
                        Cut cut3 = range4.f17136b;
                        int iCompareTo2 = cut2.compareTo(cut3);
                        if (iCompareTo > 0 || iCompareTo2 < 0) {
                            if (iCompareTo < 0 || iCompareTo2 > 0) {
                                if (iCompareTo > 0) {
                                    cut = range4.f17135a;
                                }
                                if (iCompareTo2 < 0) {
                                    cut2 = cut3;
                                }
                                range2 = new Range(cut, cut2);
                            } else {
                                range2 = range4;
                            }
                        }
                        break;
                    }
                    builder.h(range2);
                }
                ImmutableList immutableListJ = builder.j();
                if (immutableListJ.isEmpty()) {
                    return ImmutableRangeSet.f16827b;
                }
                return (((RegularImmutableList) immutableListJ).f17149d == 1 && ((Range) Iterables.d(immutableListJ)).equals(Range.f17134c)) ? ImmutableRangeSet.f16828c : new ImmutableRangeSet(immutableListJ);
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                if (toOptionalState.f17087b.isEmpty()) {
                    return Optional.ofNullable(toOptionalState.f17086a);
                }
                toOptionalState.b(false);
                throw null;
            case 3:
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj;
                Object obj2 = MoreCollectors.f17085a;
                if (toOptionalState2.f17086a == null) {
                    throw new NoSuchElementException();
                }
                if (!toOptionalState2.f17087b.isEmpty()) {
                    toOptionalState2.b(false);
                    throw null;
                }
                Object obj3 = toOptionalState2.f17086a;
                if (obj3 == MoreCollectors.f17085a) {
                    return null;
                }
                return obj3;
            case 4:
                return ((ImmutableSet.Builder) obj).k();
            default:
                return ((ImmutableList.Builder) obj).j();
        }
    }
}
