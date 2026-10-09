package dt;

import com.lingodeer.data.model.DisplayType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23822a;

    static {
        int[] iArr = new int[DisplayType.values().length];
        try {
            iArr[DisplayType.WORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DisplayType.ZHUYIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DisplayType.LUOMA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DisplayType.BOTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f23822a = iArr;
    }
}
