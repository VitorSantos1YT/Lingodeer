package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator f11176b = new zzaax();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzabe f11177c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzabc f11178a;

    static {
        List list = Collections.EMPTY_LIST;
        f11177c = new zzabe(new zzabc());
    }

    public zzabe(zzabc zzabcVar) {
        this.f11178a = zzabcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzabe) && ((zzabe) obj).f11178a.equals(this.f11178a);
    }

    public final int hashCode() {
        return ~this.f11178a.hashCode();
    }

    public final String toString() {
        return this.f11178a.toString();
    }
}
