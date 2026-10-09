package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Component
abstract class TransportRuntimeComponent implements Closeable {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Component.Builder
    public interface Builder {
    }

    public abstract EventStore a();

    public abstract TransportRuntime b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a().close();
    }
}
