package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Monitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17666a = new ReentrantLock(false);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Guard {
        public Guard(Monitor monitor) {
            Preconditions.k(monitor, "monitor");
            monitor.f17666a.newCondition();
        }
    }
}
