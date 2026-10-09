package com.google.firebase.inappmessaging.model;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageType f20321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CampaignMetadata f20322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20323c;

    public InAppMessage(CampaignMetadata campaignMetadata, MessageType messageType, Map map) {
        this.f20322b = campaignMetadata;
        this.f20321a = messageType;
        this.f20323c = map;
    }

    public ImageData a() {
        return null;
    }
}
