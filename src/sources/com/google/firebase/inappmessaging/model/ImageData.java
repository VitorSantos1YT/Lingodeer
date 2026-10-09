package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20315a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20316a;

        public final ImageData a() {
            if (TextUtils.isEmpty(this.f20316a)) {
                throw new IllegalArgumentException("ImageData model must have an imageUrl");
            }
            return new ImageData(this.f20316a);
        }
    }

    public ImageData(String str) {
        this.f20315a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageData)) {
            return false;
        }
        String str = ((ImageData) obj).f20315a;
        String str2 = this.f20315a;
        return str2.hashCode() == str.hashCode() && str2.equals(str);
    }

    public final int hashCode() {
        return this.f20315a.hashCode();
    }
}
