package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j11, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j11, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j11) != obj) {
                return false;
            }
        }
        return true;
    }
}
