package com.google.firebase.inappmessaging.model;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BannerMessage extends InAppMessage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Text f20284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Text f20285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageData f20286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Action f20287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20288h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Text f20289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Text f20290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageData f20291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Action f20292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20293e;
    }

    public BannerMessage(CampaignMetadata campaignMetadata, Text text, Text text2, ImageData imageData, Action action, String str, Map map) {
        super(campaignMetadata, MessageType.BANNER, map);
        this.f20284d = text;
        this.f20285e = text2;
        this.f20286f = imageData;
        this.f20287g = action;
        this.f20288h = str;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public final ImageData a() {
        return this.f20286f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerMessage)) {
            return false;
        }
        BannerMessage bannerMessage = (BannerMessage) obj;
        Action action = bannerMessage.f20287g;
        ImageData imageData = bannerMessage.f20286f;
        Text text = bannerMessage.f20285e;
        if (hashCode() != bannerMessage.hashCode()) {
            return false;
        }
        Text text2 = this.f20285e;
        if ((text2 == null && text != null) || (text2 != null && !text2.equals(text))) {
            return false;
        }
        ImageData imageData2 = this.f20286f;
        if ((imageData2 == null && imageData != null) || (imageData2 != null && !imageData2.equals(imageData))) {
            return false;
        }
        Action action2 = this.f20287g;
        return (action2 != null || action == null) && (action2 == null || action2.equals(action)) && this.f20284d.equals(bannerMessage.f20284d) && this.f20288h.equals(bannerMessage.f20288h);
    }

    public final int hashCode() {
        Text text = this.f20285e;
        int iHashCode = text != null ? text.hashCode() : 0;
        ImageData imageData = this.f20286f;
        int iHashCode2 = imageData != null ? imageData.f20315a.hashCode() : 0;
        Action action = this.f20287g;
        return this.f20288h.hashCode() + this.f20284d.hashCode() + iHashCode + iHashCode2 + (action != null ? action.hashCode() : 0);
    }
}
