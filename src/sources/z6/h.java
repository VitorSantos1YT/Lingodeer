package z6;

import com.lingodeer.data.model.AchievementLevelType;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f58954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f58955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f58956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f58957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f58958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f58959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f58960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f58961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f58962l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f58963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f58965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f58966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f58967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f58968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f58969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f58970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f58971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f58972w;

    public h(int i11, int i12, float f5, float f11, int i13) {
        this.f58951a = i11;
        this.f58952b = i12;
        this.f58953c = f5;
        this.f58954d = f11;
        this.f58955e = i11 / i13;
        this.f58956f = i11 / 400;
        int i14 = i11 / 65;
        this.f58957g = i14;
        int i15 = i14 * 2;
        this.f58958h = i15;
        this.f58959i = new short[i15];
        this.f58960j = new short[i15 * i12];
        this.f58962l = new short[i15 * i12];
        this.f58963n = new short[i15 * i12];
    }

    public static void e(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr3[i18] * i21) + ((i11 - i21) * sArr2[i19])) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    public final void a(short[] sArr, int i11, int i12) {
        short[] sArrC = c(this.f58962l, this.m, i12);
        this.f58962l = sArrC;
        int i13 = this.f58952b;
        System.arraycopy(sArr, i11 * i13, sArrC, this.m * i13, i13 * i12);
        this.m += i12;
    }

    public final void b(short[] sArr, int i11, int i12) {
        int i13 = this.f58958h / i12;
        int i14 = this.f58952b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f58959i[i17] = (short) (i18 / i15);
        }
    }

    public final short[] c(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f58952b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    public final int d(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f58952b;
        int i15 = 255;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int iAbs = 0;
            for (int i19 = 0; i19 < i12; i19++) {
                iAbs += Math.abs(sArr[i14 + i19] - sArr[(i14 + i12) + i19]);
            }
            if (iAbs * i17 < i16 * i12) {
                i17 = i12;
                i16 = iAbs;
            }
            if (iAbs * i15 > i18 * i12) {
                i15 = i12;
                i18 = iAbs;
            }
            i12++;
        }
        this.f58970u = i16 / i17;
        this.f58971v = i18 / i15;
        return i17;
    }

    public final void f() {
        float f5;
        double d5;
        int iD;
        int i11;
        int i12;
        int iRound;
        int i13;
        int i14;
        int i15;
        long j11;
        long j12;
        int i16 = this.m;
        float f11 = this.f58953c;
        float f12 = this.f58954d;
        double d11 = f11 / f12;
        float f13 = this.f58955e * f12;
        int i17 = this.f58951a;
        int i18 = 1;
        int i19 = this.f58952b;
        int i21 = 0;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            int i22 = this.f58961k;
            int i23 = this.f58958h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f58967r;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        a(this.f58960j, i24, iMin);
                        this.f58967r -= iMin;
                        i24 += iMin;
                        f5 = f13;
                        d5 = d11;
                        i23 = i23;
                    } else {
                        short[] sArr = this.f58960j;
                        int i26 = i17 > 4000 ? i17 / AchievementLevelType.XP_LV_6 : i18;
                        int i27 = this.f58957g;
                        int i28 = this.f58956f;
                        if (i19 == i18 && i26 == i18) {
                            iD = d(sArr, i24, i28, i27);
                            f5 = f13;
                            d5 = d11;
                        } else {
                            b(sArr, i24, i26);
                            f5 = f13;
                            d5 = d11;
                            short[] sArr2 = this.f58959i;
                            int iD2 = d(sArr2, i21, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = iD2 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i24, i28, i27);
                                } else {
                                    b(sArr, i24, 1);
                                    iD = d(sArr2, i21, i28, i27);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i33 = this.f58970u;
                        int i34 = this.f58971v;
                        if (i33 == 0 || (i11 = this.f58968s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f58969t * 3) {
                            i11 = iD;
                        }
                        this.f58969t = i33;
                        this.f58968s = iD;
                        if (d5 > 1.0d) {
                            short[] sArr3 = this.f58960j;
                            if (d5 >= 2.0d) {
                                double d12 = (((double) i11) / (d5 - 1.0d)) + this.f58972w;
                                iRound = (int) Math.round(d12);
                                this.f58972w = d12 - ((double) iRound);
                            } else {
                                double d13 = (((2.0d - d5) * ((double) i11)) / (d5 - 1.0d)) + this.f58972w;
                                int iRound2 = (int) Math.round(d13);
                                this.f58967r = iRound2;
                                this.f58972w = d13 - ((double) iRound2);
                                iRound = i11;
                            }
                            short[] sArrC = c(this.f58962l, this.m, iRound);
                            this.f58962l = sArrC;
                            int i35 = i24 + i11;
                            int i36 = i24;
                            int i37 = iRound;
                            e(i37, this.f58952b, sArrC, this.m, sArr3, i36, sArr3, i35);
                            this.m += i37;
                            i24 = i11 + i37 + i36;
                        } else {
                            i23 = i23;
                            int i38 = i24;
                            short[] sArr4 = this.f58960j;
                            if (d5 < 0.5d) {
                                double d14 = ((((double) i11) * d5) / (1.0d - d5)) + this.f58972w;
                                int iRound3 = (int) Math.round(d14);
                                this.f58972w = d14 - ((double) iRound3);
                                i12 = iRound3;
                            } else {
                                double d15 = ((((d5 * 2.0d) - 1.0d) * ((double) i11)) / (1.0d - d5)) + this.f58972w;
                                int iRound4 = (int) Math.round(d15);
                                this.f58967r = iRound4;
                                this.f58972w = d15 - ((double) iRound4);
                                i12 = i11;
                            }
                            int i39 = i11 + i12;
                            short[] sArrC2 = c(this.f58962l, this.m, i39);
                            this.f58962l = sArrC2;
                            System.arraycopy(sArr4, i38 * i19, sArrC2, this.m * i19, i11 * i19);
                            e(i12, this.f58952b, this.f58962l, this.m + i11, sArr4, i38 + i11, sArr4, i38);
                            this.m += i39;
                            i24 = i38 + i12;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    i21 = 0;
                    i23 = i23;
                    i18 = 1;
                    f13 = f5;
                    d11 = d5;
                }
                int i40 = this.f58961k - i24;
                short[] sArr5 = this.f58960j;
                System.arraycopy(sArr5, i24 * i19, sArr5, 0, i40 * i19);
                this.f58961k = i40;
            }
            if (f5 != 1.0f || this.m == i16) {
            }
            long j13 = (long) (i17 / f5);
            long j14 = i17;
            while (j13 != 0 && j14 != 0 && j13 % 2 == 0 && j14 % 2 == 0) {
                j13 /= 2;
                j14 /= 2;
            }
            int i41 = this.m - i16;
            short[] sArrC3 = c(this.f58963n, this.f58964o, i41);
            this.f58963n = sArrC3;
            System.arraycopy(this.f58962l, i16 * i19, sArrC3, this.f58964o * i19, i41 * i19);
            this.m = i16;
            this.f58964o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f58964o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f58965p + 1;
                    j11 = i15;
                    long j15 = j11 * j13;
                    j12 = this.f58966q;
                    if (j15 <= j12 * j14) {
                        break;
                    }
                    this.f58962l = c(this.f58962l, this.m, 1);
                    int i43 = 0;
                    while (i43 < i19) {
                        short[] sArr6 = this.f58962l;
                        int i44 = (this.m * i19) + i43;
                        short[] sArr7 = this.f58963n;
                        int i45 = (i42 * i19) + i43;
                        short s3 = sArr7[i45];
                        short s11 = sArr7[i45 + i19];
                        long j16 = ((long) this.f58966q) * j14;
                        int i46 = this.f58965p;
                        long j17 = j13;
                        int i47 = i42;
                        long j18 = ((long) (i46 + 1)) * j17;
                        long j19 = j18 - j16;
                        long j21 = j18 - (((long) i46) * j17);
                        sArr6[i44] = (short) ((((j21 - j19) * ((long) s11)) + (((long) s3) * j19)) / j21);
                        i43++;
                        i42 = i47;
                        j13 = j17;
                    }
                    this.f58966q++;
                    this.m++;
                    i42 = i42;
                    j13 = j13;
                }
                long j22 = j13;
                int i48 = i42;
                this.f58965p = i15;
                if (j11 == j14) {
                    this.f58965p = 0;
                    b7.a.j(j12 == j22);
                    this.f58966q = 0;
                }
                i42 = i48 + 1;
                j13 = j22;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f58963n;
            System.arraycopy(sArr8, i14 * i19, sArr8, 0, (i13 - i14) * i19);
            this.f58964o -= i14;
            return;
        }
        a(this.f58960j, 0, this.f58961k);
        this.f58961k = 0;
        f5 = f13;
        if (f5 != 1.0f) {
        }
    }
}
