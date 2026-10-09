package ex;

import io.reactivex.exceptions.MissingBackpressureException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends q {
    private static final long serialVersionUID = 338953216916120960L;

    @Override // ex.q
    public final void g() {
        c(new MissingBackpressureException("create: could not emit value due to lack of requests"));
    }
}
