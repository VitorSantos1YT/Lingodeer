package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17307a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f17307a) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                CollectCollectors.EnumSetAccumulator enumSetAccumulator2 = (CollectCollectors.EnumSetAccumulator) obj2;
                EnumSet enumSet = enumSetAccumulator.f16629a;
                if (enumSet == null) {
                    return enumSetAccumulator2;
                }
                EnumSet enumSet2 = enumSetAccumulator2.f16629a;
                if (enumSet2 == null) {
                    return enumSetAccumulator;
                }
                enumSet.addAll(enumSet2);
                return enumSetAccumulator;
            case 1:
                ImmutableList.Builder builder = (ImmutableList.Builder) obj;
                ImmutableList.Builder builder2 = (ImmutableList.Builder) obj2;
                builder.getClass();
                builder.d(builder2.f16763b, builder2.f16762a);
                return builder;
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj2;
                if (toOptionalState.f17086a == null) {
                    return toOptionalState2;
                }
                if (toOptionalState2.f17086a == null) {
                    return toOptionalState;
                }
                if (toOptionalState.f17087b.isEmpty()) {
                    toOptionalState.f17087b = new ArrayList();
                }
                toOptionalState.f17087b.add(toOptionalState2.f17086a);
                toOptionalState.f17087b.addAll(toOptionalState2.f17087b);
                if (toOptionalState.f17087b.size() <= 4) {
                    return toOptionalState;
                }
                List list = toOptionalState.f17087b;
                list.subList(4, list.size()).clear();
                toOptionalState.b(true);
                throw null;
            case 3:
                return ((ImmutableSet.Builder) obj).l((ImmutableSet.Builder) obj2);
            default:
                ImmutableRangeSet.Builder builder3 = (ImmutableRangeSet.Builder) obj;
                builder3.getClass();
                ArrayList arrayList = ((ImmutableRangeSet.Builder) obj2).f16840a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    Range range = (Range) obj3;
                    Preconditions.f("range must not be empty, but was %s", !range.f(), range);
                    builder3.f16840a.add(range);
                }
                return builder3;
        }
    }
}
