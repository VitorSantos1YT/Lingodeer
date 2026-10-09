package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zaa extends LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f8766a;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = this.f8766a;
            this.f8766a = new ArrayList();
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
    }
}
