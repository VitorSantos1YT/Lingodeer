package pt;

import java.util.Set;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f47146a = l.m0(new Integer[]{51, 55, 57, 61, 63});

    public static final int a(int i11, int i12) {
        if (l.D(new Integer[]{12, 1}, Integer.valueOf(i11))) {
            if (i12 == 0 || i12 == 1) {
                return 1;
            }
            if (i12 == 3 || i12 == 4 || i12 == 5) {
                return 2;
            }
            return i12 != 6 ? -1 : 3;
        }
        if (l.D(new Integer[]{11, 0}, Integer.valueOf(i11))) {
            if (i12 == 0 || i12 == 1) {
                return 1;
            }
            if (i12 != 2) {
                return i12 != 3 ? -1 : 3;
            }
            return 2;
        }
        if (l.D(new Integer[]{13, 2}, Integer.valueOf(i11))) {
            if (i12 == 0 || i12 == 1) {
                return 1;
            }
            return i12 != 2 ? -1 : 2;
        }
        if (!f47146a.contains(Integer.valueOf(i11))) {
            return -1;
        }
        if (i12 != 0) {
            return i12 != 1 ? -1 : 2;
        }
        return 1;
    }
}
