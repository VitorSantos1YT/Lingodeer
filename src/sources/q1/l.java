package q1;

import java.util.Arrays;
import l1.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f47382e = new l(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.b f47385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f47386d;

    public l(int i11, int i12, Object[] objArr, s1.b bVar) {
        this.f47383a = i11;
        this.f47384b = i12;
        this.f47385c = bVar;
        this.f47386d = objArr;
    }

    public static l j(int i11, Object obj, Object obj2, int i12, Object obj3, Object obj4, int i13, s1.b bVar) {
        if (i13 > 30) {
            return new l(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iA = com.bumptech.glide.f.A(i11, i13);
        int iA2 = com.bumptech.glide.f.A(i12, i13);
        if (iA != iA2) {
            return new l((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new l(0, 1 << iA, new Object[]{j(i11, obj, obj2, i12, obj3, obj4, i13 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i11, int i12, int i13, Object obj, Object obj2, int i14, s1.b bVar) {
        Object obj3 = this.f47386d[i11];
        l lVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i11), i13, obj, obj2, i14 + 5, bVar);
        int iT = t(i12);
        int i15 = iT + 1;
        Object[] objArr = this.f47386d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ry.l.K(0, i11, 6, objArr, objArr2);
        ry.l.G(i11, i11 + 2, i15, objArr, objArr2);
        objArr2[iT - 1] = lVarJ;
        ry.l.G(iT, i15, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f47384b == 0) {
            return this.f47386d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f47383a);
        int length = this.f47386d.length;
        for (int i11 = iBitCount * 2; i11 < length; i11++) {
            iBitCount += s(i11).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        lz.e eVarS = hz.b.S(2, hz.b.U(0, this.f47386d.length));
        int i11 = eVarS.f40532a;
        int i12 = eVarS.f40533b;
        int i13 = eVarS.f40534c;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (!kotlin.jvm.internal.m.a(obj, this.f47386d[i11])) {
                if (i11 != i12) {
                    i11 += i13;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i11, int i12, Object obj) {
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        if (h(iA)) {
            return kotlin.jvm.internal.m.a(obj, this.f47386d[f(iA)]);
        }
        if (!i(iA)) {
            return false;
        }
        l lVarS = s(t(iA));
        return i12 == 30 ? lVarS.c(obj) : lVarS.d(i11, i12 + 5, obj);
    }

    public final boolean e(l lVar) {
        if (this == lVar) {
            return true;
        }
        if (this.f47384b == lVar.f47384b && this.f47383a == lVar.f47383a) {
            int length = this.f47386d.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (this.f47386d[i11] == lVar.f47386d[i11]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i11) {
        return Integer.bitCount((i11 - 1) & this.f47383a) * 2;
    }

    public final Object g(int i11, int i12, Object obj) {
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        if (h(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.f47386d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iA)) {
            return null;
        }
        l lVarS = s(t(iA));
        if (i12 != 30) {
            return lVarS.g(i11, i12 + 5, obj);
        }
        lz.e eVarS = hz.b.S(2, hz.b.U(0, lVarS.f47386d.length));
        int i13 = eVarS.f40532a;
        int i14 = eVarS.f40533b;
        int i15 = eVarS.f40534c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return null;
        }
        while (!kotlin.jvm.internal.m.a(obj, lVarS.f47386d[i13])) {
            if (i13 == i14) {
                return null;
            }
            i13 += i15;
        }
        return lVarS.x(i13);
    }

    public final boolean h(int i11) {
        return (i11 & this.f47383a) != 0;
    }

    public final boolean i(int i11) {
        return (i11 & this.f47384b) != 0;
    }

    public final l k(int i11, e eVar) {
        eVar.b(eVar.f47371f - 1);
        eVar.f47369d = x(i11);
        Object[] objArr = this.f47386d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f47385c != eVar.f47367b) {
            return new l(0, 0, com.bumptech.glide.f.f(i11, objArr), eVar.f47367b);
        }
        this.f47386d = com.bumptech.glide.f.f(i11, objArr);
        return this;
    }

    public final l l(int i11, Object obj, Object obj2, int i12, e eVar) {
        e eVar2;
        l lVarL;
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        boolean zH = h(iA);
        s1.b bVar = this.f47385c;
        if (zH) {
            int iF = f(iA);
            if (!kotlin.jvm.internal.m.a(obj, this.f47386d[iF])) {
                eVar.b(eVar.f47371f + 1);
                s1.b bVar2 = eVar.f47367b;
                if (bVar != bVar2) {
                    return new l(this.f47383a ^ iA, this.f47384b | iA, a(iF, iA, i11, obj, obj2, i12, bVar2), bVar2);
                }
                this.f47386d = a(iF, iA, i11, obj, obj2, i12, bVar2);
                this.f47383a ^= iA;
                this.f47384b |= iA;
                return this;
            }
            eVar.f47369d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f47367b) {
                this.f47386d[iF + 1] = obj2;
                return this;
            }
            eVar.f47370e++;
            Object[] objArr = this.f47386d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new l(this.f47383a, this.f47384b, objArrCopyOf, eVar.f47367b);
        }
        if (!i(iA)) {
            eVar.b(eVar.f47371f + 1);
            s1.b bVar3 = eVar.f47367b;
            int iF2 = f(iA);
            if (bVar != bVar3) {
                return new l(this.f47383a | iA, this.f47384b, com.bumptech.glide.f.e(this.f47386d, iF2, obj, obj2), bVar3);
            }
            this.f47386d = com.bumptech.glide.f.e(this.f47386d, iF2, obj, obj2);
            this.f47383a |= iA;
            return this;
        }
        int iT = t(iA);
        l lVarS = s(iT);
        if (i12 == 30) {
            lz.e eVarS = hz.b.S(2, hz.b.U(0, lVarS.f47386d.length));
            int i13 = eVarS.f40532a;
            int i14 = eVarS.f40533b;
            int i15 = eVarS.f40534c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (!kotlin.jvm.internal.m.a(obj, lVarS.f47386d[i13])) {
                        if (i13 == i14) {
                            eVar.b(eVar.f47371f + 1);
                            lVarL = new l(0, 0, com.bumptech.glide.f.e(lVarS.f47386d, 0, obj, obj2), eVar.f47367b);
                            break;
                        }
                        i13 += i15;
                    } else {
                        eVar.f47369d = lVarS.x(i13);
                        if (lVarS.f47385c != eVar.f47367b) {
                            eVar.f47370e++;
                            Object[] objArr2 = lVarS.f47386d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i13 + 1] = obj2;
                            lVarL = new l(0, 0, objArrCopyOf2, eVar.f47367b);
                            break;
                        }
                        lVarS.f47386d[i13 + 1] = obj2;
                        lVarL = lVarS;
                        break;
                    }
                }
            } else {
                eVar.b(eVar.f47371f + 1);
                lVarL = new l(0, 0, com.bumptech.glide.f.e(lVarS.f47386d, 0, obj, obj2), eVar.f47367b);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            lVarL = lVarS.l(i11, obj, obj2, i12 + 5, eVar2);
        }
        return lVarS == lVarL ? this : r(iT, lVarL, eVar2.f47367b);
    }

    public final l m(l lVar, int i11, s1.a aVar, e eVar) {
        l lVar2;
        Object[] objArr;
        l lVarJ;
        if (this == lVar) {
            aVar.f51279a += b();
            return this;
        }
        int i12 = 0;
        if (i11 > 30) {
            s1.b bVar = eVar.f47367b;
            int i13 = lVar.f47384b;
            Object[] objArr2 = this.f47386d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + lVar.f47386d.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            int length = this.f47386d.length;
            lz.e eVarS = hz.b.S(2, hz.b.U(0, lVar.f47386d.length));
            int i14 = eVarS.f40532a;
            int i15 = eVarS.f40533b;
            int i16 = eVarS.f40534c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (c(lVar.f47386d[i14])) {
                        aVar.f51279a++;
                    } else {
                        Object[] objArr3 = lVar.f47386d;
                        objArrCopyOf[length] = objArr3[i14];
                        objArrCopyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length != this.f47386d.length) {
                if (length == lVar.f47386d.length) {
                    return lVar;
                }
                if (length == objArrCopyOf.length) {
                    return new l(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(...)");
                return new l(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i17 = this.f47384b | lVar.f47384b;
            int i18 = this.f47383a;
            int i19 = lVar.f47383a;
            int i21 = (i18 ^ i19) & (~i17);
            int i22 = i18 & i19;
            int i23 = i21;
            while (i22 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i22);
                if (kotlin.jvm.internal.m.a(this.f47386d[f(iLowestOneBit)], lVar.f47386d[lVar.f(iLowestOneBit)])) {
                    i23 |= iLowestOneBit;
                } else {
                    i17 |= iLowestOneBit;
                }
                i22 ^= iLowestOneBit;
            }
            if ((i17 & i23) != 0) {
                r1.b("Check failed.");
            }
            if (kotlin.jvm.internal.m.a(this.f47385c, eVar.f47367b) && this.f47383a == i23 && this.f47384b == i17) {
                lVar2 = this;
            } else {
                lVar2 = new l(i23, i17, new Object[Integer.bitCount(i17) + (Integer.bitCount(i23) * 2)], null);
            }
            int i24 = i17;
            int i25 = 0;
            while (i24 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i24);
                Object[] objArr4 = lVar2.f47386d;
                int length2 = (objArr4.length - 1) - i25;
                if (i(iLowestOneBit2)) {
                    lVarJ = s(t(iLowestOneBit2));
                    if (lVar.i(iLowestOneBit2)) {
                        lVarJ = lVarJ.m(lVar.s(lVar.t(iLowestOneBit2)), i11 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (lVar.h(iLowestOneBit2)) {
                        int iF = lVar.f(iLowestOneBit2);
                        Object obj = lVar.f47386d[iF];
                        Object objX = lVar.x(iF);
                        int i26 = eVar.f47371f;
                        objArr = objArr4;
                        lVarJ = lVarJ.l(obj != null ? obj.hashCode() : i12, obj, objX, i11 + 5, eVar);
                        if (eVar.f47371f == i26) {
                            aVar.f51279a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (lVar.i(iLowestOneBit2)) {
                        l lVarS = lVar.s(lVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f47386d[iF2];
                            int i27 = i11 + 5;
                            if (lVarS.d(obj2 != null ? obj2.hashCode() : 0, i27, obj2)) {
                                aVar.f51279a++;
                                lVarJ = lVarS;
                            } else {
                                lVarJ = lVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i27, eVar);
                            }
                        } else {
                            lVarJ = lVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f47386d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = lVar.f(iLowestOneBit2);
                        Object obj4 = lVar.f47386d[iF4];
                        lVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, lVar.x(iF4), i11 + 5, eVar.f47367b);
                    }
                }
                objArr[length2] = lVarJ;
                i25++;
                i24 ^= iLowestOneBit2;
                i12 = 0;
            }
            int i28 = 0;
            while (i23 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i23);
                int i29 = i28 * 2;
                if (lVar.h(iLowestOneBit3)) {
                    int iF5 = lVar.f(iLowestOneBit3);
                    Object[] objArr5 = lVar2.f47386d;
                    objArr5[i29] = lVar.f47386d[iF5];
                    objArr5[i29 + 1] = lVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f51279a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = lVar2.f47386d;
                    objArr6[i29] = this.f47386d[iF6];
                    objArr6[i29 + 1] = x(iF6);
                }
                i28++;
                i23 ^= iLowestOneBit3;
            }
            if (!e(lVar2)) {
                return lVar.e(lVar2) ? lVar : lVar2;
            }
        }
        return this;
    }

    public final l n(int i11, Object obj, int i12, e eVar) {
        l lVarN;
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        if (h(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.f47386d[iF])) {
                return p(iF, iA, eVar);
            }
        } else if (i(iA)) {
            int iT = t(iA);
            l lVarS = s(iT);
            if (i12 == 30) {
                lz.e eVarS = hz.b.S(2, hz.b.U(0, lVarS.f47386d.length));
                int i13 = eVarS.f40532a;
                int i14 = eVarS.f40533b;
                int i15 = eVarS.f40534c;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, lVarS.f47386d[i13])) {
                            if (i13 == i14) {
                                lVarN = lVarS;
                                break;
                            }
                            i13 += i15;
                        } else {
                            lVarN = lVarS.k(i13, eVar);
                            break;
                        }
                    }
                } else {
                    lVarN = lVarS;
                    break;
                }
            } else {
                lVarN = lVarS.n(i11, obj, i12 + 5, eVar);
            }
            return q(lVarS, lVarN, iT, iA, eVar.f47367b);
        }
        return this;
    }

    public final l o(int i11, Object obj, Object obj2, int i12, e eVar) {
        l lVar;
        l lVarO;
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        if (h(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.f47386d[iF]) && kotlin.jvm.internal.m.a(obj2, x(iF))) {
                return p(iF, iA, eVar);
            }
        } else if (i(iA)) {
            int iT = t(iA);
            l lVarS = s(iT);
            if (i12 == 30) {
                lz.e eVarS = hz.b.S(2, hz.b.U(0, lVarS.f47386d.length));
                int i13 = eVarS.f40532a;
                int i14 = eVarS.f40533b;
                int i15 = eVarS.f40534c;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, lVarS.f47386d[i13]) || !kotlin.jvm.internal.m.a(obj2, lVarS.x(i13))) {
                            if (i13 == i14) {
                                lVarO = lVarS;
                                break;
                            }
                            i13 += i15;
                        } else {
                            lVarO = lVarS.k(i13, eVar);
                            break;
                        }
                    }
                } else {
                    lVarO = lVarS;
                    break;
                }
                lVar = lVarS;
            } else {
                lVar = lVarS;
                lVarO = lVar.o(i11, obj, obj2, i12 + 5, eVar);
            }
            return q(lVar, lVarO, iT, iA, eVar.f47367b);
        }
        return this;
    }

    public final l p(int i11, int i12, e eVar) {
        eVar.b(eVar.f47371f - 1);
        eVar.f47369d = x(i11);
        Object[] objArr = this.f47386d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f47385c != eVar.f47367b) {
            return new l(i12 ^ this.f47383a, this.f47384b, com.bumptech.glide.f.f(i11, objArr), eVar.f47367b);
        }
        this.f47386d = com.bumptech.glide.f.f(i11, objArr);
        this.f47383a ^= i12;
        return this;
    }

    public final l q(l lVar, l lVar2, int i11, int i12, s1.b bVar) {
        s1.b bVar2 = this.f47385c;
        if (lVar2 != null) {
            return (bVar2 == bVar || lVar != lVar2) ? r(i11, lVar2, bVar) : this;
        }
        Object[] objArr = this.f47386d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new l(this.f47383a, i12 ^ this.f47384b, com.bumptech.glide.f.g(i11, objArr), bVar);
        }
        this.f47386d = com.bumptech.glide.f.g(i11, objArr);
        this.f47384b ^= i12;
        return this;
    }

    public final l r(int i11, l lVar, s1.b bVar) {
        Object[] objArr = this.f47386d;
        if (objArr.length == 1 && lVar.f47386d.length == 2 && lVar.f47384b == 0) {
            lVar.f47383a = this.f47384b;
            return lVar;
        }
        if (this.f47385c == bVar) {
            objArr[i11] = lVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = lVar;
        return new l(this.f47383a, this.f47384b, objArrCopyOf, bVar);
    }

    public final l s(int i11) {
        Object obj = this.f47386d[i11];
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (l) obj;
    }

    public final int t(int i11) {
        return (this.f47386d.length - 1) - Integer.bitCount((i11 - 1) & this.f47384b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.f7471c = w(r12, r4, (q1.l) r14.f7471c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.c0 u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.l.u(java.lang.Object, int, int, java.lang.Object):com.android.billingclient.api.c0");
    }

    public final l v(int i11, int i12, Object obj) {
        l lVarV;
        int iA = 1 << com.bumptech.glide.f.A(i11, i12);
        if (h(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.f47386d[iF])) {
                Object[] objArr = this.f47386d;
                if (objArr.length != 2) {
                    return new l(this.f47383a ^ iA, this.f47384b, com.bumptech.glide.f.f(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iA)) {
            int iT = t(iA);
            l lVarS = s(iT);
            if (i12 == 30) {
                lz.e eVarS = hz.b.S(2, hz.b.U(0, lVarS.f47386d.length));
                int i13 = eVarS.f40532a;
                int i14 = eVarS.f40533b;
                int i15 = eVarS.f40534c;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, lVarS.f47386d[i13])) {
                            if (i13 == i14) {
                                lVarV = lVarS;
                                break;
                            }
                            i13 += i15;
                        } else {
                            Object[] objArr2 = lVarS.f47386d;
                            if (objArr2.length != 2) {
                                lVarV = new l(0, 0, com.bumptech.glide.f.f(i13, objArr2), null);
                                break;
                            }
                            lVarV = null;
                            break;
                        }
                    }
                } else {
                    lVarV = lVarS;
                    break;
                }
            } else {
                lVarV = lVarS.v(i11, i12 + 5, obj);
            }
            if (lVarV == null) {
                Object[] objArr3 = this.f47386d;
                if (objArr3.length != 1) {
                    return new l(this.f47383a, iA ^ this.f47384b, com.bumptech.glide.f.g(iT, objArr3), null);
                }
                return null;
            }
            if (lVarS != lVarV) {
                return w(iT, iA, lVarV);
            }
        }
        return this;
    }

    public final l w(int i11, int i12, l lVar) {
        Object[] objArr = lVar.f47386d;
        if (objArr.length != 2 || lVar.f47384b != 0) {
            Object[] objArr2 = this.f47386d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i11] = lVar;
            return new l(this.f47383a, this.f47384b, objArrCopyOf, null);
        }
        if (this.f47386d.length == 1) {
            lVar.f47383a = this.f47384b;
            return lVar;
        }
        int iF = f(i12);
        Object[] objArr3 = this.f47386d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.m.e(objArrCopyOf2, "copyOf(...)");
        ry.l.G(i11 + 2, i11 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        ry.l.G(iF + 2, iF, i11, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new l(this.f47383a ^ i12, i12 ^ this.f47384b, objArrCopyOf2, null);
    }

    public final Object x(int i11) {
        return this.f47386d[i11 + 1];
    }
}
