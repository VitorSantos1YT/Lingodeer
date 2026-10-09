package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38814a;

    public s(List list) {
        this.f38814a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && kotlin.jvm.internal.m.a(this.f38814a, ((s) obj).f38814a);
    }

    public final int hashCode() {
        return this.f38814a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f38814a, "KanaChanges(changes=", ")");
    }
}
