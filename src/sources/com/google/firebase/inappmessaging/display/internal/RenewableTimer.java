package com.google.firebase.inappmessaging.display.internal;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RenewableTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownTimer f19786a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Callback {
        void a();
    }

    public final void a(long j11, final Callback callback) {
        this.f19786a = new CountDownTimer(j11) { // from class: com.google.firebase.inappmessaging.display.internal.RenewableTimer.1
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                callback.a();
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j12) {
            }
        }.start();
    }
}
