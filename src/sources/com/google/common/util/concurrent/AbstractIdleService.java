package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractIdleService implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f17605a = new DelegateService();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class DelegateService extends AbstractService {
        public DelegateService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ThreadNameSupplier implements Supplier<String> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + " [" + ((AbstractService) this.f17605a).f17610b.f17612a + "]";
    }
}
