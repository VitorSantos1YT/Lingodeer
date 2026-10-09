package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzabn f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11133b;

    public zzaaf(zzabn zzabnVar, String str) {
        zzabr.a(zzabnVar, "parser");
        this.f11132a = zzabnVar;
        this.f11133b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) obj;
            if (this.f11132a.equals(zzaafVar.f11132a) && this.f11133b.equals(zzaafVar.f11133b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11132a.hashCode() ^ this.f11133b.hashCode();
    }
}
