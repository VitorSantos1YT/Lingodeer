package vt;

import aj.uZCn.evRpcb;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54284a;

    public s(ArrayList arrayList) {
        this.f54284a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f54284a.equals(((s) obj).f54284a);
    }

    public final int hashCode() {
        return this.f54284a.hashCode();
    }

    public final String toString() {
        return "BookmarkFolderSyncData(folders=" + this.f54284a + evRpcb.DoDcpJwIioqXAzV;
    }
}
