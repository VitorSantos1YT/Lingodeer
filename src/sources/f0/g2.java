package f0;

import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f26286a;

    public g2(i2 i2Var) {
        this.f26286a = i2Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234  */
    /* JADX WARN: Code duplicated, block: B:113:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x0245  */
    /* JADX WARN: Code duplicated, block: B:119:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x026b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:134:0x027b  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x030d  */
    /* JADX WARN: Code duplicated, block: B:168:0x031e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0322  */
    /* JADX WARN: Code duplicated, block: B:171:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x0332  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:182:0x034f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0360  */
    /* JADX WARN: Code duplicated, block: B:185:0x0364  */
    /* JADX WARN: Code duplicated, block: B:187:0x0369  */
    /* JADX WARN: Code duplicated, block: B:191:0x0374  */
    /* JADX WARN: Code duplicated, block: B:193:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x037c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0380  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    public final long a(int i11, long j11) {
        long j12;
        float fIntBitsToFloat;
        int i12;
        char c11;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jG;
        long jG2;
        boolean z11;
        boolean zF;
        boolean z12;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        d0.p0 p0Var;
        float f5;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        d0.p0 p0Var2;
        float f11;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        d0.p0 p0Var3;
        float f12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        i2 i2Var = this.f26286a;
        i2Var.f26314j = i11;
        d0.i iVar = i2Var.f26306b;
        if (iVar == null || !(i2Var.f26305a.d() || i2Var.f26305a.c())) {
            return i2Var.c(i2Var.f26315k, j11, i11);
        }
        int i15 = i2Var.f26314j;
        com.google.firebase.datastorage.a aVar = i2Var.m;
        d0.k0 k0Var = iVar.f22722c;
        if (f2.e.e(iVar.f22726g)) {
            i2 i2Var2 = (i2) aVar.f19621b;
            return new f2.b(i2Var2.c(i2Var2.f26315k, j11, i2Var2.f26314j)).f26570a;
        }
        if (!iVar.f22725f) {
            if (d0.k0.g(k0Var.f22746f)) {
                iVar.f(0L);
            }
            if (d0.k0.g(k0Var.f22747g)) {
                iVar.g(0L);
            }
            if (d0.k0.g(k0Var.f22744d)) {
                iVar.h(0L);
            }
            if (d0.k0.g(k0Var.f22745e)) {
                iVar.e(0L);
            }
            iVar.f22725f = true;
        }
        int i16 = d0.k.f22740a;
        float f13 = i15 == 2 ? 4.0f : 1.0f;
        long jI = f2.b.i(j11, f13);
        int i17 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i17) != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (!d0.k0.g(k0Var.f22744d) || Float.intBitsToFloat(i17) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                j12 = 4294967295L;
                if (d0.k0.g(k0Var.f22745e) && Float.intBitsToFloat(i17) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    float fE = iVar.e(jI);
                    if (!d0.k0.g(k0Var.f22745e)) {
                        k0Var.b().finish();
                    }
                    jI = jI;
                    fIntBitsToFloat = fE == Float.intBitsToFloat((int) (jI & 4294967295L)) ? Float.intBitsToFloat(i17) : fE / f13;
                }
            } else {
                float fH = iVar.h(jI);
                j12 = 4294967295L;
                if (!d0.k0.g(k0Var.f22744d)) {
                    k0Var.e().finish();
                }
                fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jI & 4294967295L)) ? Float.intBitsToFloat(i17) : fH / f13;
                jI = jI;
            }
            i12 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i12) == CropImageView.DEFAULT_ASPECT_RATIO) {
                if (d0.k0.g(k0Var.f22746f) || Float.intBitsToFloat(i12) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    long j13 = jI;
                    c11 = ' ';
                    if (!d0.k0.g(k0Var.f22747g) && Float.intBitsToFloat(i12) > CropImageView.DEFAULT_ASPECT_RATIO) {
                        float fG = iVar.g(j13);
                        if (!d0.k0.g(k0Var.f22747g)) {
                            k0Var.d().finish();
                        }
                        fIntBitsToFloat2 = fG == Float.intBitsToFloat((int) (j13 >> 32)) ? Float.intBitsToFloat(i12) : fG / f13;
                    }
                } else {
                    long j14 = jI;
                    float f14 = iVar.f(j14);
                    c11 = ' ';
                    if (!d0.k0.g(k0Var.f22746f)) {
                        k0Var.c().finish();
                    }
                    fIntBitsToFloat2 = f14 == Float.intBitsToFloat((int) (j14 >> 32)) ? Float.intBitsToFloat(i12) : f14 / f13;
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j12) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c11);
                if (!f2.b.c(jFloatToRawIntBits, 0L)) {
                    iVar.d();
                }
                jG = f2.b.g(j11, jFloatToRawIntBits);
                i2 i2Var3 = (i2) aVar.f19621b;
                long j15 = new f2.b(i2Var3.c(i2Var3.f26315k, jG, i2Var3.f26314j)).f26570a;
                jG2 = f2.b.g(jG, j15);
                if ((Float.intBitsToFloat((int) (jG >> c11)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (jG & j12)) != CropImageView.DEFAULT_ASPECT_RATIO) && ((Float.intBitsToFloat((int) (j15 >> c11)) != CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (j15 & j12)) != CropImageView.DEFAULT_ASPECT_RATIO) && (d0.k0.g(k0Var.f22746f) || d0.k0.g(k0Var.f22744d) || d0.k0.g(k0Var.f22747g) || d0.k0.g(k0Var.f22745e)))) {
                    iVar.a();
                }
                if (i15 == 1) {
                    i13 = (int) (jG2 >> c11);
                    if (Float.intBitsToFloat(i13) > 0.5f) {
                        iVar.f(jG2);
                    } else {
                        if (Float.intBitsToFloat(i13) < -0.5f) {
                            iVar.g(jG2);
                        } else {
                            z13 = false;
                        }
                        i14 = (int) (jG2 & j12);
                        if (Float.intBitsToFloat(i14) > 0.5f) {
                            iVar.h(jG2);
                        } else {
                            if (Float.intBitsToFloat(i14) < -0.5f) {
                                iVar.e(jG2);
                            } else {
                                z14 = false;
                            }
                            if (!z13 || z14) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        z14 = true;
                        if (z13) {
                        }
                        z11 = true;
                    }
                    z13 = true;
                    i14 = (int) (jG2 & j12);
                    if (Float.intBitsToFloat(i14) > 0.5f) {
                        iVar.h(jG2);
                    } else {
                        if (Float.intBitsToFloat(i14) < -0.5f) {
                            iVar.e(jG2);
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                        }
                        z11 = true;
                    }
                    z14 = true;
                    if (z13) {
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!f2.b.c(jG, 0L)) {
                    if (d0.k0.f(k0Var.f22746f) || Float.intBitsToFloat(i12) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        zF = false;
                    } else {
                        EdgeEffect edgeEffectC = k0Var.c();
                        float fIntBitsToFloat6 = Float.intBitsToFloat(i12);
                        if (edgeEffectC instanceof d0.p0) {
                            d0.p0 p0Var4 = (d0.p0) edgeEffectC;
                            float f15 = p0Var4.f22775b + fIntBitsToFloat6;
                            p0Var4.f22775b = f15;
                            if (Math.abs(f15) > p0Var4.f22774a) {
                                p0Var4.onRelease();
                            }
                        } else {
                            edgeEffectC.onRelease();
                        }
                        zF = d0.k0.f(k0Var.f22746f);
                    }
                    if (d0.k0.f(k0Var.f22747g) && Float.intBitsToFloat(i12) > CropImageView.DEFAULT_ASPECT_RATIO) {
                        edgeEffectD = k0Var.d();
                        fIntBitsToFloat5 = Float.intBitsToFloat(i12);
                        if (edgeEffectD instanceof d0.p0) {
                            p0Var3 = (d0.p0) edgeEffectD;
                            f12 = p0Var3.f22775b + fIntBitsToFloat5;
                            p0Var3.f22775b = f12;
                            if (Math.abs(f12) > p0Var3.f22774a) {
                                p0Var3.onRelease();
                            }
                        } else {
                            edgeEffectD.onRelease();
                        }
                        if (!zF || d0.k0.f(k0Var.f22747g)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (d0.k0.f(k0Var.f22744d) && Float.intBitsToFloat(i17) < CropImageView.DEFAULT_ASPECT_RATIO) {
                        edgeEffectE = k0Var.e();
                        fIntBitsToFloat4 = Float.intBitsToFloat(i17);
                        if (edgeEffectE instanceof d0.p0) {
                            p0Var2 = (d0.p0) edgeEffectE;
                            f11 = p0Var2.f22775b + fIntBitsToFloat4;
                            p0Var2.f22775b = f11;
                            if (Math.abs(f11) > p0Var2.f22774a) {
                                p0Var2.onRelease();
                            }
                        } else {
                            edgeEffectE.onRelease();
                        }
                        if (!zF || d0.k0.f(k0Var.f22744d)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (d0.k0.f(k0Var.f22745e) && Float.intBitsToFloat(i17) > CropImageView.DEFAULT_ASPECT_RATIO) {
                        edgeEffectB = k0Var.b();
                        fIntBitsToFloat3 = Float.intBitsToFloat(i17);
                        if (edgeEffectB instanceof d0.p0) {
                            p0Var = (d0.p0) edgeEffectB;
                            f5 = p0Var.f22775b + fIntBitsToFloat3;
                            p0Var.f22775b = f5;
                            if (Math.abs(f5) > p0Var.f22774a) {
                                p0Var.onRelease();
                            }
                        } else {
                            edgeEffectB.onRelease();
                        }
                        if (!zF || d0.k0.f(k0Var.f22745e)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (!zF || z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = z12;
                }
                if (z11) {
                    iVar.d();
                }
                return f2.b.h(jFloatToRawIntBits, j15);
            }
            c11 = ' ';
            fIntBitsToFloat2 = 0.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j12) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c11);
            if (!f2.b.c(jFloatToRawIntBits, 0L)) {
                iVar.d();
            }
            jG = f2.b.g(j11, jFloatToRawIntBits);
            i2 i2Var4 = (i2) aVar.f19621b;
            long j16 = new f2.b(i2Var4.c(i2Var4.f26315k, jG, i2Var4.f26314j)).f26570a;
            jG2 = f2.b.g(jG, j16);
            if (Float.intBitsToFloat((int) (jG >> c11)) == CropImageView.DEFAULT_ASPECT_RATIO) {
                iVar.a();
            } else {
                iVar.a();
            }
            if (i15 == 1) {
                i13 = (int) (jG2 >> c11);
                if (Float.intBitsToFloat(i13) > 0.5f) {
                    iVar.f(jG2);
                } else {
                    if (Float.intBitsToFloat(i13) < -0.5f) {
                        iVar.g(jG2);
                    } else {
                        z13 = false;
                    }
                    i14 = (int) (jG2 & j12);
                    if (Float.intBitsToFloat(i14) > 0.5f) {
                        iVar.h(jG2);
                    } else {
                        if (Float.intBitsToFloat(i14) < -0.5f) {
                            iVar.e(jG2);
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                        }
                        z11 = true;
                    }
                    z14 = true;
                    if (z13) {
                    }
                    z11 = true;
                }
                z13 = true;
                i14 = (int) (jG2 & j12);
                if (Float.intBitsToFloat(i14) > 0.5f) {
                    iVar.h(jG2);
                } else {
                    if (Float.intBitsToFloat(i14) < -0.5f) {
                        iVar.e(jG2);
                    } else {
                        z14 = false;
                    }
                    if (z13) {
                    }
                    z11 = true;
                }
                z14 = true;
                if (z13) {
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!f2.b.c(jG, 0L)) {
                if (d0.k0.f(k0Var.f22746f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (d0.k0.f(k0Var.f22747g)) {
                    edgeEffectD = k0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i12);
                    if (edgeEffectD instanceof d0.p0) {
                        p0Var3 = (d0.p0) edgeEffectD;
                        f12 = p0Var3.f22775b + fIntBitsToFloat5;
                        p0Var3.f22775b = f12;
                        if (Math.abs(f12) > p0Var3.f22774a) {
                            p0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (d0.k0.f(k0Var.f22744d)) {
                    edgeEffectE = k0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i17);
                    if (edgeEffectE instanceof d0.p0) {
                        p0Var2 = (d0.p0) edgeEffectE;
                        f11 = p0Var2.f22775b + fIntBitsToFloat4;
                        p0Var2.f22775b = f11;
                        if (Math.abs(f11) > p0Var2.f22774a) {
                            p0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (d0.k0.f(k0Var.f22745e)) {
                    edgeEffectB = k0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i17);
                    if (edgeEffectB instanceof d0.p0) {
                        p0Var = (d0.p0) edgeEffectB;
                        f5 = p0Var.f22775b + fIntBitsToFloat3;
                        p0Var.f22775b = f5;
                        if (Math.abs(f5) > p0Var.f22774a) {
                            p0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                z11 = z12;
            }
            if (z11) {
                iVar.d();
            }
            return f2.b.h(jFloatToRawIntBits, j16);
        }
        j12 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i12 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i12) == CropImageView.DEFAULT_ASPECT_RATIO) {
            if (d0.k0.g(k0Var.f22746f)) {
                long j17 = jI;
                c11 = ' ';
                if (!d0.k0.g(k0Var.f22747g)) {
                }
            } else {
                long j18 = jI;
                c11 = ' ';
                if (!d0.k0.g(k0Var.f22747g)) {
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j12) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c11);
            if (!f2.b.c(jFloatToRawIntBits, 0L)) {
                iVar.d();
            }
            jG = f2.b.g(j11, jFloatToRawIntBits);
            i2 i2Var5 = (i2) aVar.f19621b;
            long j19 = new f2.b(i2Var5.c(i2Var5.f26315k, jG, i2Var5.f26314j)).f26570a;
            jG2 = f2.b.g(jG, j19);
            if (Float.intBitsToFloat((int) (jG >> c11)) == CropImageView.DEFAULT_ASPECT_RATIO) {
                iVar.a();
            } else {
                iVar.a();
            }
            if (i15 == 1) {
                i13 = (int) (jG2 >> c11);
                if (Float.intBitsToFloat(i13) > 0.5f) {
                    iVar.f(jG2);
                } else {
                    if (Float.intBitsToFloat(i13) < -0.5f) {
                        iVar.g(jG2);
                    } else {
                        z13 = false;
                    }
                    i14 = (int) (jG2 & j12);
                    if (Float.intBitsToFloat(i14) > 0.5f) {
                        iVar.h(jG2);
                    } else {
                        if (Float.intBitsToFloat(i14) < -0.5f) {
                            iVar.e(jG2);
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                        }
                        z11 = true;
                    }
                    z14 = true;
                    if (z13) {
                    }
                    z11 = true;
                }
                z13 = true;
                i14 = (int) (jG2 & j12);
                if (Float.intBitsToFloat(i14) > 0.5f) {
                    iVar.h(jG2);
                } else {
                    if (Float.intBitsToFloat(i14) < -0.5f) {
                        iVar.e(jG2);
                    } else {
                        z14 = false;
                    }
                    if (z13) {
                    }
                    z11 = true;
                }
                z14 = true;
                if (z13) {
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!f2.b.c(jG, 0L)) {
                if (d0.k0.f(k0Var.f22746f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (d0.k0.f(k0Var.f22747g)) {
                    edgeEffectD = k0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i12);
                    if (edgeEffectD instanceof d0.p0) {
                        p0Var3 = (d0.p0) edgeEffectD;
                        f12 = p0Var3.f22775b + fIntBitsToFloat5;
                        p0Var3.f22775b = f12;
                        if (Math.abs(f12) > p0Var3.f22774a) {
                            p0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (d0.k0.f(k0Var.f22744d)) {
                    edgeEffectE = k0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i17);
                    if (edgeEffectE instanceof d0.p0) {
                        p0Var2 = (d0.p0) edgeEffectE;
                        f11 = p0Var2.f22775b + fIntBitsToFloat4;
                        p0Var2.f22775b = f11;
                        if (Math.abs(f11) > p0Var2.f22774a) {
                            p0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (d0.k0.f(k0Var.f22745e)) {
                    edgeEffectB = k0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i17);
                    if (edgeEffectB instanceof d0.p0) {
                        p0Var = (d0.p0) edgeEffectB;
                        f5 = p0Var.f22775b + fIntBitsToFloat3;
                        p0Var.f22775b = f5;
                        if (Math.abs(f5) > p0Var.f22774a) {
                            p0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                z11 = z12;
            }
            if (z11) {
                iVar.d();
            }
            return f2.b.h(jFloatToRawIntBits, j19);
        }
        c11 = ' ';
        fIntBitsToFloat2 = 0.0f;
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j12) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c11);
        if (!f2.b.c(jFloatToRawIntBits, 0L)) {
            iVar.d();
        }
        jG = f2.b.g(j11, jFloatToRawIntBits);
        i2 i2Var6 = (i2) aVar.f19621b;
        long j110 = new f2.b(i2Var6.c(i2Var6.f26315k, jG, i2Var6.f26314j)).f26570a;
        jG2 = f2.b.g(jG, j110);
        if (Float.intBitsToFloat((int) (jG >> c11)) == CropImageView.DEFAULT_ASPECT_RATIO) {
            iVar.a();
        } else {
            iVar.a();
        }
        if (i15 == 1) {
            i13 = (int) (jG2 >> c11);
            if (Float.intBitsToFloat(i13) > 0.5f) {
                iVar.f(jG2);
            } else {
                if (Float.intBitsToFloat(i13) < -0.5f) {
                    iVar.g(jG2);
                } else {
                    z13 = false;
                }
                i14 = (int) (jG2 & j12);
                if (Float.intBitsToFloat(i14) > 0.5f) {
                    iVar.h(jG2);
                } else {
                    if (Float.intBitsToFloat(i14) < -0.5f) {
                        iVar.e(jG2);
                    } else {
                        z14 = false;
                    }
                    if (z13) {
                    }
                    z11 = true;
                }
                z14 = true;
                if (z13) {
                }
                z11 = true;
            }
            z13 = true;
            i14 = (int) (jG2 & j12);
            if (Float.intBitsToFloat(i14) > 0.5f) {
                iVar.h(jG2);
            } else {
                if (Float.intBitsToFloat(i14) < -0.5f) {
                    iVar.e(jG2);
                } else {
                    z14 = false;
                }
                if (z13) {
                }
                z11 = true;
            }
            z14 = true;
            if (z13) {
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (!f2.b.c(jG, 0L)) {
            if (d0.k0.f(k0Var.f22746f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (d0.k0.f(k0Var.f22747g)) {
                edgeEffectD = k0Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i12);
                if (edgeEffectD instanceof d0.p0) {
                    p0Var3 = (d0.p0) edgeEffectD;
                    f12 = p0Var3.f22775b + fIntBitsToFloat5;
                    p0Var3.f22775b = f12;
                    if (Math.abs(f12) > p0Var3.f22774a) {
                        p0Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (d0.k0.f(k0Var.f22744d)) {
                edgeEffectE = k0Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i17);
                if (edgeEffectE instanceof d0.p0) {
                    p0Var2 = (d0.p0) edgeEffectE;
                    f11 = p0Var2.f22775b + fIntBitsToFloat4;
                    p0Var2.f22775b = f11;
                    if (Math.abs(f11) > p0Var2.f22774a) {
                        p0Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (d0.k0.f(k0Var.f22745e)) {
                edgeEffectB = k0Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i17);
                if (edgeEffectB instanceof d0.p0) {
                    p0Var = (d0.p0) edgeEffectB;
                    f5 = p0Var.f22775b + fIntBitsToFloat3;
                    p0Var.f22775b = f5;
                    if (Math.abs(f5) > p0Var.f22774a) {
                        p0Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z12 = true;
            } else {
                z12 = true;
            }
            z11 = z12;
        }
        if (z11) {
            iVar.d();
        }
        return f2.b.h(jFloatToRawIntBits, j110);
    }
}
