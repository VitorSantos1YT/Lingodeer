package df;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23392a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23394c;

    public final boolean a(String str) {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!qf.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i11 = 0; i11 < 30; i11++) {
                        fArr[i11] = 0.0f;
                    }
                    String[] strArrF = ff.g.f(ff.d.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    if (strArrF == null || (str2 = strArrF[0]) == null) {
                        str2 = "none";
                    }
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return false;
        }
    }
}
