package r7;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ordering f48831b = Ordering.c().f(new a7.c(8)).a(Ordering.c().g().f(new a7.c(9)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48832a = new ArrayList();

    @Override // r7.a
    public final long a(long j11) {
        int i11 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f48832a;
            if (i11 >= arrayList.size()) {
                break;
            }
            long j12 = ((u8.a) arrayList.get(i11)).f52819b;
            long j13 = ((u8.a) arrayList.get(i11)).f52821d;
            if (j11 < j12) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j12);
                    break;
                }
                jMin = j12;
                break;
            }
            if (j11 < j13) {
                jMin = jMin == -9223372036854775807L ? j13 : Math.min(jMin, j13);
            }
            i11++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r7.a
    public final ImmutableList b(long j11) {
        ArrayList arrayList = this.f48832a;
        if (!arrayList.isEmpty()) {
            if (j11 >= ((u8.a) arrayList.get(0)).f52819b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    u8.a aVar = (u8.a) arrayList.get(i11);
                    if (j11 >= aVar.f52819b && j11 < aVar.f52821d) {
                        arrayList2.add(aVar);
                    }
                    if (j11 < aVar.f52819b) {
                        break;
                    }
                }
                ImmutableList immutableListZ = ImmutableList.z(f48831b, arrayList2);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (int i12 = 0; i12 < immutableListZ.size(); i12++) {
                    builder.f(((u8.a) immutableListZ.get(i12)).f52818a);
                }
                return builder.j();
            }
        }
        return ImmutableList.s();
    }

    @Override // r7.a
    public final long c(long j11) {
        ArrayList arrayList = this.f48832a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j11 < ((u8.a) arrayList.get(0)).f52819b) {
            return -9223372036854775807L;
        }
        long jMax = ((u8.a) arrayList.get(0)).f52819b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long j12 = ((u8.a) arrayList.get(i11)).f52819b;
            long j13 = ((u8.a) arrayList.get(i11)).f52821d;
            if (j13 > j11) {
                if (j12 > j11) {
                    break;
                }
                jMax = Math.max(jMax, j12);
            } else {
                jMax = Math.max(jMax, j13);
            }
        }
        return jMax;
    }

    @Override // r7.a
    public final void clear() {
        this.f48832a.clear();
    }

    @Override // r7.a
    public final boolean d(u8.a aVar, long j11) {
        long j12 = aVar.f52819b;
        b7.a.d(j12 != -9223372036854775807L);
        b7.a.d(aVar.f52820c != -9223372036854775807L);
        boolean z11 = j12 <= j11 && j11 < aVar.f52821d;
        ArrayList arrayList = this.f48832a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j12 >= ((u8.a) arrayList.get(size)).f52819b) {
                arrayList.add(size + 1, aVar);
                return z11;
            }
        }
        arrayList.add(0, aVar);
        return z11;
    }

    @Override // r7.a
    public final void e(long j11) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f48832a;
            if (i11 >= arrayList.size()) {
                return;
            }
            long j12 = ((u8.a) arrayList.get(i11)).f52819b;
            if (j11 > j12 && j11 > ((u8.a) arrayList.get(i11)).f52821d) {
                arrayList.remove(i11);
                i11--;
            } else if (j11 < j12) {
                return;
            }
            i11++;
        }
    }
}
