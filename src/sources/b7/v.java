package b7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f4032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4035e;

    public v() {
        this.f4031a = 0;
        this.f4032b = f0.f3976b;
    }

    public void a() {
        int i11;
        int i12;
        switch (this.f4031a) {
            case 0:
                int i13 = this.f4033c;
                a.j(i13 >= 0 && (i13 < (i11 = this.f4035e) || (i13 == i11 && this.f4034d == 0)));
                break;
            default:
                int i14 = this.f4034d;
                a.j(i14 >= 0 && (i14 < (i12 = this.f4033c) || (i14 == i12 && this.f4035e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f4035e - this.f4033c) * 8) - this.f4034d;
    }

    public void c() {
        if (this.f4034d == 0) {
            return;
        }
        this.f4034d = 0;
        this.f4033c++;
        a();
    }

    public boolean d(int i11) {
        int i12 = this.f4034d;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f4035e + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f4033c) {
                break;
            }
            if (r(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f4033c;
        if (i14 >= i16) {
            return i14 == i16 && i15 == 0;
        }
        return true;
    }

    public boolean e() {
        int i11 = this.f4034d;
        int i12 = this.f4035e;
        int i13 = 0;
        while (this.f4034d < this.f4033c && !h()) {
            i13++;
        }
        boolean z11 = this.f4034d == this.f4033c;
        this.f4034d = i11;
        this.f4035e = i12;
        return !z11 && d((i13 * 2) + 1);
    }

    public int f() {
        a.j(this.f4034d == 0);
        return this.f4033c;
    }

    public int g() {
        return (this.f4033c * 8) + this.f4034d;
    }

    public boolean h() {
        switch (this.f4031a) {
            case 0:
                boolean z11 = (this.f4032b[this.f4033c] & (128 >> this.f4034d)) != 0;
                s();
                return z11;
            case 1:
                boolean z12 = (this.f4032b[this.f4034d] & (128 >> this.f4035e)) != 0;
                s();
                return z12;
            default:
                boolean z13 = (((this.f4032b[this.f4034d] & 255) >> this.f4035e) & 1) == 1;
                t(1);
                return z13;
        }
    }

    public int i(int i11) {
        switch (this.f4031a) {
            case 0:
                if (i11 == 0) {
                    return 0;
                }
                this.f4034d += i11;
                int i12 = 0;
                while (true) {
                    int i13 = this.f4034d;
                    if (i13 <= 8) {
                        byte[] bArr = this.f4032b;
                        int i14 = this.f4033c;
                        int i15 = ((-1) >>> (32 - i11)) & (i12 | ((bArr[i14] & 255) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f4034d = 0;
                            this.f4033c = i14 + 1;
                        }
                        a();
                        return i15;
                    }
                    int i16 = i13 - 8;
                    this.f4034d = i16;
                    byte[] bArr2 = this.f4032b;
                    int i17 = this.f4033c;
                    this.f4033c = i17 + 1;
                    i12 |= (bArr2[i17] & 255) << i16;
                }
                break;
            case 1:
                this.f4035e += i11;
                int i18 = 0;
                while (true) {
                    int i19 = this.f4035e;
                    int i21 = 2;
                    if (i19 <= 8) {
                        byte[] bArr3 = this.f4032b;
                        int i22 = this.f4034d;
                        int i23 = ((-1) >>> (32 - i11)) & (i18 | ((bArr3[i22] & 255) >> (8 - i19)));
                        if (i19 == 8) {
                            this.f4035e = 0;
                            this.f4034d = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i19 - 8;
                    this.f4035e = i24;
                    byte[] bArr4 = this.f4032b;
                    int i25 = this.f4034d;
                    i18 |= (bArr4[i25] & 255) << i24;
                    if (!r(i25 + 1)) {
                        i21 = 1;
                    }
                    this.f4034d = i25 + i21;
                }
                break;
            default:
                int i26 = this.f4034d;
                int iMin = Math.min(i11, 8 - this.f4035e);
                byte[] bArr5 = this.f4032b;
                int i27 = i26 + 1;
                int i28 = ((bArr5[i26] & 255) >> this.f4035e) & (255 >> (8 - iMin));
                while (iMin < i11) {
                    i28 |= (bArr5[i27] & 255) << iMin;
                    iMin += 8;
                    i27++;
                }
                int i29 = i28 & ((-1) >>> (32 - i11));
                t(i11);
                return i29;
        }
    }

    public void j(byte[] bArr, int i11) {
        int i12 = i11 >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.f4032b;
            int i14 = this.f4033c;
            int i15 = i14 + 1;
            this.f4033c = i15;
            byte b3 = bArr2[i14];
            int i16 = this.f4034d;
            byte b11 = (byte) (b3 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | b11);
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b12;
        int i18 = this.f4034d;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f4032b;
            int i19 = this.f4033c;
            this.f4033c = i19 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i19] & 255) << i18));
            this.f4034d = i18 - 8;
        }
        int i21 = this.f4034d + i17;
        this.f4034d = i21;
        byte[] bArr4 = this.f4032b;
        int i22 = this.f4033c;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i22]) >> (8 - i21)) << (8 - i17))) | bArr[i12]);
        if (i21 == 8) {
            this.f4034d = 0;
            this.f4033c = i22 + 1;
        }
        a();
    }

    public long k(int i11) {
        if (i11 <= 32) {
            int i12 = i(i11);
            String str = f0.f3975a;
            return 4294967295L & ((long) i12);
        }
        int i13 = i(i11 - 32);
        int i14 = i(32);
        String str2 = f0.f3975a;
        return (4294967295L & ((long) i14)) | ((((long) i13) & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i11) {
        a.j(this.f4034d == 0);
        System.arraycopy(this.f4032b, this.f4033c, bArr, 0, i11);
        this.f4033c += i11;
        a();
    }

    public int m() {
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? i(i11) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(w wVar) {
        p(wVar.f4039a, wVar.f4041c);
        q(wVar.f4040b * 8);
    }

    public void p(byte[] bArr, int i11) {
        this.f4032b = bArr;
        this.f4033c = 0;
        this.f4034d = 0;
        this.f4035e = i11;
    }

    public void q(int i11) {
        int i12 = i11 / 8;
        this.f4033c = i12;
        this.f4034d = i11 - (i12 * 8);
        a();
    }

    public boolean r(int i11) {
        if (2 > i11 || i11 >= this.f4033c) {
            return false;
        }
        byte[] bArr = this.f4032b;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 - 1] == 0;
    }

    public void s() {
        switch (this.f4031a) {
            case 0:
                int i11 = this.f4034d + 1;
                this.f4034d = i11;
                if (i11 == 8) {
                    this.f4034d = 0;
                    this.f4033c++;
                }
                a();
                break;
            default:
                int i12 = this.f4035e + 1;
                this.f4035e = i12;
                if (i12 == 8) {
                    this.f4035e = 0;
                    int i13 = this.f4034d;
                    this.f4034d = i13 + (r(i13 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i11) {
        int i12;
        switch (this.f4031a) {
            case 0:
                int i13 = i11 / 8;
                int i14 = this.f4033c + i13;
                this.f4033c = i14;
                int i15 = (i11 - (i13 * 8)) + this.f4034d;
                this.f4034d = i15;
                if (i15 > 7) {
                    this.f4033c = i14 + 1;
                    this.f4034d = i15 - 8;
                }
                a();
                break;
            case 1:
                int i16 = this.f4034d;
                int i17 = i11 / 8;
                int i18 = i16 + i17;
                this.f4034d = i18;
                int i19 = (i11 - (i17 * 8)) + this.f4035e;
                this.f4035e = i19;
                if (i19 > 7) {
                    this.f4034d = i18 + 1;
                    this.f4035e = i19 - 8;
                }
                while (true) {
                    i16++;
                    if (i16 > this.f4034d) {
                        a();
                        break;
                    } else if (r(i16)) {
                        this.f4034d++;
                        i16 += 2;
                    }
                }
                break;
            default:
                int i21 = i11 / 8;
                int i22 = this.f4034d + i21;
                this.f4034d = i22;
                int i23 = (i11 - (i21 * 8)) + this.f4035e;
                this.f4035e = i23;
                boolean z11 = true;
                if (i23 > 7) {
                    this.f4034d = i22 + 1;
                    this.f4035e = i23 - 8;
                }
                int i24 = this.f4034d;
                if (i24 < 0 || (i24 >= (i12 = this.f4033c) && (i24 != i12 || this.f4035e != 0))) {
                    z11 = false;
                }
                a.j(z11);
                break;
        }
    }

    public void u(int i11) {
        a.j(this.f4034d == 0);
        this.f4033c += i11;
        a();
    }

    public v(byte[] bArr) {
        this.f4031a = 3;
        this.f4032b = bArr;
        this.f4033c = bArr.length;
    }

    public v(byte[] bArr, int i11, int i12) {
        this.f4031a = 1;
        this.f4032b = bArr;
        this.f4034d = i11;
        this.f4033c = i12;
        this.f4035e = 0;
        a();
    }

    public v(byte[] bArr, int i11) {
        this.f4031a = 0;
        this.f4032b = bArr;
        this.f4035e = i11;
    }

    public v(int i11, int i12) {
        this.f4031a = 2;
        this.f4033c = i11;
        this.f4034d = i12;
        this.f4032b = new byte[(i12 * 2) - 1];
        this.f4035e = 0;
    }
}
