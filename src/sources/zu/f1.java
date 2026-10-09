package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f59411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f59412b;

    public f1(q0 recommendFriendsStatus, m1 searchStatus) {
        kotlin.jvm.internal.m.f(recommendFriendsStatus, "recommendFriendsStatus");
        kotlin.jvm.internal.m.f(searchStatus, "searchStatus");
        this.f59411a = recommendFriendsStatus;
        this.f59412b = searchStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.m.a(this.f59411a, f1Var.f59411a) && kotlin.jvm.internal.m.a(this.f59412b, f1Var.f59412b);
    }

    public final int hashCode() {
        return this.f59412b.hashCode() + (this.f59411a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(recommendFriendsStatus=" + this.f59411a + ", searchStatus=" + this.f59412b + ")";
    }
}
