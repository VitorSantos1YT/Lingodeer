package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Types {
    }

    public abstract long D1();

    public abstract int E1();

    public abstract String F1();

    public final String toString() {
        long jD1 = D1();
        int iE1 = E1();
        String strF1 = F1();
        int length = String.valueOf(jD1).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(iE1).length() + 3 + strF1.length());
        sb2.append(jD1);
        sb2.append("\t");
        sb2.append(iE1);
        return a.k(sb2, "\t-1", strF1);
    }
}
