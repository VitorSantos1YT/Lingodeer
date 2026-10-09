package sd;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f51556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f51557c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f51555a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51558d = 0;

    public final boolean a() {
        return this.f51557c.f51545b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f51556b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f51557c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f51557c.f51549f = this.f51556b.getShort();
            this.f51557c.f51550g = this.f51556b.getShort();
            int iC = c();
            b bVar = this.f51557c;
            bVar.f51551h = (iC & 128) != 0;
            bVar.f51552i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f51557c.f51553j = c();
            b bVar2 = this.f51557c;
            c();
            bVar2.getClass();
            if (this.f51557c.f51551h && !a()) {
                b bVar3 = this.f51557c;
                bVar3.f51544a = e(bVar3.f51552i);
                b bVar4 = this.f51557c;
                bVar4.f51554k = bVar4.f51544a[bVar4.f51553j];
            }
        } else {
            this.f51557c.f51545b = 1;
        }
        if (!a()) {
            boolean z11 = false;
            while (!z11 && !a() && this.f51557c.f51546c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f51557c.f51547d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f51557c.f51547d;
                        int i12 = (iC4 & 28) >> 2;
                        aVar.f51539g = i12;
                        if (i12 == 0) {
                            aVar.f51539g = 1;
                        }
                        aVar.f51538f = (iC4 & 1) != 0;
                        short s3 = this.f51556b.getShort();
                        if (s3 < 2) {
                            s3 = 10;
                        }
                        a aVar2 = this.f51557c.f51547d;
                        aVar2.f51541i = s3 * 10;
                        aVar2.f51540h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i13 = 0;
                        while (true) {
                            bArr = this.f51555a;
                            if (i13 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i13]);
                            i13++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b3 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f51557c.getClass();
                                }
                                if (this.f51558d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f51557c;
                    if (bVar5.f51547d == null) {
                        bVar5.f51547d = new a();
                    }
                    bVar5.f51547d.f51533a = this.f51556b.getShort();
                    this.f51557c.f51547d.f51534b = this.f51556b.getShort();
                    this.f51557c.f51547d.f51535c = this.f51556b.getShort();
                    this.f51557c.f51547d.f51536d = this.f51556b.getShort();
                    int iC5 = c();
                    boolean z12 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f51557c.f51547d;
                    aVar3.f51537e = (iC5 & 64) != 0;
                    if (z12) {
                        aVar3.f51543k = e(iPow);
                    } else {
                        aVar3.f51543k = null;
                    }
                    this.f51557c.f51547d.f51542j = this.f51556b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f51557c;
                        bVar6.f51546c++;
                        bVar6.f51548e.add(bVar6.f51547d);
                    }
                } else if (iC2 != 59) {
                    this.f51557c.f51545b = 1;
                } else {
                    z11 = true;
                }
            }
            b bVar7 = this.f51557c;
            if (bVar7.f51546c < 0) {
                bVar7.f51545b = 1;
            }
        }
        return this.f51557c;
    }

    public final int c() {
        try {
            return this.f51556b.get() & 255;
        } catch (Exception unused) {
            this.f51557c.f51545b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f51558d = iC;
        if (iC <= 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f51558d;
                if (i11 >= i12) {
                    return;
                }
                int i13 = i12 - i11;
                this.f51556b.get(this.f51555a, i11, i13);
                i11 += i13;
            } catch (Exception unused) {
                this.f51557c.f51545b = 1;
                return;
            }
        }
    }

    public final int[] e(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f51556b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f51557c.f51545b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f51556b.position(Math.min(this.f51556b.position() + iC, this.f51556b.limit()));
        } while (iC > 0);
    }
}
