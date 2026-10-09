package com.google.firebase.sessions;

import c00.e;
import g00.d1;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class ProcessData {
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20913b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return ProcessData$$serializer.f20914a;
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    public /* synthetic */ ProcessData(int i11, int i12, String str) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, ProcessData$$serializer.f20914a.getDescriptor());
            throw null;
        }
        this.f20912a = i12;
        this.f20913b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) obj;
        return this.f20912a == processData.f20912a && m.a(this.f20913b, processData.f20913b);
    }

    public final int hashCode() {
        return this.f20913b.hashCode() + (Integer.hashCode(this.f20912a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f20912a);
        sb2.append(", uuid=");
        return p0.o(sb2, this.f20913b, ')');
    }

    public ProcessData(int i11, String uuid) {
        m.f(uuid, "uuid");
        this.f20912a = i11;
        this.f20913b = uuid;
    }
}
