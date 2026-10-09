package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17664a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Event<L> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PerListenerQueue<L> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17665a;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                synchronized (this) {
                    Preconditions.r(this.f17665a);
                    throw null;
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    this.f17665a = false;
                    throw th2;
                }
            }
        }
    }

    static {
        new LazyLogger(ListenerCallQueue.class);
    }
}
