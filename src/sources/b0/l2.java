package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface l2 {
    boolean c();

    long e(s sVar, s sVar2, s sVar3);

    default s g(s sVar, s sVar2, s sVar3) {
        return m(e(sVar, sVar2, sVar3), sVar, sVar2, sVar3);
    }

    s i(long j11, s sVar, s sVar2, s sVar3);

    s m(long j11, s sVar, s sVar2, s sVar3);
}
