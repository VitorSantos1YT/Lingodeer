package q7;

import b7.f0;
import b7.w;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.UUID;
import x7.e0;
import x7.l;
import y6.c0;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f47512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f47513c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f47514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f47515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47516f;

    public b(int i11, int i12, p pVar) {
        this.f47511a = i12;
        this.f47512b = pVar;
    }

    @Override // x7.e0
    public final void a(w wVar, int i11, int i12) {
        e0 e0Var = this.f47515e;
        String str = f0.f3975a;
        e0Var.a(wVar, i11, 0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e A[EDGE_INSN: B:100:0x013e->B:83:0x013e BREAK  A[LOOP:2: B:76:0x011a->B:80:0x012f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f A[LOOP:2: B:76:0x011a->B:80:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ed A[SYNTHETIC] */
    @Override // x7.e0
    public final void b(p pVar) {
        String str;
        ImmutableList immutableList;
        String str2;
        String str3;
        c0 c0Var;
        float f5;
        y6.l lVar;
        y6.l lVar2;
        ArrayList arrayList;
        String str4;
        y6.l lVar3;
        int size;
        y6.k[] kVarArr;
        int length;
        int i11;
        y6.k kVar;
        int i12;
        int i13;
        UUID uuid;
        int i14;
        y6.k[] kVarArr2;
        int length2;
        int i15;
        y6.k kVar2;
        String string;
        p pVar2 = pVar;
        p pVar3 = this.f47512b;
        if (pVar3 == null) {
            pVar2 = pVar;
        } else if (pVar2 == pVar3) {
            pVar2.getClass();
        } else {
            int i16 = d0.i(pVar2.f57291n);
            String str5 = pVar3.f57279a;
            c0 c0VarB = pVar3.f57290l;
            ImmutableList immutableList2 = pVar3.f57281c;
            int i17 = pVar3.M;
            int i18 = pVar3.N;
            String str6 = pVar3.f57280b;
            if (str6 == null) {
                str6 = pVar2.f57280b;
            }
            if (immutableList2.isEmpty()) {
                immutableList2 = pVar2.f57281c;
            }
            String str7 = pVar2.f57282d;
            if ((i16 == 3 || i16 == 1) && (str = pVar3.f57282d) != null) {
                str7 = str;
            }
            int i19 = pVar2.f57286h;
            if (i19 == -1) {
                i19 = pVar3.f57286h;
            }
            int i21 = pVar2.f57287i;
            if (i21 == -1) {
                i21 = pVar3.f57287i;
            }
            String str8 = pVar2.f57289k;
            if (str8 == null) {
                String[] strArrU = f0.U(pVar3.f57289k);
                if (strArrU.length == 0) {
                    immutableList = immutableList2;
                    str2 = str8;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    immutableList = immutableList2;
                    int length3 = strArrU.length;
                    str2 = str8;
                    int i22 = 0;
                    while (i22 < length3) {
                        int i23 = length3;
                        String str9 = strArrU[i22];
                        int i24 = i22;
                        if (i16 == d0.i(d0.e(str9))) {
                            if (sb2.length() > 0) {
                                sb2.append(",");
                            }
                            sb2.append(str9);
                        }
                        i22 = i24 + 1;
                        length3 = i23;
                    }
                    if (sb2.length() > 0) {
                        string = sb2.toString();
                    }
                    if (f0.U(string).length == 1) {
                        str3 = string;
                    }
                    c0Var = pVar2.f57290l;
                    if (c0Var != null) {
                        c0VarB = c0Var.b(c0VarB);
                    }
                    f5 = pVar2.f57302y;
                    if (f5 == -1.0f && i16 == 2) {
                        f5 = pVar3.f57302y;
                    }
                    int i25 = pVar2.f57283e | pVar3.f57283e;
                    int i26 = pVar2.f57284f | pVar3.f57284f;
                    lVar = pVar3.f57295r;
                    lVar2 = pVar2.f57295r;
                    arrayList = new ArrayList();
                    if (lVar != null) {
                        String str10 = lVar.f57226c;
                        kVarArr2 = lVar.f57224a;
                        length2 = kVarArr2.length;
                        i15 = 0;
                        while (i15 < length2) {
                            int i27 = length2;
                            kVar2 = kVarArr2[i15];
                            int i28 = i15;
                            if (kVar2.f57220e != null) {
                                arrayList.add(kVar2);
                            }
                            i15 = i28 + 1;
                            length2 = i27;
                        }
                        str4 = str10;
                    } else {
                        str4 = null;
                    }
                    if (lVar2 != null) {
                        if (str4 == null) {
                            str4 = lVar2.f57226c;
                        }
                        size = arrayList.size();
                        kVarArr = lVar2.f57224a;
                        String str11 = str4;
                        length = kVarArr.length;
                        i11 = 0;
                        while (i11 < length) {
                            int i29 = length;
                            kVar = kVarArr[i11];
                            int i30 = i11;
                            if (kVar.f57220e != null) {
                                uuid = kVar.f57217b;
                                i13 = i18;
                                i14 = 0;
                                while (true) {
                                    if (i14 >= size) {
                                        i12 = size;
                                        arrayList.add(kVar);
                                        break;
                                    } else {
                                        i12 = size;
                                        if (((y6.k) arrayList.get(i14)).f57217b.equals(uuid)) {
                                            break;
                                        }
                                        i14++;
                                        size = i12;
                                    }
                                }
                            } else {
                                i12 = size;
                                i13 = i18;
                            }
                            i11 = i30 + 1;
                            length = i29;
                            i18 = i13;
                            size = i12;
                        }
                        str4 = str11;
                    }
                    int i31 = i18;
                    if (arrayList.isEmpty()) {
                        lVar3 = null;
                    } else {
                        lVar3 = new y6.l(arrayList, str4);
                    }
                    o oVarA = pVar.a();
                    oVarA.f57253a = str5;
                    oVarA.f57254b = str6;
                    oVarA.f57255c = ImmutableList.n(immutableList);
                    oVarA.f57256d = str7;
                    oVarA.f57257e = i25;
                    oVarA.f57258f = i26;
                    oVarA.f57260h = i19;
                    oVarA.f57261i = i21;
                    oVarA.f57262j = str3;
                    oVarA.f57263k = c0VarB;
                    oVarA.f57268q = lVar3;
                    oVarA.f57275x = f5;
                    oVarA.L = i17;
                    oVarA.M = i31;
                    pVar2 = new p(oVarA);
                }
                string = null;
                if (f0.U(string).length == 1) {
                    str3 = string;
                }
                c0Var = pVar2.f57290l;
                if (c0Var != null) {
                    c0VarB = c0Var.b(c0VarB);
                }
                f5 = pVar2.f57302y;
                if (f5 == -1.0f) {
                    f5 = pVar3.f57302y;
                }
                int i210 = pVar2.f57283e | pVar3.f57283e;
                int i211 = pVar2.f57284f | pVar3.f57284f;
                lVar = pVar3.f57295r;
                lVar2 = pVar2.f57295r;
                arrayList = new ArrayList();
                if (lVar != null) {
                    String str12 = lVar.f57226c;
                    kVarArr2 = lVar.f57224a;
                    length2 = kVarArr2.length;
                    i15 = 0;
                    while (i15 < length2) {
                        int i212 = length2;
                        kVar2 = kVarArr2[i15];
                        int i213 = i15;
                        if (kVar2.f57220e != null) {
                            arrayList.add(kVar2);
                        }
                        i15 = i213 + 1;
                        length2 = i212;
                    }
                    str4 = str12;
                } else {
                    str4 = null;
                }
                if (lVar2 != null) {
                    if (str4 == null) {
                        str4 = lVar2.f57226c;
                    }
                    size = arrayList.size();
                    kVarArr = lVar2.f57224a;
                    String str13 = str4;
                    length = kVarArr.length;
                    i11 = 0;
                    while (i11 < length) {
                        int i214 = length;
                        kVar = kVarArr[i11];
                        int i32 = i11;
                        if (kVar.f57220e != null) {
                            uuid = kVar.f57217b;
                            i13 = i18;
                            i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    i12 = size;
                                    arrayList.add(kVar);
                                    break;
                                    break;
                                } else {
                                    i12 = size;
                                    if (((y6.k) arrayList.get(i14)).f57217b.equals(uuid)) {
                                        break;
                                        break;
                                    } else {
                                        i14++;
                                        size = i12;
                                    }
                                }
                            }
                        } else {
                            i12 = size;
                            i13 = i18;
                        }
                        i11 = i32 + 1;
                        length = i214;
                        i18 = i13;
                        size = i12;
                    }
                    str4 = str13;
                }
                int i33 = i18;
                if (arrayList.isEmpty()) {
                    lVar3 = null;
                } else {
                    lVar3 = new y6.l(arrayList, str4);
                }
                o oVarA2 = pVar.a();
                oVarA2.f57253a = str5;
                oVarA2.f57254b = str6;
                oVarA2.f57255c = ImmutableList.n(immutableList);
                oVarA2.f57256d = str7;
                oVarA2.f57257e = i210;
                oVarA2.f57258f = i211;
                oVarA2.f57260h = i19;
                oVarA2.f57261i = i21;
                oVarA2.f57262j = str3;
                oVarA2.f57263k = c0VarB;
                oVarA2.f57268q = lVar3;
                oVarA2.f57275x = f5;
                oVarA2.L = i17;
                oVarA2.M = i33;
                pVar2 = new p(oVarA2);
            } else {
                immutableList = immutableList2;
                str2 = str8;
            }
            str3 = str2;
            c0Var = pVar2.f57290l;
            if (c0Var != null) {
                c0VarB = c0Var.b(c0VarB);
            }
            f5 = pVar2.f57302y;
            if (f5 == -1.0f) {
                f5 = pVar3.f57302y;
            }
            int i215 = pVar2.f57283e | pVar3.f57283e;
            int i216 = pVar2.f57284f | pVar3.f57284f;
            lVar = pVar3.f57295r;
            lVar2 = pVar2.f57295r;
            arrayList = new ArrayList();
            if (lVar != null) {
                String str14 = lVar.f57226c;
                kVarArr2 = lVar.f57224a;
                length2 = kVarArr2.length;
                i15 = 0;
                while (i15 < length2) {
                    int i217 = length2;
                    kVar2 = kVarArr2[i15];
                    int i218 = i15;
                    if (kVar2.f57220e != null) {
                        arrayList.add(kVar2);
                    }
                    i15 = i218 + 1;
                    length2 = i217;
                }
                str4 = str14;
            } else {
                str4 = null;
            }
            if (lVar2 != null) {
                if (str4 == null) {
                    str4 = lVar2.f57226c;
                }
                size = arrayList.size();
                kVarArr = lVar2.f57224a;
                String str15 = str4;
                length = kVarArr.length;
                i11 = 0;
                while (i11 < length) {
                    int i219 = length;
                    kVar = kVarArr[i11];
                    int i34 = i11;
                    if (kVar.f57220e != null) {
                        uuid = kVar.f57217b;
                        i13 = i18;
                        i14 = 0;
                        while (true) {
                            if (i14 >= size) {
                                i12 = size;
                                arrayList.add(kVar);
                                break;
                                break;
                            } else {
                                i12 = size;
                                if (((y6.k) arrayList.get(i14)).f57217b.equals(uuid)) {
                                    break;
                                    break;
                                } else {
                                    i14++;
                                    size = i12;
                                }
                            }
                        }
                    } else {
                        i12 = size;
                        i13 = i18;
                    }
                    i11 = i34 + 1;
                    length = i219;
                    i18 = i13;
                    size = i12;
                }
                str4 = str15;
            }
            int i35 = i18;
            if (arrayList.isEmpty()) {
                lVar3 = null;
            } else {
                lVar3 = new y6.l(arrayList, str4);
            }
            o oVarA3 = pVar.a();
            oVarA3.f57253a = str5;
            oVarA3.f57254b = str6;
            oVarA3.f57255c = ImmutableList.n(immutableList);
            oVarA3.f57256d = str7;
            oVarA3.f57257e = i215;
            oVarA3.f57258f = i216;
            oVarA3.f57260h = i19;
            oVarA3.f57261i = i21;
            oVarA3.f57262j = str3;
            oVarA3.f57263k = c0VarB;
            oVarA3.f57268q = lVar3;
            oVarA3.f57275x = f5;
            oVarA3.L = i17;
            oVarA3.M = i35;
            pVar2 = new p(oVarA3);
        }
        this.f47514d = pVar2;
        e0 e0Var = this.f47515e;
        String str16 = f0.f3975a;
        e0Var.b(pVar2);
    }

    @Override // x7.e0
    public final int c(y6.h hVar, int i11, boolean z11) {
        e0 e0Var = this.f47515e;
        String str = f0.f3975a;
        return e0Var.c(hVar, i11, z11);
    }

    @Override // x7.e0
    public final void d(long j11, int i11, int i12, int i13, x7.d0 d0Var) {
        long j12 = this.f47516f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            this.f47515e = this.f47513c;
        }
        e0 e0Var = this.f47515e;
        String str = f0.f3975a;
        e0Var.d(j11, i11, i12, i13, d0Var);
    }
}
