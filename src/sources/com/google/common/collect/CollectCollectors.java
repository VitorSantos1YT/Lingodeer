package com.google.common.collect;

import java.util.EnumSet;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CollectCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16628a = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EnumMapAccumulator<K extends Enum<K>, V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EnumSetAccumulator<E extends Enum<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EnumSet f16629a;

        static {
            int i11 = CollectCollectors.f16628a;
            Collector.of(new a(0), new b(0), new c(0), new d(0), Collector.Characteristics.UNORDERED);
        }

        private EnumSetAccumulator() {
        }

        public /* synthetic */ EnumSetAccumulator(int i11) {
            this();
        }
    }

    static {
        Collector.of(new a(4), new b(5), new c(1), new d(5), new Collector.Characteristics[0]);
        Collector.of(new a(2), new b(3), new c(3), new d(4), new Collector.Characteristics[0]);
        Collector.of(new a(3), new b(4), new c(4), new d(1), new Collector.Characteristics[0]);
    }

    private CollectCollectors() {
    }
}
