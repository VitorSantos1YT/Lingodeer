package l2;

import android.graphics.Bitmap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f39589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dg.e f39592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.n f39593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f39594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g2.p f39595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f39596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f39598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f39599l;
    public final d0 m;

    public e0(b bVar) {
        this.f39589b = bVar;
        bVar.f39541i = new d0(this, 0);
        this.f39590c = BuildConfig.VERSION_NAME;
        this.f39591d = true;
        this.f39592e = new dg.e();
        this.f39593f = g.f39605c;
        this.f39594g = l1.t.B(null);
        this.f39596i = l1.t.B(new f2.e(0L));
        this.f39597j = 9205357640488583168L;
        this.f39598k = 1.0f;
        this.f39599l = 1.0f;
        this.m = new d0(this, 1);
    }

    @Override // l2.c0
    public final void a(i2.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    public final void e(i2.d dVar, float f5, g2.p pVar) {
        int i11;
        g2.p pVar2;
        g2.h hVarG;
        char c11;
        long j11;
        long jC;
        int iD;
        int i12;
        int i13;
        g2.p pVar3 = pVar;
        b bVar = this.f39589b;
        boolean z11 = bVar.f39536d;
        k1 k1Var = this.f39594g;
        if (!z11 || bVar.f39537e == 16) {
            i11 = 0;
        } else {
            g2.p pVar4 = (g2.p) k1Var.getValue();
            int i14 = h0.f39633a;
            if (!(pVar4 instanceof g2.p) ? pVar4 == null : (i13 = pVar4.f28591c) == 5 || i13 == 3) {
                i11 = 0;
            } else if (!(pVar3 instanceof g2.p) ? pVar3 == null : (i12 = pVar3.f28591c) == 5 || i12 == 3) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        }
        boolean z12 = this.f39591d;
        dg.e eVar = this.f39592e;
        if (z12 || !f2.e.a(this.f39597j, dVar.d())) {
            if (i11 == 1) {
                jC = bVar.f39537e;
                int i15 = h0.f39633a;
                if (g2.x.e(jC) != 1.0f) {
                    jC = g2.x.c(jC, 1.0f);
                }
                pVar2 = new g2.p(jC, 5);
            } else {
                pVar2 = null;
            }
            this.f39595h = pVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
            k1 k1Var2 = this.f39596i;
            this.f39598k = fIntBitsToFloat / Float.intBitsToFloat((int) (((f2.e) k1Var2.getValue()).f26584a >> 32));
            this.f39599l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((f2.e) k1Var2.getValue()).f26584a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L))))) & 4294967295L);
            v3.m layoutDirection = dVar.getLayoutDirection();
            hVarG = (g2.h) eVar.f23421c;
            g2.c cVarA = (g2.c) eVar.f23422d;
            if (hVarG != null || cVarA == null) {
                c11 = ' ';
                j11 = 4294967295L;
            } else {
                int i16 = (int) (jCeil >> 32);
                Bitmap bitmap = hVarG.f28568a;
                c11 = ' ';
                j11 = 4294967295L;
                if (i16 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || eVar.f23420b != i11) {
                }
                eVar.f23419a = jCeil;
                i2.b bVar2 = (i2.b) eVar.f23423e;
                long jP = ff.h.P(jCeil);
                i2.a aVar = bVar2.f34120a;
                v3.c cVar = aVar.f34116a;
                v3.m mVar = aVar.f34117b;
                g2.v vVar = aVar.f34118c;
                g2.c cVar2 = cVarA;
                long j12 = aVar.f34119d;
                aVar.f34116a = dVar;
                aVar.f34117b = layoutDirection;
                aVar.f34118c = cVar2;
                aVar.f34119d = jP;
                cVar2.e();
                i2.d.U(bVar2, g2.x.f28615b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 62);
                this.m.invoke(bVar2);
                cVar2.p();
                i2.a aVar2 = bVar2.f34120a;
                aVar2.f34116a = cVar;
                aVar2.f34117b = mVar;
                aVar2.f34118c = vVar;
                aVar2.f34119d = j12;
                hVarG.f28568a.prepareToDraw();
                this.f39591d = false;
                this.f39597j = dVar.d();
            }
            hVarG = g2.f0.g((int) (jCeil >> c11), (int) (jCeil & j11), i11);
            cVarA = g2.f0.a(hVarG);
            eVar.f23421c = hVarG;
            eVar.f23422d = cVarA;
            eVar.f23420b = i11;
            eVar.f23419a = jCeil;
            i2.b bVar3 = (i2.b) eVar.f23423e;
            long jP2 = ff.h.P(jCeil);
            i2.a aVar3 = bVar3.f34120a;
            v3.c cVar3 = aVar3.f34116a;
            v3.m mVar2 = aVar3.f34117b;
            g2.v vVar2 = aVar3.f34118c;
            g2.c cVar4 = cVarA;
            long j13 = aVar3.f34119d;
            aVar3.f34116a = dVar;
            aVar3.f34117b = layoutDirection;
            aVar3.f34118c = cVar4;
            aVar3.f34119d = jP2;
            cVar4.e();
            i2.d.U(bVar3, g2.x.f28615b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 62);
            this.m.invoke(bVar3);
            cVar4.p();
            i2.a aVar4 = bVar3.f34120a;
            aVar4.f34116a = cVar3;
            aVar4.f34117b = mVar2;
            aVar4.f34118c = vVar2;
            aVar4.f34119d = j13;
            hVarG.f28568a.prepareToDraw();
            this.f39591d = false;
            this.f39597j = dVar.d();
        } else {
            g2.h hVar = (g2.h) eVar.f23421c;
            if (hVar != null) {
                Bitmap.Config config = hVar.f28568a.getConfig();
                kotlin.jvm.internal.m.c(config);
                iD = g2.i.d(config);
            } else {
                iD = 0;
            }
            if (i11 != iD) {
                if (i11 == 1) {
                    jC = bVar.f39537e;
                    int i17 = h0.f39633a;
                    if (g2.x.e(jC) != 1.0f) {
                        jC = g2.x.c(jC, 1.0f);
                    }
                    pVar2 = new g2.p(jC, 5);
                } else {
                    pVar2 = null;
                }
                this.f39595h = pVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() >> 32));
                k1 k1Var3 = this.f39596i;
                this.f39598k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((f2.e) k1Var3.getValue()).f26584a >> 32));
                this.f39599l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((f2.e) k1Var3.getValue()).f26584a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L))))) & 4294967295L);
                v3.m layoutDirection2 = dVar.getLayoutDirection();
                hVarG = (g2.h) eVar.f23421c;
                g2.c cVarA2 = (g2.c) eVar.f23422d;
                if (hVarG != null) {
                    c11 = ' ';
                    j11 = 4294967295L;
                    hVarG = g2.f0.g((int) (jCeil2 >> c11), (int) (jCeil2 & j11), i11);
                    cVarA2 = g2.f0.a(hVarG);
                    eVar.f23421c = hVarG;
                    eVar.f23422d = cVarA2;
                    eVar.f23420b = i11;
                } else {
                    c11 = ' ';
                    j11 = 4294967295L;
                    hVarG = g2.f0.g((int) (jCeil2 >> c11), (int) (jCeil2 & j11), i11);
                    cVarA2 = g2.f0.a(hVarG);
                    eVar.f23421c = hVarG;
                    eVar.f23422d = cVarA2;
                    eVar.f23420b = i11;
                }
                eVar.f23419a = jCeil2;
                i2.b bVar4 = (i2.b) eVar.f23423e;
                long jP3 = ff.h.P(jCeil2);
                i2.a aVar5 = bVar4.f34120a;
                v3.c cVar5 = aVar5.f34116a;
                v3.m mVar3 = aVar5.f34117b;
                g2.v vVar3 = aVar5.f34118c;
                g2.c cVar6 = cVarA2;
                long j14 = aVar5.f34119d;
                aVar5.f34116a = dVar;
                aVar5.f34117b = layoutDirection2;
                aVar5.f34118c = cVar6;
                aVar5.f34119d = jP3;
                cVar6.e();
                i2.d.U(bVar4, g2.x.f28615b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 62);
                this.m.invoke(bVar4);
                cVar6.p();
                i2.a aVar6 = bVar4.f34120a;
                aVar6.f34116a = cVar5;
                aVar6.f34117b = mVar3;
                aVar6.f34118c = vVar3;
                aVar6.f34119d = j14;
                hVarG.f28568a.prepareToDraw();
                this.f39591d = false;
                this.f39597j = dVar.d();
            }
        }
        if (pVar3 == null) {
            pVar3 = ((g2.p) k1Var.getValue()) != null ? (g2.p) k1Var.getValue() : this.f39595h;
        }
        g2.p pVar5 = pVar3;
        g2.h hVar2 = (g2.h) eVar.f23421c;
        if (hVar2 == null) {
            v2.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        i2.d.t0(dVar, hVar2, eVar.f23419a, 0L, f5, pVar5, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f39590c);
        sb2.append("\n\tviewportWidth: ");
        k1 k1Var = this.f39596i;
        sb2.append(Float.intBitsToFloat((int) (((f2.e) k1Var.getValue()).f26584a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((f2.e) k1Var.getValue()).f26584a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
