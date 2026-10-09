package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20582c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f20580a = i11;
        this.f20581b = obj;
        this.f20582c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f20580a;
        Object obj = this.f20582c;
        Object obj2 = this.f20581b;
        switch (i11) {
            case 0:
                ((FcmLifecycleCallbacks) obj2).a((Intent) obj);
                break;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                Store store = FirebaseMessaging.f20471l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource2.setResult(((ImageDownload) obj2).a());
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                }
                break;
        }
    }
}
