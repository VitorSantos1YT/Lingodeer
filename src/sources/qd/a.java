package qd;

import gu.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f47700e = new g(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f47702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47704d;

    public a(int i11, ArrayList arrayList, int i12, InputStream inputStream) {
        this.f47701a = i11;
        this.f47702b = arrayList;
        this.f47703c = i12;
        this.f47704d = inputStream;
    }

    public synchronized byte[] a(int i11) {
        for (int i12 = 0; i12 < ((ArrayList) this.f47704d).size(); i12++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f47704d).get(i12);
            if (bArr.length >= i11) {
                this.f47701a -= bArr.length;
                ((ArrayList) this.f47704d).remove(i12);
                this.f47702b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i11];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f47703c) {
                this.f47702b.add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.f47704d, bArr, f47700e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.f47704d).add(iBinarySearch, bArr);
                this.f47701a += bArr.length;
                synchronized (this) {
                    while (this.f47701a > this.f47703c) {
                        byte[] bArr2 = (byte[]) this.f47702b.remove(0);
                        ((ArrayList) this.f47704d).remove(bArr2);
                        this.f47701a -= bArr2.length;
                    }
                }
            }
        }
    }

    public a() {
        this.f47702b = new ArrayList();
        this.f47704d = new ArrayList(64);
        this.f47701a = 0;
        this.f47703c = 4096;
    }
}
