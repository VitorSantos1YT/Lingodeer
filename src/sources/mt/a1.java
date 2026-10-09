package mt;

import rt.ke;
import rt.me;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f41231b;

    static {
        int[] iArr = new int[me.values().length];
        try {
            iArr[me.NEXT_REVIEW_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[me.UNIT_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f41230a = iArr;
        int[] iArr2 = new int[ke.values().length];
        try {
            iArr2[ke.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f41231b = iArr2;
    }
}
