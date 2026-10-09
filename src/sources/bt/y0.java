package bt;

import com.lingodeer.data.model.OptionItemSelectedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6204a;

    static {
        int[] iArr = new int[OptionItemSelectedState.values().length];
        try {
            iArr[OptionItemSelectedState.CORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionItemSelectedState.WRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6204a = iArr;
    }
}
