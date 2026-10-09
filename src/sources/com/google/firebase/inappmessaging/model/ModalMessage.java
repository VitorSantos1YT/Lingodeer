package com.google.firebase.inappmessaging.model;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ModalMessage extends InAppMessage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Text f20324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Text f20325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageData f20326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Action f20327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20328h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Text f20329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Text f20330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageData f20331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Action f20332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20333e;
    }

    public ModalMessage(CampaignMetadata campaignMetadata, Text text, Text text2, ImageData imageData, Action action, String str, Map map) {
        super(campaignMetadata, MessageType.MODAL, map);
        this.f20324d = text;
        this.f20325e = text2;
        this.f20326f = imageData;
        this.f20327g = action;
        this.f20328h = str;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public final ImageData a() {
        return this.f20326f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModalMessage)) {
            return false;
        }
        ModalMessage modalMessage = (ModalMessage) obj;
        ImageData imageData = modalMessage.f20326f;
        Action action = modalMessage.f20327g;
        Text text = modalMessage.f20325e;
        if (hashCode() != modalMessage.hashCode()) {
            return false;
        }
        Text text2 = this.f20325e;
        if ((text2 == null && text != null) || (text2 != null && !text2.equals(text))) {
            return false;
        }
        Action action2 = this.f20327g;
        if ((action2 == null && action != null) || (action2 != null && !action2.equals(action))) {
            return false;
        }
        ImageData imageData2 = this.f20326f;
        return (imageData2 != null || imageData == null) && (imageData2 == null || imageData2.equals(imageData)) && this.f20324d.equals(modalMessage.f20324d) && this.f20328h.equals(modalMessage.f20328h);
    }

    public final int hashCode() {
        Text text = this.f20325e;
        int iHashCode = text != null ? text.hashCode() : 0;
        Action action = this.f20327g;
        int iHashCode2 = action != null ? action.hashCode() : 0;
        ImageData imageData = this.f20326f;
        return this.f20328h.hashCode() + this.f20324d.hashCode() + iHashCode + iHashCode2 + (imageData != null ? imageData.f20315a.hashCode() : 0);
    }
}
