package xr;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56214b;

    public c(String title, List items) {
        m.f(title, "title");
        m.f(items, "items");
        this.f56213a = title;
        this.f56214b = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f56213a, cVar.f56213a) && m.a(this.f56214b, cVar.f56214b);
    }

    public final int hashCode() {
        return this.f56214b.hashCode() + (this.f56213a.hashCode() * 31);
    }

    public final String toString() {
        return "RadicalPage(title=" + this.f56213a + ", items=" + this.f56214b + ")";
    }
}
