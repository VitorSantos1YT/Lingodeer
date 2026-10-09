package com.google.firebase.components;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Qualified<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f18133b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public @interface Unqualified {
    }

    public Qualified(Class cls, Class cls2) {
        this.f18132a = cls;
        this.f18133b = cls2;
    }

    public static Qualified a(Class cls) {
        return new Qualified(Unqualified.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f18133b.equals(qualified.f18133b)) {
            return this.f18132a.equals(qualified.f18132a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18132a.hashCode() + (this.f18133b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f18133b;
        Class cls2 = this.f18132a;
        if (cls2 == Unqualified.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
