package gv;

import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29868b;

    public c(String str, String str2) {
        this.f29867a = str;
        this.f29868b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f29867a, cVar.f29867a) && m.a(this.f29868b, cVar.f29868b);
    }

    public final int hashCode() {
        return this.f29868b.hashCode() + (this.f29867a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("Success(eTag=", this.f29867a, ", requestId=", this.f29868b, tcppUUQxZjFdy.oREWPlLKByGNra);
    }
}
