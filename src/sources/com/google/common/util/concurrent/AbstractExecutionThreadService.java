package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractExecutionThreadService implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f17570a = new AbstractService() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.1
        @Override // com.google.common.util.concurrent.AbstractService
        public final String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    };

    static {
        new LazyLogger(AbstractExecutionThreadService.class);
    }

    public final String toString() {
        return getClass().getSimpleName() + " [" + ((AbstractService) this.f17570a).f17610b.f17612a + "]";
    }
}
