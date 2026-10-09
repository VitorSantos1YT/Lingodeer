package w9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ka.f, ka.e {
    public static final TreeMap K = new TreeMap();
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f54865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f54866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f54867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f54868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f54869f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f54870t;

    public u(int i11) {
        this.f54864a = i11;
        int i12 = i11 + 1;
        this.f54870t = new int[i12];
        this.f54866c = new long[i12];
        this.f54867d = new double[i12];
        this.f54868e = new String[i12];
        this.f54869f = new byte[i12][];
    }

    public static final u b(int i11, String query) {
        kotlin.jvm.internal.m.f(query, "query");
        TreeMap treeMap = K;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
            if (entryCeilingEntry == null) {
                u uVar = new u(i11);
                uVar.f54865b = query;
                uVar.H = i11;
                return uVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            u uVar2 = (u) entryCeilingEntry.getValue();
            uVar2.getClass();
            uVar2.f54865b = query;
            uVar2.H = i11;
            return uVar2;
        }
    }

    @Override // ka.e
    public final void L(int i11, double d5) {
        this.f54870t[i11] = 3;
        this.f54867d[i11] = d5;
    }

    @Override // ka.f
    public final String a() {
        String str = this.f54865b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // ka.f
    public final void c(ka.e eVar) {
        int i11 = this.H;
        if (1 > i11) {
            return;
        }
        int i12 = 1;
        while (true) {
            int i13 = this.f54870t[i12];
            if (i13 == 1) {
                eVar.s(i12);
            } else if (i13 == 2) {
                eVar.g(i12, this.f54866c[i12]);
            } else if (i13 == 3) {
                eVar.L(i12, this.f54867d[i12]);
            } else if (i13 == 4) {
                String str = this.f54868e[i12];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.l(i12, str);
            } else if (i13 == 5) {
                byte[] bArr = this.f54869f[i12];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.t0(bArr, i12);
            }
            if (i12 == i11) {
                return;
            } else {
                i12++;
            }
        }
    }

    @Override // ka.e
    public final void g(int i11, long j11) {
        this.f54870t[i11] = 2;
        this.f54866c[i11] = j11;
    }

    @Override // ka.e
    public final void l(int i11, String value) {
        kotlin.jvm.internal.m.f(value, "value");
        this.f54870t[i11] = 4;
        this.f54868e[i11] = value;
    }

    public final void release() {
        TreeMap treeMap = K;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f54864a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.m.e(it, "iterator(...)");
                while (true) {
                    int i11 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i11;
                }
            }
        }
    }

    @Override // ka.e
    public final void s(int i11) {
        this.f54870t[i11] = 1;
    }

    @Override // ka.e
    public final void t0(byte[] bArr, int i11) {
        this.f54870t[i11] = 5;
        this.f54869f[i11] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
