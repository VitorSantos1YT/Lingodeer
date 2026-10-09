package com.google.firebase.encoders;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FieldDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19623b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f19625b = null;

        public Builder(String str) {
            this.f19624a = str;
        }
    }

    public FieldDescriptor(String str, Map map) {
        this.f19622a = str;
        this.f19623b = map;
    }

    public static FieldDescriptor a(String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f19622a.equals(fieldDescriptor.f19622a) && this.f19623b.equals(fieldDescriptor.f19623b);
    }

    public final int hashCode() {
        return this.f19623b.hashCode() + (this.f19622a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f19622a + ", properties=" + this.f19623b.values() + "}";
    }
}
