package gb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28892a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28893b;

    public a(fb.l clock) {
        kotlin.jvm.internal.m.f(clock, "clock");
        this.f28893b = clock;
    }

    public final void a(ka.a db2) {
        switch (this.f28892a) {
            case 0:
                kotlin.jvm.internal.m.f(db2, "db");
                db2.j();
                try {
                    StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((fb.l) this.f28893b).getClass();
                    sb2.append(System.currentTimeMillis() - n.f28949a);
                    sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    db2.k(sb2.toString());
                    db2.o();
                    return;
                } finally {
                    db2.r();
                }
            default:
                kotlin.jvm.internal.m.f(db2, "db");
                ((s0.a) this.f28893b).invoke(db2);
                return;
        }
    }

    public a(s0.a aVar) {
        this.f28893b = aVar;
    }
}
