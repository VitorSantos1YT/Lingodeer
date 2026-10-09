package gy;

import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f29899e;

    public /* synthetic */ i(int i11) {
        this.f29895a = i11;
    }

    public void a(rx.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f29899e;
        int i11 = this.f29896b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i12 = (iHashCode ^ (iHashCode >>> 16)) & i11;
        Object obj3 = objArr[i12];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i12 = (i12 + 1) & i11;
                obj2 = objArr[i12];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i12] = bVar;
        int i13 = this.f29897c + 1;
        this.f29897c = i13;
        if (i13 < this.f29898d) {
            return;
        }
        Object[] objArr2 = this.f29899e;
        int length = objArr2.length;
        int i14 = length << 1;
        int i15 = i14 - 1;
        Object[] objArr3 = new Object[i14];
        while (true) {
            int i16 = i13 - 1;
            if (i13 == 0) {
                this.f29896b = i15;
                this.f29898d = (int) (i14 * 0.75f);
                this.f29899e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i17 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i15;
            if (objArr3[i17] != null) {
                do {
                    i17 = (i17 + 1) & i15;
                } while (objArr3[i17] != null);
            }
            objArr3[i17] = objArr2[length];
            i13 = i16;
        }
    }

    public void b(ww.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f29899e;
        int i11 = this.f29896b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i12 = (iHashCode ^ (iHashCode >>> 16)) & i11;
        Object obj3 = objArr[i12];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i12 = (i12 + 1) & i11;
                obj2 = objArr[i12];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i12] = bVar;
        int i13 = this.f29897c + 1;
        this.f29897c = i13;
        if (i13 < this.f29898d) {
            return;
        }
        Object[] objArr2 = this.f29899e;
        int length = objArr2.length;
        int i14 = length << 1;
        int i15 = i14 - 1;
        Object[] objArr3 = new Object[i14];
        while (true) {
            int i16 = i13 - 1;
            if (i13 == 0) {
                this.f29896b = i15;
                this.f29898d = (int) (i14 * 0.75f);
                this.f29899e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i17 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i15;
            if (objArr3[i17] != null) {
                do {
                    i17 = (i17 + 1) & i15;
                } while (objArr3[i17] != null);
            }
            objArr3[i17] = objArr2[length];
            i13 = i16;
        }
    }

    public void c(y9.f fVar) {
        Object[] objArr = this.f29899e;
        int i11 = this.f29897c;
        objArr[i11] = fVar;
        int i12 = this.f29898d & (i11 + 1);
        this.f29897c = i12;
        int i13 = this.f29896b;
        if (i12 == i13) {
            int length = objArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i15];
            l.G(0, i13, length, objArr, objArr2);
            l.G(i14, 0, this.f29896b, this.f29899e, objArr2);
            this.f29899e = objArr2;
            this.f29896b = 0;
            this.f29897c = length;
            this.f29898d = i15 - 1;
        }
    }

    public void d(int i11, int i12, Object[] objArr) {
        int i13;
        Object obj;
        Object obj2;
        switch (this.f29895a) {
            case 0:
                this.f29897c--;
                while (true) {
                    int i14 = i11 + 1;
                    while (true) {
                        i13 = i14 & i12;
                        obj = objArr[i13];
                        if (obj != null) {
                            int iHashCode = obj.hashCode() * (-1640531527);
                            int i15 = (iHashCode ^ (iHashCode >>> 16)) & i12;
                            if (i11 > i13) {
                                if (i11 < i15 || i15 <= i13) {
                                    i14 = i13 + 1;
                                }
                            } else if (i11 < i15 && i15 <= i13) {
                                i14 = i13 + 1;
                            }
                        } else {
                            objArr[i11] = null;
                        }
                        break;
                    }
                    objArr[i11] = obj;
                    i11 = i13;
                }
                break;
            default:
                this.f29897c--;
                while (true) {
                    int i16 = i11;
                    int i17 = i16 + 1;
                    while (true) {
                        i11 = i17 & i12;
                        obj2 = objArr[i11];
                        if (obj2 != null) {
                            int iHashCode2 = obj2.hashCode() * (-1640531527);
                            int i18 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i12;
                            if (i16 > i11) {
                                if (i16 < i18 || i18 <= i11) {
                                    i17 = i11 + 1;
                                }
                            } else if (i16 < i18 && i18 <= i11) {
                                i17 = i11 + 1;
                            }
                        } else {
                            objArr[i16] = null;
                        }
                        break;
                    }
                    objArr[i16] = obj2;
                }
                break;
        }
    }
}
