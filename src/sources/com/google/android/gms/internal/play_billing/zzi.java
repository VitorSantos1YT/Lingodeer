package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzi {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zzo zzoVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zzoVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zzoVar) != obj && atomicReferenceFieldUpdater.get(zzoVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
