package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20084b;

    public /* synthetic */ e(DeveloperListenerManager.ExecutorAndListener executorAndListener, InAppMessage inAppMessage, int i11) {
        this.f20083a = i11;
        this.f20084b = executorAndListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20083a) {
            case 0:
                ((DeveloperListenerManager.ErrorsExecutorAndListener) this.f20084b).getClass();
                throw null;
            case 1:
                ((DeveloperListenerManager.ClicksExecutorAndListener) this.f20084b).getClass();
                throw null;
            case 2:
                ((DeveloperListenerManager.DismissExecutorAndListener) this.f20084b).getClass();
                throw null;
            case 3:
                ((DeveloperListenerManager.ImpressionExecutorAndListener) this.f20084b).getClass();
                throw null;
            default:
                ForegroundNotifier foregroundNotifier = (ForegroundNotifier) this.f20084b;
                boolean z11 = foregroundNotifier.f20002b;
                foregroundNotifier.f20002b = !(z11 && foregroundNotifier.f20003c) && z11;
                return;
        }
    }

    public /* synthetic */ e(DeveloperListenerManager.ExecutorAndListener executorAndListener, InAppMessage inAppMessage, Object obj, int i11) {
        this.f20083a = i11;
        this.f20084b = executorAndListener;
    }

    public /* synthetic */ e(ForegroundNotifier foregroundNotifier) {
        this.f20083a = 4;
        this.f20084b = foregroundNotifier;
    }
}
