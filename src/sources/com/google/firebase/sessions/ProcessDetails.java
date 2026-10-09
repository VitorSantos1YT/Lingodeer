package com.google.firebase.sessions;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20926d;

    public ProcessDetails(int i11, boolean z11, int i12, String str) {
        this.f20923a = str;
        this.f20924b = i11;
        this.f20925c = i12;
        this.f20926d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return m.a(this.f20923a, processDetails.f20923a) && this.f20924b == processDetails.f20924b && this.f20925c == processDetails.f20925c && this.f20926d == processDetails.f20926d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20926d) + e.b(this.f20925c, e.b(this.f20924b, this.f20923a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f20923a);
        sb2.append(", pid=");
        sb2.append(this.f20924b);
        sb2.append(", importance=");
        sb2.append(this.f20925c);
        sb2.append(", isDefaultProcess=");
        return ep.a.l(sb2, this.f20926d, ')');
    }
}
