package e4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d4.g f24827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f24828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d4.f f24829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f24830e = new h(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24831f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24832g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f24833h = new g(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f24834i = new g(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f24835j = s.NONE;

    public t(d4.g gVar) {
        this.f24827b = gVar;
    }

    public static void b(g gVar, g gVar2, int i11) {
        gVar.f24810l.add(gVar2);
        gVar.f24804f = i11;
        gVar2.f24809k.add(gVar);
    }

    public static g h(d4.d dVar) {
        d4.d dVar2 = dVar.f23111f;
        if (dVar2 == null) {
            return null;
        }
        d4.g gVar = dVar2.f23109d;
        int i11 = r.f24825a[dVar2.f23110e.ordinal()];
        if (i11 == 1) {
            return gVar.f23122d.f24833h;
        }
        if (i11 == 2) {
            return gVar.f23122d.f24834i;
        }
        if (i11 == 3) {
            return gVar.f23124e.f24833h;
        }
        if (i11 == 4) {
            return gVar.f23124e.f24817k;
        }
        if (i11 != 5) {
            return null;
        }
        return gVar.f23124e.f24834i;
    }

    public static g i(d4.d dVar, int i11) {
        d4.d dVar2 = dVar.f23111f;
        if (dVar2 == null) {
            return null;
        }
        d4.g gVar = dVar2.f23109d;
        t tVar = i11 == 0 ? gVar.f23122d : gVar.f23124e;
        int i12 = r.f24825a[dVar2.f23110e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return tVar.f24834i;
        }
        return tVar.f24833h;
    }

    public final void c(g gVar, g gVar2, int i11, h hVar) {
        gVar.f24810l.add(gVar2);
        gVar.f24810l.add(this.f24830e);
        gVar.f24806h = i11;
        gVar.f24807i = hVar;
        gVar2.f24809k.add(gVar);
        hVar.f24809k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i11, int i12) {
        if (i12 == 0) {
            d4.g gVar = this.f24827b;
            int i13 = gVar.f23156v;
            int iMax = Math.max(gVar.f23155u, i11);
            if (i13 > 0) {
                iMax = Math.min(i13, i11);
            }
            if (iMax != i11) {
                return iMax;
            }
        } else {
            d4.g gVar2 = this.f24827b;
            int i14 = gVar2.f23159y;
            int iMax2 = Math.max(gVar2.f23158x, i11);
            if (i14 > 0) {
                iMax2 = Math.min(i14, i11);
            }
            if (iMax2 != i11) {
                return iMax2;
            }
        }
        return i11;
    }

    public long j() {
        h hVar = this.f24830e;
        if (hVar.f24808j) {
            return hVar.f24805g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(d4.d dVar, d4.d dVar2, int i11) {
        h hVar;
        float f5;
        int i12;
        g gVarH = h(dVar);
        g gVarH2 = h(dVar2);
        if (gVarH.f24808j && gVarH2.f24808j) {
            int iE = dVar.e() + gVarH.f24805g;
            int iE2 = gVarH2.f24805g - dVar2.e();
            int i13 = iE2 - iE;
            h hVar2 = this.f24830e;
            if (!hVar2.f24808j) {
                d4.f fVar = this.f24829d;
                d4.f fVar2 = d4.f.MATCH_CONSTRAINT;
                if (fVar == fVar2) {
                    int i14 = this.f24826a;
                    if (i14 == 0) {
                        hVar2.d(g(i13, i11));
                    } else if (i14 == 1) {
                        hVar2.d(Math.min(g(hVar2.m, i11), i13));
                    } else if (i14 == 2) {
                        d4.g gVar = this.f24827b;
                        d4.g gVar2 = gVar.V;
                        if (gVar2 != null) {
                            h hVar3 = (i11 == 0 ? gVar2.f23122d : gVar2.f23124e).f24830e;
                            if (hVar3.f24808j) {
                                hVar2.d(g((int) ((hVar3.f24805g * (i11 == 0 ? gVar.f23157w : gVar.f23160z)) + 0.5f), i11));
                            }
                        }
                    } else if (i14 == 3) {
                        d4.g gVar3 = this.f24827b;
                        t tVar = gVar3.f23122d;
                        if (tVar.f24829d == fVar2 && tVar.f24826a == 3) {
                            p pVar = gVar3.f23124e;
                            if (pVar.f24829d != fVar2 || pVar.f24826a != 3) {
                                if (i11 == 0) {
                                    tVar = gVar3.f23124e;
                                }
                                hVar = tVar.f24830e;
                                if (hVar.f24808j) {
                                    f5 = gVar3.Y;
                                    if (i11 == 1) {
                                        i12 = (int) ((hVar.f24805g / f5) + 0.5f);
                                    } else {
                                        i12 = (int) ((f5 * hVar.f24805g) + 0.5f);
                                    }
                                    hVar2.d(i12);
                                }
                            }
                        } else {
                            if (i11 == 0) {
                                tVar = gVar3.f23124e;
                            }
                            hVar = tVar.f24830e;
                            if (hVar.f24808j) {
                                f5 = gVar3.Y;
                                if (i11 == 1) {
                                    i12 = (int) ((hVar.f24805g / f5) + 0.5f);
                                } else {
                                    i12 = (int) ((f5 * hVar.f24805g) + 0.5f);
                                }
                                hVar2.d(i12);
                            }
                        }
                    }
                }
            }
            if (hVar2.f24808j) {
                int i15 = hVar2.f24805g;
                g gVar4 = this.f24834i;
                g gVar5 = this.f24833h;
                if (i15 == i13) {
                    gVar5.d(iE);
                    gVar4.d(iE2);
                    return;
                }
                float f11 = i11 == 0 ? this.f24827b.f23127f0 : this.f24827b.f23129g0;
                if (gVarH == gVarH2) {
                    iE = gVarH.f24805g;
                    iE2 = gVarH2.f24805g;
                    f11 = 0.5f;
                }
                gVar5.d((int) ((((iE2 - iE) - i15) * f11) + iE + 0.5f));
                gVar4.d(gVar5.f24805g + hVar2.f24805g);
            }
        }
    }
}
