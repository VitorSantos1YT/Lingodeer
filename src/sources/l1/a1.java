package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface a1 extends b1, b3 {
    @Override // l1.b3
    default Object getValue() {
        return Integer.valueOf(((h1) this).l());
    }

    @Override // l1.b1
    default void setValue(Object obj) {
        ((h1) this).m(((Number) obj).intValue());
    }
}
