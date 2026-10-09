package kv;

import ot.a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f38713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f38714b;

    static {
        int[] iArr = new int[s0.values().length];
        try {
            iArr[s0.HIRAGANA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s0.KATAKANA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s0.HANDWRITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f38713a = iArr;
        int[] iArr2 = new int[a2.values().length];
        try {
            iArr2[a2.WordTranslation.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f38714b = iArr2;
    }
}
