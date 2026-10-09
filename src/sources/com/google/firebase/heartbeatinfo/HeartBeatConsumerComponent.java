package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HeartBeatConsumerComponent {
    private HeartBeatConsumerComponent() {
    }

    public static Component a() {
        HeartBeatConsumer heartBeatConsumer = new HeartBeatConsumer() { // from class: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.1
        };
        Component.Builder builderB = Component.b(HeartBeatConsumer.class);
        builderB.f18095e = 1;
        builderB.f18096f = new androidx.lifecycle.viewmodel.compose.c(heartBeatConsumer);
        return builderB.b();
    }
}
