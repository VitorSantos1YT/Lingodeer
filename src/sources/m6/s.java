package m6;

import l1.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40925a;

    static {
        int[] iArr = new int[a2.values().length];
        try {
            iArr[a2.Idle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a2.ShutDown.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f40925a = iArr;
    }
}
