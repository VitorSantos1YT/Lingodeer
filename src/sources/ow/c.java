package ow;

import fr.p3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import m00.d0;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f46100b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46099a = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f46103e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46104f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46105g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46106h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46101c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46102d = 4096;

    public c(e eVar) {
        this.f46100b = m00.b.c(eVar);
    }

    public final int a(int i11) {
        int i12;
        int i13 = 0;
        if (i11 > 0) {
            int length = this.f46103e.length;
            while (true) {
                length--;
                i12 = this.f46104f;
                if (length < i12 || i11 <= 0) {
                    break;
                }
                int i14 = this.f46103e[length].f46098c;
                i11 -= i14;
                this.f46106h -= i14;
                this.f46105g--;
                i13++;
            }
            b[] bVarArr = this.f46103e;
            System.arraycopy(bVarArr, i12 + 1, bVarArr, i12 + 1 + i13, this.f46105g);
            this.f46104f += i13;
        }
        return i13;
    }

    public final l b(int i11) throws IOException {
        if (i11 >= 0) {
            b[] bVarArr = d.f46108b;
            if (i11 <= bVarArr.length - 1) {
                return bVarArr[i11].f46096a;
            }
        }
        int length = this.f46104f + 1 + (i11 - d.f46108b.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f46103e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f46096a;
            }
        }
        throw new IOException("Header index too large " + (i11 + 1));
    }

    public final void c(b bVar) {
        this.f46099a.add(bVar);
        int i11 = bVar.f46098c;
        int i12 = this.f46102d;
        if (i11 > i12) {
            Arrays.fill(this.f46103e, (Object) null);
            this.f46104f = this.f46103e.length - 1;
            this.f46105g = 0;
            this.f46106h = 0;
            return;
        }
        a((this.f46106h + i11) - i12);
        int i13 = this.f46105g + 1;
        b[] bVarArr = this.f46103e;
        if (i13 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f46104f = this.f46103e.length - 1;
            this.f46103e = bVarArr2;
        }
        int i14 = this.f46104f;
        this.f46104f = i14 - 1;
        this.f46103e[i14] = bVar;
        this.f46105g++;
        this.f46106h += i11;
    }

    public final l d() {
        d0 d0Var = this.f46100b;
        byte b3 = d0Var.readByte();
        int i11 = b3 & 255;
        boolean z11 = (b3 & 128) == 128;
        int iE = e(i11, 127);
        if (!z11) {
            return d0Var.z(iE);
        }
        j jVar = j.f46131d;
        long j11 = iE;
        d0Var.s1(j11);
        byte[] bArrX = d0Var.f40691b.x(j11);
        jVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b.a aVar = jVar.f46132a;
        b.a aVar2 = aVar;
        int i12 = 0;
        int i13 = 0;
        for (byte b11 : bArrX) {
            i12 = (i12 << 8) | (b11 & 255);
            i13 += 8;
            while (i13 >= 8) {
                aVar2 = ((b.a[]) aVar2.f3415c)[(i12 >>> (i13 - 8)) & 255];
                if (((b.a[]) aVar2.f3415c) == null) {
                    byteArrayOutputStream.write(aVar2.f3413a);
                    i13 -= aVar2.f3414b;
                    aVar2 = aVar;
                } else {
                    i13 -= 8;
                }
            }
        }
        while (i13 > 0) {
            b.a aVar3 = ((b.a[]) aVar2.f3415c)[(i12 << (8 - i13)) & 255];
            b.a[] aVarArr = (b.a[]) aVar3.f3415c;
            int i14 = aVar3.f3414b;
            if (aVarArr != null || i14 > i13) {
                break;
            }
            byteArrayOutputStream.write(aVar3.f3413a);
            i13 -= i14;
            aVar2 = aVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l lVar = l.f40723d;
        return p3.u(byteArray);
    }

    public final int e(int i11, int i12) {
        int i13 = i11 & i12;
        if (i13 < i12) {
            return i13;
        }
        int i14 = 0;
        while (true) {
            byte b3 = this.f46100b.readByte();
            int i15 = b3 & 255;
            if ((b3 & 128) == 0) {
                return i12 + (i15 << i14);
            }
            i12 += (b3 & 127) << i14;
            i14 += 7;
        }
    }
}
