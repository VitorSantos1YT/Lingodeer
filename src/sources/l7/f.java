package l7;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.lingodeer.data.model.INTENTS;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends f7.e {
    public final hq.a U;
    public final e7.d V;
    public final ArrayDeque W;
    public boolean X;
    public boolean Y;
    public d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f39783a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f39784b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f39785c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f39786d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p f39787e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public b f39788f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e7.d f39789g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ImageOutput f39790h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Bitmap f39791i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f39792j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public e f39793k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public e f39794l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f39795m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f39796n0;

    public f(hq.a aVar) {
        super(4);
        this.U = aVar;
        this.f39790h0 = ImageOutput.f2138a;
        this.V = new e7.d(0);
        this.Z = d.f39777c;
        this.W = new ArrayDeque();
        this.f39784b0 = -9223372036854775807L;
        this.f39783a0 = -9223372036854775807L;
        this.f39785c0 = 0;
        this.f39786d0 = 1;
    }

    @Override // f7.e
    public final int B(p pVar) {
        this.U.getClass();
        return hq.a.c(pVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    public final boolean D(long j11) throws ExoPlaybackException {
        boolean z11;
        e eVar;
        Bitmap bitmap;
        long j12;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int i13;
        p pVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.f39791i0;
        if ((bitmap2 == null || this.f39793k0 != null) && (this.f39786d0 != 0 || this.H == 2)) {
            ArrayDeque arrayDeque = this.W;
            if (bitmap2 == null) {
                b7.a.k(this.f39788f0);
                a aVar = (a) this.f39788f0.c();
                if (aVar != null) {
                    if (!aVar.e(4)) {
                        b7.a.l(aVar.f39773e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f39791i0 = aVar.f39773e;
                        aVar.o();
                        if (this.f39792j0 && this.f39791i0 != null && this.f39793k0 != null) {
                            b7.a.k(this.f39787e0);
                            p pVar2 = this.f39787e0;
                            int i14 = pVar2.M;
                            int i15 = pVar2.N;
                            z11 = ((i14 != 1 && i15 == 1) || i14 == -1 || i15 == -1) ? false : true;
                            eVar = this.f39793k0;
                            if (((Bitmap) eVar.f39782c) == null) {
                                if (z11) {
                                    int i16 = eVar.f39780a;
                                    b7.a.k(this.f39791i0);
                                    int width = this.f39791i0.getWidth();
                                    p pVar3 = this.f39787e0;
                                    b7.a.k(pVar3);
                                    int i17 = width / pVar3.M;
                                    int height = this.f39791i0.getHeight();
                                    p pVar4 = this.f39787e0;
                                    b7.a.k(pVar4);
                                    int i18 = height / pVar4.N;
                                    int i19 = this.f39787e0.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f39791i0, (i16 % i19) * i17, (i16 / i19) * i18, i17, i18);
                                } else {
                                    bitmapCreateBitmap = this.f39791i0;
                                    b7.a.k(bitmapCreateBitmap);
                                }
                                eVar.f39782c = bitmapCreateBitmap;
                            }
                            bitmap = (Bitmap) this.f39793k0.f39782c;
                            b7.a.k(bitmap);
                            j12 = this.f39793k0.f39781b;
                            long j13 = j12 - j11;
                            if (this.H == 2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            i11 = this.f39786d0;
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    z12 = true;
                                } else {
                                    if (i11 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z12 = false;
                                }
                            }
                            if (!z12 || j13 < 30000) {
                                this.f39790h0.onImageAvailable(j12 - this.Z.f39779b, bitmap);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                e eVar2 = this.f39793k0;
                                b7.a.k(eVar2);
                                long j14 = eVar2.f39781b;
                                this.f39783a0 = j14;
                                while (!arrayDeque.isEmpty() && j14 >= ((d) arrayDeque.peek()).f39778a) {
                                    this.Z = (d) arrayDeque.removeFirst();
                                }
                                this.f39786d0 = 3;
                                if (z11) {
                                    e eVar3 = this.f39793k0;
                                    b7.a.k(eVar3);
                                    i12 = eVar3.f39780a;
                                    p pVar5 = this.f39787e0;
                                    b7.a.k(pVar5);
                                    i13 = pVar5.N;
                                    pVar = this.f39787e0;
                                    b7.a.k(pVar);
                                    if (i12 == (i13 * pVar.M) - 1) {
                                        this.f39791i0 = null;
                                    }
                                } else {
                                    this.f39791i0 = null;
                                }
                                this.f39793k0 = this.f39794l0;
                                this.f39794l0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f39785c0 == 3) {
                            G();
                            b7.a.k(this.f39787e0);
                            F();
                            return false;
                        }
                        aVar.o();
                        if (arrayDeque.isEmpty()) {
                            this.Y = true;
                            return false;
                        }
                    }
                }
            } else if (this.f39792j0) {
                b7.a.k(this.f39787e0);
                p pVar6 = this.f39787e0;
                int i110 = pVar6.M;
                int i111 = pVar6.N;
                if (i110 != 1) {
                }
                eVar = this.f39793k0;
                if (((Bitmap) eVar.f39782c) == null) {
                    if (z11) {
                        int i112 = eVar.f39780a;
                        b7.a.k(this.f39791i0);
                        int width2 = this.f39791i0.getWidth();
                        p pVar7 = this.f39787e0;
                        b7.a.k(pVar7);
                        int i113 = width2 / pVar7.M;
                        int height2 = this.f39791i0.getHeight();
                        p pVar8 = this.f39787e0;
                        b7.a.k(pVar8);
                        int i114 = height2 / pVar8.N;
                        int i115 = this.f39787e0.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f39791i0, (i112 % i115) * i113, (i112 / i115) * i114, i113, i114);
                    } else {
                        bitmapCreateBitmap = this.f39791i0;
                        b7.a.k(bitmapCreateBitmap);
                    }
                    eVar.f39782c = bitmapCreateBitmap;
                }
                bitmap = (Bitmap) this.f39793k0.f39782c;
                b7.a.k(bitmap);
                j12 = this.f39793k0.f39781b;
                long j15 = j12 - j11;
                if (this.H == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = this.f39786d0;
                if (i11 != 0) {
                    if (i11 != 1) {
                        z12 = true;
                    } else {
                        if (i11 == 3) {
                            throw new IllegalStateException();
                        }
                        z12 = false;
                    }
                }
                if (z12) {
                    this.f39790h0.onImageAvailable(j12 - this.Z.f39779b, bitmap);
                    z13 = true;
                } else {
                    this.f39790h0.onImageAvailable(j12 - this.Z.f39779b, bitmap);
                    z13 = true;
                }
                if (z13) {
                    e eVar4 = this.f39793k0;
                    b7.a.k(eVar4);
                    long j16 = eVar4.f39781b;
                    this.f39783a0 = j16;
                    while (!arrayDeque.isEmpty()) {
                        this.Z = (d) arrayDeque.removeFirst();
                    }
                    this.f39786d0 = 3;
                    if (z11) {
                        e eVar5 = this.f39793k0;
                        b7.a.k(eVar5);
                        i12 = eVar5.f39780a;
                        p pVar9 = this.f39787e0;
                        b7.a.k(pVar9);
                        i13 = pVar9.N;
                        pVar = this.f39787e0;
                        b7.a.k(pVar);
                        if (i12 == (i13 * pVar.M) - 1) {
                            this.f39791i0 = null;
                        }
                    } else {
                        this.f39791i0 = null;
                    }
                    this.f39793k0 = this.f39794l0;
                    this.f39794l0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    public final boolean E(long j11) {
        int iX;
        ByteBuffer byteBuffer;
        e7.d dVar;
        boolean z11;
        e7.d dVar2;
        long j12;
        boolean z12;
        e eVar;
        boolean z13;
        p pVar;
        boolean z14;
        boolean z15;
        p pVar2;
        int i11;
        e7.d dVar3;
        if (!this.f39792j0 || this.f39793k0 == null) {
            ob.e eVar2 = this.f26701c;
            eVar2.f();
            b bVar = this.f39788f0;
            if (bVar != null && this.f39785c0 != 3 && !this.X) {
                if (this.f39789g0 == null) {
                    e7.d dVar4 = (e7.d) bVar.d();
                    this.f39789g0 = dVar4;
                    if (dVar4 != null) {
                        if (this.f39785c0 == 2) {
                            b7.a.k(this.f39789g0);
                            this.f39789g0.f6652b = 4;
                            b bVar2 = this.f39788f0;
                            b7.a.k(bVar2);
                            bVar2.e(this.f39789g0);
                            this.f39789g0 = null;
                            this.f39785c0 = 3;
                            return false;
                        }
                        iX = x(eVar2, this.f39789g0, 0);
                        if (iX != -5) {
                            p pVar3 = (p) eVar2.f44805c;
                            b7.a.k(pVar3);
                            this.f39787e0 = pVar3;
                            this.f39796n0 = true;
                            this.f39785c0 = 2;
                            return true;
                        }
                        if (iX != -4) {
                            this.f39789g0.r();
                            byteBuffer = this.f39789g0.f25115e;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                dVar = this.f39789g0;
                                b7.a.k(dVar);
                                if (dVar.e(4)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                e7.d dVar5 = this.f39789g0;
                                b7.a.k(dVar5);
                                dVar5.f25113c = this.f39787e0;
                                b bVar3 = this.f39788f0;
                                b7.a.k(bVar3);
                                e7.d dVar6 = this.f39789g0;
                                b7.a.k(dVar6);
                                bVar3.e(dVar6);
                                this.f39795m0 = 0;
                            }
                            dVar2 = this.f39789g0;
                            b7.a.k(dVar2);
                            if (dVar2.e(4)) {
                                this.f39792j0 = true;
                            } else {
                                int i12 = this.f39795m0;
                                j12 = dVar2.f25117t;
                                e eVar3 = new e();
                                eVar3.f39780a = i12;
                                eVar3.f39781b = j12;
                                this.f39794l0 = eVar3;
                                this.f39795m0 = i12 + 1;
                                if (this.f39792j0) {
                                    this.f39793k0 = this.f39794l0;
                                    this.f39794l0 = null;
                                } else {
                                    if (j12 - 30000 <= j11 || j11 > 30000 + j12) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    eVar = this.f39793k0;
                                    if (eVar != null || eVar.f39781b > j11 || j11 >= j12) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    pVar = this.f39787e0;
                                    b7.a.k(pVar);
                                    if (pVar.M != -1 || (i11 = (pVar2 = this.f39787e0).N) == -1 || i12 == (i11 * pVar2.M) - 1) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z12 || z13 || z14) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    this.f39792j0 = z15;
                                    if (z13 || z12) {
                                        this.f39793k0 = this.f39794l0;
                                        this.f39794l0 = null;
                                    }
                                }
                            }
                            dVar3 = this.f39789g0;
                            b7.a.k(dVar3);
                            if (dVar3.e(4)) {
                                this.X = true;
                                this.f39789g0 = null;
                                return false;
                            }
                            long j13 = this.f39784b0;
                            e7.d dVar7 = this.f39789g0;
                            b7.a.k(dVar7);
                            this.f39784b0 = Math.max(j13, dVar7.f25117t);
                            if (z11) {
                                this.f39789g0 = null;
                            } else {
                                e7.d dVar8 = this.f39789g0;
                                b7.a.k(dVar8);
                                dVar8.n();
                            }
                            return !this.f39792j0;
                        }
                        if (iX != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f39785c0 == 2) {
                        b7.a.k(this.f39789g0);
                        this.f39789g0.f6652b = 4;
                        b bVar4 = this.f39788f0;
                        b7.a.k(bVar4);
                        bVar4.e(this.f39789g0);
                        this.f39789g0 = null;
                        this.f39785c0 = 3;
                        return false;
                    }
                    iX = x(eVar2, this.f39789g0, 0);
                    if (iX != -5) {
                        p pVar4 = (p) eVar2.f44805c;
                        b7.a.k(pVar4);
                        this.f39787e0 = pVar4;
                        this.f39796n0 = true;
                        this.f39785c0 = 2;
                        return true;
                    }
                    if (iX != -4) {
                        this.f39789g0.r();
                        byteBuffer = this.f39789g0.f25115e;
                        if (byteBuffer != null) {
                            dVar = this.f39789g0;
                            b7.a.k(dVar);
                            if (dVar.e(4)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            dVar = this.f39789g0;
                            b7.a.k(dVar);
                            if (dVar.e(4)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            e7.d dVar9 = this.f39789g0;
                            b7.a.k(dVar9);
                            dVar9.f25113c = this.f39787e0;
                            b bVar5 = this.f39788f0;
                            b7.a.k(bVar5);
                            e7.d dVar10 = this.f39789g0;
                            b7.a.k(dVar10);
                            bVar5.e(dVar10);
                            this.f39795m0 = 0;
                        }
                        dVar2 = this.f39789g0;
                        b7.a.k(dVar2);
                        if (dVar2.e(4)) {
                            this.f39792j0 = true;
                        } else {
                            int i13 = this.f39795m0;
                            j12 = dVar2.f25117t;
                            e eVar4 = new e();
                            eVar4.f39780a = i13;
                            eVar4.f39781b = j12;
                            this.f39794l0 = eVar4;
                            this.f39795m0 = i13 + 1;
                            if (this.f39792j0) {
                                this.f39793k0 = this.f39794l0;
                                this.f39794l0 = null;
                            } else {
                                if (j12 - 30000 <= j11) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                eVar = this.f39793k0;
                                if (eVar != null) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                pVar = this.f39787e0;
                                b7.a.k(pVar);
                                if (pVar.M != -1) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                if (z12) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                                this.f39792j0 = z15;
                                if (z13) {
                                    this.f39793k0 = this.f39794l0;
                                    this.f39794l0 = null;
                                } else {
                                    this.f39793k0 = this.f39794l0;
                                    this.f39794l0 = null;
                                }
                            }
                        }
                        dVar3 = this.f39789g0;
                        b7.a.k(dVar3);
                        if (dVar3.e(4)) {
                            this.X = true;
                            this.f39789g0 = null;
                            return false;
                        }
                        long j14 = this.f39784b0;
                        e7.d dVar11 = this.f39789g0;
                        b7.a.k(dVar11);
                        this.f39784b0 = Math.max(j14, dVar11.f25117t);
                        if (z11) {
                            this.f39789g0 = null;
                        } else {
                            e7.d dVar12 = this.f39789g0;
                            b7.a.k(dVar12);
                            dVar12.n();
                        }
                        return !this.f39792j0;
                    }
                    if (iX != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    public final void F() throws ExoPlaybackException {
        if (this.f39796n0) {
            p pVar = this.f39787e0;
            pVar.getClass();
            hq.a aVar = this.U;
            aVar.getClass();
            int iC = hq.a.c(pVar);
            if (iC != f7.e.a(4, 0, 0, 0) && iC != f7.e.a(3, 0, 0, 0)) {
                throw g(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f39787e0, false, INTENTS.RESULT_CHANGE_LOCATE_LAN);
            }
            b bVar = this.f39788f0;
            if (bVar != null) {
                bVar.release();
            }
            this.f39788f0 = new b(aVar.f33689a);
            this.f39796n0 = false;
        }
    }

    public final void G() {
        this.f39789g0 = null;
        this.f39785c0 = 0;
        this.f39784b0 = -9223372036854775807L;
        b bVar = this.f39788f0;
        if (bVar != null) {
            bVar.release();
            this.f39788f0 = null;
        }
    }

    @Override // f7.e, f7.a1
    public final void f(int i11, Object obj) {
        if (i11 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f2138a;
        }
        this.f39790h0 = imageOutput;
    }

    @Override // f7.e
    public final String k() {
        return "ImageRenderer";
    }

    @Override // f7.e
    public final boolean m() {
        return this.Y;
    }

    @Override // f7.e
    public final boolean o() {
        int i11 = this.f39786d0;
        if (i11 != 3) {
            return i11 == 0 && this.f39792j0;
        }
        return true;
    }

    @Override // f7.e
    public final void p() {
        this.f39787e0 = null;
        this.Z = d.f39777c;
        this.W.clear();
        G();
        this.f39790h0.a();
    }

    @Override // f7.e
    public final void q(boolean z11, boolean z12) {
        this.f39786d0 = z12 ? 1 : 0;
    }

    @Override // f7.e
    public final void r(long j11, boolean z11) {
        this.f39786d0 = Math.min(this.f39786d0, 1);
        this.Y = false;
        this.X = false;
        this.f39791i0 = null;
        this.f39793k0 = null;
        this.f39794l0 = null;
        this.f39792j0 = false;
        this.f39789g0 = null;
        b bVar = this.f39788f0;
        if (bVar != null) {
            bVar.flush();
        }
        this.W.clear();
    }

    @Override // f7.e
    public final void s() {
        G();
    }

    @Override // f7.e
    public final void t() {
        G();
        this.f39786d0 = Math.min(this.f39786d0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // f7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(y6.p[] r5, long r6, long r8, p7.b0 r10) {
        /*
            r4 = this;
            l7.d r5 = r4.Z
            long r5 = r5.f39779b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.W
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f39784b0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f39783a0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            l7.d r6 = new l7.d
            long r0 = r4.f39784b0
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            l7.d r5 = new l7.d
            r5.<init>(r0, r8)
            r4.Z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.f.w(y6.p[], long, long, p7.b0):void");
    }

    @Override // f7.e
    public final void y(long j11, long j12) throws ExoPlaybackException {
        if (this.Y) {
            return;
        }
        if (this.f39787e0 == null) {
            ob.e eVar = this.f26701c;
            eVar.f();
            e7.d dVar = this.V;
            dVar.n();
            int iX = x(eVar, dVar, 2);
            if (iX != -5) {
                if (iX == -4) {
                    b7.a.j(dVar.e(4));
                    this.X = true;
                    this.Y = true;
                    return;
                }
                return;
            }
            p pVar = (p) eVar.f44805c;
            b7.a.k(pVar);
            this.f39787e0 = pVar;
            this.f39796n0 = true;
        }
        if (this.f39788f0 == null) {
            F();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (D(j11)) {
            }
            while (E(j11)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e8) {
            throw g(e8, null, false, INTENTS.RESULT_NEED_VERIFICATION_EMAIL);
        }
    }
}
