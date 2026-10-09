package u1;

import y.e0;
import y.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52724c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52722a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f52725d = new i0();

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:5:0x000d->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[EDGE_INSN: B:23:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0051], SYNTHETIC] */
    public final void a() {
        i0 i0Var = this.f52725d;
        Object[] objArr = i0Var.f56715c;
        long[] jArr = i0Var.f56713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (obj instanceof e0) {
                                e0 e0Var = (e0) obj;
                                Object[] objArr2 = e0Var.f56686a;
                                int i14 = e0Var.f56687b;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    Object obj2 = objArr2[i15];
                                }
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        i0Var.a();
    }
}
