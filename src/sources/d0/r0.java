package d0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements g2.w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f22790b = new r0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f22791c = new r0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22792a;

    public /* synthetic */ r0(int i11) {
        this.f22792a = i11;
    }

    @Override // g2.w0
    public final g2.f0 a(long j11, v3.m mVar, v3.c cVar) {
        switch (this.f22792a) {
            case 0:
                float fN0 = cVar.n0(b0.f22640a);
                return new g2.m0(new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, -fN0, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) + fN0));
            default:
                float fN1 = cVar.n0(b0.f22640a);
                return new g2.m0(new f2.c(-fN1, CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j11 >> 32)) + fN1, Float.intBitsToFloat((int) (j11 & 4294967295L))));
        }
    }
}
