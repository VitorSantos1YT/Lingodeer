package com.google.firebase.inappmessaging.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageOnlyMessage extends InAppMessage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageData f20317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Action f20318e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageData f20319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Action f20320b;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public final ImageData a() {
        return this.f20317d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageOnlyMessage)) {
            return false;
        }
        ImageOnlyMessage imageOnlyMessage = (ImageOnlyMessage) obj;
        Action action = imageOnlyMessage.f20318e;
        if (hashCode() != imageOnlyMessage.hashCode()) {
            return false;
        }
        Action action2 = this.f20318e;
        return (action2 != null || action == null) && (action2 == null || action2.equals(action)) && this.f20317d.equals(imageOnlyMessage.f20317d);
    }

    public final int hashCode() {
        Action action = this.f20318e;
        return this.f20317d.f20315a.hashCode() + (action != null ? action.hashCode() : 0);
    }
}
