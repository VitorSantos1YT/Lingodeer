package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17306a;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f17306a) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                Enum r9 = (Enum) obj2;
                EnumSet enumSet = enumSetAccumulator.f16629a;
                if (enumSet != null) {
                    enumSet.add(r9);
                } else {
                    enumSetAccumulator.f16629a = EnumSet.of(r9);
                }
                break;
            case 1:
                ((MoreCollectors.ToOptionalState) obj).a(obj2);
                break;
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                if (obj2 == null) {
                    obj2 = MoreCollectors.f17085a;
                } else {
                    Object obj3 = MoreCollectors.f17085a;
                }
                toOptionalState.a(obj2);
                break;
            case 3:
                ((ImmutableSet.Builder) obj).a(obj2);
                break;
            case 4:
                ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                Range range = (Range) obj2;
                builder.getClass();
                Preconditions.f("range must not be empty, but was %s", !range.f(), range);
                builder.f16840a.add(range);
                break;
            default:
                ((ImmutableList.Builder) obj).h(obj2);
                break;
        }
    }
}
