package d1;

import b0.i1;
import b0.j2;
import d0.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.p f22922a = new b0.p(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f22923b = new j2(new y1(2), new y1(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f22924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i1 f22925d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f22924c = jFloatToRawIntBits;
        f22925d = new i1(new f2.b(jFloatToRawIntBits), 3);
    }
}
