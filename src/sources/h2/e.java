package h2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f31460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f31461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f31462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f31463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f31464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f31465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f31466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f31467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f31468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f31469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f31470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f31471l;
    public static final r m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r f31472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r f31473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r f31474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r f31475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f31476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f31477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f31478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f31479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f31480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f31481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f31482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f31483y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f31460a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f31461b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        s sVar = new s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar2 = new s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar3 = new s(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f31462c = sVar3;
        s sVar4 = new s(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f31463d = sVar4;
        t tVar = k.f31495d;
        r rVar = new r("sRGB IEC61966-2.1", fArr, tVar, sVar, 0);
        f31464e = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, tVar, 1.0d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1);
        f31465f = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, tVar, null, new g7.c(29), new d(0), -0.799f, 2.399f, sVar, 2);
        f31466g = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, tVar, 1.0d, -0.5f, 7.499f, 3);
        f31467h = rVar4;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f31468i = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, tVar, new s(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f31469j = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new t(0.314f, 0.351f), 2.6d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 6);
        f31470k = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, tVar, sVar, 7);
        f31471l = rVar8;
        r rVar9 = new r("NTSC (1953)", fArr2, k.f31492a, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f31472n = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, tVar, 2.2d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 10);
        f31473o = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f31493b, new s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f31474p = rVar12;
        float[] fArr4 = {0.7347f, 0.2653f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0E-4f, -0.077f};
        t tVar2 = k.f31494c;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", fArr4, tVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f31475q = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, tVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f31476r = rVar14;
        l lVar = new l(14, 1, b.f31452b, "Generic XYZ");
        f31477s = lVar;
        long j11 = b.f31453c;
        l lVar2 = new l(15, 0, j11, "Generic L*a*b*");
        f31478t = lVar2;
        r rVar15 = new r("None", fArr, tVar, sVar2, 16);
        f31479u = rVar15;
        r rVar16 = new r("Hybrid Log Gamma encoding", fArr3, tVar, null, new d(1), new d(2), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, sVar3, 17);
        f31480v = rVar16;
        r rVar17 = new r("Perceptual Quantizer encoding", fArr3, tVar, null, new d(3), new d(4), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, sVar4, 18);
        f31481w = rVar17;
        m mVar = new m("Oklab", j11, 19);
        f31482x = mVar;
        f31483y = new c[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, lVar, lVar2, rVar15, rVar16, rVar17, mVar};
    }

    public static double a(s sVar, double d5) {
        double d11 = d5 < 0.0d ? -1.0d : 1.0d;
        double d12 = d5 * d11;
        double d13 = sVar.f31525b;
        double d14 = sVar.f31526c;
        double d15 = sVar.f31527d;
        double d16 = sVar.f31528e;
        double d17 = sVar.f31529f;
        double d18 = d13 * d12;
        return (sVar.f31530g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(s sVar, double d5) {
        double d11 = d5 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / sVar.f31525b;
        double d13 = 1.0d / sVar.f31526c;
        double d14 = 1.0d / sVar.f31527d;
        double d15 = sVar.f31528e;
        double d16 = sVar.f31529f;
        double d17 = (d5 * d11) / (sVar.f31530g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    public static double c(s sVar, double d5) {
        double d11 = d5 < 0.0d ? -1.0d : 1.0d;
        double d12 = d5 * d11;
        double d13 = sVar.f31525b;
        double d14 = sVar.f31527d;
        double dPow = (Math.pow(d12, d14) * sVar.f31526c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * sVar.f31529f) + sVar.f31528e), sVar.f31530g) * d11;
    }

    public static double d(s sVar, double d5) {
        double d11 = d5 < 0.0d ? -1.0d : 1.0d;
        double d12 = d5 * d11;
        double d13 = -sVar.f31525b;
        double d14 = sVar.f31528e;
        double d15 = 1.0d / sVar.f31530g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-sVar.f31529f)) + sVar.f31526c), 1.0d / sVar.f31527d) * d11;
    }
}
