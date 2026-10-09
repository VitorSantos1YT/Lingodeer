package ks;

import java.util.Set;
import kotlin.jvm.internal.m;
import lz.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38637a = new g(1, 5, 1);

    public static int a(int i11, Set owned) {
        m.f(owned, "owned");
        if (i11 != -1 && 1 <= i11 && i11 < 11) {
            g gVar = f38637a;
            int i12 = gVar.f40532a;
            if (i11 > gVar.f40533b || i12 > i11 || owned.contains(Integer.valueOf(i11))) {
                return i11;
            }
        }
        return -1;
    }
}
