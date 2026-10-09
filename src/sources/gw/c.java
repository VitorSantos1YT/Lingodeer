package gw;

import hh.p0;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f29882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f29883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29885d;

    @Override // gw.b
    public final void a(fw.b bVar, Random random) {
        float fNextFloat = random.nextFloat();
        float f5 = this.f29883b;
        float f11 = this.f29882a;
        float fA = p0.a(f5, f11, fNextFloat, f11);
        int i11 = this.f29885d;
        int iNextInt = this.f29884c;
        if (i11 != iNextInt) {
            iNextInt += random.nextInt(i11 - iNextInt);
        }
        double d5 = fA;
        double d11 = (float) ((((double) iNextInt) * 3.141592653589793d) / 180.0d);
        bVar.f28212g = (float) (Math.cos(d11) * d5);
        bVar.f28213h = (float) (Math.sin(d11) * d5);
    }
}
