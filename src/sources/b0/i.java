package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    boolean c();

    long d();

    j2 e();

    s f(long j11);

    default boolean g(long j11) {
        return j11 >= d();
    }

    Object h(long j11);

    Object i();
}
