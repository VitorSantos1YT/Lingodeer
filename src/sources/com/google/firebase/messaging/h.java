package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f20586b;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging, int i11) {
        this.f20585a = i11;
        this.f20586b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z11;
        switch (this.f20585a) {
            case 0:
                TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
                if (!this.f20586b.f20478f.a() || topicsSubscriber.f20549h.a() == null) {
                    return;
                }
                synchronized (topicsSubscriber) {
                    z11 = topicsSubscriber.f20548g;
                }
                if (z11) {
                    return;
                }
                topicsSubscriber.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f20586b;
                CloudMessage cloudMessage = (CloudMessage) obj;
                Store store = FirebaseMessaging.f20471l;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    MessagingAnalytics.b(cloudMessage.f8563a);
                    firebaseMessaging.g();
                    return;
                }
                return;
        }
    }
}
