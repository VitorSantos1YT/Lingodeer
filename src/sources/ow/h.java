package ow;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import m00.c0;
import m00.l;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f46122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00.i f46123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b10.b f46124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46126e;

    public h(c0 c0Var) {
        this.f46122a = c0Var;
        m00.i iVar = new m00.i();
        this.f46123b = iVar;
        this.f46124c = new b10.b(iVar);
        this.f46125d = 16384;
    }

    public final void a(int i11, int i12, byte b3, byte b11) {
        Logger logger = i.f46127a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f.a(false, i11, i12, b3, b11));
        }
        int i13 = this.f46125d;
        if (i12 > i13) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(p.p("FRAME_SIZE_ERROR length > ", i13, i12, ": "));
        }
        if ((Integer.MIN_VALUE & i11) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(p.j(i11, "reserved bit set: "));
        }
        c0 c0Var = this.f46122a;
        c0Var.writeByte((i12 >>> 16) & 255);
        c0Var.writeByte((i12 >>> 8) & 255);
        c0Var.writeByte(i12 & 255);
        c0Var.writeByte(b3 & 255);
        c0Var.writeByte(b11 & 255);
        c0Var.writeInt(i11 & Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public final void b(int i11, List list, boolean z11) throws IOException {
        int length;
        int length2;
        if (this.f46126e) {
            throw new IOException("closed");
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) list.get(i12);
            l lVarT = bVar.f46096a.t();
            l lVar = bVar.f46097b;
            Integer num = (Integer) d.f46109c.get(lVarT);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 < 2 || length2 > 7) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = d.f46108b;
                    if (bVarArr[iIntValue].f46097b.equals(lVar)) {
                        length = length2;
                    } else if (bVarArr[length2].f46097b.equals(lVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            b10.b bVar2 = this.f46124c;
            if (length2 == -1) {
                int i13 = bVar2.f3847b + 1;
                while (true) {
                    b[] bVarArr2 = (b[]) bVar2.f3850e;
                    if (i13 >= bVarArr2.length) {
                        break;
                    }
                    if (bVarArr2[i13].f46096a.equals(lVarT)) {
                        if (((b[]) bVar2.f3850e)[i13].f46097b.equals(lVar)) {
                            length2 = (i13 - bVar2.f3847b) + d.f46108b.length;
                            break;
                        } else if (length == -1) {
                            length = (i13 - bVar2.f3847b) + d.f46108b.length;
                        }
                    }
                    i13++;
                }
            }
            if (length2 != -1) {
                bVar2.s(length2, 127, 128);
            } else if (length == -1) {
                ((m00.i) bVar2.f3849d).J(64);
                bVar2.r(lVarT);
                bVar2.r(lVar);
                bVar2.g(bVar);
            } else if (!lVarT.p(d.f46107a) || b.f46095h.equals(lVarT)) {
                bVar2.s(length, 63, 64);
                bVar2.r(lVar);
                bVar2.g(bVar);
            } else {
                bVar2.s(length, 15, 0);
                bVar2.r(lVar);
            }
        }
        m00.i iVar = this.f46123b;
        long j11 = iVar.f40718b;
        int iMin = (int) Math.min(this.f46125d, j11);
        long j12 = iMin;
        byte b3 = j11 == j12 ? (byte) 4 : (byte) 0;
        if (z11) {
            b3 = (byte) (b3 | 1);
        }
        a(i11, iMin, (byte) 1, b3);
        c0 c0Var = this.f46122a;
        c0Var.K0(iVar, j12);
        if (j11 > j12) {
            long j13 = j11 - j12;
            while (j13 > 0) {
                int iMin2 = (int) Math.min(this.f46125d, j13);
                long j14 = iMin2;
                j13 -= j14;
                a(i11, iMin2, (byte) 9, j13 == 0 ? (byte) 4 : (byte) 0);
                c0Var.K0(iVar, j14);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f46126e = true;
        this.f46122a.close();
    }
}
