package vy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i[] f54317a;

    public b(i[] iVarArr) {
        this.f54317a = iVarArr;
    }

    private final Object readResolve() {
        i[] iVarArr = this.f54317a;
        i iVarPlus = j.f54321a;
        for (i iVar : iVarArr) {
            iVarPlus = iVarPlus.plus(iVar);
        }
        return iVarPlus;
    }
}
