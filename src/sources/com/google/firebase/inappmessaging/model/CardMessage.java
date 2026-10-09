package com.google.firebase.inappmessaging.model;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CardMessage extends InAppMessage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Text f20301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Text f20302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Action f20304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Action f20305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageData f20306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageData f20307j;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageData f20308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageData f20309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Action f20311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Text f20312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Text f20313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Action f20314g;
    }

    public CardMessage(CampaignMetadata campaignMetadata, Text text, Text text2, ImageData imageData, ImageData imageData2, String str, Action action, Action action2, Map map) {
        super(campaignMetadata, MessageType.CARD, map);
        this.f20301d = text;
        this.f20302e = text2;
        this.f20306i = imageData;
        this.f20307j = imageData2;
        this.f20303f = str;
        this.f20304g = action;
        this.f20305h = action2;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public final ImageData a() {
        return this.f20306i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardMessage)) {
            return false;
        }
        CardMessage cardMessage = (CardMessage) obj;
        ImageData imageData = cardMessage.f20307j;
        ImageData imageData2 = cardMessage.f20306i;
        Action action = cardMessage.f20305h;
        Text text = cardMessage.f20302e;
        if (hashCode() != cardMessage.hashCode()) {
            return false;
        }
        Text text2 = this.f20302e;
        if ((text2 == null && text != null) || (text2 != null && !text2.equals(text))) {
            return false;
        }
        Action action2 = this.f20305h;
        if ((action2 == null && action != null) || (action2 != null && !action2.equals(action))) {
            return false;
        }
        ImageData imageData3 = this.f20306i;
        if ((imageData3 == null && imageData2 != null) || (imageData3 != null && !imageData3.equals(imageData2))) {
            return false;
        }
        ImageData imageData4 = this.f20307j;
        return (imageData4 != null || imageData == null) && (imageData4 == null || imageData4.equals(imageData)) && this.f20301d.equals(cardMessage.f20301d) && this.f20304g.equals(cardMessage.f20304g) && this.f20303f.equals(cardMessage.f20303f);
    }

    public final int hashCode() {
        Text text = this.f20302e;
        int iHashCode = text != null ? text.hashCode() : 0;
        Action action = this.f20305h;
        int iHashCode2 = action != null ? action.hashCode() : 0;
        ImageData imageData = this.f20306i;
        int iHashCode3 = imageData != null ? imageData.f20315a.hashCode() : 0;
        ImageData imageData2 = this.f20307j;
        return this.f20304g.hashCode() + this.f20303f.hashCode() + this.f20301d.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (imageData2 != null ? imageData2.f20315a.hashCode() : 0);
    }
}
