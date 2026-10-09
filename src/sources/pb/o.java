package pb;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qb.a f46752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb.d f46753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.s f46754c;

    static {
        fb.l.c("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, gb.d dVar, qb.a aVar) {
        this.f46753b = dVar;
        this.f46752a = aVar;
        this.f46754c = workDatabase.E();
    }
}
