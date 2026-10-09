package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20080b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f20079a = i11;
        this.f20080b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20079a) {
            case 0:
                return ((CampaignCacheClient) this.f20080b).f19964d;
            default:
                ((TaskCompletionSource) this.f20080b).setResult(null);
                return null;
        }
    }
}
