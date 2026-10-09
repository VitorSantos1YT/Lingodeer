package com.google.firebase.components;

import a.ar.MFeWs;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qualified f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18119c;

    public Dependency(int i11, int i12, Class cls) {
        this(Qualified.a(cls), i11, i12);
    }

    public static Dependency a(Class cls) {
        return new Dependency(0, 2, cls);
    }

    public static Dependency b(Class cls) {
        return new Dependency(0, 1, cls);
    }

    public static Dependency c(Qualified qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency d(Class cls) {
        return new Dependency(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f18117a.equals(dependency.f18117a) && this.f18118b == dependency.f18118b && this.f18119c == dependency.f18119c;
    }

    public final int hashCode() {
        return ((((this.f18117a.hashCode() ^ 1000003) * 1000003) ^ this.f18118b) * 1000003) ^ this.f18119c;
    }

    public Dependency(Qualified qualified, int i11, int i12) {
        Preconditions.a(qualified, "Null dependency anInterface.");
        this.f18117a = qualified;
        this.f18118b = i11;
        this.f18119c = i12;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f18117a);
        sb2.append(", type=");
        int i11 = this.f18118b;
        if (i11 == 1) {
            str = "required";
        } else {
            str = i11 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i12 = this.f18119c;
        if (i12 == 0) {
            str2 = "direct";
        } else if (i12 == 1) {
            str2 = "provider";
        } else {
            if (i12 != 2) {
                throw new AssertionError(p.j(i12, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return ep.a.k(sb2, str2, MFeWs.fedaaLL);
    }
}
