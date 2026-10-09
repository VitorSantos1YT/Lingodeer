package c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends v10.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f6539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f6540k;

    @Override // v10.c
    public final double p(double d5) {
        return this.f6540k[0];
    }

    @Override // v10.c
    public final void q(double d5, double[] dArr) {
        double[] dArr2 = this.f6540k;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // v10.c
    public final void r(double d5, float[] fArr) {
        int i11 = 0;
        while (true) {
            double[] dArr = this.f6540k;
            if (i11 >= dArr.length) {
                return;
            }
            fArr[i11] = (float) dArr[i11];
            i11++;
        }
    }

    @Override // v10.c
    public final double t(double d5) {
        return 0.0d;
    }

    @Override // v10.c
    public final void u(double d5, double[] dArr) {
        for (int i11 = 0; i11 < this.f6540k.length; i11++) {
            dArr[i11] = 0.0d;
        }
    }

    @Override // v10.c
    public final double[] w() {
        return new double[]{this.f6539j};
    }
}
