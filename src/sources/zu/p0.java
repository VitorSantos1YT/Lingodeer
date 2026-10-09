package zu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59522a;

    public p0(List recommendFriends) {
        kotlin.jvm.internal.m.f(recommendFriends, "recommendFriends");
        this.f59522a = recommendFriends;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && kotlin.jvm.internal.m.a(this.f59522a, ((p0) obj).f59522a);
    }

    public final int hashCode() {
        return this.f59522a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f59522a, "Success(recommendFriends=", ")");
    }
}
