package j00;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f35449a;

    public a(c00.a aVar) {
        this.f35449a = aVar;
    }

    @Override // j00.c
    public final c00.a a(List list) {
        return this.f35449a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && m.a(((a) obj).f35449a, this.f35449a);
    }

    public final int hashCode() {
        return this.f35449a.hashCode();
    }
}
