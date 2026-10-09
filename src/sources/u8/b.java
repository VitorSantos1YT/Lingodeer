package u8;

import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ordering f52822c = Ordering.c().f(new a7.c(13));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f52823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f52824b;

    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List list) {
        if (list.size() == 1) {
            a aVar = (a) Iterables.d((AbstractCollection) list);
            long j11 = aVar.f52819b;
            ImmutableList immutableList = aVar.f52818a;
            long j12 = aVar.f52820c;
            long j13 = j11 == -9223372036854775807L ? 0L : j11;
            if (j12 == -9223372036854775807L) {
                this.f52823a = ImmutableList.u(immutableList);
                this.f52824b = new long[]{j13};
                return;
            } else {
                this.f52823a = ImmutableList.v(immutableList, ImmutableList.s());
                this.f52824b = new long[]{j13, j12 + j13};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f52824b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListZ = ImmutableList.z(f52822c, list);
        int i11 = 0;
        for (int i12 = 0; i12 < immutableListZ.size(); i12++) {
            a aVar2 = (a) immutableListZ.get(i12);
            long j14 = aVar2.f52819b;
            long j15 = aVar2.f52820c;
            ImmutableList immutableList2 = aVar2.f52818a;
            j14 = j14 == -9223372036854775807L ? 0L : j14;
            long j16 = j14 + j15;
            if (i11 != 0) {
                int i13 = i11 - 1;
                long j17 = this.f52824b[i13];
                if (j17 < j14) {
                    this.f52824b[i11] = j14;
                    arrayList.add(immutableList2);
                    i11++;
                } else if (j17 == j14 && ((ImmutableList) arrayList.get(i13)).isEmpty()) {
                    arrayList.set(i13, immutableList2);
                } else {
                    b7.a.B("Truncating unsupported overlapping cues.");
                    this.f52824b[i13] = j14;
                    arrayList.set(i13, immutableList2);
                }
            } else {
                this.f52824b[i11] = j14;
                arrayList.add(immutableList2);
                i11++;
            }
            if (j15 != -9223372036854775807L) {
                this.f52824b[i11] = j16;
                arrayList.add(ImmutableList.s());
                i11++;
            }
        }
        this.f52823a = ImmutableList.n(arrayList);
    }

    @Override // u8.d
    public final int f(long j11) {
        int iA = f0.a(this.f52824b, j11, false);
        if (iA < this.f52823a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // u8.d
    public final long j(int i11) {
        b7.a.d(i11 < this.f52823a.size());
        return this.f52824b[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u8.d
    public final List p(long j11) {
        int iD = f0.d(this.f52824b, j11, false);
        return iD == -1 ? ImmutableList.s() : (ImmutableList) this.f52823a.get(iD);
    }

    @Override // u8.d
    public final int s() {
        return this.f52823a.size();
    }
}
