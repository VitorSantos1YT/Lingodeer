package w7;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import b7.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import v7.t;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements t, a {
    public int K;
    public SurfaceTexture L;
    public byte[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f54684a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f54685b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f54686c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bq.f f54687d = new bq.f(18, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ar.f f54688e = new ar.f(1, (byte) 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ar.f f54689f = new ar.f(1, (byte) 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f54690t = new float[16];
    public final float[] H = new float[16];
    public volatile int M = 0;
    public int N = -1;

    @Override // w7.a
    public final void a(long j11, float[] fArr) {
        ((ar.f) this.f54687d.f4946d).a(j11, fArr);
    }

    @Override // w7.a
    public final void b() {
        this.f54688e.c();
        bq.f fVar = this.f54687d;
        ((ar.f) fVar.f4946d).c();
        fVar.f4943a = false;
        this.f54685b.set(true);
    }

    @Override // v7.t
    public final void c(long j11, long j12, p pVar, MediaFormat mediaFormat) {
        int i11;
        ArrayList arrayListH;
        this.f54688e.a(j12, Long.valueOf(j11));
        byte[] bArr = pVar.B;
        int i12 = pVar.C;
        byte[] bArr2 = this.O;
        int i13 = this.N;
        this.O = bArr;
        if (i12 == -1) {
            i12 = this.M;
        }
        this.N = i12;
        if (i13 == i12 && Arrays.equals(bArr2, this.O)) {
            return;
        }
        byte[] bArr3 = this.O;
        f fVar = null;
        if (bArr3 != null) {
            int i14 = this.N;
            w wVar = new w(bArr3);
            try {
                wVar.J(4);
                int iJ = wVar.j();
                wVar.I(0);
                if (iJ == 1886547818) {
                    wVar.J(8);
                    int i15 = wVar.f4040b;
                    int i16 = wVar.f4041c;
                    while (true) {
                        if (i15 < i16) {
                            int iJ2 = wVar.j() + i15;
                            if (iJ2 > i15 && iJ2 <= i16) {
                                int iJ3 = wVar.j();
                                if (iJ3 != 2037673328 && iJ3 != 1836279920) {
                                    wVar.I(iJ2);
                                    i15 = iJ2;
                                }
                                wVar.H(iJ2);
                                arrayListH = ff.h.H(wVar);
                            }
                        }
                        arrayListH = null;
                    }
                } else {
                    arrayListH = ff.h.H(wVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListH != null) {
                int size = arrayListH.size();
                if (size == 1) {
                    e eVar = (e) arrayListH.get(0);
                    fVar = new f(eVar, eVar, i14);
                } else if (size == 2) {
                    fVar = new f((e) arrayListH.get(0), (e) arrayListH.get(1), i14);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i17 = this.N;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f5 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            for (int i22 = 36; i18 < i22; i22 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i18 * f5) - f12;
                int i23 = i18 + 1;
                float f14 = (i23 * f5) - f12;
                int i24 = 0;
                while (i24 < 73) {
                    int i25 = i23;
                    float f15 = f14;
                    float f16 = radians;
                    int i26 = i19;
                    int i27 = i21;
                    int i28 = 0;
                    int i29 = 2;
                    while (i28 < i29) {
                        float f17 = i28 == 0 ? f13 : f15;
                        float f18 = radians2;
                        float f19 = i24 * f11;
                        float f21 = f13;
                        float f22 = f5;
                        double d5 = 50.0f;
                        double d11 = (f19 + 3.1415927f) - (f18 / 2.0f);
                        double d12 = f17;
                        fArr[i26] = -((float) (Math.cos(d12) * Math.sin(d11) * d5));
                        fArr[i26 + 1] = (float) (Math.sin(d12) * d5);
                        int i30 = i26 + 3;
                        fArr[i26 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d5);
                        fArr2[i27] = f19 / f18;
                        int i31 = i27 + 2;
                        fArr2[i27 + 1] = ((i18 + i28) * f22) / f16;
                        if ((i24 == 0 && i28 == 0) || (i24 == 72 && i28 == 1)) {
                            System.arraycopy(fArr, i26, fArr, i30, 3);
                            i26 += 6;
                            i11 = 2;
                            System.arraycopy(fArr2, i27, fArr2, i31, 2);
                            i27 += 4;
                        } else {
                            i11 = 2;
                            i26 = i30;
                            i27 = i31;
                        }
                        i28++;
                        i29 = i11;
                        radians2 = f18;
                        f13 = f21;
                        f5 = f22;
                    }
                    i24++;
                    i19 = i26;
                    i21 = i27;
                    i23 = i25;
                    f14 = f15;
                    radians = f16;
                    radians2 = radians2;
                    f5 = f5;
                }
                i18 = i23;
            }
            e eVar2 = new e(new ar.f(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i17);
        }
        this.f54689f.a(j12, fVar);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            b7.a.e();
            this.f54686c.a();
            b7.a.e();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            b7.a.e();
            int i11 = iArr[0];
            b7.a.b(36197, i11);
            this.K = i11;
        } catch (GlUtil$GlException e8) {
            b7.a.p("Failed to initialize the renderer", e8);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.K);
        this.L = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: w7.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f54683a.f54684a.set(true);
            }
        });
        return this.L;
    }
}
