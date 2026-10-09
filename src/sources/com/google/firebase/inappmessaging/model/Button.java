package com.google.firebase.inappmessaging.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Text f20294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20295b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Text f20296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20297b;
    }

    public Button(Text text, String str) {
        this.f20294a = text;
        this.f20295b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return hashCode() == button.hashCode() && this.f20294a.equals(button.f20294a) && this.f20295b.equals(button.f20295b);
    }

    public final int hashCode() {
        return this.f20295b.hashCode() + this.f20294a.hashCode();
    }
}
