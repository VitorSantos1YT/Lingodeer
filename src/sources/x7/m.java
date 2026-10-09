package x7;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    boolean c(n nVar);

    void e(o oVar);

    void f(long j11, long j12);

    int g(n nVar, kw.b bVar);

    default List h() {
        return ImmutableList.s();
    }

    void release();
}
