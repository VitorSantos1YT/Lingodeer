package com.google.zxing.pdf417.decoder.ec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ModulusGF {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21559c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21560a = new int[929];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21561b = new int[929];

    static {
        new ModulusGF();
    }

    public ModulusGF() {
        int i11 = 1;
        for (int i12 = 0; i12 < 929; i12++) {
            this.f21560a[i12] = i11;
            i11 = (i11 * 3) % 929;
        }
        for (int i13 = 0; i13 < 928; i13++) {
            this.f21561b[this.f21560a[i13]] = i13;
        }
        new ModulusPoly(new int[]{0});
        new ModulusPoly(new int[]{1});
    }
}
