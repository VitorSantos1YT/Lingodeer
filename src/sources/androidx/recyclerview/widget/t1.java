package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f2618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f2620c;

    public final s1 a(int i11) {
        SparseArray sparseArray = this.f2618a;
        s1 s1Var = (s1) sparseArray.get(i11);
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1();
        sparseArray.put(i11, s1Var2);
        return s1Var2;
    }
}
