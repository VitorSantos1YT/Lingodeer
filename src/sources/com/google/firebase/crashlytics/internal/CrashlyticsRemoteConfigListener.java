package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMetadata f18218a;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        this.f18218a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public final void a(RolloutsState rolloutsState) {
        final UserMetadata userMetadata = this.f18218a;
        Set<RolloutAssignment> setB = rolloutsState.b();
        m.e(setB, "getRolloutAssignments(...)");
        ArrayList arrayList = new ArrayList(n.W(setB, 10));
        for (RolloutAssignment rolloutAssignment : setB) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.a(rolloutAssignment.d(), rolloutAssignment.b(), rolloutAssignment.c(), rolloutAssignment.f(), rolloutAssignment.e()));
        }
        synchronized (userMetadata.f18436f) {
            try {
                if (userMetadata.f18436f.b(arrayList)) {
                    final List listA = userMetadata.f18436f.a();
                    userMetadata.f18432b.f18377b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.b
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            UserMetadata userMetadata2 = userMetadata;
                            userMetadata2.f18431a.i(userMetadata2.f18433c, listA);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
