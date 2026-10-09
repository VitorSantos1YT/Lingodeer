package com.google.common.collect;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class TableCollectors {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImmutableTableCollectorState<R, C, V> {
        private ImmutableTableCollectorState() {
            new ArrayList();
            new HashBasedTable(new LinkedHashMap(), new HashBasedTable.Factory());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MutableCell<R, C, V> extends Tables.AbstractCell<R, C, V> {
        @Override // com.google.common.collect.Table.Cell
        public final Object a() {
            return null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object b() {
            return null;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            return null;
        }
    }

    private TableCollectors() {
    }
}
