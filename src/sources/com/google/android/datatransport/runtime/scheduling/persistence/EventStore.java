package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface EventStore extends Closeable {
    Iterable E(TransportContext transportContext);

    void J0(long j11, TransportContext transportContext);

    PersistedEvent W0(TransportContext transportContext, EventInternal eventInternal);

    Iterable X();

    long d1(TransportContext transportContext);

    boolean g1(TransportContext transportContext);

    void o1(Iterable iterable);

    int t();

    void u(Iterable iterable);
}
