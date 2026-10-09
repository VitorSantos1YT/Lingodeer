package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory implements Factory<FirebaseInAppMessaging> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeadlessInAppMessagingModule f19898a;

    public HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
        this.f19898a = headlessInAppMessagingModule;
    }

    @Override // oy.a
    public final Object get() {
        FirebaseInAppMessaging firebaseInAppMessaging = this.f19898a.f19897a;
        Preconditions.b(firebaseInAppMessaging);
        return firebaseInAppMessaging;
    }
}
