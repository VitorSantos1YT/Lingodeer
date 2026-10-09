package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Entry<E> {
        Object a();

        int getCount();
    }

    boolean J(int i11, Object obj);

    int add(int i11, Object obj);

    Set c();

    Set entrySet();

    boolean equals(Object obj);

    int hashCode();

    int q0(Object obj);

    int u0(int i11, Object obj);

    int w1(Object obj);
}
