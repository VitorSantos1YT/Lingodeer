package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38745a;

    public h(List list) {
        this.f38745a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.f38745a, ((h) obj).f38745a);
    }

    public final int hashCode() {
        return this.f38745a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f38745a, "IntroTableRowData(cells=", ")");
    }
}
