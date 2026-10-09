package z2;

import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.x f58725a;

    public x1() {
        y.x xVar = y.n.f56742a;
        this.f58725a = new y.x();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        y.x xVar = this.f58725a;
        int[] iArr = xVar.f56737b;
        Object[] objArr = xVar.f56738c;
        long[] jArr = xVar.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        int i16 = iArr[i15];
                        y.e0 e0Var = (y.e0) objArr[i15];
                        Object[] objArr2 = e0Var.f56686a;
                        int i17 = e0Var.f56687b;
                        int i18 = 0;
                        while (i18 < i17) {
                            w1 w1Var = (w1) objArr2[i18];
                            int i19 = i12;
                            l1.h hVar = w1Var.f58698d;
                            if (hVar != null) {
                                hVar.cancel();
                            }
                            w1Var.f58698d = null;
                            u1.c cVar = (u1.c) w1Var.f58695a.f52454b;
                            cVar.f52723b = true;
                            cVar.f52722a = false;
                            cVar.a();
                            i18++;
                            i12 = i19;
                        }
                    }
                    int i21 = i12;
                    j11 >>= i21;
                    i14++;
                    i12 = i21;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }
}
