package k3;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f37905a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f37906b = a(0, 0);

    public static final long a(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final TextDirectionHeuristic b(int i11) {
        if (i11 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i11 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i11 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i11 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i11 != 4) {
            return i11 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
