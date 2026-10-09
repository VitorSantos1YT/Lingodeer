package u8;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface k {
    default d h(byte[] bArr, int i11, int i12) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        j(bArr, 0, i12, j.f52840c, new hh.c(builder, 28));
        return new b(builder.j());
    }

    void j(byte[] bArr, int i11, int i12, j jVar, b7.g gVar);

    int l();

    default void reset() {
    }
}
