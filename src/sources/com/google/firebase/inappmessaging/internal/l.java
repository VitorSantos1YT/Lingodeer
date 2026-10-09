package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements yw.c, yw.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CampaignProto.ThickContent f20244a;

    @Override // yw.b
    public void accept(Object obj) {
        CampaignProto.ThickContent thickContent = this.f20244a;
        if (thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            thickContent.M().H();
        } else if (thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
            thickContent.H().H();
        }
    }

    @Override // yw.c
    public Object apply(Object obj) {
        return this.f20244a;
    }
}
