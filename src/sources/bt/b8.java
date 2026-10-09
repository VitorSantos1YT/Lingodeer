package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5240b;

    static {
        int[] iArr = new int[ot.a2.values().length];
        try {
            iArr[ot.a2.AudioWord.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ot.a2.AudioAudio.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ot.a2.WordTranslation.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ot.a2.AudioTranslation.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ot.a2.AudioZhuYin.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ot.a2.WordZhuYin.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f5239a = iArr;
        int[] iArr2 = new int[g8.values().length];
        try {
            iArr2[g8.Left.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[g8.Right.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f5240b = iArr2;
    }
}
