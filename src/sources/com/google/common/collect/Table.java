package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Cell<R, C, V> {
        Object a();

        Object b();

        Object getValue();
    }

    Set A();

    boolean equals(Object obj);

    Map f();

    int hashCode();

    int size();
}
