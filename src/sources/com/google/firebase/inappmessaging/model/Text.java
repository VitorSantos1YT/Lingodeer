package com.google.firebase.inappmessaging.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Text {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20337b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20339b;
    }

    public Text(String str, String str2) {
        this.f20336a = str;
        this.f20337b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        String str = text.f20336a;
        if (hashCode() != text.hashCode()) {
            return false;
        }
        String str2 = this.f20336a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.f20337b.equals(text.f20337b);
    }

    public final int hashCode() {
        String str = this.f20337b;
        String str2 = this.f20336a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
