package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class MoreCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f17085a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ToOptionalState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17086a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f17087b = Collections.EMPTY_LIST;

        public final void a(Object obj) {
            obj.getClass();
            if (this.f17086a == null) {
                this.f17086a = obj;
                return;
            }
            if (this.f17087b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f17087b = arrayList;
                arrayList.add(obj);
            } else if (this.f17087b.size() < 4) {
                this.f17087b.add(obj);
            } else {
                b(true);
                throw null;
            }
        }

        public final void b(boolean z11) {
            StringBuilder sb2 = new StringBuilder("expected one element but was: <");
            sb2.append(this.f17086a);
            for (Object obj : this.f17087b) {
                sb2.append(", ");
                sb2.append(obj);
            }
            if (z11) {
                sb2.append(", ...");
            }
            sb2.append('>');
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static {
        a aVar = new a(1);
        b bVar = new b(1);
        c cVar = new c(2);
        d dVar = new d(2);
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        Collector.of(aVar, bVar, cVar, dVar, characteristics);
        f17085a = new Object();
        Collector.of(new a(1), new b(2), new c(2), new d(3), characteristics);
    }

    private MoreCollectors() {
    }
}
