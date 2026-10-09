package nq;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements ms.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq.a f43930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43931b;

    public d(pq.a aVar, String headerText) {
        m.f(headerText, "headerText");
        this.f43930a = aVar;
        this.f43931b = headerText;
    }

    @Override // ms.c
    public final String a() {
        String str;
        pq.a aVar = this.f43930a;
        return (aVar == null || (str = aVar.f46983a) == null) ? this.f43931b : str;
    }

    @Override // ms.c
    public final String b() {
        String str;
        pq.a aVar = this.f43930a;
        return (aVar == null || (str = aVar.f46985c) == null) ? BuildConfig.VERSION_NAME : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f43930a, dVar.f43930a) && m.a(this.f43931b, dVar.f43931b);
    }

    public final int hashCode() {
        pq.a aVar = this.f43930a;
        return this.f43931b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @Override // ms.c
    public final boolean isEmpty() {
        return this.f43930a == null && this.f43931b.length() == 0;
    }

    public final String toString() {
        return "VTTableItem(vtChar=" + this.f43930a + ", headerText=" + this.f43931b + ")";
    }
}
