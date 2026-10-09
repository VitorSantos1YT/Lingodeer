package fd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum l {
    STAR(1),
    POLYGON(2);

    private final int value;

    l(int i11) {
        this.value = i11;
    }

    public static l a(int i11) {
        for (l lVar : values()) {
            if (lVar.value == i11) {
                return lVar;
            }
        }
        return null;
    }
}
