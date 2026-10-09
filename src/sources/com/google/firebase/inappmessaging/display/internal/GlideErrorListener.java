package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.model.InAppMessage;
import le.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GlideErrorListener implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InAppMessage f19772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInAppMessagingDisplayCallbacks f19773b;

    public GlideErrorListener(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        this.f19772a = inAppMessage;
        this.f19773b = firebaseInAppMessagingDisplayCallbacks;
    }
}
